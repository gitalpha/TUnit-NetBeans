
package TUnit;

import java.util.Vector;

/**
 * Classe qui affiche les résultats des tests
 * @author Sébastien Renaud
 * @version 29 septembre 2011
 */
public class AfficherResultat {
    
    private Resultat resultat;
    
    public AfficherResultat( Resultat a_resultat ){
        resultat = a_resultat;
    }
    
    public void afficherEntete(){
        System.out.println( "Résultats des tests : " );
    }
   
    public void afficherErreurs(){
        if( ! resultat.obtenirErreurs().isEmpty() ){
            Vector<GestionnaireExceptions> listeErreurs = resultat.obtenirErreurs();
            System.out.println("Erreurs lors des tests : ");
            for (GestionnaireExceptions uneErreur : listeErreurs)
            {
                System.out.println(uneErreur.obtenirTest().toString());
            }
        }
    }
    
    public void afficherEchecs(){
        if( ! resultat.obtenirEchecs().isEmpty() ){
            Vector<GestionnaireExceptions> listeEchecs = resultat.obtenirEchecs();
            System.out.println("Echecs lors des tests : ");
            for (GestionnaireExceptions unEchec : listeEchecs)
            {
                System.out.println(unEchec.obtenirTest().toString());
            }
        }
    }    
    
    public void afficherFin(){
        System.out.println( 
                resultat.obtenirNombreTestsReussis() + " tests réussis sur " +
                resultat.obtenirNombreTests() );
    }
    
    
    
    
    
}
