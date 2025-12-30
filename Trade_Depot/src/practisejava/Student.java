package practisejava;

public class Student {
	String name = "Diawakar";
	int marks = 		871;
			String displayDetails(){
				return name +" scored "+ marks+" out of 1000.";
			}
			
	String name2 = "Shruti";
	int marks2 = 910; 
	String displayDetails2() {
		return name2 +" scored "+ marks2+" out of 1000.";
	}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student result = new Student();
		Student result2 = new Student();
		System.out.println("Result of students:"+result.displayDetails());
		System.out.println("Result of students:"+result2.displayDetails2());
		System.out.println("Topper is Shruti with: 910 Marks");

	}
	
}


