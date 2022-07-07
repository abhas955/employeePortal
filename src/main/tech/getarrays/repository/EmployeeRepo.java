package tech.getarrays.employeeportal.src.main.tech.getarrays.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeeportal.src.main.tech.getarrays.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
