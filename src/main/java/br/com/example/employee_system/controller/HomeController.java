package br.com.example.employee_system.controller;

import br.com.example.employee_system.entity.Employee;
import br.com.example.employee_system.service.EmployeeService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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


    @RequestMapping(value="/editEmp/{id}", method= RequestMethod.GET)
    public String editEmp(  @PathVariable int id, Model model) {
        Employee employee = employeeService.getEmpById(id);
        model.addAttribute("emp",employee);
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

    @PostMapping("/updateEmpDtls")
    public String updateEmp(@ModelAttribute Employee employee, HttpSession session) {
        Employee updateEmp = employeeService.saveEmp(employee);
        if (updateEmp != null) {
            session.setAttribute("msg", "Update Successfully");
        } else {
            session.setAttribute("msg", "Something Wrong on Server");
        }
        return "redirect:/";
    }

    @GetMapping("/deleteEmp/{id}")
    public String deleteEmp(@PathVariable Integer id, HttpSession session) {
        boolean f = employeeService.deleteEmp(id);
        if (f) {
            session.setAttribute("msg", "Delete Successfully");
        } else {
            session.setAttribute("msg", "Something Wrong on Server");
        }
        return "redirect:/";
    }
}
