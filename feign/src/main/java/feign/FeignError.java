package feign;

import feign.entity.Student;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignProviderClient {

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "not available now";
    }
}
