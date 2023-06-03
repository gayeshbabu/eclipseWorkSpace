package com.IOStreams_gayesh;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadStudentFromDB {

	public static void main(String[] args) {
		try {
			// Open FileInputStream and ObjectInputStream
			FileInputStream fis = new FileInputStream("studentDB.serr");
			ObjectInputStream ois = new ObjectInputStream(fis);

			// Read the Student object from the file
			Student reference = (Student) ois.readObject();
			reference.getDetails();
			System.out.println(reference.toString());
			System.out.println(reference.toString());

			// Close the streams
			ois.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
