package GUIDemo;

import javax.swing.JFrame;


public class JFrameDemo {
    
    JFrameDemo(){
        //alternativt kan man låta denna klass extenda JFrameDemo
        //Då behövs inget JFrame-objekt och istf. "jf." används "this."
        JFrame jf = new JFrame();
        jf.setTitle("En titel");
        jf.setSize(500, 200);
        //jf.setLocation(100, 50);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        JFrameDemo g = new JFrameDemo();
    }
    
}
