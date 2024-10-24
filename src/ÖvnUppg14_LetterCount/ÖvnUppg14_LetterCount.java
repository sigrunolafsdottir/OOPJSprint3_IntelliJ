package ÖvnUppg14_LetterCount;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;


public class ÖvnUppg14_LetterCount {

    public ÖvnUppg14_LetterCount() {

        String temp;
        int[] fördelning = new int[100];
        int total = 0;

        try{
            URL url = new URL("https://github.com/dwyl/english-words/blob/master/words.txt?raw=true");
        
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()))) {
                while ((temp = in.readLine()) != null ){
                    int size = temp.length();
                    fördelning[size]++;
                    total++;
                }
        
                for (int i = 0; i < fördelning.length; i++){
                    if (fördelning[i] != 0){
                        System.out.println("Antal ord med "+ i +" bokstäver: "
                                +fördelning[i] );
                    }
                }
                
            }
            System.out.println("Totala mängden ord: "+total);
        }
        catch (MalformedURLException e){
            e.printStackTrace();
       }

        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args){
        ÖvnUppg14_LetterCount ö = new ÖvnUppg14_LetterCount();
    }
}
