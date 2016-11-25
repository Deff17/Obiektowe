package agh.cs.lab2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by David on 2016-11-11.
 */
public class PositionTest {
    @Test
    public void testToString() {
        assertEquals("(1,2)",new Position(1,2).toString());
        assertEquals("(2,3)",new Position(2,3).toString());
    }

    @Test
    public void testsmaller() throws Exception {
        assertTrue(new Position(1,1).smaller(new Position(4,5)));
        assertFalse(new Position(5,3).smaller(new Position(3,2)));
    }

    @Test
    public void testlarger() throws Exception {
        assertTrue(new Position(5,5).larger(new Position(1,1)));
        assertFalse(new Position(1,1).larger(new Position(5,5)));

    }

    @Test
    public void testequals() throws Exception {

    }

    @Test
    public void testadd() throws Exception {

    }

}