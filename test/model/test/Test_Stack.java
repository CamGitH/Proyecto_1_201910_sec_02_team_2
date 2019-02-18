package model.test;

import junit.framework.TestCase;

public class Test_Stack  extends TestCase{

		private model.data_structures.Queue<String> s;


		public void setUp() {
			s = new model.data_structures.Stack<String>();

			System.out.println("Codigo de iniciacion");
			System.out.println("prueba");
		}


		public void test() {

			s.enqueue("n1");
			s.enqueue("n2");
			s.enqueue("n3");
			s.enqueue("n4");
			s.enqueue("n");
			if(s.size()!=5){
				fail("Error clase");
			}
			assertEquals("No funciona el añadido del queue","n",s.getUltimo().darElemento());
			assertEquals("La extraccion de info no funciona","n1",s.dequeue());
			assertEquals("No se elimino el primer elemento despues de consultarlos","n2",s.getPrimero().darElemento());

			
		
	}
}
