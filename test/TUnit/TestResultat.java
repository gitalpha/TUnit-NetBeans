
package TUnit;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Batterie de tests sur la classe Resultat
 * @author Sébastien Renaud
 * @version 29 septembre 2011
 */
public class TestResultat {
    
    public TestResultat() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test public void resultatVide(){

        Resultat resultat = new Resultat();
        
        assertTrue(resultat.obtenirNombreTests() == 0);
        assertTrue(resultat.obtenirNombreTestsReussis() == 0);
        assertTrue(resultat.obtenirEchecs().isEmpty());
        assertFalse(resultat.obtenirErreurs().isEmpty());
  
    }
    
    @Test public void resultatUnTest(){

        Resultat resultat = new Resultat();
        
        resultat.compterTest(this);
        
        assertTrue(resultat.obtenirNombreTests() == 1);
        assertTrue(resultat.obtenirNombreTestsReussis() == 0);
        assertTrue(resultat.obtenirEchecs().isEmpty());
        assertFalse(resultat.obtenirErreurs().isEmpty());
  
    }
    
    @Test public void resultatUnTestReussi(){

        Resultat resultat = new Resultat();
        
        resultat.compterTest(this);
        resultat.compterTestReussi();
        
        assertTrue(resultat.obtenirNombreTests() == 1);
        assertTrue(resultat.obtenirNombreTestsReussis() == 1);
        assertTrue(resultat.obtenirEchecs().isEmpty());
        assertFalse(resultat.obtenirErreurs().isEmpty());
  
    }
    
    @Test public void resultatUnTestReussi(){

        Resultat resultat = new Resultat();
        
        resultat.compterTest(this);
        resultat.compterTestReussi();
        
        assertTrue(resultat.obtenirNombreTests() == 1);
        assertTrue(resultat.obtenirNombreTestsReussis() == 1);
        assertTrue(resultat.obtenirEchecs().isEmpty());
        assertFalse(resultat.obtenirErreurs().isEmpty());
  
    }
    
}
