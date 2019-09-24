package feign;

import feign.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider", fallback = FeignError.class)
public interface FeignProviderClient {

    @GetMapping("/student/all")
    Collection<Student> findAll();

    @GetMapping("/student/index")
    String index();
}
