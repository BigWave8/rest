package ua.lviv.iot.first.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.first.dataaccess.StudentRepository;
import ua.lviv.iot.spring.first.rest.model.Student;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }
}
