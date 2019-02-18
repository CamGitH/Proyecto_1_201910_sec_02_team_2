package model.data_structures;

import java.util.Iterator;

public class Stack<T> implements IStack<T> {

	private Nodo<T> primero;
	private int tamano=0;

	/**
	 * Retorna true si la Pila esta vacia
	 * @return true si la Pila esta vacia, false de lo contrario
	 */
	public Stack( )
	{
		primero = null;
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
	 * @param elemento el nuevo elemento que se va ha agregar
	 */
	public void push(T elemento){
		Nodo<T> n = new Nodo<T>(elemento);
		n.cambiarAnterior(primero);
		if(primero==null){
			primero=n;
		}
		else{
			primero.cambiarSiguiente(n);
			primero= n;
		}
		tamano++;
	}

	/**
	 * Quita y retorna el elemento agregado más recientemente
	 * @return el elemento agregado más recientemente
	 * @throws Exception 
	 */
	public T pop(){
		if(size()==0){
			try {
				throw new Exception("la pila esta vacia");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		Nodo<T> nodo = primero;
		if(primero.darSiguiente()==null){
			primero=null;
			tamano=0;
		}
		else{
		primero=primero.darSiguiente();
		tamano--;
		}
		return nodo.darElemento();
	}


	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
