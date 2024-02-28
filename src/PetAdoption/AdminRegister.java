/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PetAdoption;

/**
 *
 * @author eirmo
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

public class AdminRegister extends JFrame {

    private JPanel contentPane;

    public AdminRegister(Dimension size) {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(473, 100, size.width, size.height);

        contentPane = new JPanel();
        contentPane.setBackground(new Color(53, 94, 59));
        contentPane.setLayout(null);

        // Add your components or logic here as needed
    }

    public static void main(String[] args) {
        // Get the size of the green JPanel in MainActivity
        Dimension size = new Dimension(427, 600);

        // Create an instance of AdminRegister with the size information
        AdminRegister adminRegisterFrame = new AdminRegister(size);

        // Make the frame visible
        adminRegisterFrame.setVisible(true);
    }
}

