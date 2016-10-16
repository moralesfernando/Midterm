package com.cisc181.core;

import java.util.UUID;

public class Section {
	
	public UUID CourseID;
	public UUID SemesterID;
	public UUID SectionID;
	public int RoomID;
	
	Section(UUID CourseID, UUID SemesterID, UUID SectionID, int RoomID){
		this.CourseID = CourseID;
		this.SemesterID = SemesterID;
		this.SectionID = SectionID;
		this.RoomID = RoomID;
	}
}