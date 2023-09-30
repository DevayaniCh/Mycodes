package com.marolix.ExceptionalHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TryVthResources 
{
	
public static void main(String[] args) {
	try(FileOutputStream fos = new FileOutputStream("D:\\.txt")	)
	{
		String text ="Hello world.Th my java program";
		byte arr[]=text.getBytes();
		fos.write(arr);;
}
	catch(IOException e) {
		System.out.println(e);
	}
	System.out.println("Resource closed ");
}
}
