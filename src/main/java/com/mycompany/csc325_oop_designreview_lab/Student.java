/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
	// ToDo 1: Make this class a child of Human

	// ToDo 2: Fix the resulting errors
    private double gpa;
    private int credits;
    private String sAddress;

    // Student Constructor
    public Student(String name, short age){
        super(name, age);
    }

    // sAddress - Getter & Setter
    @Override
    public String getAddress() {
        return sAddress;
    }
    @Override
    public void setAddress(String address) { sAddress = address; }

    @Override
    public String toString() {
        return "Student - Name: " + getName() + ", Age: " + getAge() + ", GPA: " + getCredits();
    }

	// ToDo 3: Add a field for GPA and create a setter and a getter
    // GPA - Getter & Setter
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    // ToDo 4: Add comments to your code
}
