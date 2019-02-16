package model.test;

import junit.framework.TestCase;
import model.data_structures.LinkedList;
import model.data_structures.Nodo;

public class Test_LinkedList<T> extends TestCase {

	
    private LinkedList<T> listaEncadenada;
    
    private Nodo<T> nodo1;
    
    private Nodo<T> nodo2;
    
    private Nodo<T> nodo3;

  
    private void escenario1( )
    {
        listaEncadenada = new LinkedList<>();
    }
    /**
     * Agrega algunos nodos a la lista para realizar las pruebas
     */
    private void escenario2()
    {
//    	escenario1();
//    	T elemento = "String";
//    	listaEncadenada.agregarFinal(nodo1);
//    	nodo2 = new Nodo<T>(null);
//    	listaEncadenada.agregarFinal(nodo2);
//    	nodo3 = new Nodo<T>(null);
//    	listaEncadenada.agregarFinal(nodo3);
    }
    


    public void testAgregarNodo( )
    {
        escenario2( );
        Nodo <T >nodoPrueba = listaEncadenada.darPrimero();
        assertEquals( "El nodo no se agrego", nodoPrueba, nodo1 );
        
        Nodo <T >nodoPrueba2 = listaEncadenada.darUltimo();
        assertEquals( "El nodo no se agrego", nodoPrueba2, nodo3 );
        
        Nodo <T >nodoPrueba3 = listaEncadenada.darPrimero().darSiguiente();
        assertEquals( "El nodo no se agrego", nodoPrueba3, nodo2 );
        
        
       
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


