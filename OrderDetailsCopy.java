import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class OrderDetailsCopy {
	public static void main(String[] args) throws IOException{
		try{
		FileReader fr = new FileReader("C:\\Users\\ereddy\\Downloads\\JAVA files\\EcommerceWebsiteFile1.txt");
		FileWriter wr = new FileWriter("C:\\Users\\ereddy\\Downloads\\JAVA files\\EcommerceWebsiteFile2.txt");
		BufferedReader bf = new BufferedReader(fr);
		PrintWriter pr = new PrintWriter(wr);
		String Str;
		int count= 1;
		while((Str = bf.readLine())!= null && count<=50){
			pr.println(Str);
			count++;
			
			
		}
		pr.close();
		bf.close();
 }
 catch (IOException e){
		System.out.println(e.getMessage());
	}
	}
}


