/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern;

/**
 *
 * @author Alexis
 * @param <E>
 */
public interface Iterator<E> {
    
    void reset();   // reset to the first element
 
    E next();   // To get the next element
 
    E currentItem();    // To retrieve the current element
 
    boolean hasNext();  // To check whether there is any next element or not.
}
    

