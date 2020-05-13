package com.leizhen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@ContextConfiguration(classes = FooServiceImpl.class)
public class FooServiceImplTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private FooService foo;

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testPlusCount() {
//        FooService foo = new FooServiceImpl();
        assertEquals(foo.getCount(), 0);

        foo.plusCount();
        assertEquals(foo.getCount(), 1);
    }

    @Test
    public void testGetCount() {
    }
}