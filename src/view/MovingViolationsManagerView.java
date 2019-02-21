package view;

import model.data_structures.IQueue;

import model.data_structures.IStack;
import model.moving_violations.VOMovingViolations;


public class MovingViolationsManagerView 
{
	public MovingViolationsManagerView() {
		
	}
	
	public void printMenu() {
		System.out.println("---------ISIS 1206 - Estructuras de datos----------");
		System.out.println("---------------------Proyecto1----------------------");
		System.out.println("1. Cargar informacion del 1er cuatrimestre 2018");
		System.out.println("2. Cargar informacion del 2do cuatrimestre 2018");
		System.out.println("3. Cargar informacion del 3er cuatrimestre 2018");
		System.out.println("4. Mostrar datos cargados");
		System.out.println("5. Salir");
		System.out.println("Digite el numero de opcionn para ejecutar la tarea, luego presione enter: (Ej., 1):");
		
	}
	
	
	public void printMovingViolations(IQueue<VOMovingViolations> violations) {
		System.out.println("Se encontraron "+ violations.size() + " elementos");
		while(violations.size()!=0)
		{
			VOMovingViolations actual = violations.dequeue();
			System.out.println(actual.getObjectID() + " " 
								+ actual.getTicketIssueDate() + " " 
								+ actual.getLocation()+ " " 
								+ actual.getViolationCode());
		}
	}
	
	public void printMensage(String mensaje) {
		System.out.println(mensaje);
	}
}
