package eureka.client.controller;

import eureka.client.entity.Student;
import eureka.client.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentHandler {

    @Value("${server.port}")
    private String port;

    @Autowired
    private StudentRepo studentRepo;

    @GetMapping("/all")
    public Collection<Student> findAll() {
        return studentRepo.findAll();
    }

    @GetMapping("/id/{id}")
    public Student findById(@PathVariable("id") long id) {
        return studentRepo.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Student student) {
        studentRepo.saveOrUpdate(student);
    }

    @PutMapping
    public void update(@RequestBody Student student) {
        studentRepo.saveOrUpdate(student);
    }

    @DeleteMapping("/id/{id}")
    public void delete(@PathVariable("id") long id) {
        studentRepo.deleteById(id);
    }

    @GetMapping("/index")
    public String index() {
        return "current port: " + port;
    }
}
