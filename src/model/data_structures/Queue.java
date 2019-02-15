package model.data_structures;

import java.util.Iterator;

public class Queue<T> implements IQueue<T> {

	private Nodo<T> primero;
	private Nodo<T> ultimo;
	private int tamano=0;

	/**
	 * Retorna true si la Cola esta vacia
	 * @return true si la Cola esta vacia, false de lo contrario
	 */
	public boolean isEmpty(){
		if (tamano==0){
			return true;
		}
		else{
			return false;
		}
	}

	/**
	 * Retorna el numero de elementos contenidos
	 * @return el numero de elemntos contenidos
	 */
	public int size(){
		return tamano;
	}

	/**
	 * Inserta un nuevo elemento en la Cola
	 * @param t el nuevo elemento que se va ha agregar
	 */
	public void enqueue(T t) {
		Nodo<T> n = new Nodo<T>(t);
		n.cambiarSiguiente(ultimo);
		ultimo.cambiarAnterior(n);
		ultimo=n;

	}
	/**
	 * Quita y retorna el elemento agregado menos recientemente
	 * @return el elemento agregado menos recientemente
	 */
	public T dequeue(){
		T ret = (T) primero;
		primero=primero.darAnterior();
		primero.cambiarSiguiente(null);
		return ret;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
