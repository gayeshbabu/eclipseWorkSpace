package com.IOStreams_gayesh;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ExampleForTextIO implements Serializable {

	public static void main(String[] args) throws IOException {

		ArrayList names = new ArrayList(List.of("Gayesh", "Tharun", "Mohan" ));
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("text.txt"));

			writer.write("My name is gayesh");
			writer.write("\n i dont know about you");

			//for (String name : names) {
				writer.write("\n " + names);

			//}
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
		
		String list;
		while((list=reader.readLine())!= null)
		System.out.println(list);
		
		
		// String[] new1 = reader.readLine();
		
		
		
		
		
		
		/*String list;
		while(list = name.readLine()!= null)
			System.out.println(name.readLine());*/
		reader.close();
	}

}
