package com.learn.abstraction;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetJson {
public static void main(String[] args) {
	File file = new File("D:/vagrant_share/locations.json");
	try {
		String line = null;
		FileReader fileReader= new FileReader(file);
		int data=fileReader.read();
		BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/vagrant_share/locations.json"));
		List<String> li =new ArrayList<>();
		while ((line = bufferedReader.readLine()) != null)
	    {
          li.add(line);
	       
	    }
		System.out.println(li);
		fileReader.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
