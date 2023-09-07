package kr.kro.repository;

import kr.kro.domain.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // 추가적인 쿼리 메서드 정의 가능
}

