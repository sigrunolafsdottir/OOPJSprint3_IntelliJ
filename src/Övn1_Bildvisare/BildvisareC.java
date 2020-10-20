package Övn1_Bildvisare;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

//Läser godtyckligt antal bilder från en katalog
public class BildvisareC extends JFrame implements ActionListener {
    JButton changeImageButton;
    JLabel imageViewer;
    JPanel panel = new JPanel();
    final String imagePath = "src\\övningsuppgift1\\images\\";
    Path imageFolder = Paths.get(imagePath);
    int imageIndex = 0;
    int imageCount= 0;
    List <String> imageFileNames = new ArrayList<>();

    //Creates a list of all files in a given directory
    protected List <String> loadImageNames(Path imageDir){
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(imageDir)) {
            for (Path file: stream) {
                imageFileNames.add(file.toString());
                System.out.println(file.toString());
            }
        } catch (IOException | DirectoryIteratorException x) {
            x.printStackTrace();
        }
        return imageFileNames;
    }

    public BildvisareC() {
        imageFileNames = loadImageNames(imageFolder);
        imageCount = imageFileNames.size();
        changeImageButton = new JButton("Byt bild");
        imageViewer = new JLabel(new ImageIcon(imageFileNames.get(imageIndex)));
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.BLACK);
        panel.add(imageViewer);
        panel.add(changeImageButton);
        this.add(panel);
        changeImageButton.addActionListener(this);
        setSize(800,600);   
        setVisible(true); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }
    
    public static void main(String args[]){
        BildvisareC bildvisare = new BildvisareC();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        imageIndex = (imageIndex + 1) % imageCount;
        imageViewer.setIcon(new ImageIcon( imageFileNames.get(imageIndex)));
    }
}
