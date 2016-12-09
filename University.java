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
public class University {
    
    protected String name;
    protected int studentNumber=0;
    protected int lecturerNumber=0;
    protected int numberOfPeople=0;
    protected int numberOfSubjects =0;
    protected Person [] universityArray;
    protected Subject [] subjectArray;
   
    public University (String name, int capacity, int nSubjects){
        universityArray = new Person [capacity];
        subjectArray = new Subject [nSubjects];
    }
    
    public double getCosts (){
        double costs=0;
        for (int i=0; i<numberOfPeople; i++){
            costs = universityArray[i].getCost() + costs;
        }
        return costs;
    }
    public int getNumberOfStudents (){
        for (Person universityArray1 : universityArray) {
            if (universityArray1 instanceof Student) {
                studentNumber++;
            }
        }
        return this.studentNumber;
    }
    
    public int getNumberOfLecturers (){
        for (Person universityArray1: universityArray) {
            if (universityArray1 instanceof Lecturer){
                lecturerNumber++;
            }
        }
        return this.lecturerNumber;
    }
    
    public String getName () {
        return name;
    }
    
    public void addSubject (Subject s){
        subjectArray [numberOfSubjects++] = s;
    }
    
    public void addPerson (Person p) {
        universityArray [numberOfPeople++]= p;
    }
    
    public String showPeople (){
        String people = "";
        int i=0; 
        
        while(i<universityArray.length && universityArray[i]!=null){
            people=people+universityArray[i++];
        }
        return people;
    }
    
    public String showStudents (){
        int i=0;
        String studentArray= "";
        while(i<universityArray.length && universityArray[i]!=null){
            if (universityArray[i] instanceof Student){
                studentArray+= (Student) universityArray [i];
            }
            i++;
        }
        return studentArray;
    }
    
    public Lecturer [] showLecturers (){
        int i=0;
        Lecturer [] lecArray = new Lecturer [i];
        while(i<universityArray.length && universityArray[i]!=null){
            if (universityArray[i] instanceof Lecturer){
                lecArray [i] = (Lecturer) universityArray [i];
            }
            i++;
        }
        return lecArray;
    }
    
    public String showSubjects (){
        int i=0;
        String array = "";
        while(i<subjectArray.length && subjectArray[i]!=null){
                array = array + subjectArray [i];
            i++;
        }
        return array;
    }
 
    public Student findStudent (String surname){
         for (int i=0; i<universityArray.length;i++){
            if (universityArray[i].surname.equals(surname)&& universityArray[i] instanceof Student){
                return (Student)universityArray[i];
             }
        }
        return null;
    }
    
    public Lecturer findLecturer (String surname){
        for (int i=0; i<universityArray.length;i++){
            if (universityArray[i].surname.equals(surname) && universityArray[i] instanceof Lecturer){
                return (Lecturer) universityArray[i];
            }
        }
        return null;
    }
    
    public Subject findSubject (String s){
        for(int i=0; i<subjectArray.length;i++){
            if (subjectArray[i].name.equals(s)){
                return subjectArray[i];
            }
        }
        return null;
    }
    
    public String studentsOfSubject (String subjectName){
        String students = "";
        Subject sub = findSubject(subjectName);
        for( int i=0; i<sub.nstudents; i++){
            students = students + sub.studentsarray[i].getName() + " " + sub.studentsarray[i].getSurname() + "\n";
        }
        return students;
    }
    
    public String toString (){
        return name + " " + studentNumber+ " " + lecturerNumber + " " + numberOfPeople ;
    }
    
}
