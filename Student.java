/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasic;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author User
 */
public class Student extends Person implements  Comparable<Student> , Serializable{
    private String studentID;
    private String major;
    private Date  enrolledDate;

    public Student() {
    }

    public Student(String studentID, String major, Date enrolledDate) {
        this.studentID = studentID;
        this.major = major;
        this.enrolledDate = enrolledDate;
    }

    public Student(String studentID, String major, Date enrolledDate, String name, Date birthday, byte gender) {
        super(name, birthday, gender);
        this.studentID = studentID;
        this.major = major;
        this.enrolledDate = enrolledDate;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Date getEnrolledDate() {
        return enrolledDate;
    }

    public void setEnrolledDate(Date enrolledDate) {
        this.enrolledDate = enrolledDate;
    }

    @Override
    public int compareTo(Student o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
    

   
    
    
}


    