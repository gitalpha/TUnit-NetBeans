
package TUnit;

import org.junit.*;
import static org.junit.Assert.*;


/**
 * Batterie de tests sur l'assertion
 * @author Sébastien Renaud
 * @version 29 septembre 2011
 */
public class TestAssertion {
    
    public TestAssertion() {
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

    @Test public void un_egale_un_entier(){
        Assertion t = new Assertion();
        Integer i = 1, j =1;
        try{
            assertTrue("Integer 1 egale 1", t.egaux( i, j ) );
        }catch( AssertionException e ){
            
        }
    }

    @Test public void un_egale_un_entier2(){
        Assertion t = new Assertion();
        int i = 1, j =1;
        try{
            assertTrue("int 1 egale 1", t.egaux( i, j ) );
        }catch( AssertionException e ){
            
        }
    }

    @Test public void un_egale_un_chaine(){
        Assertion t = new Assertion();
        String i = "1";
        String j = "1";
        try{
            assertTrue("String 1 egale 1", t.egaux( i, j ) );
        }catch( AssertionException e ){
            
        }
    }
    
    @Test public void types_differents(){
        Assertion t = new Assertion();
        Integer i = 1;
        String j = "1";
        try{
            assertFalse("types_differents 1 n'egale pas '1'", t.egaux( i, j ) );
        }catch( AssertionException e ){
            
        }
    }

    
}
