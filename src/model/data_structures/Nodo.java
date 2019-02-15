package model.data_structures;

/*
 *Clase del nodo
 */
public class Nodo<T> {

	private T elemento;

	private Nodo<T> anterior;

	private Nodo<T> siguiente;

	public Nodo( T pElemento )
	{
		elemento = pElemento;

	}

	public T darAlgo( )
	{
		return elemento;
	}
	
	public Nodo<T> darAnterior(){
		return anterior;
	}
	
	public Nodo<T> darSiguiente(){
		return siguiente;
	}
	
	public void cambiarAnterior(Nodo<T> ultimo){
		anterior =  ultimo;
	}
	
	public void cambiarSiguiente(Nodo<T> n){
		siguiente =  n;
	}
	
}