package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student {
    private int credits;

    // Freshman Constructor
    public Freshman(String name, short age, int credits) {
        super(name, age);

            this.credits = credits;
    }

    @Override
    public String toString() {
        return "Freshman - Name: " + getName() + ", Age: " + getAge() + ", Credits: " + credits;
    }
}
