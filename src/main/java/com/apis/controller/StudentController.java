
package com.apis.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.apis.repository.*;
import com.apis.entity.*;
import com.apis.service.PredictionService;
@RestController @RequestMapping("/student")
public class StudentController{
@Autowired StudentRepository srepo;
@Autowired ResultRepository rrepo;
@Autowired PredictionService ps;
@PostMapping
public Student add(@RequestBody Student s){
Student saved=srepo.save(s);
Result r=ps.calculate(saved,0.6,0.4);
rrepo.save(r);
return saved;
}
}
