/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein.Pattern;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author andy
 */
//need a patterns class to retrieve a list of patterns from the xml file
@XmlRootElement(name = "Patterns")
@XmlAccessorType (XmlAccessType.FIELD)
public class Patterns {
    
    private List<Pattern> p;

    public void setPatternList(List<Pattern> patternInfo) 
    {
        this.p = patternInfo;
    }

    @XmlElement(name="PatternList")
    public List<Pattern> getPatternList() {
        return p;
    }
}
