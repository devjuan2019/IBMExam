
package com.ibm.examen;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ibm.examen.model.Suma;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ExamenApplicationTests {
	

    @Test    
    public void test() throws Exception {
    	Suma s = new Suma();
    	s.setId(new Long("1"));
    	s.setResultado(15);
    	s.setSumando01(10);
    	s.setSumando02(5);
    	assertNotNull(s);  	    	
               
    }
   


}
