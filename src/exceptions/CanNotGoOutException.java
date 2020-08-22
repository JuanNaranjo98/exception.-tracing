package exceptions;

@SuppressWarnings("serial")
public class CanNotGoOutException extends Exception {
	
	public CanNotGoOutException() {
		super("The person can not go out today");
	}

}
