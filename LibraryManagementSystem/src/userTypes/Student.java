package userTypes;

public class Student extends User{

	public Student(String email, String password) {
		// TODO Auto-generated constructor stub
		super(email, password);
	}
	public boolean getValidate() {
		return true;
	}


}
