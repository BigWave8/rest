package ua.lviv.iot.spring.first.dataaccess;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.spring.first.rest.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    public List<Student> findAllByFirstName(String firstName);

    public List<Student> findAllByFirstNameAndLastName(String firstName, String lastName);
}
