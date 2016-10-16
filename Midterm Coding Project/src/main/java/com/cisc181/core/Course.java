package com.cisc181.core;
import com.cisc181.eNums.eMajor;
import java.util.UUID;


public class Course {
	public UUID CourseID;
	public String CourseName;
	private int GradePoints;
	private eMajor Major;

	public Course(int GradePoints, eMajor Major){
		this.GradePoints = GradePoints;
		this.Major = Major;
	}

	public int getGradePoints(){
		return GradePoints;
	}

	public eMajor getMajor(){
		return Major;
	}
	
}
