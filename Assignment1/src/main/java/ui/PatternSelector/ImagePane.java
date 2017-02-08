/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PatternSelector;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author andy
 */
public class ImagePane extends JPanel{
    private BufferedImage img;
    public ImagePane() {}
    
    public void setImg(BufferedImage value) {
            if (img != value) {
                img = value;
                repaint();
            }
        }
     @Override
        public Dimension getPreferredSize() {
            BufferedImage img = getImg();
            return img == null ? new Dimension(200, 200) : new Dimension(img.getWidth(), img.getHeight());
        }
    
    @Override
    
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            BufferedImage img = getImg();
            if (img != null) {
                int x = (getWidth() - img.getWidth()) / 2;
                int y = (getHeight()- img.getHeight()) / 2;

                g2d.drawImage(img, x, y, this);
            }
            g2d.dispose();
        }

    private BufferedImage getImg() {
       return img;
    }
    
}
