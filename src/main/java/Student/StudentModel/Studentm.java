package Student.StudentModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Studentm {
	@Id
	@Column
	private int id;
	@Column
	private String Name;

	@Column
	private int RollNumber;
	@Column
	private int DOB;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollNumber() {
		return RollNumber;
	}
	public void setRollNumber(int rollNumber) {
		RollNumber = rollNumber;
	}
	public int getDOB() {
		return DOB;
	}
	public void setDOB(int dOB) {
		DOB = dOB;
	}
	
	

	
}
