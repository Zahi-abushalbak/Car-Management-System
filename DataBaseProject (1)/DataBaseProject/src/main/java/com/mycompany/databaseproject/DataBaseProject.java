/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.databaseproject;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import static org.jfree.ui.RefineryUtilities.centerFrameOnScreen;
/**
 *
 * @author Hadi
 */

public class DataBaseProject {

    public static void main(String[] args) { 
       JFrame frame = new NewJFrame();
       frame.setVisible(true);
       frame.setSize(1300, 940);
       frame.setResizable(false);
       frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
       centerFrameOnScreen(frame);
       frame.setLocationRelativeTo(null);
       JOptionPane.showMessageDialog(frame,"Use \"Admin\" for Username and Password, and \"123\" for the Passcode","Information",JOptionPane.INFORMATION_MESSAGE);
    }
}
