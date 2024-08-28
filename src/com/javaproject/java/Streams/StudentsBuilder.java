package com.javaproject.java.Streams;

public class StudentsBuilder {
    private String name;
    private String gender;
    private int id;
    private String department;
    private double grade;

    public StudentsBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentsBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public StudentsBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public StudentsBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    public StudentsBuilder setGrade(double grade) {
        this.grade = grade;
        return this;
    }

    public Students createStudents() {
        return new Students(name, gender, id, department, grade);
    }
}