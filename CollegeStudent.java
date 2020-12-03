/*
 * Josh Bartlett
 * February 8, 2020
 * Assignment 4.3
 * Bellevue University
 * CollegeStudent.java
 */

import java.util.GregorianCalendar;

public class CollegeStudent {
    // Declare Variables
    private String firstName,
            lastName;

    private GregorianCalendar enrollDate,
            gradDate;

    // Constructor for CollegeStudent object
    public CollegeStudent(String firstName, String lastName, GregorianCalendar
            enrollDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.enrollDate = enrollDate;
        // Below was necessary in order to get enrollDate and gradDate to work 
        // properly
        int year = enrollDate.get(GregorianCalendar.YEAR) + 4;
        int month = enrollDate.get(GregorianCalendar.MONTH);
        int day = enrollDate.get(GregorianCalendar.DAY_OF_MONTH);
        this.gradDate = new GregorianCalendar(year, month, day);
    }

    // Gets and Sets for all data fields
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public GregorianCalendar getEnrollDate(){
        return enrollDate;
    }

    public void setEnrollDate(GregorianCalendar enrollDate){
        this.enrollDate = enrollDate;
    }

    public GregorianCalendar getGradDate(){
        return gradDate;
    }

    public void setGradDate(GregorianCalendar gradDate){
        this.gradDate = gradDate;
    }
}
