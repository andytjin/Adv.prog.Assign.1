/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternController;

import domein.IMG.ProxyDiagramIMG;
import domein.Pattern.Category;
import domein.Pattern.Pattern;
import Persistance.XML;
import domein.Pattern.Patterns;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author andy
 */
public class PatternController {

    private XML xml = new XML();
    private String filePath, pName;
    private List<Pattern> patternlist = new ArrayList<Pattern>();
    private static PatternController instance = new PatternController();
    private Pattern modPattern;

    private PatternController(){
        
    }
    
    public BufferedImage getDiagramIMG(Pattern p) {
        ProxyDiagramIMG pd = p.getDiagram();
        pd.display();
        return pd.getRealIMG();
    }
  
    
    
    public static PatternController getInstance(){
        return instance;
    }

    public void setFilePath(String fP) {
        filePath = fP;
    }

    public String getFilePath() {
        return filePath;
    }

    public void saveNieuwePattern(String naam, String scope, String category, String context, String problem,
            String solution, String consequences, String diagram) {

        Category c = new Category();
        c.setNaam(category);

        ProxyDiagramIMG pdi = new ProxyDiagramIMG();
        pdi.setFileName(diagram);

        patternlist.add(new Pattern(naam, scope, context, problem, solution, consequences, pdi, c));
        xml.SaveFile(patternlist, filePath);

    }

    public void addNieuwePattern(String naam, String scope, String category, String context, String problem,
            String solution, String consequences, String diagram) {
        Category c = new Category();
        c.setNaam(category);

        ProxyDiagramIMG pdi = new ProxyDiagramIMG();
        pdi.setFileName(diagram);

        patternlist = xml.LoadPatternList(filePath);
        patternlist.add(new Pattern(naam, scope, context, problem, solution, consequences, pdi, c));
        xml.SaveFile(patternlist, filePath);
    }
    public void savePatternList(List<Pattern> patternlist){
        xml.SaveFile(patternlist, filePath);
    }
    public List<Pattern> getAllePatterns() {
        //Patterns pat = new Patterns();
        System.out.println(filePath);
        patternlist = xml.LoadPatternList(filePath);
        System.out.println(patternlist);
        return patternlist;
    }
    
   
    
    public void setPatternMod(Pattern p){
        modPattern = p;
    }
    public Pattern getPatterMod(){
        return modPattern;
    }
    
    public Pattern ZoekPattern(String pNaam,List<Pattern> plist){
        Pattern pe = null;
        for(Pattern p1: plist){
            if(p1.getName().equals(pNaam)){
                pe = p1;
            }
        }
        return pe;
    }
   
    
    public void verwijderPattern(String pNaam, List<Pattern> plist){
        Pattern pv = ZoekPattern(pNaam,plist);
        if(pv != null){
            plist.remove(pv);
        }
    }
    
    
    
    public List<Pattern> getComboBoxPList(String Scope, String Category){
        if(Scope.equals("Class") && Category.equals("Creational")){
            ListIterator<Pattern> it = patternlist.listIterator();
            while (it.hasNext()){
                if(!it.next().getScopeAndCategory().equals(Category+Scope)){
                   it.remove();
                } 
            }   
        }
        if(Scope.equals("Object") && Category.equals("Creational")){
            ListIterator<Pattern> it = patternlist.listIterator();
            while (it.hasNext()){
                if(!it.next().getScopeAndCategory().equals(Category+Scope)){
                   it.remove();
                } 
            }   
        }
        if(Scope.equals("Class") && Category.equals("Structural")){
            ListIterator<Pattern> it = patternlist.listIterator();
            while (it.hasNext()){
                if(!it.next().getScopeAndCategory().equals(Category+Scope)){
                   it.remove();
                } 
            }   
        }
        if(Scope.equals("Object") && Category.equals("Structural")){
            ListIterator<Pattern> it = patternlist.listIterator();
            while (it.hasNext()){
                if(!it.next().getScopeAndCategory().equals(Category+Scope)){
                   it.remove();
                } 
            }   
        }
        if(Scope.equals("Class") && Category.equals("Behavioral")){
            ListIterator<Pattern> it = patternlist.listIterator();
            while (it.hasNext()){
                if(!it.next().getScopeAndCategory().equals(Category+Scope)){
                   it.remove();
                } 
            }   
        }
        if(Scope.equals("Object") && Category.equals("Behavioral")){
            ListIterator<Pattern> it = patternlist.listIterator();
            while (it.hasNext()){
                if(!it.next().getScopeAndCategory().equals(Category+Scope)){
                   it.remove();
                } 
            }   
        }
        
        return patternlist;
    }
    
        
        
       
}
