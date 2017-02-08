/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PatternEditor;

import domein.Pattern.Pattern;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 *
 * @author Thijs
 */
public class MyListRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
       Object item = value;
       if (item instanceof Pattern){
           item = ((Pattern)item).getName();
       }
       return super.getListCellRendererComponent(list, item, index, isSelected, cellHasFocus);
    }
    
}
