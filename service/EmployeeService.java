package tech.getarrays.employeeportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.employeeportal.src.main.tech.getarrays.exception.UserNotFoundException;
import tech.getarrays.employeeportal.src.main.tech.getarrays.model.Employee;
import tech.getarrays.employeeportal.src.main.tech.getarrays.repository.EmployeeRepo;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo){
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Employee> getAllEmployees(){
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepo.save(employee);
    }


    public Employee findEmployeeId(Long id){
        return employeeRepo.findEmployeeById(id)
                .orElseThrow(() -> new UserNotFoundException("User by Id "+id+ " was not found"));
    }


    public void deleteEmployee(Long id){
        employeeRepo.deleteEmployeeById(id);
    }


}
