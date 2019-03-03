package controller;

import java.io.FileReader;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


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

	
	public VOMovingViolations busquedaBin(String busca, Comparator comparator){
		generarComparables();
		Sort.ordenarShellSort(comparables, comparator);
		int ini = 0;
		int fin = comparables.length;
		boolean encontrado=false;
		VOMovingViolations ret=null;
		while(!encontrado){
			int mid=(fin-ini/2)+ini;
			if(comparables[mid].l.compareTo(busca)){
				ini=mid;
			}
			else if(comparables.get(mid)>busca){
				fin = mid;
			}
			else if (ret == busca){
				return ret
			}
			else{
				"NO EXISTE"
			}
		}
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
	public Queue<VOMovingViolations> consultarPorFechaHora(String ini, String fin){
		//TODO

		generarComparables();

		Sort.ordenarShellSort(comparables, new VOMovingViolations.TicketIssueDate());
		
		Queue<VOMovingViolations> cola = new Queue<VOMovingViolations>();
		
		return cola;
		

	}

	public LinkedList<VOMovingViolations> verifyObjectIDIsUnique(){
		
		generarComparables();

		Sort.ordenarShellSort(comparables, new VOMovingViolations.ObjectID());
		
		LinkedList<VOMovingViolations> lista = new LinkedList<VOMovingViolations>();
		
		return lista;
	}
	
	/*
	 * dado  un  tipo  de  infracción  (VIOLATIONCODE) informar 
	 * el  (FINEAMT) promedio cuando no hubo accidente y el (FINEAMT) promedio cuando si lo hubo.
	 */
	public String fineATMperViolationCode(String direccion){
		
		generarComparables();

		Sort.ordenarShellSort(comparables, new VOMovingViolations.ViolationDesc());
		
		return "";
	}

	/*
	 * Consultar las infracciones en una dirección (ADDRESS_ID) en el rango fecha inicial y fecha final.
	 * Ordenar descendentemente por STREETSEGID y fecha. Para las infracciones resultantes 
	 *  mostrar  OBJECTID,  TICKETISSUEDAT, STREETSEGIDy  ADDRESS_ID.
	 *  La  Vista debe recibir una pila con las infracciones.
	 */
	public Stack<VOMovingViolations> consultarPorDireccion(String direccion){
		
		generarComparables();

		Sort.ordenarShellSort(comparables, new VOMovingViolations.StreetSeg());
		
		Stack<VOMovingViolations> pila = new Stack<VOMovingViolations>();
		
		return pila;
	}
	/*
	 * Consultar los  tipos  de  infracciones  (VIOLATIONCODE) con  su valor  (FINEAMT) promedio 
	 * en  un  rango  dado. Por cada tipo mostrar suVIOLATIONCODE y el FINEAMT promedio.
	 * La  Vista  debe  recibir  una  cola  con  los  tiposde  infracciones y  su respectivo FINEAMT promedio.
	 */
	public Queue<VOMovingViolations> consultarPorFineATM(String direccion){
		//TODO
		generarComparables();

		Sort.ordenarShellSort(comparables, new VOMovingViolations.AddressID());
		
		Queue<VOMovingViolations> cola = new Queue<VOMovingViolations>();
		
		return cola;
	}
	
	/*
	 * Consultar infracciones  donde  la  cantidad  pagada (TOTALPAID) esta en  un  rango dado.
	 * Se  ordena por  fecha  de  infracción. 
	 * Para  las  infracciones  resultantes  mostrar OBJECTID,  TICKETISSUEDAT, TOTALPAID.
	 * Se  debe  poder  seleccionar si  el  resultado  se  retorna descendentemente o 
	 * ascendentemente por fecha de la infracción.
	 * La Vista debe recibir una pila con las infracciones.
	 */
	public Stack<VOMovingViolations> consultarPorRangPagado(String min, String max, int pOrden){
		
		//TODO
		generarComparables();
		
		if( pOrden==0){
			Sort.ordenarShellSort(comparables, new VOMovingViolations.TotalPaidAscendente());
		}
		else if( pOrden==1){
			Sort.ordenarShellSort(comparables, new VOMovingViolations.TotalPaidDescendente());
		}
		
		Stack<VOMovingViolations> pila = new Stack<VOMovingViolations>();
		
		return pila;
	}
		
		
	
	
/*
 * Consultar infracciones por hora inicial y hora final, ordenada ascendentemente por VIOLATIONDESC. 
 * Para las infracciones resultantes mostrar OBJECTID, TICKETISSUEDAT y VIOLATIONDESC. 
 * La Vista debe recibir una cola con las infracciones.
 */
	public Queue<VOMovingViolations> consultarPorFechaHoraViolationDesc(String pIni, String pFin){
		//TODO

		generarComparables();

		Sort.ordenarShellSort(comparables, new VOMovingViolations.ViolationDesc());
		
		Queue<VOMovingViolations> cola = new Queue<VOMovingViolations>();
		
		return cola;
		

	}
	
	/*
	 * Dado un tipo de infracción (VIOLATIONCODE) informar el (FINEAMT) promedio y su desviación estándar.
	 */
	public String estadisticasViolationCode(String pViolationCode){
		//TODO

		generarComparables();

		Sort.ordenarShellSort(comparables, new VOMovingViolations.ViolationCode());
		boolean fin = true;
		for(int i = elemto.; 0<comparables.length;i++){
			VOMovingViolations violacion = (VOMovingViolations) comparables[i];
		
		}
		
		return "";
		

	}
	

}