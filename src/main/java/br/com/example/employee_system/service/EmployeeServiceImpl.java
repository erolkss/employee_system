package br.com.example.employee_system.service;

import br.com.example.employee_system.entity.Employee;
import br.com.example.employee_system.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee saveEmp(Employee employee) {
        return null;
    }

    @Override
    public List<Employee> getAllEmp() {
        return null;
    }

    @Override
    public Employee getEmpById(int id) {
        return null;
    }

    @Override
    public boolean deleteEmp(int id) {
        return false;
    }
}
