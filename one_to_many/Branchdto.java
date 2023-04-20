package one_to_many;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Branchdto 
{
	@Id
	private int id;
	private String branchName;
	private int pincode;
	@OneToOne
	private Addressdto ad;
	public Addressdto getAd() {
		return ad;
	}
	public void setAd(Addressdto ad) {
		this.ad = ad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
