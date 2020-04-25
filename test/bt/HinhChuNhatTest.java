/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tqtr
 */
public class HinhChuNhatTest {
    
    public HinhChuNhatTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of DienTich method, of class HinhChuNhat.
     */
    @Test
    public void testDienTich() {
        System.out.println("DienTich");
        HinhChuNhat instance = new HinhChuNhat();
        double expResult = 0.0;
        double result = instance.DienTich();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ChuVi method, of class HinhChuNhat.
     */
    @Test
    public void testChuVi() {
        System.out.println("ChuVi");
        HinhChuNhat instance = new HinhChuNhat();
        double expResult = 0.0;
        double result = instance.ChuVi();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDai method, of class HinhChuNhat.
     */
    @Test
    public void testGetDai() {
        System.out.println("getDai");
        HinhChuNhat instance = new HinhChuNhat();
        double expResult = 0.0;
        double result = instance.getDai();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDai method, of class HinhChuNhat.
     */
    @Test
    public void testSetDai() {
        System.out.println("setDai");
        double dai = 0.0;
        HinhChuNhat instance = new HinhChuNhat();
        instance.setDai(dai);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRong method, of class HinhChuNhat.
     */
    @Test
    public void testGetRong() {
        System.out.println("getRong");
        HinhChuNhat instance = new HinhChuNhat();
        double expResult = 0.0;
        double result = instance.getRong();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRong method, of class HinhChuNhat.
     */
    @Test
    public void testSetRong() {
        System.out.println("setRong");
        double rong = 0.0;
        HinhChuNhat instance = new HinhChuNhat();
        instance.setRong(rong);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
