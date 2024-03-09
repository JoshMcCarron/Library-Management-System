package userTypes;

public class Faculty extends User{
	protected boolean validate = true;
	public Faculty(String email, String password) {
		// TODO Auto-generated constructor stub
		super(email, password);
	}
	public boolean getValidate() {
		return true;
	}
}
