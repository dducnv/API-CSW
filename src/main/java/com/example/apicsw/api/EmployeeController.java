package com.example.apicsw.api;

import com.example.apicsw.entity.Employee;
import com.example.apicsw.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"https://client-csw.vercel.app/","http://localhost:3000/"})
@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(employeeService.findAll());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(employeeService.findById(id));
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<Employee> Save(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.save(employee));
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> Delete(@PathVariable Long id) {
        employeeService.delete(id);
        return ResponseEntity.ok("Deleted");
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public ResponseEntity<Employee> Update(@RequestBody Employee employeeDto, @PathVariable Long id) {
        return ResponseEntity.ok(employeeService.update(employeeDto, id));
    }

}
