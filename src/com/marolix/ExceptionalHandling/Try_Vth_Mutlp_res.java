package com.marolix.ExceptionalHandling;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;

public class Try_Vth_Mutlp_res 
{
public static void main(String[] args) {
	try(FileOutputStream fos = new FileOutputStream("D:\\java1.txt");
			BufferedReader br=new BufferedReader(new FileReader("D:\\java1.txt"))){
		String text="i am java programm";
		while((text = br.readLine()) != null) {
			byte arr[] = text.getBytes();
			fos.write(arr);
		}
		System.out.println("File content copied to another file");
	}
	catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("Resources are closed");
}
}
