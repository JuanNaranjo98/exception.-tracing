package model;

public class Person {
	
	public static final String TARJETADEIDENTIDAD = "TI";
	public static final String CEDULADECIUDADANIA = "CC";
	public static final String PASAPORTE = "PP";
	public static final String CEDULADEESTRANGERIA = "CE";
	
	private String type;
	private String number;
	
	public Person(String tp, String num) {
		type = tp;
		number = num;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String tp) {
		type = tp;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String n) {
		number = n;
	}
	
}
