package fr.devavance.employee.employee_core.core.service;

import fr.devavance.employee.employee_core.core.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    public List<Employee> findAll();
    public void save(Employee employee);
    public Employee findById(Long id);
    public void delete(Long id);
}