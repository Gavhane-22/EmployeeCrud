package com.demo.Controller;
    import com.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.demo.Model.Employee;
import com.demo.Service.EmployeeService;

    @Controller
    public class EmployeeController {

        @Autowired
        EmployeeService service;

        @GetMapping("/")
        public String home() {
            return "redirect:/list";
        }

        // READ
        @GetMapping("/list")
        public String list(Model model) {
            model.addAttribute("list", service.list());
            return "list";
        }

        // CREATE FORM
        @GetMapping("/add")
        public String addForm(Model model) {
            model.addAttribute("emp", new Employee());
            return "add";
        }

        // SAVE
        @PostMapping("/save")
        public String save(@ModelAttribute Employee emp) {
            service.save(emp);
            return "redirect:/list";
        }

        // DELETE
        @GetMapping("/delete/{id}")
        public String delete(@PathVariable ("id") int id) {
            service.delete(id);
            return "redirect:/list";
        }

        // EDIT FORM
        @GetMapping("/edit/{id}")
        public String edit(@PathVariable ("id") int id, Model model) {
            model.addAttribute("emp", service.get(id));
            return "edit";
        }

        // UPDATE
        @PostMapping("/update")
        public String update(@ModelAttribute Employee emp) {
            service.update(emp);
            return "redirect:/list";
        }
    }

