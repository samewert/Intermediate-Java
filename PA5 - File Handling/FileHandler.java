package PA5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler{
	
	public final static String[] readStringsFromFile(final String fileName) throws IOException{
		FileReader reader = new FileReader(fileName);
		BufferedReader br = new BufferedReader(reader);
		
		String line = br.readLine();
		String[] arr = new String[Integer.parseInt(line)];

		for(int i = 0; i < arr.length; i++) {
			line = br.readLine();
			arr[i] = line;
		}		
		br.close();
		return arr;
	}
	
	public final static void writeArrayOfStringsToFile(final String[] arr, final String fileName) throws IOException {
		FileWriter writer = new FileWriter(fileName);
		BufferedWriter bw = new BufferedWriter(writer);
		
		bw.write(String.valueOf(arr.length));
		bw.newLine();
		
		for(int i = 0; i < arr.length; i++) {
			bw.write(arr[i]);
			bw.newLine();
		}
		bw.close();
	}
	
	public final static String[] readArrayOfStringsFromFile(final String fileName) throws IOException {
		FileReader reader = new FileReader(fileName);
		BufferedReader br = new BufferedReader(reader);
		
		String line = br.readLine();
		line = line.substring(1,line.length() - 1);
		String[] tokens = line.split(", ");
		
		br.close();
		return tokens;
	}
	
	
//	Didn't really know the correct way to do this method because trying to read and write on the same file kept
//	kept resulting in the br.readLine() to be null so I did all the reading first and saved the pre-existing String
//	and then I did all the writing pulling from the ArrayList. (I chose ArrayList because I don't know how to make an 
//	array that doesn't have a predetermined length
	
	public final static void writeStringToFile(final String str1, String fileName) throws IOException {
		FileReader reader = new FileReader(fileName); 
		BufferedReader br = new BufferedReader(reader);
		
		ArrayList<String> a = new ArrayList<String>();
		String line = br.readLine();
		while(line != null) {
			a.add(line);
			line = br.readLine();	
		}
		br.close();
		
		FileWriter writer = new FileWriter(fileName);
		BufferedWriter bw = new BufferedWriter(writer);
		
		for(int i = 0; i < a.size(); i++) {
			bw.write(a.get(i));
			bw.newLine();
		}
		
		bw.write(str1);
		bw.close();
	}
	

	
}