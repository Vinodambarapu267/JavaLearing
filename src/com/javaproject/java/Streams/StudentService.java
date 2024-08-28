package com.javaproject.java.Streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public List<Students> getstudents(){
        return this.studentRepository.getstudents();
    }
    public List<Students> filterBygrade(double minGrade){
       return this.studentRepository.getstudents().stream()
                               .filter(students -> students.getGrade()>=minGrade)
                .collect(Collectors.toList());
    }
    public void DisplayDetails(){
        this.studentRepository.getstudents().forEach(students -> {
            System.out.println("Name : " +students.getName());
            System.out.println("Department : "+students.getDepartment());
            System.out.println("Gender : " + students.getGender());
        });
    }
    public List<String> getAllnames(){
       return this.studentRepository.getstudents().stream().map(Students::getName).collect(Collectors.toList());
    }
    public Students getStudentsById(int id) throws StudentNotFoundException {
        Optional<Students> optional= this.studentRepository.getStudentById(id);
        if (optional.isPresent())
            return optional.get();
        else throw new StudentNotFoundException("Student is not found this id : "+ id);
    }
    public Students getNameByid(String name) throws StudentNotFoundException{
        Optional<Students> optional = this.studentRepository.getStudentByName(name);
        if (optional.isPresent())
            return optional.get();
        else throw new StudentNotFoundException("Student is not fount by this name : "+name);
    }
}
