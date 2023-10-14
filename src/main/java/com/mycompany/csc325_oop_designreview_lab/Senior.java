package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {
    private int credits;

    // Senior Constructor
    public Senior(String name, short age, int credits) {
        super(name, age);
        if (credits < 85) {
            System.out.println("Senior students must have a minimum of 85 credits.");
        } else {
            this.credits = credits;
        }
    }

    @Override
    public String toString() {
        return "Senior - Name: " + getName() + ", Age: " + getAge() + ", Credits: " + credits;
    }
}
