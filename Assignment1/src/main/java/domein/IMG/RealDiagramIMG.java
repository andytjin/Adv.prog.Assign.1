/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein.IMG;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author andy
 */
public class RealDiagramIMG implements DiagramIMG {
    private String fileName;
    private File DiagramIMG;
    private BufferedImage Dimg;
    
    public RealDiagramIMG(String filenm){
        fileName = filenm;
        loadFromDisk(fileName);
    }
    
    public void loadFromDisk(String fileName){
        DiagramIMG = new File(fileName);
    }

    @Override
    public void display() {
        if(fileName.contains("/")){
           try {
            Dimg = ImageIO.read(getClass().getResource(fileName));
            
        } catch (IOException ex) {
            Logger.getLogger(RealDiagramIMG.class.getName()).log(Level.SEVERE, null, ex);
        }
       } else {
           try {
            Dimg = ImageIO.read(DiagramIMG);
            
        } catch (IOException ex) {
            Logger.getLogger(RealDiagramIMG.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    }
    
    public BufferedImage getDiagramIMG(){
        return Dimg;
    }

}
