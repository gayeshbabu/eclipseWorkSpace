package com.IOStreams_gayesh;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentRunner {

	public static void main(String[] args) throws IOException {
		try {

		Student s1 = new Student(21, "Gayesh", 82.80);
		s1.getDetails();
		System.out.println(s1.toString());

		// this method creates a FileDB in Local System and it can store  Data from the Application
		FileOutputStream fos = new FileOutputStream("studentDB.ser"); // Making fileDb name as .ser then only Object type data  is allowed into FileDb

		// this method creates a object in FileDB to store object data
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		// to Store the oos object with programmer given Data this inbuilt method can
		// do it

		oos.writeObject(s1); // so here the data from Student class instance(s1) is stored into FileDb through
								// this object(oos) with the help of writeObject() method
		
		
		// Open FileInputStream and ObjectInputStream
		FileInputStream fis = new FileInputStream("studentDB.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		// Read the Student object from the file
		Student reference = (Student) ois.readObject();
		
		reference.getDetails();
		System.out.println(reference.toString());

		// Close the streams
		ois.close();
		fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
