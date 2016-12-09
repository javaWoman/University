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
public class Date {
    protected int day;
    protected int month;
    protected int year;
 

    
    public Date (int day, int month, int year){
        this.day = day; 
        this.month= month;
        this.year= year;
}
    public Date () {  
    }
    
    public int getDay () {
        return day;
    }
    public int getMonth (){
        return month;
    }
    public int getYear (){
        return year;
    }
    @Override
    public String toString (){
        return day + "." + month + "." + year;
    }
    }
    
