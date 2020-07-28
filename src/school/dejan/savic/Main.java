/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.dejan.savic;

import computer.Computer;
import course.Course;
import student.Student;
/**
 *
 * @author Home
 */
public class Main {

    
    public static void main(String[] args) {
        
        Student Marko = new Student();
        Marko.info();
        
        Student Jovan = new Student();
        Jovan.info();
        
        Course qa = new Course("QA testing", "qa", 30);
        qa.info();
        
        Computer lenovo = new Computer("Windows", 2.2, 4.0, 500);
        lenovo.info();
        
        Student Milica = new Student("Milica", "Jokić ", 1989, qa, lenovo);
        Milica.info();
    }
    
    
}
