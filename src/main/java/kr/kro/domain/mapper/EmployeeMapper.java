package kr.kro.domain.mapper;

import kr.kro.domain.dto.EmployeeDetailsDTO;
import kr.kro.domain.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    @Mapping(source = "employeeId", target = "employeeId")
    @Mapping(source = "job.jobId", target = "jobId")
    @Mapping(source = "manager.employeeId", target = "managerId")
    @Mapping(source = "department.departmentId", target = "departmentId")
    @Mapping(source = "department.location.locationId", target = "locationId")
    @Mapping(source = "department.location.country.countryId", target = "countryId")
    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "salary", target = "salary")
    @Mapping(source = "commissionPct", target = "commissionPct")
    @Mapping(source = "department.departmentName", target = "departmentName")
    @Mapping(source = "job.jobTitle", target = "jobTitle")
    @Mapping(source = "department.location.city", target = "city")
    @Mapping(source = "department.location.stateProvince", target = "stateProvince")
    @Mapping(source = "department.location.country.countryName", target = "countryName")
    @Mapping(source = "department.location.country.region.regionName", target = "regionName")
    EmployeeDetailsDTO employeeToEmployeeDetailsDTO(Employee employee);

    default String mapManagerName(Employee employee) {
        if (employee.getManager() != null) {
            return employee.getManager().getFirstName() + " " + employee.getManager().getLastName();
        }
        return null;
    }
}