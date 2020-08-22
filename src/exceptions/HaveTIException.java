package exceptions;

@SuppressWarnings("serial")
public class HaveTIException extends Exception {

	private String ti;

	public HaveTIException(String t) {
		super("The person have a TI ");
		ti = t;
	}

	public String getTi() {
		return ti;
	}
}
