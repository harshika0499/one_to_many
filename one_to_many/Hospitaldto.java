package one_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Hospitaldto
{
	@Id
	private int id;
	private String name;
	@OneToMany
	private List<Branchdto> branches; 
	public List<Branchdto> getBranches() {
		return branches;
	}
	public void setBranches(List<Branchdto> branches) {
		this.branches = branches;
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

}



























//to store many branches we are creating list