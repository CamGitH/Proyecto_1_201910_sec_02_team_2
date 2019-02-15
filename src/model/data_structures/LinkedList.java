package model.data_structures;

import java.util.Iterator;

/**
 * Abstract Data Type for a linked list of generic objects
 * agregar, agregarFin, getSize, delete, eliminarultimo
 * next, previous
 * @param <T>
 */
public class LinkedList<T> implements ILinkedList<T>{

	private Nodo<T> primero;
	private Nodo<T> ultimo;
	private int tamano=0;

	public Nodo<T> darPrimero(){
		return primero;
	}

	public T darUltimo(){
		return ultimo;
	}

	public void agregarIni(T nuevo){
		Nodo<T> nodo = new Nodo(nuevo);
		if(tamano==0){
			primero=(T) nodo;
			ultimo=(T) nodo;
			tamano ++;
		}
		else{
			((Nodo<T>) nuevo).cambiarSiguiente(primero);
			primero=nuevo;
			tamano ++;
		}
	}
	
	public void agregarFinal(T nuevo){
		Nodo<T> nodo = new Nodo(nuevo);
		if(tamano==0){
			
			primero= nodo;
			ultimo= nodo;
			tamano ++;
		}
		else{
			ultimo.cambiarSiguiente(nodo);
			ultimo=nodo;
			tamano ++;
		}
	}
	
	

	
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getSize() {
		return tamano;
	}

	public void eliminarUltimo() throws Exception{
		if (tamano==0){
			throw new Exception("La lista no existe");
		}
		else if(tamano==1){
			primero=null;
			ultimo=null;
		}
		else{
			((Nodo<T>) ultimo).darAnterior().cambiarSiguiente(null);
			ultimo=(T) ((Nodo<T>) ultimo).darAnterior();
			tamano --;
		}
	}

	public void eliminarPrimero() throws Exception{
		if (tamano==0){
			throw new Exception("La lista no existe");
		}
		else if(tamano==1){
			primero=null;
			ultimo=null;
		}
		else{
		((Nodo<T>) primero).darSiguiente().cambiarAnterior(null);
		primero=primero.darSiguiente();
		tamano --;
		}
	}
}
