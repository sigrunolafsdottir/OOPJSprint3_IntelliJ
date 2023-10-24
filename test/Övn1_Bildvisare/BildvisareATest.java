package Övn1_Bildvisare;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class BildvisareATest {

    BildvisareA bA = new BildvisareA();

    @Test
    public void bildvisarTest(){
        Component label = bA.panel.getComponent(0);
        Component button = bA.panel.getComponent(1);
       // Component panel = bA.getComponent(0);

        assert(label.getClass().getName().equalsIgnoreCase("javax.swing.JLabel"));
        assert(button.getClass().getName().equalsIgnoreCase("javax.swing.JButton"));

        assert(((JButton) button).getText().equalsIgnoreCase("Byt Bild"));

    }

}