
package TUnit;

/**
 * Classe qui d'exception des assertions
 * @author Sébastien Renaud
 * @version 29 septembre 2011
 */
public class AssertionException extends Exception {
    
    public AssertionException(String message){
       super(message);
    }
    
    public AssertionException(String message, Throwable cause){
        super(message,cause);
    }
        
}
