package kr.kro.api;

import kr.kro.domain.dto.EmployeeDetailsView;
import kr.kro.service.EmployeeDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeDetailsController {

    private final EmployeeDetailsService employeeDetailsService;

    @Autowired
    public EmployeeDetailsController(EmployeeDetailsService employeeDetailsService) {
        this.employeeDetailsService = employeeDetailsService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDetailsView> getEmployeeDetails(@PathVariable Long id) {
        EmployeeDetailsView employeeDetails = employeeDetailsService.getEmployeeDetailsById(id);
        if (employeeDetails != null) {
            return ResponseEntity.ok(employeeDetails);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

