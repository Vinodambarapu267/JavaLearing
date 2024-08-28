package com.javaproject.java.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentRepository {
    private List<Students> studentsList;
    private String name;

    public StudentRepository(){
        this.studentsList = new ArrayList<>();
        studentsList.add(new Students("Alice Smith","Female",101,"Computer Science",3.5));
        studentsList.add(new Students("Bob Johnson","Male",102,"Mechanical Engineering",3.7));
        studentsList.add(new Students("Carol Williams","Female",103,"Electrical Engineering",3.2));
        studentsList.add(new Students("David Brown","Male",104,"Civil Engineering",2.9));
        studentsList.add(new Students("Eve Davis","Female",105,"Biotechnology",3.8));
        studentsList.add(new Students("Frank Miller","Male",106,"Computer Science",3.4));
        studentsList.add(new Students("Grace Wilson","Female",107,"Information Technology",3.6));
        studentsList.add(new Students("Henry Moore","Male",108,"Physics",2.8));
        studentsList.add(new Students("Ivy Taylor","Female",109,"Mathematics",3.9));
        studentsList.add(new Students("Jack Anderson","Male",110,"Computer Science",3.3));
        studentsList.add(new Students("Kim Lee","Female",111,"Electrical Engineering",3.5));
        studentsList.add(new Students("Liam Harris","Male",112,"Biotechnology",3.2));
        studentsList.add(new Students("Mia Clark","Female",113,"Mechanical Engineering",3.7));
        studentsList.add(new Students("Noah Lewis","Male",114,"Civil Engineering",3.1));
        studentsList.add(new Students("Olivia Walker","Female",115,"Physics",3.9));
        studentsList.add(new Students("Paul Hall","Male",116,"Information Technology",3.2));
        studentsList.add(new Students("Quinn Young","Female",117,"Computer Science",3.6));
        studentsList.add(new Students("Ryan King","Male",118,"Mechanical Engineering",2.7));
        studentsList.add(new Students("Sophia Wright","Female",119,"Electrical Engineering",3.8));
        studentsList.add(new Students("Tom Scott","Male",120,"Civil Engineering",3.4));
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

