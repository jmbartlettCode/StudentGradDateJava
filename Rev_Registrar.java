/*
 * Josh Bartlett
 * February 22, 2020
 * Assignment 4.3
 * Bellevue University
 * Rev_Registrar.java
 */

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Rev_Registrar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // created LocalDate object
        LocalDate date = LocalDate.now();
        // declare variables
        int month1 = 0,
            month2 = 0,
            day1 = 0,
            day2 = 0,
            year1, year2;

        String firstName1, firstName2, lastName1, lastName2;

        // Ask for and save student1 info into variables
        System.out.print("Enter Student 1's First Name: ");
        firstName1 = input.next();
        System.out.print("Enter Student 1's Last Name: ");
        lastName1 = input.next();
        // while loop to check that month entered is within range
        while ((month1 < 1) || (month1 > 12)) {
            System.out.print("Enter Student 1's Enrollment Month: ");
            month1 = input.nextInt();
        }
        // ifs and while loops to check the range of the day for the month entered
        if ((month1 == 1) || (month1 == 3) || (month1 == 5) || (month1 == 7) || (month1 == 8) ||
                (month1 == 10) || (month1 == 12)){
            while ((day1 < 1) || (day1 > 31)){
                System.out.print("Enter Student 1's Enrollment Day: ");
                day1 = input.nextInt();
            }
        } else if ((month1 == 4) || (month1 == 6) || (month1 == 9) || (month1 == 11)){
            while ((day1 < 1) || (day1 > 30)){
                System.out.print("Enter Student 1's Enrollment Day: ");
                day1 = input.nextInt();
            }
        } else if (month1 == 2){
            while ((day1 < 1) || (day1 > 28)){
                System.out.print("Enter Student 1's Enrollment Day: ");
                day1 = input.nextInt();
            }
        }
        // subtracts 1 from the month entered for use with the GregorianCalendar
        month1 -= 1;
        // auto populates year variable with current year
        year1 = date.getYear();

        // Ask for and save student2 info into variables
        System.out.print("\nEnter Student 2's First Name: ");
        firstName2 = input.next();
        System.out.print("Enter Student 2's Last Name: ");
        lastName2 = input.next();
        // while loop to check that month entered is within range
        while ((month2 < 1) || (month2 > 12)) {
            System.out.print("Enter Student 2's Enrollment Month: ");
            month2 = input.nextInt();
        }
        // ifs and while loops to check the range of the day for the month entered
        if ((month2 == 1) || (month2 == 3) || (month2 == 5) || (month2 == 7) || (month2 == 8) ||
                (month2 == 10) || (month2 == 12)){
            while ((day2 < 1) || (day2 > 31)){
                System.out.print("Enter Student 1's Enrollment Day: ");
                day2 = input.nextInt();
            }
        } else if ((month2 == 4) || (month2 == 6) || (month2 == 9) || (month2 == 11)){
            while ((day2 < 1) || (day2 > 30)){
                System.out.print("Enter Student 1's Enrollment Day: ");
                day2 = input.nextInt();
            }
        } else if (month2 == 2){
            while ((day2 < 1) || (day2 > 28)){
                System.out.print("Enter Student 1's Enrollment Day: ");
                day2 = input.nextInt();
            }
        }
        // subtracts 1 from the month entered for use with the GregorianCalendar
        month2 -= 1;
        // auto populates year variable with current year
        year2 = date.getYear();

        // Create GregorianCalendars for student1 and student2 enrollment dates
        GregorianCalendar enrollDate1 = new GregorianCalendar(year1, month1,
                day1);
        GregorianCalendar enrollDate2 = new GregorianCalendar(year2, month2,
                day2);

        // Create student1 and student2 objects passing firstName, lastName, and
        // enrollDate
        CollegeStudent student1 = new CollegeStudent(firstName1, lastName1,
                enrollDate1);
        CollegeStudent student2 = new CollegeStudent(firstName2, lastName2,
                enrollDate2);

        // Use SimpleDateFormat to display dates easier
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        // Format student1 dates
        sdf.setCalendar(student1.getEnrollDate());
        String eDateAsString1 = sdf.format(student1.getEnrollDate().getTime());
        sdf.setCalendar(student1.getGradDate());
        String gDateAsString1 = sdf.format(student1.getGradDate().getTime());
        // Format student2 dates
        sdf.setCalendar(student2.getEnrollDate());
        String eDateAsString2 = sdf.format(student2.getEnrollDate().getTime());
        sdf.setCalendar(student2.getGradDate());
        String gDateAsString2 = sdf.format(student2.getGradDate().getTime());

        // Display student1 info including graduation date
        System.out.println("\nStudent 1" + "\nName: " + student1.getFirstName()
                + " " + student1.getLastName() + "\nEnrollment Date: " +
                eDateAsString1 + "\nGraduation Date: " + gDateAsString1);
        // Display student2 info including graduation date
        System.out.println("\nStudent 2" + "\nName: " + student2.getFirstName()
                + " " + student2.getLastName() + "\nEnrollment Date: " +
                eDateAsString2 + "\nGraduation Date: " + gDateAsString2);
    }
}
