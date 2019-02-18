package model.test;

import junit.framework.TestCase;
import model.data_structures.Stack;

public class Test_Stack  extends TestCase{

		private Stack<String> s;


		public void setUp() {
			s = new Stack<String>();

			System.out.println("Codigo de iniciacion");
			System.out.println("prueba");
		}


		public void test() {

			s.push("n1");
			s.push("n2");
			s.push("n3");
			s.push("n4");
			s.push("n");
			if(s.size()!=5){
				fail("Error clase");
			}
			assertEquals("No funciona pop","n1",s.pop());
			assertEquals("No funciona pop","n2",s.pop());
			assertEquals("No funciona pop","n3",s.pop());
			
			
		
	}
}
