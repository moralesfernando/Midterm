package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;

public class Student_Test {
	private static ArrayList<Student> Student;
	private static ArrayList<Course> Course;
	private static ArrayList<Semester> Semester;
	private static ArrayList<Section> Section;

	@BeforeClass
	public static void setup() throws PersonException {
		ArrayList<Student> StudentList = new ArrayList<Student>();
		Student St1 = new Student("FN1", "MN1", "LN1", new Date(97,1,1), eMajor.CHEM, "1 Address Rd.", "000-000-0001", "FML1@udel.edu");
		StudentList.add(St1);
		Student St2 = new Student("FN2", "MN2", "LN2", new Date(97,2,2), eMajor.BUSINESS, "2 Address Ln.", "000-000-0002", "FML2@udel.edu");
		StudentList.add(St2);
		Student St3 = new Student("FN3", "MN3", "LN3", new Date(97,3,3), eMajor.COMPSI, "3 Address Ct.", "000-000-0003", "FML3@udel.edu");
		StudentList.add(St3);
		Student St4 = new Student("FN4", "MN4", "LN4", new Date(97,4,4), eMajor.PHYSICS, "4 Address Ave.", "000-000-0004", "FML4@udel.edu");
		StudentList.add(St4);
		Student St5 = new Student("FN5", "MN5", "LN5", new Date(97,5,5), eMajor.NURSING,"5 Address Blvd.", "000-000-0005", "FML5@udel.edu");
		StudentList.add(St5);
		Student St6 = new Student("FN6", "MN6", "LN6", new Date(97,6,6), eMajor.CHEM,"6 Address Rd.", "000-000-0006", "FML6@udel.edu");
		StudentList.add(St6);
		Student St7 = new Student("FN7", "MN7", "LN7", new Date(97,7,7), eMajor.BUSINESS,"7 Address Ln.", "000-000-0007", "FML7@udel.edu");
		StudentList.add(St7);
		Student St8 = new Student("FN8", "MN8", "LN8", new Date(97,8,8), eMajor.COMPSI,"8 Address Ct.", "000-000-0008", "FML8@udel.edu");
		StudentList.add(St8);
		Student St9 = new Student("FN9", "MN9", "LN9", new Date(97,9,9), eMajor.PHYSICS,"9 Address Ave.", "000-000-0009", "FML9@udel.edu");
		StudentList.add(St9);
		Student St10 = new Student("FN10", "MN10", "LN10", new Date(97,10,10), eMajor.NURSING,"10 Address Blvd.", "000-000-0010", "FML10@udel.edu");
		StudentList.add(St10);
	
		ArrayList<Course> CourseList = new ArrayList<Course>();
		Course COMPSI = new Course(UUID.randomUUID(), "PHYS100", 100, eMajor.COMPSI);
		CourseList.add(COMPSI);
		Course CHEM = new Course(UUID.randomUUID(), "CHEM200", 100, eMajor.CHEM);
		CourseList.add(CHEM);
		Course NURSING = new Course(UUID.randomUUID(), "NURS300", 100, eMajor.NURSING);
		CourseList.add(NURSING);
		
		ArrayList<Semester> SemesterList = new ArrayList<Semester>();
		Semester FALL = new Semester(UUID.randomUUID(), new Date(116,7,30), new Date(116,12,12));
		SemesterList.add(FALL);
		Semester SPRING = new Semester(UUID.randomUUID(), new Date(117,2,1), new Date(117,5,26));
		SemesterList.add(SPRING);
		
		ArrayList<Section> SectionList = new ArrayList<Section>();
		//Section Sct1 = new Section(Course.get(0).getCourseID(), Semester.get(0).getSemesterID(), UUID.randomUUID())
		
	}

	@Test
	public void StudentTest() throws PersonException {
		
	}
}