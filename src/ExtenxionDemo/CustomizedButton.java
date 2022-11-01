package ExtenxionDemo;

import javax.swing.*;
import java.awt.*;

public class CustomizedButton extends JButton {

    public CustomizedButton(String caption){
        this.setBackground(Color.CYAN);
        this.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        this.setText(caption);
    }

}
