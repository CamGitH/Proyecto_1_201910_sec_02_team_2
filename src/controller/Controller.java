package controller;

import java.io.FileReader;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import model.data_structures.IQueue;
import model.data_structures.IStack;
import model.data_structures.Queue;
import model.data_structures.Stack;
import view.MovingViolationsManagerView;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class Controller {

	private MovingViolationsManagerView view;

	/**
	 * Cola donde se van a cargar los datos de los archivos
	 */
	private IQueue<VOMovingViolations> movingViolationsQueue;

	/**
	 * Pila donde se van a cargar los datos de los archivos
	 */
	private IStack<VOMovingViolations> movingViolationsStack;


	public Controller() {
		view = new MovingViolationsManagerView();

		//TODO, inicializar la pila y la cola
		movingViolationsQueue = new Queue();
		movingViolationsStack = new Stack();

	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		boolean fin = false;

		while(!fin)
		{
			view.printMenu();

			int option = sc.nextInt();

			switch(option)
			{
			case 1:
				this.loadMovingViolations();
				break;

			case 2:
				IQueue<VODaylyStatistic> dailyStatistics = this.getDailyStatistics();
				view.printDailyStatistics(dailyStatistics);
				break;

			case 3:
				view.printMensage("Ingrese el número de infracciones a buscar");
				int n = sc.nextInt();

				IStack<VOMovingViolations> violations = this.nLastAccidents(n);
				view.printMovingViolations(violations);
				break;

			case 4:	
				fin=true;
				sc.close();
				break;
			}
		}
	}


	@SuppressWarnings("unchecked")
	public void loadMovingViolations() {

		List<String[]> list1 = new ArrayList();
		List<String[]> list2 = new ArrayList();

		CSVReader reader =null;
		CSVReader reader2=null;


		try{

			reader=new CSVReaderBuilder(new FileReader("./data/Moving_Violations_Issued_in_January_2018_ordered.csv")).withSkipLines(1).build();
			
			list1 = reader.readAll();
			
			
			

				for(int i = 0;i<list1.size();i++){
					movingViolationsQueue.enqueue(new VOMovingViolations(Integer.parseInt(list1.get(i)[0]), Integer.parseInt(list1.get(i)[1]), list1.get(i)[2], Integer.parseInt(list1.get(i)[3]), Integer.parseInt(list1.get(i)[4]), Integer.parseInt(list1.get(i)[5]), Integer.parseInt(list1.get(i)[6]), list1.get(i)[7],
							Integer.parseInt(list1.get(i)[8]), Integer.parseInt(list1.get(i)[9]), Integer.parseInt(list1.get(i)[10]), Integer.parseInt(list1.get(i)[11]), list1.get(i)[12], list1.get(i)[13], Integer.parseInt(list1.get(i)[14]), Integer.parseInt(list1.get(i)[15]),list1.get(i)[16]));
				}


				reader2=new CSVReaderBuilder(new FileReader("./data/Moving_Violations_Issued_in_January_2018_ordered.csv")).withSkipLines(1).build();
				
				list2 = reader.readAll();
				
				
				

					for(int i = 0;i<list2.size();i++){
						movingViolationsQueue.enqueue(new VOMovingViolations(Integer.parseInt(list2.get(i)[0]), Integer.parseInt(list2.get(i)[1]), list2.get(i)[2], Integer.parseInt(list2.get(i)[3]), Integer.parseInt(list2.get(i)[4]), Integer.parseInt(list2.get(i)[5]), Integer.parseInt(list2.get(i)[6]), list2.get(i)[7],
								Integer.parseInt(list2.get(i)[8]), Integer.parseInt(list2.get(i)[9]), Integer.parseInt(list2.get(i)[10]), Integer.parseInt(list2.get(i)[11]), list2.get(i)[12], list2.get(i)[13], Integer.parseInt(list2.get(i)[14]), Integer.parseInt(list2.get(i)[15]),list2.get(i)[16]));
					}


		}catch( Exception e){
			e.printStackTrace();

		}

	}

	public IQueue <VODaylyStatistic> getDailyStatistics () {


		VOMovingViolations actual = movingViolationsQueue.dequeue();
		Queue<VODaylyStatistic> cola = new Queue<>();
		while( actual != null )
		{

			String fecha = actual.getTICKETISSUEDATE();
			int numeroAccidentes = 0;
			int numeroInfracciones = 0;
			int sumaFineATM = 0;
			
			
			while(actual.getTICKETISSUEDATE().equals(fecha)){
				if(!(actual.getACCIDENTINDICATOR().contains("No"))){
					numeroAccidentes++;
				}
				if(actual.getVIOLATIONCODE()!=0){
					numeroInfracciones++;
				}
				sumaFineATM+=actual.getFINEAMT();
				actual = movingViolationsQueue.dequeue();
			}
			//TODO agregar a la lista 
			VODaylyStatistic stat = new VODaylyStatistic(fecha, numeroAccidentes, numeroInfracciones, sumaFineATM);
			cola.enqueue(stat);
			
		}
		return cola;
	}


	public IStack <VOMovingViolations> nLastAccidents(int nAccidentes) {
		Stack<VOMovingViolations> pila = new Stack<>();
		for(int i = 0;i<nAccidentes;i++){
			pila.push(movingViolationsStack.pop());
		}
		return pila;
	}
}