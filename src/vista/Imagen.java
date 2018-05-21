/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author chelo
 */
public class Imagen extends JPanel {
    
       String ruta;
       
       public Imagen(String ruta){
           this.ruta=ruta;
           this.setSize(120,120);
       }
       
       public void paint(Graphics g){
           Dimension  height = getSize();
           ImageIcon img  = new ImageIcon(getClass().getResource(ruta));
           g.drawImage(img.getImage(),0,0,height.width,height.height,null);
           setOpaque(false);
           super.paintComponent(g);
       }
}
