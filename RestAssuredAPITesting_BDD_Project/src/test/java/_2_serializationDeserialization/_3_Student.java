package _2_serializationDeserialization;

import java.util.List;

public class _3_Student {
	
	
	public String name;
	public String location;
	public int phone;
	List<String> cources;
	public int id;
	
	
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public List<String> getCources() {
		return cources;
	}
	public void setCources(List<String> cources) {
		this.cources = cources;
	}
	
//	Just to see result on console
	public String getStudentRecord() {
		return (this.name + " "+this.location+" "+this.phone+" "+this.cources+" "+this.id);
	}
	
	
}
