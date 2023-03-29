package com.bridgeLabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegestration {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Fist name:- ");
	        String name = sc.next();
	        System.out.print("Enter LastFist name:- ");
	        String lastName = sc.next();
	        
	        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
	        Matcher matcher = pattern.matcher(name);
	        Matcher matcher1 = pattern.matcher(lastName);

	        if (matcher.matches() && matcher1.matches() )
	            System.out.println("valid");
	        else
	            System.out.println("Invalid");
	        System.out.print("Enter Email id:- ");
	        String Email = sc.next();
	        Pattern pattern2 = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
	        Matcher matcher2 = pattern2.matcher(Email);
	        if(matcher2.matches()){
	            System.out.println("valid");
	        }
	        else {
	            System.out.println("Invalid");
	        }
	        System.out.print("Enter Mobile number:- ");
	        String mobileNumber = sc.next();
	        Pattern pattern3 = Pattern.compile("^[7-9][0-9]{9}$");
	        Matcher matcher3= pattern3.matcher(mobileNumber);
	        if(matcher3.matches()){
	            System.out.println("valid");
	        }
	        else {
	            System.out.println("Invalid");
	        }
	        System.out.print("Enter the Password:- ");
	        String Password = sc.next();
	        Pattern pattern4 = Pattern.compile("^[A-Z][a-z]{1,7}[0-9]{1}$");
	        Matcher matcher4 = pattern4.matcher(Password);
	        if (matcher4.matches())
	            System.out.println("valid password");
	        else {
	            System.out.println("Invalid password");
	        System.out.println("Minimum 8 Characters");
			System.out.println("Atleast 1 UpperCase");
			System.out.println("Atleast 1 Numeric Number");
	        }

	        
	    }
	}

