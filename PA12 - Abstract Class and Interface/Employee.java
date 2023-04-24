package PA12;

import java.io.Serializable;

// Serialize this class
public abstract class Employee implements Serializable {
    

	private static final long serialVersionUID = 1L;
	public String id;
	public String name;
	
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return String.format("%s, %-14s", id, name);
	}
}
