/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstobjectapp;

/**
 *
 * @author Emily
 */
public class Lecturer extends Person {
    protected Subject subject;
    protected double salary;
    
    public Lecturer (String name, String surname, String subject, double salary){
        super(name,surname);
        this.subject= new Subject (subject);
        this.salary = salary;
    }
    public Lecturer (String name, String surname){
        super(name,surname);
        subject = new Subject ("");
    }
    public Lecturer (String name, String surname, double salary){
        super(name, surname);
        this.salary=salary;
        subject = new Subject ("");
    }
    
    public void addSubject (Subject s){
         subject=s;
    }
    public void addSalary (double salary){
        this.salary=salary;
    }
    public double getCost(){
        return salary;
    }
    @Override
    public String toString (){
        return name+ " "+ surname+ " "+ salary+ "\n";
    }
    
}
