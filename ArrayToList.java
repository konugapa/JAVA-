import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] argv) {

		String sArray[] = new String[] { "A", "B", "C" };

		// converting array to list 
		List<String> list = Arrays.asList(sArray);

		System.out.println(list);
		
		//Converting list to array 
		List<String> myList = new ArrayList<String>();
		myList.add("A");
		myList.add("B");
		myList.add("C");
		Object[] myArray = myList.toArray();
		for (Object myObject : myArray) {
		   System.out.println(myObject);
		}
		//Converting a list to sublist
		List<String> subList1 = myList.subList(0, 3);
	     System.out.println("SubList stored in List: "+subList1);
		
		
	}
}
