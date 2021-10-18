package GUIDemo;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


    public class LivedemoLayout extends JFrame {

        JPanel rootPanel = new JPanel();
        JPanel toppanel = new JPanel();
        JPanel centerPanel = new JPanel();
        JPanel bottomPanel = new JPanel();
        JButton button1 = new JButton("Knapp");
        JButton button2 = new JButton("Knapp");
        JButton button3 = new JButton("Knapp");

        JLabel label1 = new JLabel("label");
        JLabel label2 = new JLabel("label");
        JLabel label3 = new JLabel("label");

        LivedemoLayout() {
            setSize(500, 500);

            label1.setBackground(Color.BLUE);
            label2.setBackground(Color.RED);
            label3.setBackground(Color.YELLOW);
            label1.setOpaque(true);
            label2.setOpaque(true);
            label3.setOpaque(true);

            rootPanel.setLayout(new BorderLayout());
            toppanel.setLayout(new FlowLayout());
            GridLayout g = new GridLayout(2,2);
            g.setVgap(2);
            g.setHgap(2);
            centerPanel.setLayout(g);
            bottomPanel.setLayout(new FlowLayout());

            add(rootPanel);
            rootPanel.add(toppanel, BorderLayout.NORTH);
            rootPanel.add(centerPanel, BorderLayout.CENTER);
            rootPanel.add(bottomPanel, BorderLayout.SOUTH);

            centerPanel.add(label1);
            centerPanel.add(label2);
            centerPanel.add(label3);

            toppanel.add(button1);
            toppanel.add(button2);
            toppanel.add(button3);

            setLocationRelativeTo(null);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

        public static void main(String[] args) {
            GUIDemo.LivedemoLayout g = new GUIDemo.LivedemoLayout();

        }

    }

