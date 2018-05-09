import java.io.PrintStream;


public class EmployeeAnalyst extends EmployeeManager {

	public static void EmployeeDuties(String s1) {
		s1 = s1 + " AND JAVA";
		
	}
	public void EmployeePersonalInfo() {
		// TODO Auto-generated method stub
		
	}
	static void EmployeeSkills(StringBuilder s2) {
		s2.append(" is the SkillSet.");
	}
	public static void EmployeeExperience(StringBuffer s3) {
		s3.append(" of Experience."); 
	}
	public static void main(String[] args){
		String s1 = "MAVEN";
		EmployeeDuties(s1);
		System.out.println("String: " + s1);
		
		StringBuilder s2 = new StringBuilder("SQL");
		EmployeeSkills(s2);
		System.out.println("StringBuilder: "+s2);
		
		StringBuffer s3 = new StringBuffer("2 Years");
		EmployeeExperience(s3);
		System.out.println("StringBuffer: "+s3);
	}
}
