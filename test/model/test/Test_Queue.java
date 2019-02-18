package model.test;







import java.util.Queue;

import junit.framework.TestCase;


public class Test_Queue extends TestCase{

	private Queue<String> q;
	
	
	public void setUp() {
		q = new Queue<String>();
		
		System.out.println("Codigo de iniciacion");
		System.out.println("prueba");
	}
	
	
	public void test() {
		
		q.enqueue("n1");
		q.enqueue("n2");
		q.enqueue("n3");
		q.enqueue("n4");
		q.enqueue("n");
		if(q.size()!=5){
			fail("Error fatal en la clase queue");
		}
		assertEquals("No funciona el añadido del queue","n",q.getUltimo().darElemento());
		assertEquals("La extraccion de info no funciona","n1",q.dequeue());
		assertEquals("No se elimino el primer elemento despues de consultarlos","n2",q.getPrimero().darElemento());
		
		
	}

}