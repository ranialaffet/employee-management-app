package fr.devavance.employee.employee_core.core.repository;

import fr.devavance.employee.employee_core.core.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends CrudRepository<Employee, Long> {
}
