package eureka.client.repo.impl;

import eureka.client.entity.Student;
import eureka.client.repo.StudentRepo;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepoImpl implements StudentRepo {

    private static Map<Long, Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1L, new Student(1L, "a", 17));
        studentMap.put(2L, new Student(2L, "b", 18));
        studentMap.put(3L, new Student(3L, "c", 19));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
