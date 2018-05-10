import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class OrderDetails {
	public static void main(String[] args) throws IOException{
	File file = new File("C:\\Users\\ereddy\\Downloads\\JAVA files\\EcommerceWebsiteFile1.txt");
	 try{
		//Create the file
			if (file.createNewFile()){
			System.out.println("File is created!");
			}else{
			System.out.println("File already exists.");
			}
			FileWriter wr = new FileWriter(file);
			PrintWriter pw = new PrintWriter(wr);
			for(int count = 1; count <= 100 ;count++){
				pw.println("This is "+count );
			}
			pw.close();
	 }
	 catch (IOException e){
			System.out.println(e.getMessage());
		}
	}
	
}

	
