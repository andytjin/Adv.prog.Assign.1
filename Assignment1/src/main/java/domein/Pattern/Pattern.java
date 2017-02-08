
package domein.Pattern;


import domein.IMG.ProxyDiagramIMG;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement (name="Pattern")
@XmlAccessorType(XmlAccessType.FIELD)
public class Pattern {
    
    
    private String nm;
    private String sc;
    private Category cg;
    private String ct;
    private String pb;
    private ProxyDiagramIMG di;
    private String sol;
    private String con; 
    
    public Pattern(){
        
    }
    
    public Pattern(String naam, String scope, String context, String problem,String solutions,String consequences, ProxyDiagramIMG pdi, Category c) {
        nm = naam;
        sc = scope;
        cg = c;
        ct = context;
        pb = problem;
        con = consequences;
        sol = solutions;
        di = pdi;
        
    }
    
    public String getName(){
        return nm;
    }
    
    @XmlElement
    public void setName(String nm) {
        this.nm = nm;
    }
    
    public String getScope(){
        return sc;
    }
    @XmlElement
    public void setScope(String sc) {
        this.sc = sc;
       
    }
    public Category getCategory(){
        return cg;
    }
    
  
    public void setCategory(Category cg) {
        this.cg = cg;
    }
    
    public String getContext(){
        return ct;
    }
    
    @XmlElement
    public void setContext(String ct) {
        this.ct = ct;
      
    }
    
    public String getProblem(){
        return pb;
    }
    
    @XmlElement
    public void setProblem(String pb) {
        this.pb = pb;
        
    }
    
    
    
    public ProxyDiagramIMG getDiagram(){
        return di;
    }
    
    
    public void setDiagram(ProxyDiagramIMG di) {
        this.di = di;
        
    }
    public String getSolution(){
        return sol;
    }
    
    @XmlElement
    public void setSolution(String sol) {
        this.sol = sol;
      
    }
    
    public String getConcequences(){
        return con;
    }
    @XmlElement
    public void setConcequences(String con) {
        this.con = con;
       
    }
    
    public String getScopeAndCategory(){
        String s = cg.getNaam()+sc;
        System.out.println(s);
        return s;
        
    }
    
    public String toString(){
        return ct;
        
    }
    
}
