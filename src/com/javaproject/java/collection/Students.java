package com.javaproject.java.collection;

import java.util.Objects;

public class Students implements Comparable<Students> {
     private int id;
    private String name;
   private String email;
     private String language;

    public Students() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return id == students.id && Objects.equals(name, students.name) && Objects.equals(email, students.email) && Objects.equals(language, students.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, language);
    }
    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", language='" + language + '\'' +
                '}';
    }

    @Override
    public int compareTo(Students o) {
        return name.compareTo(o.getName());
    }


}
