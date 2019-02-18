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
import model.moving_violations.VOMovingViolations;
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
	
	private IStack<VOMovingViolations> movingViolationsStack;


	public Controller() {
		
		view = new MovingViolationsManagerView();
		
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
				
				view.printMovingViolations(movingViolationsStack);
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
		

		for(int i = 0;i<list.size();i++){
			
		
			
			movingViolationsStack.push(new VOMovingViolations(0, list.get(i)[1], list.get(i)[2], 0, 0, 0, 0, list.get(i)[7],
					0, 0, 0, 0, list.get(i)[12], list.get(i)[13], 0, 0,list.get(i)[16]));
		}
	}
	

	public IStack <VOMovingViolations> nLastAccidents(int nAccidentes) {
		Stack<VOMovingViolations> pila = new Stack<>();
		for(int i = 0;i<nAccidentes;i++){
			pila.push(movingViolationsStack.pop());
		}
		return pila;
	}
}