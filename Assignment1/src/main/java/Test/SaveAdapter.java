/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Persistance.Export;
import Persistance.XML;
import domein.Pattern.Pattern;
import java.util.List;

/**
 *
 * @author andy
 */
public class SaveAdapter implements Test {

  
    
    public SaveAdapter(String fileType){
        if(fileType.equalsIgnoreCase("xml") ){
         
      }
    }
    
    @Override
    public void Save(List<Pattern> p, String filePath, String fileType) {
        if(fileType.equalsIgnoreCase("xml")){
         
      }
    }
    
}
