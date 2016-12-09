
package firstobjectapp;


public abstract class Person {
    //fields
    protected String name;
    protected String surname;
    protected Date dayOfBirth;
    
    
    
    //methods konstruktor- jak nazwa klasy identycznie
    public Person(String name, String surname, Date dayOfBirth){
        this.name = name; //this jest referencja na obiekt na który właśnie wywołaliśmy metodę
        this.surname= surname;
        this.dayOfBirth= dayOfBirth;
    }
    
    public Person(String name, String surname){
        this.name = name;
        this.surname= surname;
    }
    
    public Person (String name, String surname, int day, int month, int year){
        this.name = name; //this jest referencja na obiekt na który właśnie wywołaliśmy metodę
        this.surname= surname;
        this.dayOfBirth = new Date (day, month, year);
    }

    
    public String getName () { return name;}
    public String getSurname () {return surname;}
    public Date getDate () {return dayOfBirth;}
    public void setSurname (String s) {surname= s;}
    public int getDay () {return dayOfBirth.getDay() ;}
    public int getgetMonth () {return dayOfBirth.getMonth();}
    public int getYear () {return dayOfBirth.getYear();}
    public abstract double getCost ();
    
    @Override
    public String toString (){
        return name + " " + surname+ "\n";
    }
    
}
