package br.com.example.employee_system.controller;

import br.com.example.employee_system.entity.Employee;
import br.com.example.employee_system.service.EmployeeService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String index(Model model) {
        List<Employee> list = employeeService.getAllEmp();
        model.addAttribute("empList", list);
        return "index";
    }

    @GetMapping("/loadEmpSave")
    public String loadEmpSave() {
        return "emp_save";
    }

    @GetMapping("/EditEmp")
    public String editEmp() {
        return "edit_emp";
    }

    @PostMapping("/saveEmp")
    public String saveEmp(@ModelAttribute Employee employee, HttpSession session) {
        Employee newEmp = employeeService.saveEmp(employee);
        if (newEmp != null) {
            session.setAttribute("msg", "Register Successfully");
        } else {
            session.setAttribute("msg", "Something Wrong on Server");
        }
        return "redirect:/loadEmpSave";
    }
}
