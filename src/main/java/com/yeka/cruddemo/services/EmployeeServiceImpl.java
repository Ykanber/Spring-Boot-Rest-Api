/*
package com.yeka.cruddemo.services;

import com.yeka.cruddemo.dao.EmployeeDao;
import com.yeka.cruddemo.entity.Employee;
import com.yeka.cruddemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl() {
    }

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> byId = employeeRepository.findById(id);
        Employee employee = null;
        if (byId.isPresent()){
            employee = byId.get();
        }
        else{
            throw new RuntimeException("Employee with id " + id + " can not be found");
        }
        return employee;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }

    private EmployeeDao employeeDao;

    public EmployeeServiceImpl() {
    }
    @Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    public Employee findById(int id) {
        return employeeDao.findById(id);
    }

    @Transactional
    @Override
    public Employee save(Employee employee) {
        return employeeDao.save(employee);
    }
    @Transactional
    @Override
    public void deleteById(int id) {
        employeeDao.deleteById(id);
    }


}
*/
