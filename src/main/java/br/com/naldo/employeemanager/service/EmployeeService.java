package br.com.naldo.employeemanager.service;

import br.com.naldo.employeemanager.model.Employee;
import br.com.naldo.employeemanager.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
