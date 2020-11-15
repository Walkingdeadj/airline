package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerReservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	// This is equivalent to the customer table id
	private int custId;
	// This is equivalent to the flight table id
	private int flightId;
	// This is generated by the programming based upon seats available/flight capacity: Example 1A
	private String seatIdentifierText;
	

	// constructors
	public CustomerReservation() {
	}

	public CustomerReservation(int custId, int flightId, String seatIdentifierText) {
		super();
		//this.id = id;
		this.custId = custId;
		this.flightId = flightId;
		this.seatIdentifierText = seatIdentifierText;
	}
	
	public int getId() {
		return id;
	}


	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getSeatIdentifierText() {
		return seatIdentifierText;
	}

	public void setSeatIdentifierText(String seatIdentifierText) {
		this.seatIdentifierText = seatIdentifierText;
	}




	@Override
	public String toString() {
		return "CustomerReservation [id=" + id + ", custId=" + custId + ", flightId=" + flightId
				+ ", seatIdentifierText=" + seatIdentifierText + "]";
	}
	
	
	



}
