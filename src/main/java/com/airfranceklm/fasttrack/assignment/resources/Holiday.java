package com.airfranceklm.fasttrack.assignment.resources;

import java.util.UUID;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "holidays")
public class Holiday {
	
	// DATA
	@Id
	@GeneratedValue
	private UUID holidayId;
	
	@Column(name = "holidayLabel")
    private String holidayLabel;
	
	@Column(name = "employeeId")
	private String employeeId;
	
	@Column(name = "startOfHoliday")
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
	private String startOfHoliday;
	
	
	@Column(name = "endOfHoliday")
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
	private String endOfHoliday;

	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	private Status status;
	
	// EMPTY CONTROLLER
	public Holiday() {
		
	}
	
	// CONTROLLERS
    public Holiday(String holidayLabel, String employeeId, String startOfHoliday, String endOfHoliday, Status status) {
		this.holidayLabel = holidayLabel;
		this.employeeId = employeeId;
		this.startOfHoliday = startOfHoliday;
		this.endOfHoliday = endOfHoliday;
		this.status = status;
	}

    // GETTERS AND SETTERS
	public String getHolidayLabel() {
		return holidayLabel;
	}

	public void setHolidayLabel(String holidayLabel) {
		this.holidayLabel = holidayLabel;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getStartOfHoliday() {
		return startOfHoliday;
	}

	public void setStartOfHoliday(String startOfHoliday) {
		this.startOfHoliday = startOfHoliday;
	}

	public String getEndOfHoliday() {
		return endOfHoliday;
	}

	public void setEndOfHoliday(String endOfHoliday) {
		this.endOfHoliday = endOfHoliday;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public UUID getHolidayId() {
		return holidayId;
	}
}
