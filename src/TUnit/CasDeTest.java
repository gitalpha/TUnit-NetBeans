
package TUnit;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

/**
 * Classe d'un cas de tests
 * @author Sébastien Renaud
 * @version 29 septembre 2011
 */
public abstract class CasDeTest implements UniteTest {
    
    private final String nom;
    private Resultat leResultat;
    
    /*
     * Constructeur
     */
    public CasDeTest( String a_nom ) { 
        nom = a_nom;
        leResultat = new Resultat();
    }
    
    /*
     * Obtenir le nom du test
     * @return nom
     */
    public String obtenirNom(){
        return nom;
    }

    /*
     * Obtenir le resultat des tests de ce cas
     */
    public Resultat obtenirResultat(){
        return leResultat;
    }
    
    /*
     * Debuter ce cas de test par cette methode
     */
    public void lancer() {
        
        System.out.println("CasDeTest - lancer()");
        
        leResultat.compterTest( this );
        
        setUp(); 
        
        try { 
            lancerTest();
            leResultat.compterTestReussi();
        } 
        catch ( AssertionException e ) {
            leResultat.ajouterEchec( this, e ); 
            System.out.println("CasDeTest - lancer() AssertionException");
        } 
        catch ( Throwable e ) {
            leResultat.ajouterErreur( this, e ); 
            System.out.println("CasDeTest - lancer() Throwable");
        }
        finally { 
            tearDown(); 
        } 

    }
    
    /*
     * Actions a effectuer avant chaque methode de test
     */
    protected abstract void setUp();
    
    /*
     * Actions a effectuer apres chaque methode de test
     */
    protected abstract void tearDown();
    
    
    /* 
     * Lance chacune des methodes du cas de test
     */
    protected void lancerTest() throws Throwable {
        
        System.out.println("CasDeTest - lancerTest()");
        
        Method laMethode = null;
        
        try { 
            laMethode = getClass().getMethod( nom, new Class[0] ); 
        } catch ( NoSuchMethodException e ) { 
            System.out.println("Méthode "+laMethode.getName()+" est introuvable.");
        } 
        
        try { 
            laMethode.invoke( this, new Class[0] ); 
        } 
        catch( InvocationTargetException e ){
            System.out.println("CasDeTest - lancerTest() InvocationTargetException " + e );
        }
        catch( IllegalAccessException e ){
            System.out.println("CasDeTest - lancerTest() IllegalAccessException " + e );
        } 
        
    }
    
    
    
    
}
