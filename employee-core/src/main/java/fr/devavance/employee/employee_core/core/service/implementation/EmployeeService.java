package fr.devavance.employee.employee_core.core.service.implementation;

import fr.devavance.employee.employee_core.core.entity.Employee;
import fr.devavance.employee.employee_core.core.repository.IEmployeeRepository;
import fr.devavance.employee.employee_core.core.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private IEmployeeRepository repository;




    @Override
    public List<Employee> findAll() {
        return (List<Employee>) repository.findAll();
    }

    @Override
    public void save(Employee employee) {
        repository.save(employee);
    }

    @Override
    public Employee findById(Long id) {
        Optional<Employee> employeeOpt = repository.findById(id);

        return employeeOpt.orElse(null);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}