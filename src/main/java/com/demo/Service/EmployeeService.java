package com.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.DAO.EmployeeDAO;
import com.demo.Model.Employee;

    @Service
    public class EmployeeService {

        @Autowired
        EmployeeDAO dao;

        public void save(Employee e) {
            dao.save(e);
        }

        public List<Employee> list() {
            return dao.getAll();
        }

        public void delete(int id) {
            dao.delete(id);
        }

        public Employee get(int id) {
            return dao.getById(id);
        }

        public void update(Employee e) {
            dao.update(e);
        }
    }

