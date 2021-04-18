package javaapril21;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;  

//import com.javaapril21.logic.*;  
import org.junit.Test;  
import SImpleJava.HelloWorld;

public class HelloWorldTestCase {
	
	
	
	@Test                                               
      
    public void testMultiply() {
		
		HelloWorld hw = new HelloWorld();
		assertEquals(20, hw.multiply(5, 4));
		  
        
    }


	


	

}
