/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance;

import domein.Pattern.Pattern;
import domein.Pattern.Patterns;
import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author andy
 */
public class XML implements Import, Export{
    Patterns pat = new Patterns();
    
    @Override
    public void SaveFile(List<Pattern> p, String filePath) {
        try{
            
            File file = new File(filePath);
            JAXBContext jC = JAXBContext.newInstance(Patterns.class);
            Marshaller ms = jC.createMarshaller();
            
            pat.setPatternList(p);
            
            ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            ms.marshal(pat,file);
            ms.marshal(pat,System.out);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    
    }
    
   
    @Override
    public List<Pattern> LoadPatternList(String filePath) {
        File file = new File(filePath);
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Patterns.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            pat = (Patterns) jaxbUnmarshaller.unmarshal(file);
          
        } catch (JAXBException ex) {
           ex.printStackTrace();
        }
        return pat.getPatternList();
    }
}
