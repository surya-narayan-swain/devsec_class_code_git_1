package com.nit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testSumWithPositives() {
    	App app =new App();
    	int excepted=300;
    	int actual=app.sum(100, 200);
    	assertEquals(excepted, actual);
    }
    @Test
    public void testSumWithNegatives() {
    	App app =new App();
    	int excepted=-300;
    	int actual=app.sum(-100, -200);
    	assertEquals(excepted, actual);
    }
    
    @Test
    public void testSumWithMixedValues() {
    	App app =new App();
    	int excepted=-100;
    	int actual=app.sum(100, -200);
    	assertEquals(excepted, actual);
    }
}
