package kr.kro.repository;

import kr.kro.domain.dto.EmployeeDetailsView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetailsView, Long> {
    // 추가적인 쿼리 메서드 정의 가능
    // Spring Data JPA가 메서드 이름을 통해 자동으로 쿼리 생성
    EmployeeDetailsView findByEmployeeId(Long employeeId);
}

