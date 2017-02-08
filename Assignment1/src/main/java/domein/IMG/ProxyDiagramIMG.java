/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein.IMG;

import java.awt.image.BufferedImage;

/**
 *
 * @author andy
 */
public class ProxyDiagramIMG implements DiagramIMG{
    private String fileName;
    private RealDiagramIMG RealDiagram;
    
    public String getFileName(){
        return fileName;
    }
    
    public void setFileName(String fln){
        fileName = fln;
    }

    @Override
    public void display() {
        if(RealDiagram == null){
            RealDiagram = new RealDiagramIMG(fileName);
        }
        RealDiagram.display();
    }
    
    public BufferedImage getRealIMG(){
        return RealDiagram.getDiagramIMG();
    }

    
    
   
}
