package model;

import java.util.ArrayList;
import java.util.List;

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

	public void registerPeople(String type, int number){
		
	}
	
	public int consultAmount() {
		return amount;
	}
	 
	 
	 
	 
	 
}
