package com.demo.DAO;
import java.util.List;
import com.demo.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.Repository;

    @Repository
    public class EmployeeDAO {

        @Autowired
        JdbcTemplate jdbcTemplate;

        public void save(Employee e) {
            jdbcTemplate.update("INSERT INTO employee(name,email,salary) VALUES(?,?,?)",
                    e.getName(), e.getEmail(), e.getSalary());
        }

        public List<Employee> getAll() {
            return jdbcTemplate.query("SELECT * FROM employee",
                    new BeanPropertyRowMapper<>(Employee.class));
        }

        public void delete(int id) {
            jdbcTemplate.update("DELETE FROM employee WHERE id=?", id);
        }

        public Employee getById(int id) {
            return jdbcTemplate.queryForObject(
                    "SELECT * FROM employee WHERE id=?",
                    new BeanPropertyRowMapper<>(Employee.class),
                    id);
        }

        public void update(Employee e) {
            jdbcTemplate.update("UPDATE employee SET name=?,email=?,salary=? WHERE id=?",
                    e.getName(), e.getEmail(), e.getSalary(), e.getId());
        }
    }

