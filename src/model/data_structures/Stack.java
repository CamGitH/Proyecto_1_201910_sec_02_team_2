package model.data_structures;

import java.util.Iterator;

public class Stack<T> implements IStack<T> {

	private Nodo<T> ultimo;
	private int tamano=0;

	/**
	 * Retorna true si la Pila esta vacia
	 * @return true si la Pila esta vacia, false de lo contrario
	 */
	public Stack( )
	{
		ultimo = null;
		tamano = 0;
	}

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
	 * Inserta un nuevo elemento en la Pila
	 * @param t el nuevo elemento que se va ha agregar
	 */
	public void push(T t){
		Nodo<T> n = new Nodo<T>(t);
		n.cambiarAnterior(ultimo);
		ultimo.cambiarSiguiente(n);
		ultimo= n;
	}

	/**
	 * Quita y retorna el elemento agregado más recientemente
	 * @return el elemento agregado más recientemente
	 */
	public T pop(){
		Nodo<T> ret = ultimo;
		ultimo=ultimo.darSiguiente();
		ultimo.cambiarAnterior(null);;
		tamano--;
		return ret.darElemento();
	}


	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
