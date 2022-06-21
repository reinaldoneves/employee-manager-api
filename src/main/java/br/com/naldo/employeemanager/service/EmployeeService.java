package br.com.naldo.employeemanager.service;

import br.com.naldo.employeemanager.model.Employee;
import br.com.naldo.employeemanager.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    private final EmployeeRepo repo;

    @Autowired
    public EmployeeService(EmployeeRepo repo) {
        this.repo = repo;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return repo.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return repo.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return repo.save(employee);
    }

    public void deleteEmployee(Long id){
        repo.deleteEmployeeById(id);
    }

    public Employee findEmployeeById(Long id){
        return repo.findEmployeeById(id).orElseThrow();
    }

}
