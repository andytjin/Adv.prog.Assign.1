/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance;

import domein.Pattern.Pattern;
import java.util.List;

/**
 *
 * @author andy
 */
public interface Import {
    public List<Pattern> LoadPatternList(String filePath);
}
