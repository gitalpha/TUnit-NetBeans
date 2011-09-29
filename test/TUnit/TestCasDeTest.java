
package TUnit;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Batterie de tests sur la classe CasDeTest
 * @author Sébastien Renaud
 * @version 29 septembre 2011
 */
public class TestCasDeTest {
    
    public TestCasDeTest() {
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

    
    @Test public void casDeTestVide(){

        CasDeTest test = new CasDeTest( "vide" ) {
            @Override
            public void lancer( Resultat resultat ){
                
            }
            
            @Override
            protected void setUp() {
                System.out.println( "avant casDeTestVide" );
            }

            @Override
            protected void tearDown() {
                System.out.println( "apres casDeTestVide" );
                System.out.println( "---------------------------------" );
            }

        };
        
        test.lancer();
        Resultat resultat = test.obtenirResultat();
        assertTrue(resultat.obtenirNombreTests() == 1);
        assertTrue(resultat.obtenirNombreTestsReussis() == 0);
        assertTrue(resultat.obtenirEchecs().isEmpty());
        assertFalse(resultat.obtenirErreurs().isEmpty());
  
    }
    
    
    @Test public void casDeTestSimple(){

        CasDeTest test = new CasDeTest( "simple" ) {
            @Override
            public void lancer( Resultat resultat ){
                
            }
            
            @Override
            protected void setUp() {
                System.out.println( "avant casDeTestSimple" );
            }

            @Override
            protected void tearDown() {
                System.out.println( "apres casDeTestSimple" );
                System.out.println( "---------------------------------" );
            }
            
            
            public void un_egale_un_entier(){
                Assertion assertion = new Assertion();
                Integer i = 1, j =1;
                try{
                    assertion.egaux( i, j );
                }catch( AssertionException e ){
                   System.out.println( "casDeTestSimple AssertionException " + e ); 
                }
            }

        };
        
        test.lancer();
        Resultat resultat = test.obtenirResultat();
        assertTrue(resultat.obtenirNombreTests() == 1);
        assertTrue(resultat.obtenirNombreTestsReussis() == 1);
        assertTrue(resultat.obtenirEchecs().isEmpty());
        assertTrue(resultat.obtenirErreurs().isEmpty());
  
    }
    
        
}
