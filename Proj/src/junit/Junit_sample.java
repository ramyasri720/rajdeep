package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junit_sample {

	@Before
	public void a1() {
		System.out.println("this is before");
	}
	
		@After
		public void b1() {
	System.out.println("this is after");}
		@Test
		public void c1() {
			System.out.println("this is test1");}
		@Test
		public void e1() {
			System.out.println("this is test 2");}
		
			
		
		
	}
	

