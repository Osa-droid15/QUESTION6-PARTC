/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.windowadapterexample;

/**
 *
 * @author odong
 */
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapterExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("WindowAdapter Example");

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is closing");
                System.exit(0);
            }
        });

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setVisible(true);
    }
}
