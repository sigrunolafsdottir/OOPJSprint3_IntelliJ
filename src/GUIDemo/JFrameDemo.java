package GUIDemo;

import javax.swing.JFrame;


public class JFrameDemo  {
    
    JFrameDemo(){
        JFrame jf = new JFrame();
        jf.setTitle("En titel");
        jf.setSize(5000, 5000);
        jf.setLocation(100, 50);
       //this.setLocationRelativeTo(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        JFrameDemo g = new JFrameDemo();
    }
    
}
