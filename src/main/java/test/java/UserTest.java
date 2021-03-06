package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import banksy.User;


class UserTest {
	
	@Test
	void checkIfAlpha() {
		User test = new User("Dog","1234");//Create new user 
		
		assertFalse(test.isAlphabetical("1234"));//1234 is not purely alphabetical
		assertTrue(test.isAlphabetical("Dog"));//Dog is purely alphabetical
		//assertNull(test.isAlpha(""));
		
		return;
		
	}
	
	@Test
	void checkPassword() {
		String pwTrue = "Helloworld123";
		String pwFalse = "aaa";
		User test = new User();
		//assertTrue(test.passwordCheck(pwTrue));
		//assertFalse(test.passwordCheck(pwFalse));
	}

	@Test
	void testPass() {

		String pwTrue = "1mypasswordK";
		String pwFalse = "aaa";
		User test = new User();
		//assertTrue(test.passCheck(pwTrue));
		assertFalse(test.passCheck(pwFalse));


	}



	@Test
	void testEmail(){

		String emailTrue = "ted@gmail.com";
		String emailTrue2 = "khay@hotmail.com";

		String emailFalse = "ted.gmail.com";
		String emailFalse2 = "ted@gmail";

		User test = new User();

		assertTrue(test.emailCheck(emailTrue));
		assertTrue(test.emailCheck(emailTrue2));

		assertFalse(test.emailCheck(emailFalse));
		assertFalse(test.emailCheck(emailFalse2));









	}

	@Test
	void testSSN(){
		String ssnPass = "123456789";
		String ssnPass2 = "127618091";

		String failTooLong = "12345678910";
		String failWrongChar = "adb123801";
		User test = new User();

		assertTrue(test.ssnCheck(ssnPass));
		assertTrue(test.ssnCheck(ssnPass2));

		assertFalse(test.ssnCheck(failTooLong));
		assertFalse(test.ssnCheck(failWrongChar));





	}

	@Test
	void testGenerateUser(){
		User test = new User();
		User testOne = test.generateUser();
		User testTwo = test.generateUser();

		System.out.println(testOne.getFirstName());
		System.out.println(testOne.getSsn());
		System.out.println(testOne.getEmail());

		//System.out.println(testTwo.getFirstName());


		assertNotEquals(testOne.getFirstName(),testTwo.getFirstName());
		assertTrue(testOne.ssnCheck(testOne.getSsn()));
		assertTrue(testOne.emailCheck(testOne.getEmail()));



	}


	

}
