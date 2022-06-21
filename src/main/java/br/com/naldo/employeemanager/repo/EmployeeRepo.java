package br.com.naldo.employeemanager.repo;

import br.com.naldo.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
