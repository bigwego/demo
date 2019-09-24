package eureka.client.repo;

import eureka.client.entity.Student;

import java.util.Collection;

public interface StudentRepo {

    Collection<Student> findAll();

    Student findById(long id);

    void saveOrUpdate(Student student);

    void deleteById(long id);
}
