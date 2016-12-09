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
public class Student extends Person {
    protected int sYear;
    protected int debt;
    protected int nlecturers=0;
    protected double scholarship;
    protected Subject [] subjectsArray;
    protected int nsubjects=0;
    
    public Student (String name, String surname, int sYear){
        super(name,surname);
        this.sYear=sYear;
        subjectsArray = new Subject [3];
    }
    
    public Student (String name, String surname, int sYear, double scholarship){
        super(name,surname);
        this.sYear=sYear;
        subjectsArray = new Subject [3];
        this.scholarship=scholarship;
    }
    public Student (String name, String surname, int sYear, int debt){
        super(name, surname);
        this.sYear=sYear;
        this.debt=debt;
    }
    
    public Student (String name, String surname, Date dayOfBirth, int sYear, int debt, double scholarship){
        super(name, surname, dayOfBirth);
        this.sYear=sYear;
        this.debt = debt;
        this.scholarship=scholarship;
    }
    
    public Student (String name, String surname, int day, int month, int year, int sYear, double scholarship){
        super(name,surname,day,month,year);
        this.sYear=sYear;
        this.scholarship=scholarship;
    }
    
    public void addScholarship (double scholarship){
        this.scholarship=scholarship;
    }
    
    public double getCost (){
        return scholarship;
    }
    
    public void setDayOfBirth (Date dayOfBirth){
        this.dayOfBirth=dayOfBirth;  
    }
    
    public void setDebt (int debt){
        this.debt=debt;
    }
    
    public int getYear (){
        return sYear;
    }
    
    public String getName (){
        return name;
    }
    
    public String getSurname (){
        return this.surname;
    }
    
    public Date getDateOfBirth (){
        return dayOfBirth;
    }
    
    public String subjectsToString () {
        String allSubjects ="";
        for (int i=0;i<nsubjects;i++){
            allSubjects= allSubjects + subjectsArray[i].getTitle() + "\n";
        }
        return allSubjects;
    }
    
    public String toString (){
        return super.name + " " + super.surname + " " + sYear+ " " + scholarship +"\n";
    }
    
    public void addSubject (Subject s){
        subjectsArray [nsubjects++] = s;
     }

}
