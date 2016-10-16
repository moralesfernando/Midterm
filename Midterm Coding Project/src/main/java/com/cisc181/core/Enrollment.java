package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	public UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment() 
	{}
	
	public Enrollment(UUID StudentID, UUID SectionID) {
		this.SectionID = SectionID;
		this.StudentID = StudentID;
		this.EnrollmentID = UUID.randomUUID();
	}
	
	public void setGrade(double Grade) {
		this.Grade = Grade;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public double getGrade() {
		return Grade;
	}
	
}