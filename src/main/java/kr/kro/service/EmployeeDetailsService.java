package kr.kro.service;

import kr.kro.domain.dto.EmployeeDetailsView;
import kr.kro.repository.EmployeeDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDetailsService {

    private final EmployeeDetailsRepository employeeDetailsRepository;

    @Autowired
    public EmployeeDetailsService(EmployeeDetailsRepository employeeDetailsRepository) {
        this.employeeDetailsRepository = employeeDetailsRepository;
    }

    public EmployeeDetailsView getEmployeeDetailsById(Long employeeId) {
        return employeeDetailsRepository.findByEmployeeId(employeeId);
    }
}
