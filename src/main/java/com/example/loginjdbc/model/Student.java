/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 28-03-2022
Time: 23:13
File: Student.java 

*/

package com.example.loginjdbc.model;

import java.util.Objects;

public class Student {
    private final long rollNumber;
    private String studentName;
    private String username;
    private String email;
    private String password;

    public Student(long rollNumber, String studentName, String username, String email, String password) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public long getRollNumber() {
        return rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber && Objects.equals(studentName, student.studentName) && Objects.equals(username, student.username) && Objects.equals(email, student.email) && Objects.equals(password, student.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, studentName, username, email, password);
    }
}