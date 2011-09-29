package TUnit;

/**
 * Classe d'assertion de type générique
 * @author Sébastien Renaud
 * @version 29 septembre 2011
 */
public class Assertion<T> {
    
    
    public Boolean egaux( T element1, T element2 ) throws AssertionException {
        if( element1.equals( element2 ) )
            return true;
        else
            lancerException("Echec d'assertion.");
        
        return false;
    }
    
    
    private void lancerException( String message ) throws AssertionException {
        throw new AssertionException( message );
    }
    
    
}



