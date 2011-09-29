
package TUnit;

/**
 * Classe qui attrape les exceptions afin que tous les tests soient effectués
 * @author Sébastien Renaud
 * @version 29 septembre 2011
 */
public class GestionnaireExceptions extends Object{
    
    protected UniteTest testEchoue; 
    protected Throwable exceptionLevee;

    public GestionnaireExceptions( UniteTest a_testEchoue, Throwable a_exceptionLevee ) {
        this.testEchoue = a_testEchoue;
        this.exceptionLevee = a_exceptionLevee;
    }
    
    public UniteTest obtenirTest(){
        return testEchoue;
    }
    
    public Throwable obtenirExceptionLevee(){
        return exceptionLevee;
    }
    
}
