package com.school.convent.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "schoolManagement")
public class StudentModel {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int StudentId;
        @Column(name = "StudentName")
        String StudentName;
        @Column(name = "StudentDOB")
        Date StudentDOB;
        @Column(name = "StudentMarks")
        int StudentMarks;

    public StudentModel(int studentId, String studentName, Date studentDOB, int studentMarks) {
        StudentId = studentId;
        StudentName = studentName;
        StudentDOB = studentDOB;
        StudentMarks = studentMarks;
    }

    public StudentModel() {
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public Date getStudentDOB() {
        return StudentDOB;
    }

    public void setStudentDOB(Date studentDOB) {
        StudentDOB = studentDOB;
    }

    public int getStudentMarks() {
        return StudentMarks;
    }

    public void setStudentMarks(int studentMarks) {
        StudentMarks = studentMarks;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "StudentId=" + StudentId +
                ", StudentName='" + StudentName + '\'' +
                ", StudentDOB=" + StudentDOB +
                ", StudentMarks=" + StudentMarks +
                '}';
    }
}
