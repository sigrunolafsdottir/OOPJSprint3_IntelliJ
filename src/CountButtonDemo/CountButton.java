package CountButtonDemo;

import javax.swing.JButton;


public class CountButton extends JButton{
    private int count;
    private String text;
    
    public CountButton(int c){
        count = c;
        this.setText(new Integer(count).toString());
    }
    
    public void plusOne(){
        count++;
        this.setText(new Integer(count).toString());
        
    }
    
}
