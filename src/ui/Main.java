package ui;

import model.Person;
import model.MiniMarket;
import exceptions.CanNotGoOutException;
import exceptions.HaveTIException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("Welcome to Mi Barrio Te Quiere miniMarket");
	    System.out.print("Choose one option");
	    System.out.println("1.Register people");
	    System.out.println("2.Check the amount of people who have entered ");
	    System.out.println("3.Exit the program");
	    
	    boolean salir = true;
	    
	    int option = Integer.parseInt(sc.nextLine());
	    do {
	    	switch(option){
	    		case 1:
	    		
	    		case 2:
	    			System.out.println("");
	    		
	    		case 3:
	    			salir = false;
	    		
	    	}
	    }while(salir);
	}

}
