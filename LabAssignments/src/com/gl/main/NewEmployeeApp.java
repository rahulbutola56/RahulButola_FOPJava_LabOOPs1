package com.gl.main;
import java.util.Scanner;

import com.gl.model.Employee;
import com.gl.service.CredentialMaker;

public class NewEmployeeApp {

	public static void main(String[] args) {
		
		String generatedEmail="";
		char[] generatedPassword;
		
		Employee employee = new Employee ("Rahul", "Butola", "greatlearning");
		CredentialMaker credentialMaker = new CredentialMaker();
		
		System.out.println("Please enter the department you belong to: ");
		System.out.println("1: Technical");
		System.out.println("2: Admin");
		System.out.println("3: Human Resource");
		System.out.println("4: Legal");
		
		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		
		if(option==1) {
			generatedEmail = credentialMaker.makeEmailAddress(employee.getFirstName(),employee.getLastName(),"Technical", employee.getCompanyName());
		}
		else if(option==2) {
			generatedEmail = credentialMaker.makeEmailAddress(employee.getFirstName(),employee.getLastName(),"Admin", employee.getCompanyName());
		}
		else if(option==3) {
			generatedEmail = credentialMaker.makeEmailAddress(employee.getFirstName(),employee.getLastName(),"Human Resource", employee.getCompanyName());
		}
		else if(option==4) {
			generatedEmail = credentialMaker.makeEmailAddress(employee.getFirstName(),employee.getLastName(),"Legal", employee.getCompanyName());
		}
		else {
			System.out.println("Enter a valid option");
			scan.close();
			System.exit(-1);
		}
		generatedPassword = credentialMaker.makePassword();
		credentialMaker.showCredentials(employee.getFirstName(), generatedEmail, generatedPassword);
		
		scan.close();
	}

}
