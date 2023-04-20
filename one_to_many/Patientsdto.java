package one_to_many;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Patientsdto
{
	@Id
	private int id;
	private String name;
	private int roomno;
	@ManyToOne
	private Hospitaldto h;
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
	public int getRoomno() {
		return roomno;
	}
	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}
	public Hospitaldto getH() {
		return h;
	}
	public void setH(Hospitaldto h) {
		this.h = h;
	}



}
