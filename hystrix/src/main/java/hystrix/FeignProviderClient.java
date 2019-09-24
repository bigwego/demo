package hystrix;

import hystrix.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider")
public interface FeignProviderClient {

    @GetMapping("/student/all")
    Collection<Student> findAll();

    @GetMapping("/student/index")
    String index();
}
