/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author USUARIO
 */
public class JPanelimage extends JLabel{
    
    private int x, y;
    private final String path;

public JPanelimage (JPanel panel, String path) {
this.path = path;
this.x = panel.getWidth();
this.y =panel.getHeight();
this.setSize(x, y);
}
@Override
public void paint (Graphics g) {
ImageIcon img = new ImageIcon(getClass().getResource(path));
g.drawImage(img.getImage(), 0, 0, x, y, null);
    
}
}