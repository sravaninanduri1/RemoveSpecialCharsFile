package com.remove.specialchars;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RemoveSplChars {
	public static void main(String[] args) {
		FileReader fr=null;
		FileWriter fw=null;
		BufferedReader br=null;
		try{
          fr = new FileReader("E:\\sr.txt");
          fw=new FileWriter("E:\\pa.txt");
          br = new BufferedReader(fr);
          String s;
          while((s = br.readLine())!=null){
        	  s=s.replaceAll("[^a-zA-Z0-9 ]", "");
        	  fw.write(s);
        	  fw.write("\r\n");
          }
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			try{
			 br.close();
			 fr.close();
			 fw.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
