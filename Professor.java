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
public class Professor extends Person{
    protected double premium;
    protected double salary;
    
    public Professor (String name, String surname, double premium, double salary){
        super(name,surname);
        this.premium=premium;
        this.salary=salary;
    }
    
    public void addPremium (double premium){
        this.premium=premium;
    }
    
    public void addSalary (double salary){
        this.salary=salary;
    }

    @Override
    public double getCost (){
        double costs = premium + salary;
        return costs;
    }
}
