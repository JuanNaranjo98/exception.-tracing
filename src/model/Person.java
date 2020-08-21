package model;

public class Person {
	
	public static final String TARJETADEIDENTIDAD = "TI";
	
	public static final String CEDULADECIUDADANIA = "CC";
	
	public static final String PASAPORTE = "PP";
	
	public static final String CEDULADEESTRANGERIA = "CE";
	
	private String type;
	
	private int number;
	
	public Person(String tp, int num) {
		
		type = tp;
		number = num;
		
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String tp) {
		type = tp;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int n) {
		number = n;
	}
	
}
