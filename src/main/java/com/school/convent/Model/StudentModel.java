package com.school.convent.Model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "schoolManagement")
public class StudentModel {
    @Id

    int studentId;
    @Column(name = "studentName")
    String studentName;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    @Column(name = "studentDOB")
    Date studentDOB;
    @Column(name = "studentMarks")
    int studentMarks;

    public StudentModel() {
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentDOB=" + studentDOB +
                ", studentMarks=" + studentMarks +
                '}';
    }

    public StudentModel(int studentId, String studentName, Date studentDOB, int studentMarks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentDOB = studentDOB;
        this.studentMarks = studentMarks;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Date getStudentDOB() {
        return studentDOB;
    }

    public void setStudentDOB(Date studentDOB) {
        this.studentDOB = studentDOB;
    }

    public int getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(int studentMarks) {
        this.studentMarks = studentMarks;
    }
}