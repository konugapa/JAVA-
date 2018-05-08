package basicPrograms;
import java.util.Scanner;
import java.io.*;
public class Palindrome {
	public static void main(String[] args){
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
	      try{

	        System.out.print("Give an Input: ");
	          String sentence = dataIn.readLine();
	          PalCheck(sentence);

	      }catch(IOException e){

	        e.printStackTrace();
	        System.err.println(e);

	      }
	    }

	  public static void PalCheck(String s){

	    String end = "";
	    String result = s.replaceAll(" ", "");
	     for ( int i = result.length() - 1; i >= 0; i-- )
	       end = end + result.charAt(i);

	        if (result.equalsIgnoreCase(end))
	           System.out.println( result + " is a palindrome.");
	        else
	           System.out.println(result + " is not a palindrome.");


	  }

	}
