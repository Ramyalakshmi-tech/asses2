package com.asses2;

import java.io.FileWriter;

public class CreateFile {
	public static void main(String[] args) {
		try {
		FileWriter w=new FileWriter("data.txt");
		w.write("HAPPY NEW YEAR");
		w.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
