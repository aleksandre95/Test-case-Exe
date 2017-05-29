/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import unit_test.Account;
import unit_test.Customers;

/**
 *
 * @author simon
 */
public class Tests {
    
    Account a = new Account(1000);
    
    public Tests() {
    }
    
    
     
    /*
      @Test
    // 3%
    public void  betweenZeroAndHundred() {
        assert(a.getInterest() == 50 );
    }
    
    @Test
    // page 80-90
    // invalid
    public void lessThanZero() {
        assert(a.getInterest() == -50); 
        
    }
    
    @Test
    // 3%
    public void  betweenZeroAndHundred() {
        assert(a.getInterest() == 50 );
    }
    
    @Test
    // 5%
    public void betweenHundredAndNineHundredAndNinetyNine() {
        // need to change amount 
        // expected intere
        assert(a.getInterest() == 500 );
    }
    
    @Test
    // 7%
    public void greaterOrEqualToAThousand() {
        assert(a.getInterest() == 50000);
    }
     
    /*
    @Test
    // valid for 3%
    public void validForThreePercent() {
        assert(a.getInterest() == 0);
        assert(a.getInterest() == 100);
        
    }
    @Test
    // invalid
    public void exactlyZeroPointZeroOne() {
        assert(a.getInterest() == 0.01);
    }
    
    
    */
    @Test
    public void decisionTable() {
        Customers c = new Customers(true, true, true);
        assert(c.getResult() == -1);
        c = new Customers(true, true, false);
        assert(c.getResult() == -1);
        c = new Customers(true, false, true);
        assert(c.getResult() == 20);
        c = new Customers(true, false, false);
        assert(c.getResult() == 15);
        c = new Customers(false, true, true);
        assert(c.getResult() == 30);
        c = new Customers(false, true, false);
        assert(c.getResult() == 10);
        c = new Customers(false, false, true);
        assert(c.getResult() == 20);
        c = new Customers(false, false, false);
        assert(c.getResult() == 0);
        
        
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

   
}