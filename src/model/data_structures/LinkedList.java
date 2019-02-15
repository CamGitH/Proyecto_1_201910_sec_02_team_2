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

	public Nodo<T> darUltimo(){
		return ultimo;
	}

	public LinkedList()
	{
		primero = null;
		ultimo = null;
		tamano = 0;
	}

	public void agregarIni(T nuevo){
		Nodo<T> nodo = new Nodo<T>(nuevo);
		if(primero==null){
			primero= nodo;
			ultimo= nodo;
			tamano ++;
		}
		else{
			nodo.cambiarSiguiente(primero);
			primero=nodo;
			tamano ++;
		}
	}

	public void agregarFinal(T nuevo){
		Nodo<T> nodo = new Nodo<T>(nuevo);
		if(primero==null){

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
