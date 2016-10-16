package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {
	
	public UUID SemesterID;
	public Date StartDate;
	public Date EndDate;
	
	Semester(UUID SemesterID, Date StartDate, Date EndDate){
		this.SemesterID = SemesterID;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}
}

