package one_to_many;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Addressdto 
{
	@Id
	private int id;
	private int pincode;
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	private String Streetname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getStreetname() {
		return Streetname;
	}
	public void setStreetname(String streetname) {
		Streetname = streetname;
	}


}
