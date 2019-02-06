package login.submit.registration;

public class Users {
	private String email;
	private String password;
	private String username;
	private String DOB;
	private String contact;
	private String address;

	
	public Users() {
		super();
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public Users(String email, String password, String username, String dOB, String contact , String address) {
		super();
		this.email = email;
		this.password = password;
		this.username = username;
		this.DOB = dOB;
		this.contact = contact;
		this.address = address;

	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	

}
