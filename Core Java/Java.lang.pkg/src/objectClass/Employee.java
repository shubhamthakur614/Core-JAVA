package objectClass;

public class Employee {
	private int eid;
	private String name;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// overriding the equals method for deep comparison

	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		if (o == this) {
			return true;
		}

		return (this.getEid() == ((Employee) o).getEid() || this.getName() == ((Employee)o).getName());

	}

}
