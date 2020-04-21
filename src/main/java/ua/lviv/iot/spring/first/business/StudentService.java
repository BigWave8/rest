package ua.lviv.iot.spring.first.business;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.spring.first.dataaccess.StudentRepository;
import ua.lviv.iot.spring.first.rest.model.Student;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student findeOne(Integer id) {
        try {
            return studentRepository.findById(id).get();
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    public Student updateStudent(Integer studentId, Student student) {
        student.setId(studentId);
        return studentRepository.save(student);
    }

    public void deleteStudent(Integer studentId) {
        studentRepository.deleteById(studentId);
    }

    public List<Student> getAllByFirstName(String firstName) {
        return studentRepository.findAllByFirstName(firstName);
    }

    public boolean studentExists(Integer studentId) {
        return studentRepository.existsById(studentId);
    }
}
