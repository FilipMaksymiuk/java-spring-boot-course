package com.luv2codespringboot.cruddemo.service;

import com.luv2codespringboot.cruddemo.dao.EmployeeDAO;
import com.luv2codespringboot.cruddemo.dao.EmployeeDAOJpalmpl;
import com.luv2codespringboot.cruddemo.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeDAO employeeDAO;
    public EmployeeServiceImpl(EmployeeDAO theEmployEeDAO){
        employeeDAO = theEmployEeDAO;
    }
    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(int theId) {
        return employeeDAO.findById(theId);
    }

    @Transactional
    @Override
    public Employee save(Employee theEmployee) {
        return employeeDAO.save(theEmployee);
    }
    @Transactional
    @Override
    public void deleteById(int theId) {
        employeeDAO.deleteById(theId);
    }
}




















