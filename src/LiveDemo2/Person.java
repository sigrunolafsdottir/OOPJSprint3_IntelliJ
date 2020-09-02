package LiveDemo2;

import java.time.LocalDate;


public class Person {
    
    protected String name;
    protected String socSecNr;
    protected LocalDate lastPayDate;
    
    Person(){}

    Person(String name, String socSecNr, LocalDate lastPayDate) {
        this.name = name;
        this.socSecNr = socSecNr;
        this.lastPayDate = lastPayDate;
    }
    
    public String getName(){
        return name;
    }
    
    public String getSocSecNr(){
        return socSecNr;
    }
    
    public LocalDate getLastPayDate(){
        return lastPayDate;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setSocSecNr(String ssn){
        socSecNr = ssn;
    }
    
    public void setLastPayDate(LocalDate ld){
        lastPayDate = ld;
    }

}
