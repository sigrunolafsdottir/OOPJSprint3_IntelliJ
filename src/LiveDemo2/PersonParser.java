package LiveDemo2;

import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PersonParser {
    
    public List<Person> readList (Path p)  {
       
        String firstLine;
        String secondLine;
        String name;
        String socNr;
        LocalDate ld;
        Person person = new Person();
        List<Person> personList = new ArrayList<>();
            
       try{
            Scanner sc = new Scanner(p);

            while (sc.hasNext()){
                firstLine = sc.nextLine();
                secondLine = sc.nextLine();
                socNr = firstLine.split(",")[0].trim();
                name = firstLine.split(",")[1].trim();
                ld = LocalDate.parse(secondLine);
                person = new Person(name,socNr, ld );
                personList.add(person);
            }
       }
        catch (Exception e){
                e.printStackTrace();
        }
        
        return personList;
    } 

}
