package com.iddinkgroup.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Agenda {

	@Id
	private String appointmentId;
	
 
	public Agenda() {
		
	}
	
	@ElementCollection
	private List<String> attendees;

	private Date proposedTime;

	private String organizer;

	private String summary;

	private String location;
 
	public String getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}

	public List<String> getAttendees() {
		return attendees;
	}

	public void setAttendees(List<String> attendees) {
		this.attendees = attendees;
	}

	public Date getProposedTime() {
		return proposedTime;
	}

	public void setProposedTime(Date proposedTime) {
		this.proposedTime = proposedTime;
	}

	public String getOrganizer() {
		return organizer;
	}

	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

 
}
