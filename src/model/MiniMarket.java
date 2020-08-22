package model;

import java.util.ArrayList;
import java.util.List;
import exceptions.CanNotGoOutException;
import exceptions.HaveTIException;
import java.time.LocalDate;

public class MiniMarket {
	
	 private List<Person> persons;
	 
	 private int amount;
	 
	 public MiniMarket(int amnt) {
		 persons = new ArrayList<Person>();
		 amount =  amnt;
	 }

	public List<Person> getPersons() {
		return persons;
	}
	
	public int getAmount() {
		return amount;
	}
	

	public void registerPeople(String type, int number) throws
	CanNotGoOutException, HaveTIException{
		ArrayList<Integer> document = new ArrayList<Integer>();
		document.add(number);
		int documentDay = document.get(document.size() - 2);
		int date = LocalDate.now().getDayOfMonth();
		
		if(documentDay%2==0) {
			documentDay = 2;
		}else {
			documentDay=1;
		}
		if(date%2==0) {
			date=2;
		}else {
			date=1;
		}
		
		if(type.equals("TI")) {
			throw new HaveTIException(type);
		}
		if(date == documentDay ) {
			throw new CanNotGoOutException();
		}
		
		if( (type.equals("TI"))!= true && date != documentDay ) {
			Person person = new Person(type, number);
			persons.add(person);
		}
		amount++;
	}
	
	public int consultAmount() {
		return amount;
	}
	 
	 
	 
	 
	 
}
