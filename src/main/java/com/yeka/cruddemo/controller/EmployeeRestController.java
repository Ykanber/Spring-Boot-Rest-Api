/*
package com.yeka.cruddemo.controller;

import com.yeka.cruddemo.dao.EmployeeDao;
import com.yeka.cruddemo.entity.Employee;
import com.yeka.cruddemo.services.EmployeeService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    public EmployeeRestController() {
    }

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){
        Employee employee = employeeService.findById(employeeId);
        if (employee == null){
            throw new RuntimeException("Employee with id " + employeeId + " can not be found");
        }
        return employee;
    }
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        employee.setId(0);
        Employee tempEmployee = employeeService.save(employee);
        if (tempEmployee == null){
            throw new RuntimeException("Employee " +employee.toString() +" can not be added");
        }
        return tempEmployee;
    }
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        Employee tempEmployee = employeeService.save(employee);
        if (tempEmployee == null){
            throw new RuntimeException("Employee " +employee.toString() +" can not be added");
        }
        return tempEmployee;
    }
    @DeleteMapping("/employees/{employeeId}")
    public String updateEmployee(@PathVariable int employeeId){
        Employee tempEmployee = employeeService.findById(employeeId);
        if (tempEmployee == null){
            throw new RuntimeException("Employee " +employeeId +" can not be found");
        }
        employeeService.deleteById(employeeId);
        return "Deleted employee with id " + employeeId;
    }
}
*/