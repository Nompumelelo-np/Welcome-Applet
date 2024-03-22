/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.welcomeapplet;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
/**
 *
 * @author Acer-User
 */
public class WelcomeApplet extends Applet{
    @Override
    public void init() {
        setBackground(Color.RED);
        setSize(400, 200); // Set width and height
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("WELCOME TO THE WORLD OF APPLETS", 50, 100);
    }
}
    
