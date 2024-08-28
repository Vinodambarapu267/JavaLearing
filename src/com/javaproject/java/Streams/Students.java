package com.javaproject.java.Streams;

import java.util.Objects;

public class Students {
    private  int id;
    private String name;
    private String department;
    private double grade;
    private String gender;



    public Students(String name, String gender,int id,String department,double grade) {
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.id = id;
        this.grade = grade;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return id == students.id && Double.compare(grade, students.grade) == 0 && Objects.equals(name, students.name) && Objects.equals(department, students.department) && Objects.equals(gender, students.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, department, grade, gender);
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", grade=" + grade +
                ", gender='" + gender + '\'' +
                '}';
    }
}
