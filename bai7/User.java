package bai7;

public class User {
	String name;
	String pass;
	public User(String a,String b) {
		name=a;
		pass = b;
		// TODO Auto-generated constructor stub
	}
	public boolean equals(User other) {
		return(name.equals(other.name)&&pass.equals(other.pass));
	}
	
}
