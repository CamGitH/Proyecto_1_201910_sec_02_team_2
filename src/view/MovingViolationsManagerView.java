package view;

import model.data_structures.IQueue;

import model.data_structures.IStack;
import model.data_structures.LinkedList;
import model.data_structures.Nodo;
import model.data_structures.Queue;
import model.data_structures.Stack;
import model.moving_violations.VOMovingViolations;


public class MovingViolationsManagerView 
{
	public void printMenu() {
		System.out.println("---------ISIS 1206 - Estructuras de datos----------");
		System.out.println("---------------------Proyecto1----------------------");
		System.out.println("1. Cargar informacion del 1er cuatrimestre 2018");
		System.out.println("2. Cargar informacion del 2do cuatrimestre 2018");
		System.out.println("3. Cargar informacion del 3er cuatrimestre 2018");
		System.out.println("4. Mostrar datos cargados");
		System.out.println("----------------------------------------------------");
		System.out.println("5. Verificar Identificadores Unicos");
		System.out.println("6. Consultar Infracciones por fechas/horas inicial y final");
		System.out.println("7. Consultar promedio de FineATM por multas");
		System.out.println("8. Consultar las infracciones en una direccion dado un rango inicial y final");
		System.out.println("9. Consultar promedio de multas por tipo de infraccion");
		System.out.println("10. Consultar infracciones en rango de cantidad pagada");
		System.out.println("11. Consultar Infracciones por horas inicial y final ordenada ascendentemente");
		System.out.println("12. Informar el FINEAMT promedio y su desviación estándar de un tipo de infraccion.");
		System.out.println("----------------------------------------------------");
		System.out.println("13. Consultar el numero de infracciones en un rango de horas del dia [0, 24]");
		System.out.println("14. Dar grafica porcentaje accidentes del dia por hora");
		System.out.println("15. Dar deuda total por infracciones que se dieron en un rango de fechas.");
		System.out.println("16. Dar grafica de la deuda acumulada por infracciones");
		System.out.println("17. Salir");
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

	public void showID(LinkedList<VOMovingViolations> verifyObjectIDIsUnique) {
		Nodo<VOMovingViolations> objeto = verifyObjectIDIsUnique.darPrimero();

		while(objeto!=null){

			System.out.println(objeto.darElemento().toString());

			objeto=objeto.darSiguiente();
		}

	}

	public void violationsDate(Queue<VOMovingViolations> pCola) {

		VOMovingViolations objeto = pCola.dequeue();

		while(objeto!=null){

			System.out.println(objeto.getObjectID());
			System.out.println(objeto.getTicketIssueDate());

			objeto=pCola.dequeue();
		}

	}

	public void violationsAddress(Stack<VOMovingViolations> pPila) {

		VOMovingViolations objeto = pPila.pop();

		while(objeto!=null){

			System.out.println(objeto.getObjectID());
			System.out.println(objeto.getTicketIssueDate());
			System.out.println(objeto.getStreetSeg());
			System.out.println(objeto.getAddressID());

			objeto=pPila.pop();
		}

	}

	public void showATM(Queue<VOMovingViolations> pCola) {

		VOMovingViolations objeto = pCola.dequeue();

		while(objeto!=null){

			System.out.println(objeto.toString());

			objeto=pCola.dequeue();
		}

	}

	public void showPaidRange(Stack<VOMovingViolations> pPila) {

		VOMovingViolations objeto = pPila.pop();

		while(objeto!=null){

			System.out.println(objeto.getObjectID());
			System.out.println(objeto.getTicketIssueDate());
			System.out.println(objeto.getTotalPaid());

			objeto=pPila.pop();
		}

	}
	public void showDate2(Queue<VOMovingViolations> pCola) {

		VOMovingViolations objeto = pCola.dequeue();

		while(objeto!=null){

			System.out.println(objeto.getObjectID());
			System.out.println(objeto.getTicketIssueDate());
			System.out.println(objeto.getViolationDescription());

			objeto=pCola.dequeue();
		}

	}
}