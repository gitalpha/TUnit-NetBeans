
package TUnit;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Classe qui lance les cas de tests
 * Les méthodes de test doivent débuter par test et ne pas avoir d'arguments
 * @author Sébastien Renaud
 * @version 28 septembre 2011
 */
public class SuiteDeTest implements UniteTest {
 
    private Vector lesTests = new Vector(); 
    
    
    public void ajouter( UniteTest test ) { 
        lesTests.addElement( test ); 
    }
    
    
    public void lancer( Resultat leResultat ) {
        
        for( Enumeration e = lesTests.elements(); e.hasMoreElements(); ) { 
            
            UniteTest unTest = (UniteTest)e.nextElement();
            
            unTest.lancer( leResultat ); 
        } 
        
    }
    
    
}

