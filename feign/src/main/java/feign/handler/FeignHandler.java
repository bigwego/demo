package feign.handler;

import feign.FeignProviderClient;
import feign.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class FeignHandler {

    @Autowired
    private FeignProviderClient feignClient;

    @GetMapping("/all")
    public Collection<Student> findAll() {
        return feignClient.findAll();
    }

    @GetMapping("/index")
    public String index() {
        return feignClient.index();
    }
}
