package assignment9;
public class Clerk extends Person {
	private int salary;
	private String employmentGrade;
	
	public Clerk(String name, Address address, Telephone telephone, String email, int salary, String employmentGrade){
		super(name, address, telephone, email);
		setSalary(salary);
		setEmploymentGrade(employmentGrade);
	}
	
	public boolean equals(Object obj){
		if(!(obj instanceof Clerk)){
		return false;
		}
		boolean result = false;
		
		if(this.employmentGrade == ((Clerk)obj).employmentGrade){
			if(this.salary == ((Clerk)obj).salary){
				result = true;
				
			}
		}
		return result;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmploymentGrade() {
		return employmentGrade;
	}

	public void setEmploymentGrade(String employmentGrade) {
		this.employmentGrade = employmentGrade;
	}
	
//	public String toString(){
//		String result;
//		result = super.toString() + " \n Who is a Clerk with an Employment Grade of: " + employmentGrade + " and is getting paid: " + salary + " dollars.";
//		return result;
//	}

}
