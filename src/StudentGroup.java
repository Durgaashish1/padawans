import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	private ArrayList <Student> ss;
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
		this.ss = new ArrayList<Student>(Arrays.asList(students));
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		if(students==null){
			throw new IllegalArgumentException();
		}
		else {
			for (int i = 0; i < students.length; i++) {
				this.students[i] = students[i];
			}
		}
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		if(index<0||index>=students.length){
			throw new IllegalArgumentException();
		}
		else{
			return students[index];
		}

		// Add your implementation here
	}

	@Override
	public void setStudent(Student student, int index) {
		if(student==null||index<0||index>=students.length){
			throw new IllegalArgumentException();
		}
		else{
			students[index]=student;
		}
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		if(student==null) {
			throw new IllegalArgumentException();
		}
		else {

			ss.add(0, student);
			this.students =ss.toArray(this.students);
		}
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		if(student==null) {
			throw new IllegalArgumentException();
		}
		else {

			ss.add(students.length-1, student);
			this.students =ss.toArray(this.students);
		}
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		if(student==null||index<0||index>=this.students.length) {
			throw new IllegalArgumentException();
		}
		else {

			ss.add(index, student);
			this.students =ss.toArray(this.students);
		}
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		if(index<0||index>=this.students.length) {
			throw new IllegalArgumentException();
		}
		else {

			ss.remove(index);
			this.students =ss.toArray(this.students);
		}
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		if(student==null) {
			throw new IllegalArgumentException();
		}
		else {
			for(int i=0;i<this.students.length;i++){
				if(students[i]==student){

					ss.remove(student);
					this.students = ss.toArray(this.students);
					break;
				}
				else {
					throw new IllegalArgumentException();
				}
			}

		}
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		if(index<0||index>=this.students.length){
			throw new IllegalArgumentException();
		}
		else {
			for (int i=index+1;i<this.students.length;i++){

				ss.remove(i);
				this.students = ss.toArray(this.students);
			}
		}
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		int flag=-1;
		if(student==null) {
			throw new IllegalArgumentException();
		}
		else {
			for(int i=0;i<this.students.length;i++){
				if(this.students[i]==student){
					flag=i;


				}

			}


		}

			if(flag>0){
				for (int i1=flag+1;i1<this.students.length;i1++){

					ss.remove(i1);
					this.students = ss.toArray(this.students);
				}

		}
		else{
			throw new IllegalArgumentException();
		}
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		if(index<0||index>=this.students.length){
			throw new IllegalArgumentException();
		}
		else{
			for (int i1=0;i1<index;i1++){
				ss.remove(i1);
				this.students =ss.toArray(this.students);
			}
		}
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		int flag=-1;
		if(student==null) {
			throw new IllegalArgumentException();
		}
		else {
			for(int i=0;i<this.students.length;i++){
				if(this.students[i]==student){
					flag=i;
					
				}

			}


		}

			if(flag>0){
				for (int i1=0;i1<flag;i1++){

					ss.remove(i1);
					this.students =ss.toArray(this.students);
				}
			}

		else{
			throw new IllegalArgumentException();
		}
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		Student temp;
		for(int i=0;i<students.length-1;i++){
			for(int j=0;j<students.length-i-1;j++){
				if(students[j].getId()>students[j+1].getId()){
					temp=students[j];
					students[j]=students[j+1];
					students[j+1]=temp;


				}
			}
		}
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		double avgmark = 0;
        for(int i=0;i<students.length;i++){
			avgmark+= students[i].getAvgMark();
		}
        System.out.println(avgmark);
		
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
	public void printStudents(){
		try {
			for (int i = 0; i < students.length; i++) {
				System.out.printf("%d ", students[i].getId());
			}
		}
		catch (Exception e){
			System.out.println();
		}
		
	}
}
