package kr.kro.api;
import kr.kro.domain.dto.EmployeeDetailsDTO;
import kr.kro.domain.entity.Employee;
import kr.kro.domain.mapper.EmployeeMapper;
import kr.kro.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<?> getEmployeeDetails(@PathVariable Long employeeId) {
        Optional<Employee> employeeOptional = employeeService.getEmployeeById(employeeId);
        if (employeeOptional.isPresent()) {
            EmployeeDetailsDTO employeeDetailDTO = EmployeeMapper.INSTANCE.employeeToEmployeeDetailsDTO(employeeOptional.get());
            return ResponseEntity.ok(employeeDetailDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }



    // 다른 API 엔드포인트를 추가할 수 있습니다.
}
