package com.javaproject.java.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentRepository {
    private List<Students> studentsList;
    private String name;

    public StudentRepository(){
        this.studentsList = new ArrayList<>();
        studentsList.add(new StudentsBuilder().setName("Alice Smith").setGender("Female").setId(101).setDepartment("Computer Science").setGrade(3.5).createStudents());
        studentsList.add(new StudentsBuilder().setName("Bob Johnson").setGender("Male").setId(102).setDepartment("Mechanical Engineering").setGrade(3.7).createStudents());
        studentsList.add(new StudentsBuilder().setName("Carol Williams").setGender("Female").setId(103).setDepartment("Electrical Engineering").setGrade(3.2).createStudents());
        studentsList.add(new StudentsBuilder().setName("David Brown").setGender("Male").setId(104).setDepartment("Civil Engineering").setGrade(2.9).createStudents());
        studentsList.add(new StudentsBuilder().setName("Eve Davis").setGender("Female").setId(105).setDepartment("Biotechnology").setGrade(3.8).createStudents());
        studentsList.add(new StudentsBuilder().setName("Frank Miller").setGender("Male").setId(106).setDepartment("Computer Science").setGrade(3.4).createStudents());
        studentsList.add(new StudentsBuilder().setName("Grace Wilson").setGender("Female").setId(107).setDepartment("Information Technology").setGrade(3.6).createStudents());
        studentsList.add(new StudentsBuilder().setName("Henry Moore").setGender("Male").setId(108).setDepartment("Physics").setGrade(2.8).createStudents());
        studentsList.add(new StudentsBuilder().setName("Ivy Taylor").setGender("Female").setId(109).setDepartment("Mathematics").setGrade(3.9).createStudents());
        studentsList.add(new StudentsBuilder().setName("Jack Anderson").setGender("Male").setId(110).setDepartment("Computer Science").setGrade(3.3).createStudents());
        studentsList.add(new StudentsBuilder().setName("Kim Lee").setGender("Female").setId(111).setDepartment("Electrical Engineering").setGrade(3.5).createStudents());
        studentsList.add(new StudentsBuilder().setName("Liam Harris").setGender("Male").setId(112).setDepartment("Biotechnology").setGrade(3.2).createStudents());
        studentsList.add(new StudentsBuilder().setName("Mia Clark").setGender("Female").setId(113).setDepartment("Mechanical Engineering").setGrade(3.7).createStudents());
        studentsList.add(new StudentsBuilder().setName("Noah Lewis").setGender("Male").setId(114).setDepartment("Civil Engineering").setGrade(3.1).createStudents());
        studentsList.add(new StudentsBuilder().setName("Olivia Walker").setGender("Female").setId(115).setDepartment("Physics").setGrade(3.9).createStudents());
        studentsList.add(new StudentsBuilder().setName("Paul Hall").setGender("Male").setId(116).setDepartment("Information Technology").setGrade(3.2).createStudents());
        studentsList.add(new StudentsBuilder().setName("Quinn Young").setGender("Female").setId(117).setDepartment("Computer Science").setGrade(3.6).createStudents());
        studentsList.add(new StudentsBuilder().setName("Ryan King").setGender("Male").setId(118).setDepartment("Mechanical Engineering").setGrade(2.7).createStudents());
        studentsList.add(new StudentsBuilder().setName("Sophia Wright").setGender("Female").setId(119).setDepartment("Electrical Engineering").setGrade(3.8).createStudents());
        studentsList.add(new StudentsBuilder().setName("Tom Scott").setGender("Male").setId(120).setDepartment("Civil Engineering").setGrade(3.4).createStudents());
    }


    public List<Students> getstudents() {
        return studentsList;
    }
    public Optional<Students> getStudentById(int id){
        return this.studentsList.stream().filter(students -> students.getId() == id).findFirst();
    }
   public Optional<Students> getStudentByName(String name){
        return this.studentsList.stream().filter(students -> students.getName() == name).findFirst();
   }

}

