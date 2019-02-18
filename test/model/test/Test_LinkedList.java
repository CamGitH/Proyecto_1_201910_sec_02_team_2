package model.test;

import junit.framework.TestCase;

import model.data_structures.LinkedList;
import model.data_structures.Nodo;
import model.data_structures.Stack;
import model.moving_violations.VOMovingViolations;

public class Test_LinkedList<T> extends TestCase {

	
    private LinkedList<T> listaEncadenada;
    

    private void escenario1( )
    {
        
    }
    /**
     * Agrega algunos nodos a la lista para realizar las pruebas
     */
    private void escenario2()
    {
    	escenario1();
    	VOMovingViolations violacion1 = new VOMovingViolations(1, 10, "calle1", 111, 101, 101010, 010101, "tipo1", 1000, 100, 0, 0, "Yes", "date1", 0, 0, "v1");
    	VOMovingViolations violacion2 = new VOMovingViolations(2, 20, "calle2", 222, 202, 202020, 020202, "tipo2", 2000, 200, 0, 0, "Yes", "date2", 0, 0, "v1");
    	VOMovingViolations violacion3 = new VOMovingViolations(3, 30, "calle3", 333, 303, 303030, 030303, "tipo3", 3000, 300, 0, 0, "No", "date3", 0, 0, "v1");
    	
//    	listaEncadenada.agregarFinal(violacion1);
//    	
//    	listaEncadenada.agregarFinal(violacion2);
//    	
//    	listaEncadenada.agregarFinal(violacion3);
    }
    


    public void testAgregarNodo( )
    {
//        escenario2( );
//        Nodo <T >nodoPrueba = listaEncadenada.darPrimero();
//        assertEquals( "El nodo no se agrego", nodoPrueba, nodo1 );
//        
//        Nodo <T >nodoPrueba2 = listaEncadenada.darUltimo();
//        assertEquals( "El nodo no se agrego", nodoPrueba2, nodo3 );
//        
//        Nodo <T >nodoPrueba3 = listaEncadenada.darPrimero().darSiguiente();
//        assertEquals( "El nodo no se agrego", nodoPrueba3, nodo2 );
//        
        
       
    }


    public void testEliminarNodo(){
    	escenario2( );
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
    	
    	escenario2();
    	assertEquals( "El tamaño de la lista es incorrecto", 3, listaEncadenada.getSize().intValue() );
    }
    
    public void recuperarObjetoPosicion(){
    	
    }
    
    public void crearLista(){
    	
    	escenario1();
    	 assertNotNull( "La lista se debio crear", listaEncadenada );
    }
    
    public void darSiguienteNodo(){
    	
    }
    
    public void darAnteriorNodo(){
    	
    }
  
   
}


