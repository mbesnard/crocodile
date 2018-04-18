/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crocodile;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author m-besnard
 */
public class HumainTest {

    private Humain Hum;

    public HumainTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.Hum = new Humain("Toto");
    }

    @After
    public void tearDown() {
        Hum = null;
    }

    /**
     * Test of attaqueFatale method, of class Humain.
     */
    @Test
    public void testAttaqueFatale() {
        System.out.println("attaqueFatale");
        Humain instance = null;
        instance.attaqueFatale();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of attaquePartielle method, of class Humain.
     */
    @Test
    public void testAttaquePartielle() {
        System.out.println("attaquePartielle");
        int val = 0;
        Humain instance = null;
        instance.attaquePartielle(val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testAP() {
        try {
            Hum.attaquePartielle(-100);
                fail("L'attaque Partielle négative ne déclenche pas d'exception");
        } catch (IllegalArgumentException e) {
            assert (e.getMessage().contains("Nombre négatif"));
        }
    }

    /**
     * Test of aEteDevore method, of class Humain.
     */
    @Test
    public void testAEteDevore() {
        System.out.println("aEteDevore");
        Humain instance = null;
        boolean expResult = false;
        boolean result = instance.aEteDevore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deplacement method, of class Humain.
     */
    @Test
    public void testDeplacement() throws Exception {
        System.out.println("deplacement");
        char direction = ' ';
        Humain instance = null;
        instance.deplacement(direction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNom method, of class Humain.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Humain instance = null;
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPosx method, of class Humain.
     */
    @Test
    public void testGetPosx() {
        System.out.println("getPosx");
        Humain instance = null;
        int expResult = 0;
        int result = instance.getPosx();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPosy method, of class Humain.
     */
    @Test
    public void testGetPosy() {
        System.out.println("getPosy");
        Humain instance = null;
        int expResult = 0;
        int result = instance.getPosy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPointsdevie method, of class Humain.
     */
    @Test
    public void testGetPointsdevie() {
        System.out.println("getPointsdevie");
        Humain instance = null;
        int expResult = 0;
        int result = instance.getPointsdevie();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
