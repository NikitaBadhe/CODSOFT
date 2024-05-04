package Student;

import javax.persistence.Entity;
import javax.persistence.Id;

//POJO Class
@Entity
public class Student {
	
	@Id
	private int id;
	private String name;
	private String Address;
	private String  contact;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String address, String contact) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
		this.contact = contact;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Address=" + Address + ", contact=" + contact + "]";
	}
	
}
