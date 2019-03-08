package com.github.jitpack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AppTest 
{
    App app = new App();

    @Test
    public void testApp()
	
    {
		assertTrue( true );
        assertEquals("Hello world", app.greet("world"));
		assertEquals("Hello world", app.greet2("world"));
		
    }
	
}
