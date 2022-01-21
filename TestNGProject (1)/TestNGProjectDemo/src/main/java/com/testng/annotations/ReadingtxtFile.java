package com.testng.annotations;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.testng.annotations.Test;

public class ReadingtxtFile {

	@Test(priority = 1,enabled = false)     
	public void readTextFile() throws IOException {

		FileReader fileReader = new FileReader(".//src//main//resources//Sample.txt");   //reading the file 

		try {
			int j;
			while ((j = fileReader.read()) != -1) {
				System.out.print((char) j);
			}
		} finally {
			fileReader.close();
		}

	}
	
	@Test(priority = 0)
	public void writeTextFile() throws IOException {

		FileWriter fileWriter = new FileWriter(".//src//main//resources//Sample.txt");

		try {
			fileWriter.write("Added New Line !!!");
		} finally {
			fileWriter.close();
		}

	}
	
	@Test(priority = 2)
	public void appendTextFile() throws IOException {

		try {
			FileWriter fileWriter = new FileWriter(".//src//main//resources//Sample.txt");

			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			PrintWriter printWriter = new PrintWriter(bufferedWriter);
			
			printWriter.println("Added New Line");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
