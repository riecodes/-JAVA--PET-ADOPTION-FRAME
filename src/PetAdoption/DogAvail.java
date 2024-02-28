package PetAdoption;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.EventQueue;
import java.awt.Color;

public class DogAvail extends JFrame {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                DogAvail frame = new DogAvail();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public DogAvail() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 700);
        getContentPane().setBackground(new Color(53, 94, 59));
        getContentPane().setLayout(null);

        JLabel lblTitle = new JLabel("Bevvie");
        lblTitle.setForeground(Color.white);
        lblTitle.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        lblTitle.setBounds(0, 0, 900, 50);
        getContentPane().add(lblTitle);

        JPanel panel1 = new JPanel();
        panel1.setBounds(200, 50, 500, 290);
        getContentPane().add(panel1);

        ImageIcon imageIcon = new ImageIcon("dog.jpg"); // Directory here
        JLabel imageLabel = new JLabel(imageIcon);
        panel1.add(imageLabel);

        JPanel panel2 = new JPanel();
        panel2.setBounds(50, 350, 800, 250);
        getContentPane().add(panel2);
    }
}
