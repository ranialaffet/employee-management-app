package fr.devavance.employee.employee_web.controller.implementation;

import fr.devavance.employee.employee_core.core.entity.Employee;
import fr.devavance.employee.employee_core.core.service.IEmployeeService;
import fr.devavance.employee.employee_web.controller.IEmployeeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/employee")
public class EmployeeController implements IEmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    public EmployeeController(IEmployeeService employeeService){
        this.employeeService= employeeService;
    }



    @GetMapping("/home")
    public String displayHome(Model model) {
        model.addAttribute("employees", employeeService.findAll());
        model.addAttribute("employee", new Employee());

        return "view_home";
    }

    @PostMapping("/addemployee")
    public String addEmployee(@ModelAttribute Employee employee) {
        employeeService.save(employee);
        return "redirect:/employee/home";
    }

    @RequestMapping(value = "/{id}")
    public String displayEmployee(@PathVariable(name="id") Long id, Model model) {
        Employee employee = employeeService.findById(id);

        if (employee == null) {
            return "redirect:/employee/home";
        } else {
            model.addAttribute("employee", employee);
            return "view_employee";
        }
    }

}

