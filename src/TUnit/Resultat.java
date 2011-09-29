
package TUnit;

import java.util.Vector;

/**
 * Classe qui recoit le resultat des tests
 * @author Sébastien Renaud
 * @version 29 septembre 2011
 */
public class Resultat extends Object { 
    
    private int nombreTestsLances;
    private int nombreTestsReussis;
    private Vector lesErreurs = new Vector();
    private Vector lesEchecs = new Vector(); 
    
    public Resultat() { 
       nombreTestsLances = 0;
       nombreTestsReussis = 0;
    }
    
    public void compterTest( Object unTest ) { 
        nombreTestsLances++;
    }
    
    public void compterTestReussi(){
        nombreTestsReussis++;
    }
    
    // Erreurs d'assertion imprévues
    public void ajouterErreur( UniteTest test, Throwable exceptionLevee ) { 
        lesErreurs.addElement(new GestionnaireExceptions( test, exceptionLevee )); 
    } 
    
    // Echecs d'assertion
    public void ajouterEchec( UniteTest test, Throwable exceptionLevee ) { 
        lesEchecs.addElement(new GestionnaireExceptions( test, exceptionLevee )); 
    }

    
    public int obtenirNombreTests(){
        return nombreTestsLances;
    }
    
    public int obtenirNombreTestsReussis(){
        return nombreTestsReussis;
    }
    
    public Vector obtenirErreurs(){
        return lesErreurs;
    }

    public Vector obtenirEchecs(){
        return lesEchecs;
    }
            
}


