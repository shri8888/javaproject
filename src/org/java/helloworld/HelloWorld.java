package org.java.helloworld;

import java.util.ArrayList;
import java.io.*;
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("HelloW orld! This is my first Java program on eclipse.");
		
		ArrayList<String> weekdays = new ArrayList<String>();
		File path1 = new File( "file.txt");
		FileWriter path = null;
		try {
			
		
		//path1.createNewFile();
		 path = new FileWriter(path1,true);
		
		weekdays.add("Monday - Boring U seee");
		weekdays.add("Tuesday - Hmmm somehow trying to overcome the lazyneess!");
		weekdays.add("Wednesday - Oh, its going on waiting for a friday..");
		weekdays.add("Thursday - working with a motivation that the next day is Friyay!");
		weekdays.add("Friday - Oh boy! Here's the day I was looking for. No work today and plan for the weekend!");
		weekdays.add("Saturday - Work ? What is that ? Just chill buddy!");
		weekdays.add("Sunday - All chill untill the evening and then the butterflies start! ");
		for(String day : weekdays ) {
			
			path.write(day + "\n");
			System.out.println("Written to the file..");
			
		}
		path.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		
		
	}
	
		
			
	
}
}
