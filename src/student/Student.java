/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import computer.Computer;
import course.Course;


/**
 *
 * @author Home
 */
public class Student {
    
    private String firstName ;
    private String lastName ;
    private int yearOfBirth ;
    private Course course;
    private Computer computer;

    public Student() {
        
        this.firstName = "undefined";
        this.lastName = "undefined";
        this.yearOfBirth = 0;
        this.course = new Course();
        this.computer = new Computer();
        
    }
    
    public Student( String customFirstName, String customLastName, int customYearOfBirth,Course course,Computer computer){
    
        this.firstName = customFirstName;
        this.lastName = customLastName;
        this.yearOfBirth = customYearOfBirth;
        this.computer = computer;
        this.course = course;
    }
    
    
    
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
    public void info(){
        System.out.println("First name" + getFirstName());
        System.out.println("Last name" + getLastName());
        System.out.println("Year of birth" + getYearOfBirth());
        
    
    }

    
    
    
}
