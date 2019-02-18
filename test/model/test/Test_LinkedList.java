package model.test;

import junit.framework.TestCase;

import model.data_structures.LinkedList;
import model.data_structures.Nodo;
import model.data_structures.Stack;
import model.moving_violations.VOMovingViolations;

public class Test_LinkedList extends TestCase {

	
    private LinkedList<String> listaEncadenada;
    
   
    private void escenario1()
    {
    	listaEncadenada = new LinkedList<String>();
    	
		
    }
    


    public void testAgregarNodo( )
    {

        escenario1();
        listaEncadenada.agregarIni("n1");
    	listaEncadenada.agregarIni("n2");
    	listaEncadenada.agregarIni("n3");
    	
    	assertEquals( "no agrego bien el elemento", "n1", listaEncadenada.darPrimero() );
    	assertEquals( "no agrego bien el elemento", "n3", listaEncadenada.darUltimo() );
    	assertEquals( "no agrego bien el elemento", "n2", listaEncadenada.darPrimero() );
    }


    public void testEliminarNodo(){
    	escenario1( );
    	try {
			listaEncadenada.eliminarUltimo();
			listaEncadenada.eliminarUltimo();
			listaEncadenada.eliminarUltimo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        assertNull( "El nodo no se elimino", listaEncadenada.darPrimero() );
        assertNull( "El nodo no se elimino", listaEncadenada.darPrimero().darSiguiente() );
        assertNull( "El nodo no se elimino", listaEncadenada.darPrimero().darSiguiente().darSiguiente() );
    }
    
    public void testConsultarTamano(){
    	
    	escenario1();
    	assertEquals( "El tamaño de la lista es incorrecto", 3, listaEncadenada.getSize().intValue() );
    }
    
    
    public void crearLista(){
    	
    	escenario1();
    	 assertNotNull( "La lista se debio crear", listaEncadenada );
    }
    
    public void darUltimo(){
    	escenario1();
    	assertEquals( "El ultimo es incorrecto", "n3", listaEncadenada.darUltimo() );
    }
    
    public void darPrimero(){
    	escenario1();
    	assertEquals( "El primero es incorrecto", "n1", listaEncadenada.darPrimero() );
    }
  
   
}


