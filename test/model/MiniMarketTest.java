package model;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import exceptions.CanNotGoOutException;
import exceptions.HaveTIException;
import model.MiniMarket;
import model.Person;


class MiniMarketTest {
	
	private MiniMarket miniMarket;
	
	private void setupScenary1() {
		miniMarket = new MiniMarket(0);
		
	}
	

	@Test
	public void testRegisterPeople1() {
		setupScenary1();
		try{
			miniMarket.registerPeople("CC", "1112494159");
			String document = miniMarket.getPersons().get(0).getType();
			String number = miniMarket.getPersons().get(0).getNumber();
			assertTrue("They are not the same", document.equals("CC") );
			assertTrue("They are not the same", number.equals("1112494159") );
		}catch(CanNotGoOutException cngoe){
			fail("The person can not go out today");
		}catch(HaveTIException htie) {
			fail("The person have TI");
		}
		
	}
	
	public void testRegisterPeople2() {
		setupScenary1();
		try{
			miniMarket.registerPeople("TI", "1112494159");
			
		}catch(CanNotGoOutException cngoe){
			Person personNull = miniMarket.getPersons().get(0);
			assertNull(personNull, "A person was added");
		}catch(HaveTIException htie) {
			fail("The person have TI");
		}
	}
	
	public void testRegisterPeople3() {
		setupScenary1();
		try{
			miniMarket.registerPeople("CE", "1112494149");
			
		}catch(CanNotGoOutException cngoe){
			fail("The person can not go out today");
		}catch(HaveTIException htie) {
			Person personNull = miniMarket.getPersons().get(0);
			assertNull(personNull, "A person was added");
		}
	}
	
	
}
