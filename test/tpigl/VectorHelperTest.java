/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpigl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Amira
 */
public class VectorHelperTest {
    
    public VectorHelperTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   

    

    /**
     * Test of triVec method, of class VectorHelper.
     */
    @Test
    public void testTriVec() {
        System.out.println("triVec");
        int[] vec={4,1,7,5,9};
        VectorHelper instance = new VectorHelper(5,vec);
        instance.triVec();
        int[] expResult = {1,4,5,7,9};
        int[] result = instance.getVector();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of somVec method, of class VectorHelper.
     */
    @Test
    public void testSomVec() throws Exception {
        System.out.println("somVec");
        int[] vec={4,1,7,5,9};
        VectorHelper instance = new VectorHelper(5,vec);
        int[] vecc={3,9,2,5,4};
        VectorHelper v = new VectorHelper(5,vecc);
        
        int[] expResult = {7,10,9,10,13};
        int[] result = instance.somVec(v);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of inversVec method, of class VectorHelper.
     */
    @Test
    public void testInversVec() {
        System.out.println("inversVec");
        int[] vec={4,1,7,5,9};
        VectorHelper instance = new VectorHelper(5,vec);
        instance.inversVec();
        // TODO review the generated test code and remove the default call to fail.
        int[] expResult = {9,5,7,1,4};;
        int[] result = instance.getVector();
        assertArrayEquals(expResult, result);
    }

    

    /**
     * Test of minmax method, of class VectorHelper.
     */
    @Test
    public void testMinmax() {
        System.out.println("minmax");
        int[] vec={4,1,7,5,9};
        VectorHelper instance = new VectorHelper(5,vec);
        int[] expResult = {1,9};
        int[] result =instance.minmax();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of multiplvector method, of class VectorHelper.
     */
    @Test
    public void testMultiplvector() {
        System.out.println("multiplvector");
        int nb = 2;
         int[] vec={4,1,7,5,9};
        VectorHelper instance = new VectorHelper(5,vec);
        instance.multiplvector(nb);
        // TODO review the generated test code and remove the default call to fail.
        int[] expResult = {8,2,14,10,18};;
        int[] result = instance.getVector();
        assertArrayEquals(expResult, result);
    }
    
}
