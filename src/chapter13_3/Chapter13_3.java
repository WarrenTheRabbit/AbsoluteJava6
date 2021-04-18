/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter13_3;

/**
 *
 * @author Miranda and Warren
 */
public class Chapter13_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       NameCollection names = new NameCollection(new String[] {"Peter", "warren", "Troy"});
       Enumeration enumerator = names.getEnumeration();
       while (enumerator.hasNext()) {
           System.out.println(enumerator.getNext());
       }        
    }
    
}
