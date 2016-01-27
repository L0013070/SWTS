/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swts1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author L00131070
 */
public class SWTS1Test {
    
    public SWTS1Test() {
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
     * Test of main method, of class SWTS1.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SWTS1.main(args);
    }

    /**
     * Test of getData1 method, of class SWTS1.
     */
    @Test
    public void testGetData1() {
        System.out.println("getData1");
        SWTS1 instance = new SWTS1();
        int expResult = 10;
        instance.setData1(expResult);
        int result = instance.getData1();
        assertEquals(expResult, result);
    }

    /**
     * Test of setData1 method, of class SWTS1.
     */
    @Test
    public void testSetData1() {
        System.out.println("setData1");
        int data1 = 10;
        SWTS1 instance = new SWTS1();
        instance.setData1(data1);
        int result = instance.getData1();
        assertEquals(data1, result);
    }

    /**
     * Test of getData2 method, of class SWTS1.
     */
    @Test
    public void testGetData2() {
        System.out.println("getData2");
        SWTS1 instance = new SWTS1();
        int expResult = 20;
        instance.setData2(expResult);
        int result = instance.getData2();
        assertEquals(expResult, result);
     }

    /**
     * Test of setData2 method, of class SWTS1.
     */
    @Test
    public void testSetData2() {
        System.out.println("setData2");
        int data2 = 20;
        SWTS1 instance = new SWTS1();
        instance.setData2(data2);
        int result = instance.getData2();
        assertEquals(data2, result);
    }

    /**
     * Test of toString method, of class SWTS1.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SWTS1 instance = new SWTS1();
        String expResult = "data1: 0 data2: 0";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
