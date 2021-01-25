package beans;
import javax.faces.bean.*;

@ManagedBean
@ViewScoped
public class User {
	
	private String firstName = "";
	private String lastName = "";
	
	public User() {
		this.firstName = "Connor";
		this.lastName = "Rolstad";
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}	
