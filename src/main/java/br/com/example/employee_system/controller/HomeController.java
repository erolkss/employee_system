package br.com.example.employee_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
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
}
