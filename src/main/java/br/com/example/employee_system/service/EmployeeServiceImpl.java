package br.com.example.employee_system.service;

import br.com.example.employee_system.entity.Employee;
import br.com.example.employee_system.repository.EmployeeRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmp(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmp() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmpById(int id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public boolean deleteEmp(int id) {
        Employee emp = employeeRepository.findById(id).get();
        if (emp != null){
            employeeRepository.delete(emp);
            return true;
        }
        return false;
    }

    public void removeSessionMessage(){
        HttpSession session = ((ServletRequestAttributes)(RequestContextHolder.getRequestAttributes())).getRequest().getSession();
        session.removeAttribute("msg");
    }
}
