package com.cisc181.core;
import com.cisc181.eNums.eMajor;
import java.util.UUID;


public class Course {
	public UUID CourseID;
	public String CourseName;
	private int GradePoints;
	private eMajor Major;

	public Course(UUID CourseID, String CourseName, int GradePoints, eMajor Major){
		this.GradePoints = GradePoints;
		this.Major = Major;
		this.CourseID = CourseID;
		this.CourseName = CourseName;
	}

	public int getGradePoints(){
		return GradePoints;
	}

	public eMajor getMajor(){
		return Major;
	}
	
}
