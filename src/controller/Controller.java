package controller;

import java.io.FileReader;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import model.data_structures.ILinkedList;
import model.data_structures.IQueue;
import model.data_structures.IStack;
import model.data_structures.LinkedList;
import model.data_structures.Nodo;
import model.data_structures.Queue;
import model.data_structures.Stack;
import model.moving_violations.VOMovingViolations;
import model.sort.Sort;
import view.MovingViolationsManagerView;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class Controller {

	private MovingViolationsManagerView view;

	/**
	 * Pila donde se van a cargar los datos de los archivos
	 */

	private Stack<VOMovingViolations> movingViolationsStack;
	private Queue<VOMovingViolations> movingViolationsQueue;
	private LinkedList<VOMovingViolations> movingViolationsList;
	
	Comparable<VOMovingViolations> [ ] comparables;


	public Controller() {

		view = new MovingViolationsManagerView();

		movingViolationsStack = new Stack<>();
		movingViolationsQueue = new Queue<>();

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
				this.loadMovingViolations1();
				break;
			case 2:
				this.loadMovingViolations2();
				break;
			case 3:
				this.loadMovingViolations3();
				break;
			case 4:
				view.printMensage("Estos son los datos, si ya los cargo:");

				view.printMovingViolations(movingViolationsQueue);
				break;

			case 5:	
				fin=true;
				sc.close();
				break;
			}
		}
	}


	public void loadMovingViolations1() {

		List<String[]> list = new ArrayList<String[]>();

		CSVReader reader =null;

		try{

			reader=new CSVReaderBuilder(new FileReader("./data/Moving_Violations_Issued_in_January_2018.csv")).withSkipLines(1).build();

			list = reader.readAll();
			readFiles(list);
			list.clear();

			reader=new CSVReaderBuilder(new FileReader("./data/Moving_Violations_Issued_in_February_2018.csv")).withSkipLines(1).build();

			list = reader.readAll();
			readFiles(list);
			list.clear();

			reader=new CSVReaderBuilder(new FileReader("./data/Moving_Violations_Issued_in_March_2018.csv")).withSkipLines(1).build();

			list = reader.readAll();
			readFiles(list);
			list.clear();

			reader=new CSVReaderBuilder(new FileReader("./data/Moving_Violations_Issued_in_April_2018.csv")).withSkipLines(1).build();

			list = reader.readAll();
			readFiles(list);
			list.clear();


		}catch( Exception e){

			e.printStackTrace();

		}

	}

	public void loadMovingViolations2() {

		List<String[]> list = new ArrayList<String[]>();

		CSVReader reader =null;

		try{

			reader=new CSVReaderBuilder(new FileReader("./data/Moving_Violations_Issued_in_May_2018.csv")).withSkipLines(1).build();

			list = reader.readAll();
			readFiles(list);
			list.clear();

			reader=new CSVReaderBuilder(new FileReader("./data/Moving_Violations_Issued_in_June_2018.csv")).withSkipLines(1).build();

			list = reader.readAll();
			readFiles(list);
			list.clear();

			reader=new CSVReaderBuilder(new FileReader("./data/Moving_Violations_Issued_in_July_2018.csv")).withSkipLines(1).build();

			list = reader.readAll();
			readFiles(list);
			list.clear();

			reader=new CSVReaderBuilder(new FileReader("./data/Moving_Violations_Issued_in_August_2018.csv")).withSkipLines(1).build();

			list = reader.readAll();
			readFiles(list);
			list.clear();


		}catch( Exception e){

			e.printStackTrace();

		}

	}

	public void loadMovingViolations3() {

		List<String[]> list = new ArrayList<String[]>();

		CSVReader reader =null;

		try{

			reader=new CSVReaderBuilder(new FileReader("./data/Moving_Violations_Issued_in_September_2018.csv")).withSkipLines(1).build();

			list = reader.readAll();
			readFiles(list);
			list.clear();

			reader=new CSVReaderBuilder(new FileReader("./data/Moving_Violations_Issued_in_October_2018.csv")).withSkipLines(1).build();

			list = reader.readAll();
			readFiles(list);
			list.clear();

			reader=new CSVReaderBuilder(new FileReader("./data/Moving_Violations_Issued_in_November_2018.csv")).withSkipLines(1).build();

			list = reader.readAll();
			readFiles(list);
			list.clear();

			reader=new CSVReaderBuilder(new FileReader("./data/Moving_Violations_Issued_in_December_2018.csv")).withSkipLines(1).build();

			list = reader.readAll();
			readFiles(list);
			list.clear();


		}catch( Exception e){

			e.printStackTrace();

		}

	}

	public void readFiles(List<String[]> list){


		for(int i = 0;i<list.size()/10;i++){

			movingViolationsList.agregarIni(new VOMovingViolations(
					list.get(i)[0], 
					list.get(i)[1], 
					list.get(i)[2], 
					list.get(i)[3], 
					list.get(i)[4], 
					list.get(i)[5], 
					list.get(i)[6], 
					list.get(i)[7],
					list.get(i)[8], 
					list.get(i)[9],
					list.get(i)[10], 
					list.get(i)[11], 
					list.get(i)[12], 
					list.get(i)[13], 
					list.get(i)[14], 
					list.get(i)[15],
					list.get(i)[16]));

		}
	}


	public IStack <VOMovingViolations> nLastAccidents(int nAccidentes) {
		Stack<VOMovingViolations> pila = new Stack<>();
		for(int i = 0;i<nAccidentes;i++){
			pila.push(movingViolationsStack.pop());
		}
		return pila;
	}
	
	public void generarComparables(){
		comparables = new Comparable[movingViolationsList.getSize()];
		Nodo<VOMovingViolations> objeto = movingViolationsList.darPrimero();;
		
		int i=0;
		while(objeto.darElemento()!=null){
			
			comparables[i] = objeto.darElemento();
			i++;
			objeto=objeto.darSiguiente();

		}
	}

	/*
	 * consulta las infracciones en una direccion
	 * direccion
	 */
	public VOMovingViolations consultarPorDireccion(String direccion){
		//TODO
	}
	/*
	 * Consultar infracciones  donde  la  cantidad  pagada (TOTALPAID)
	 * esta en  un  rango dado.
	 * 
	 * pagado min pagado max
	 * 
	 * Se  ordenapor  fecha  de  infracci�n.
	 */
	public VOMovingViolations consultarPorRangPagado(String min, String max){
		//TODO
	}
	/*
	 * Consultar infracciones por hora inicial y hora final, 
	 * ordenada ascendentemente por VIOLATIONDESC. 
	 * 
	 * hora ini hora fin
	 *
	 * Para las infracciones resultantes mostrar OBJECTID, TICKETISSUEDAT y VIOLATIONDESC. 
	 *
	 * La Vista debe recibir una cola con las infracciones.	
	 */
	public VOMovingViolations consultarPorFechaHora(String ini, String fin){
		
		generarComparables();
		
		Sort.ordenarShellSort(comparables, new VOMovingViolations.TicketIssueDate());

	}

	public LinkedList<VOMovingViolations> verifyObjectIDIsUnique(){
		return movingViolationsList;
	}
}