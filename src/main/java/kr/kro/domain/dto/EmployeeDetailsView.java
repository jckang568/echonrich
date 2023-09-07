package kr.kro.domain.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import net.jcip.annotations.Immutable;

import java.math.BigDecimal;

@Entity
@Table(name = "emp_details_view")
@Immutable
public class EmployeeDetailsView {
    @Id
    @Column(name = "employee_id")
    private Long employeeId;
    @Column(name = "job_id")
    private String jobId;
    @Column(name = "manager_id")
    private Long managerId;
    @Column(name = "department_id")
    private Long departmentId;
    @Column(name = "location_id")
    private Long locationId;
    @Column(name = "country_id")
    private String countryId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "salary")
    private BigDecimal salary;
    @Column(name = "commission_pct")
    private BigDecimal commissionPct;
    @Column(name = "department_name")
    private String departmentName;
    @Column(name = "job_title")
    private String jobTitle;
    @Column(name = "city")
    private String city;
    @Column(name = "state_province")
    private String stateProvince;
    @Column(name = "country_name")
    private String countryName;
    @Column(name = "region_name")
    private String regionName;


    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getCommissionPct() {
        return commissionPct;
    }

    public void setCommissionPct(BigDecimal commissionPct) {
        this.commissionPct = commissionPct;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public EmployeeDetailsView(Long employeeId, String jobId, Long managerId, Long departmentId, Long locationId,
                               String countryId, String firstName, String lastName, BigDecimal salary, BigDecimal commissionPct,
                               String departmentName, String jobTitle, String city, String stateProvince, String countryName,
                               String regionName) {
        this.employeeId = employeeId;
        this.jobId = jobId;
        this.managerId = managerId;
        this.departmentId = departmentId;
        this.locationId = locationId;
        this.countryId = countryId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.commissionPct = commissionPct;
        this.departmentName = departmentName;
        this.jobTitle = jobTitle;
        this.city = city;
        this.stateProvince = stateProvince;
        this.countryName = countryName;
        this.regionName = regionName;
    }

    public EmployeeDetailsView() {

    }

}
