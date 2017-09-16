import java.lang.*;
import java.util.Date;
public class Main {
	 static int StudentCount =3;


	public static void main(String[] args) {
StudentGroup sg = new StudentGroup(StudentCount);
        


        Student a = new Student(10, "Ashish", new Date(), 60);
        Student b = new Student(20, "venkatesh", new Date(), 80);
        Student c = new Student(30, "vivek", new Date(), 90);
        Student d = new Student(40, "ashok", new Date(), 90);

        sg.setStudent(a,0);
        sg.setStudent(b,1);
        sg.setStudent(c,2);


      
  sg.add(d, 2);

	}


	public static void ShowUser(Student ss){

    
	System.out.println("\n\n--------------\n");
	System.out.println("ID: " + ss.getId());
	System.out.println("Name: " + ss.getFullName());
	System.out.println("Birth Date: " + ss.getBirthDate().toString());
	System.out.println("Avg Mark: " + ss.getAvgMark());
	
	}

		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
	

}
