package junit.assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

@TestInstance(Lifecycle.PER_CLASS)
class MyClassTest {
	
	MyClass obj;
	
	int x=0;
	
	@BeforeAll
	public void init() {
		System.out.println("Init Method Excecuted..");
	}
	
	@BeforeEach
	public void beforeEachTest() {
		obj=new MyClass();
		System.out.println("Test Started..");
		x++;
	}
	
	@AfterEach
	public void afterEachTest() {
		obj=null;
		System.out.println("Test Ended.. x = "+x);
	}
	
	@AfterAll
	public void complete() {
		System.out.println("All test are done..");
	}
	
	
	@Test
	@DisabledOnOs(value = OS.WINDOWS)
	@EnabledOnJre(value = JRE.JAVA_15)
	void testDivideForException() {
		assertThrows(RuntimeException.class, ()-> obj.divide(5, 0));
	}

	@Test
	void testAdd() {
		assertEquals(15, obj.add(10, 5));
	}

	@Test
	void testDivide() {
		assertEquals(2, obj.divide(6, 3));
		
	}
	
	

}
