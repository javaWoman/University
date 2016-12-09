/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstobjectapp;


import javax.swing.JOptionPane;


/**
 *
 * @author Emily
 */
public class FirstObjectApp {

    public static void main(String[] args) {
   
        String sub, question, person, scholarship, salary;
        
        University uni = new University ("Harvard", 100, 3);
        JOptionPane.showMessageDialog(null, "Welcome to your school!");
        
        JOptionPane.showMessageDialog(null,"First add all subjects");
            do{
                sub=JOptionPane.showInputDialog("Name it:");
                uni.addSubject(new Subject(sub));
                question= JOptionPane.showInputDialog("Another one? y/n");
              } while (question.equals("y"));
        
        addPeopleToSchool (uni);
        
        uni.addPerson(new Student ("Leszek", "M",2,1500));
        uni.addPerson(new Student ("Krzysztof", "F",1));
        uni.addPerson(new Lecturer ("Rafał", "B"));
        uni.addPerson(new Lecturer ("Piotr", "G",160));
        uni.addPerson(new Professor ("Piotr", "G", 1876,22));
        
        JOptionPane.showMessageDialog(null, uni.getCosts());
        
        JOptionPane.showMessageDialog(null, "People in your university are: \n" + uni.showPeople());
        
            question= JOptionPane.showInputDialog("Add a subject to your student y/n");
            if (question.equals("y")){
                do{
                    person = JOptionPane.showInputDialog("Find your student. Input their surname");
                    do {
                        sub = JOptionPane.showInputDialog ("What subject will he have?");
                        uni.findStudent(person).addSubject(new Subject(sub));
                        uni.findSubject(sub).addStudent(uni.findStudent(person));
                        question = JOptionPane.showInputDialog("Another subject? y/n");
                    } while (question.equals("y"));
                    
                    question = JOptionPane.showInputDialog("Another student? y/n");
                    
                } while (question.equals("y"));
            }
        
            
            question = JOptionPane.showInputDialog("Add a subject to your teacher y/n");
            if (question.equals("y")){
                do {
                    person = JOptionPane.showInputDialog("Find your teacher. Input their surname");
                    sub= JOptionPane.showInputDialog ("What subject will he have?");
                    uni.findLecturer(person).addSubject(new Subject (sub));
                    uni.findSubject(sub).addLecturer(uni.findLecturer(person));
                    
                    question = JOptionPane.showInputDialog("Another teacher? y/n");
                } while (question.equals("y"));
            }
            
        JOptionPane.showMessageDialog(null, "Subjects: \n" + uni.showSubjects());
        
            question = JOptionPane.showInputDialog("Would you like to view students of a subject? y/n");
            if (question.equals("y")){
                    sub=JOptionPane.showInputDialog("The subject being: ");
                    JOptionPane.showMessageDialog(null, uni.studentsOfSubject(sub));
            }
            
        person = JOptionPane.showInputDialog("Discover what subjects this student has: ");
        JOptionPane.showMessageDialog(null, uni.findStudent(person).subjectsToString());
        
    }
    
    public static void addPeopleToSchool (University uni){
        String name, surname, person, question;
        int years;
        double salary, scholarship, premium;
        
        do {
           person= JOptionPane.showInputDialog("Do you want to add a student or a lecturer or a professor? s/l/p");
           
           name= JOptionPane.showInputDialog("Name:\n");
           surname  = JOptionPane.showInputDialog("Surname:\n");
           
           if (person.equals("s")){
                years= Integer.parseInt(JOptionPane.showInputDialog("Year at school: "));
                scholarship= Double.parseDouble(JOptionPane.showInputDialog("Add the scholarship this students receives: "));
                uni.addPerson(new Student (name, surname, years, scholarship));
            }
            else if (person.equals("l")) {
               salary=Double.parseDouble(JOptionPane.showInputDialog("Add the salary this teacher receives: "));
               uni.addPerson(new Lecturer (name, surname,salary));
            }
            else 
                salary=Double.parseDouble(JOptionPane.showInputDialog("Add salary"));
                premium = Double.parseDouble(JOptionPane.showInputDialog("Add premium"));
           
           question=JOptionPane.showInputDialog("Another person? y/n");
        } while (question.equals("y"));
    }
}
    
