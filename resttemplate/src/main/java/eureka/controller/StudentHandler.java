package eureka.controller;

import eureka.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("rest")
public class StudentHandler {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/all")
    public Collection<Student> findAll() {
        return restTemplate.getForEntity("http://localhost:8010/student/all", Collection.class).getBody();
    }
}
