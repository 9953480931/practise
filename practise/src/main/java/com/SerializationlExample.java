package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {

private static final long serialVersionUID = 2L;


 private String firstname;
 private static String lastname="static lastname";
 private final transient String id="final transient id";
 
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public static String getLastname() {
		return lastname;
	}
	public static void setLastname(String lastname) {
		Employee.lastname = lastname;
	}
	public String getId() {
		return id;
	}
	
	
	
	
}


public class SerializationlExample {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	/*Employee emp = new Employee();
	emp.setLastname("last");
	emp.setFirstname("first");
	emp.setAge("22");
	emp.setId("1");
	
	FileOutputStream fout = new FileOutputStream("test.txt");
	ObjectOutputStream  os = new ObjectOutputStream (fout);
	os.writeObject(emp);
	os.close();
	fout.close();
	System.out.println("Saved object");*/
	
	FileInputStream fin = new FileInputStream("test.txt");
	ObjectInputStream oi = new ObjectInputStream(fin);
	Employee emp2 =(Employee)oi.readObject();
	
	System.out.println("object desrialize");
	System.out.println(emp2.getFirstname());
	System.out.println(emp2.getLastname());
	System.out.println(emp2.getId());
	
}
}
