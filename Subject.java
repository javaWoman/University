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
public class Subject {
    protected String name;
    protected Lecturer teacher;
    protected Student [] studentsarray;
    protected int nstudents=0;
    
    public Subject (String name, Lecturer teacher, int nstudents){
        this.name=name;
        this.teacher=teacher;
        this.nstudents=nstudents;
    }
    
    public Subject (String name, Lecturer teacher, Student [] studentsarray){
        this.name=name;
        this.teacher=teacher;
        this.studentsarray=studentsarray;
    }
    public Subject (String name, Lecturer teacher){
        this.name=name;
        this.teacher=teacher;
    }
    public Subject (String name){
        this.name=name;
        studentsarray = new Student [100];
    }
    
    public Lecturer getTeacher (){
        return teacher;
    }
    
    public String getTitle (){
        return name;
    }
    
    public Student getStudent (Student s){
        for (int i=0; i<studentsarray.length;i++){
            if (studentsarray[i].equals(s)){
                return studentsarray[i];
            }
        }
        return null;
    }
    
    public int getNumberOfStudents (){
        return nstudents;
    }
    
    public void addStudent (Student s){
        studentsarray[nstudents++]=s;
    }
    public void addLecturer (Lecturer l){
        teacher=l;
    }
    
    public String toString (){
        return name + " Teacher: " + teacher + " In class " + nstudents+ " students\n";
    }
    
}
