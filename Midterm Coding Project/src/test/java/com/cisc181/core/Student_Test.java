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
	private static ArrayList<Student> StudentList;
	private static ArrayList<Course> CourseList;
	private static ArrayList<Semester> SemesterList;
	private static ArrayList<Section> SectionList;
	private static ArrayList<Enrollment> EnrollmentList;

	@BeforeClass
	public static void setup() throws PersonException {
		StudentList = new ArrayList<Student>();
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

		CourseList = new ArrayList<Course>();
		Course COMPSI = new Course(UUID.randomUUID(), "PHYS100", 100, eMajor.COMPSI);
		CourseList.add(COMPSI);
		Course CHEM = new Course(UUID.randomUUID(), "CHEM200", 100, eMajor.CHEM);
		CourseList.add(CHEM);
		Course NURSING = new Course(UUID.randomUUID(), "NURS300", 100, eMajor.NURSING);
		CourseList.add(NURSING);

		SemesterList = new ArrayList<Semester>();
		Semester FALL = new Semester(UUID.randomUUID(), new Date(116,7,30), new Date(116,12,12));
		SemesterList.add(FALL);
		Semester SPRING = new Semester(UUID.randomUUID(), new Date(117,2,1), new Date(117,5,26));
		SemesterList.add(SPRING);

		SectionList = new ArrayList<Section>();
		Section Sct1 = new Section(CourseList.get(0).CourseID, SemesterList.get(0).SemesterID, UUID.randomUUID(), 111);
		SectionList.add(Sct1);
		Section Sct2 = new Section(CourseList.get(0).CourseID, SemesterList.get(1).SemesterID, UUID.randomUUID(), 122);
		SectionList.add(Sct2);
		Section Sct3 = new Section(CourseList.get(1).CourseID, SemesterList.get(0).SemesterID, UUID.randomUUID(), 213);
		SectionList.add(Sct3);
		Section Sct4 = new Section(CourseList.get(1).CourseID, SemesterList.get(1).SemesterID, UUID.randomUUID(), 224);
		SectionList.add(Sct4);
		Section Sct5 = new Section(CourseList.get(2).CourseID, SemesterList.get(0).SemesterID, UUID.randomUUID(), 315);
		SectionList.add(Sct5);
		Section Sct6 = new Section(CourseList.get(2).CourseID, SemesterList.get(1).SemesterID, UUID.randomUUID(), 326);
		SectionList.add(Sct6);

		EnrollmentList = new ArrayList<Enrollment>();
		Enrollment StEnr1 = new Enrollment(St1.getStudentID(), Sct1.getSectionID());
		EnrollmentList.add(StEnr1);
		StEnr1.setGrade(4.0);
		Enrollment StEnr2 = new Enrollment(St1.getStudentID(), Sct2.getSectionID());
		EnrollmentList.add(StEnr2);
		StEnr2.setGrade(4.0);
		Enrollment StEnr3 = new Enrollment(St1.getStudentID(), Sct3.getSectionID());
		EnrollmentList.add(StEnr3);
		StEnr3.setGrade(3.5);
		Enrollment StEnr4 = new Enrollment(St1.getStudentID(), Sct4.getSectionID());
		EnrollmentList.add(StEnr4);
		StEnr4.setGrade(3.5);
		Enrollment StEnr5 = new Enrollment(St1.getStudentID(), Sct5.getSectionID());
		EnrollmentList.add(StEnr5);
		StEnr5.setGrade(3.0);
		Enrollment StEnr6 = new Enrollment(St1.getStudentID(), Sct6.getSectionID());
		EnrollmentList.add(StEnr6);
		StEnr6.setGrade(3.0);
		//3.5 for St1
		Enrollment StEnr7 = new Enrollment(St2.getStudentID(), Sct1.getSectionID());
		EnrollmentList.add(StEnr7);
		StEnr7.setGrade(2.0);
		Enrollment StEnr8 = new Enrollment(St2.getStudentID(), Sct2.getSectionID());
		EnrollmentList.add(StEnr8);
		StEnr8.setGrade(2.0);
		Enrollment StEnr9 = new Enrollment(St2.getStudentID(), Sct3.getSectionID());
		EnrollmentList.add(StEnr9);
		StEnr9.setGrade(2.5);
		Enrollment StEnr10 = new Enrollment(St2.getStudentID(), Sct4.getSectionID());
		EnrollmentList.add(StEnr10);
		StEnr10.setGrade(2.5);
		Enrollment StEnr11 = new Enrollment(St2.getStudentID(), Sct5.getSectionID());
		EnrollmentList.add(StEnr11);
		StEnr11.setGrade(3.0);
		Enrollment StEnr12 = new Enrollment(St2.getStudentID(), Sct6.getSectionID());
		EnrollmentList.add(StEnr12);
		StEnr12.setGrade(3.0);
		//2.5 for St2
		Enrollment StEnr13 = new Enrollment(St3.getStudentID(), Sct1.getSectionID());
		EnrollmentList.add(StEnr13);
		StEnr13.setGrade(3.5);
		Enrollment StEnr14 = new Enrollment(St3.getStudentID(), Sct2.getSectionID());
		EnrollmentList.add(StEnr14);
		StEnr14.setGrade(3.5);
		Enrollment StEnr15 = new Enrollment(St3.getStudentID(), Sct3.getSectionID());
		EnrollmentList.add(StEnr15);
		StEnr15.setGrade(3.0);
		Enrollment StEnr16 = new Enrollment(St3.getStudentID(), Sct4.getSectionID());
		EnrollmentList.add(StEnr16);
		StEnr16.setGrade(3.0);
		Enrollment StEnr17 = new Enrollment(St3.getStudentID(), Sct5.getSectionID());
		EnrollmentList.add(StEnr17);
		StEnr17.setGrade(2.5);
		Enrollment StEnr18 = new Enrollment(St3.getStudentID(), Sct6.getSectionID());
		EnrollmentList.add(StEnr18);
		StEnr18.setGrade(2.5);
		//3.0 for St3
		Enrollment StEnr19 = new Enrollment(St4.getStudentID(), Sct1.getSectionID());
		EnrollmentList.add(StEnr19);
		StEnr19.setGrade(4.0);
		Enrollment StEnr20 = new Enrollment(St4.getStudentID(), Sct2.getSectionID());
		EnrollmentList.add(StEnr20);
		StEnr20.setGrade(4.0);
		Enrollment StEnr21 = new Enrollment(St4.getStudentID(), Sct3.getSectionID());
		EnrollmentList.add(StEnr21);
		StEnr21.setGrade(4.0);
		Enrollment StEnr22 = new Enrollment(St4.getStudentID(), Sct4.getSectionID());
		EnrollmentList.add(StEnr22);
		StEnr22.setGrade(4.0);
		Enrollment StEnr23 = new Enrollment(St4.getStudentID(), Sct5.getSectionID());
		EnrollmentList.add(StEnr23);
		StEnr23.setGrade(4.0);
		Enrollment StEnr24 = new Enrollment(St4.getStudentID(), Sct6.getSectionID());
		EnrollmentList.add(StEnr24);
		StEnr24.setGrade(4.0);
		//4.0 for St4
		Enrollment StEnr25 = new Enrollment(St5.getStudentID(), Sct1.getSectionID());
		EnrollmentList.add(StEnr25);
		StEnr25.setGrade(3.0);
		Enrollment StEnr26 = new Enrollment(St5.getStudentID(), Sct2.getSectionID());
		EnrollmentList.add(StEnr26);
		StEnr26.setGrade(3.0);
		Enrollment StEnr27 = new Enrollment(St5.getStudentID(), Sct3.getSectionID());
		EnrollmentList.add(StEnr27);
		StEnr27.setGrade(3.0);
		Enrollment StEnr28 = new Enrollment(St5.getStudentID(), Sct4.getSectionID());
		EnrollmentList.add(StEnr28);
		StEnr28.setGrade(3.0);
		Enrollment StEnr29 = new Enrollment(St5.getStudentID(), Sct5.getSectionID());
		EnrollmentList.add(StEnr29);
		StEnr29.setGrade(3.0);
		Enrollment StEnr30 = new Enrollment(St5.getStudentID(), Sct6.getSectionID());
		EnrollmentList.add(StEnr30);
		StEnr30.setGrade(3.0);
		//3.0 for St5
		Enrollment StEnr31 = new Enrollment(St6.getStudentID(), Sct1.getSectionID());
		EnrollmentList.add(StEnr31);
		StEnr31.setGrade(4.0);
		Enrollment StEnr32 = new Enrollment(St6.getStudentID(), Sct2.getSectionID());
		EnrollmentList.add(StEnr32);
		StEnr32.setGrade(4.0);
		Enrollment StEnr33 = new Enrollment(St6.getStudentID(), Sct3.getSectionID());
		EnrollmentList.add(StEnr33);
		StEnr33.setGrade(3.0);
		Enrollment StEnr34 = new Enrollment(St6.getStudentID(), Sct4.getSectionID());
		EnrollmentList.add(StEnr34);
		StEnr34.setGrade(3.0);
		Enrollment StEnr35 = new Enrollment(St6.getStudentID(), Sct5.getSectionID());
		EnrollmentList.add(StEnr35);
		StEnr35.setGrade(2.0);
		Enrollment StEnr36 = new Enrollment(St6.getStudentID(), Sct6.getSectionID());
		EnrollmentList.add(StEnr36);
		StEnr36.setGrade(2.0);
		//3.0 for St6
		Enrollment StEnr37 = new Enrollment(St7.getStudentID(), Sct1.getSectionID());
		EnrollmentList.add(StEnr37);
		StEnr37.setGrade(4.0);
		Enrollment StEnr38 = new Enrollment(St7.getStudentID(), Sct2.getSectionID());
		EnrollmentList.add(StEnr38);
		StEnr38.setGrade(4.0);
		Enrollment StEnr39 = new Enrollment(St7.getStudentID(), Sct3.getSectionID());
		EnrollmentList.add(StEnr39);
		StEnr39.setGrade(4.0);
		Enrollment StEnr40 = new Enrollment(St7.getStudentID(), Sct4.getSectionID());
		EnrollmentList.add(StEnr40);
		StEnr40.setGrade(3.0);
		Enrollment StEnr41 = new Enrollment(St7.getStudentID(), Sct5.getSectionID());
		EnrollmentList.add(StEnr41);
		StEnr41.setGrade(3.0);
		Enrollment StEnr42 = new Enrollment(St7.getStudentID(), Sct6.getSectionID());
		EnrollmentList.add(StEnr42);
		StEnr42.setGrade(3.0);
		//3.5 for St7
		Enrollment StEnr43 = new Enrollment(St8.getStudentID(), Sct1.getSectionID());
		EnrollmentList.add(StEnr43);
		StEnr43.setGrade(2.0);
		Enrollment StEnr44 = new Enrollment(St8.getStudentID(), Sct2.getSectionID());
		EnrollmentList.add(StEnr44);
		StEnr44.setGrade(2.0);
		Enrollment StEnr45 = new Enrollment(St8.getStudentID(), Sct3.getSectionID());
		EnrollmentList.add(StEnr45);
		StEnr45.setGrade(2.0);
		Enrollment StEnr46 = new Enrollment(St8.getStudentID(), Sct4.getSectionID());
		EnrollmentList.add(StEnr46);
		StEnr46.setGrade(2.0);
		Enrollment StEnr47 = new Enrollment(St8.getStudentID(), Sct5.getSectionID());
		EnrollmentList.add(StEnr47);
		StEnr47.setGrade(2.0);
		Enrollment StEnr48 = new Enrollment(St8.getStudentID(), Sct6.getSectionID());
		EnrollmentList.add(StEnr48);
		StEnr48.setGrade(2.0);
		//2.0 for St8
		Enrollment StEnr49 = new Enrollment(St9.getStudentID(), Sct1.getSectionID());
		EnrollmentList.add(StEnr49);
		StEnr49.setGrade(4.0);
		Enrollment StEnr50 = new Enrollment(St9.getStudentID(), Sct2.getSectionID());
		EnrollmentList.add(StEnr50);
		StEnr50.setGrade(4.0);
		Enrollment StEnr51 = new Enrollment(St9.getStudentID(), Sct3.getSectionID());
		EnrollmentList.add(StEnr51);
		StEnr51.setGrade(4.0);
		Enrollment StEnr52 = new Enrollment(St9.getStudentID(), Sct4.getSectionID());
		EnrollmentList.add(StEnr52);
		StEnr52.setGrade(2.0);
		Enrollment StEnr53 = new Enrollment(St9.getStudentID(), Sct5.getSectionID());
		EnrollmentList.add(StEnr53);
		StEnr53.setGrade(2.0);
		Enrollment StEnr54 = new Enrollment(St9.getStudentID(), Sct6.getSectionID());
		EnrollmentList.add(StEnr54);
		StEnr54.setGrade(2.0);
		//3.0 for St9
		Enrollment StEnr55 = new Enrollment(St10.getStudentID(), Sct1.getSectionID());
		EnrollmentList.add(StEnr55);
		StEnr55.setGrade(3.5);
		Enrollment StEnr56 = new Enrollment(St10.getStudentID(), Sct2.getSectionID());
		EnrollmentList.add(StEnr56);
		StEnr56.setGrade(3.5);
		Enrollment StEnr57 = new Enrollment(St10.getStudentID(), Sct3.getSectionID());
		EnrollmentList.add(StEnr57);
		StEnr57.setGrade(3.5);
		Enrollment StEnr58 = new Enrollment(St10.getStudentID(), Sct4.getSectionID());
		EnrollmentList.add(StEnr58);
		StEnr58.setGrade(3.5);
		Enrollment StEnr59 = new Enrollment(St10.getStudentID(), Sct5.getSectionID());
		EnrollmentList.add(StEnr59);
		StEnr59.setGrade(3.5);
		Enrollment StEnr60 = new Enrollment(St10.getStudentID(), Sct6.getSectionID());
		EnrollmentList.add(StEnr60);
		StEnr60.setGrade(3.5);
		//3.5 for St10
		//Use GPA scale directly because easier to calculate
	}

	@Test
	public void testGPA() throws PersonException {
		double St1Grade=0;
		St1Grade= St1Grade + EnrollmentList.get(0).getGrade();
		St1Grade= St1Grade + EnrollmentList.get(1).getGrade();
		St1Grade= St1Grade + EnrollmentList.get(2).getGrade();
		St1Grade= St1Grade + EnrollmentList.get(3).getGrade();
		St1Grade= St1Grade + EnrollmentList.get(4).getGrade();
		St1Grade= St1Grade + EnrollmentList.get(5).getGrade();
		St1Grade= St1Grade/6;

		assertTrue(St1Grade == 3.5);//for some reason only assertTrue works not assertEqual... should be the same???

		double St2Grade=0;
		St2Grade= St2Grade + EnrollmentList.get(6).getGrade();
		St2Grade= St2Grade + EnrollmentList.get(7).getGrade();
		St2Grade= St2Grade + EnrollmentList.get(8).getGrade();
		St2Grade= St2Grade + EnrollmentList.get(9).getGrade();
		St2Grade= St2Grade + EnrollmentList.get(10).getGrade();
		St2Grade= St2Grade + EnrollmentList.get(11).getGrade();
		St2Grade= St2Grade/6;

		assertTrue(St2Grade == 2.5);

		double St3Grade=0;
		St3Grade= St3Grade + EnrollmentList.get(12).getGrade();
		St3Grade= St3Grade + EnrollmentList.get(13).getGrade();
		St3Grade= St3Grade + EnrollmentList.get(14).getGrade();
		St3Grade= St3Grade + EnrollmentList.get(15).getGrade();
		St3Grade= St3Grade + EnrollmentList.get(16).getGrade();
		St3Grade= St3Grade + EnrollmentList.get(17).getGrade();
		St3Grade= St3Grade/6;

		assertTrue(St3Grade == 3.0);

		double St4Grade=0;
		St4Grade= St4Grade + EnrollmentList.get(18).getGrade();
		St4Grade= St4Grade + EnrollmentList.get(19).getGrade();
		St4Grade= St4Grade + EnrollmentList.get(20).getGrade();
		St4Grade= St4Grade + EnrollmentList.get(21).getGrade();
		St4Grade= St4Grade + EnrollmentList.get(22).getGrade();
		St4Grade= St4Grade + EnrollmentList.get(23).getGrade();
		St4Grade= St4Grade/6;

		assertTrue(St4Grade == 4.0);

		double St5Grade=0;
		St5Grade= St5Grade + EnrollmentList.get(24).getGrade();
		St5Grade= St5Grade + EnrollmentList.get(25).getGrade();
		St5Grade= St5Grade + EnrollmentList.get(26).getGrade();
		St5Grade= St5Grade + EnrollmentList.get(27).getGrade();
		St5Grade= St5Grade + EnrollmentList.get(28).getGrade();
		St5Grade= St5Grade + EnrollmentList.get(29).getGrade();
		St5Grade= St5Grade/6;

		assertTrue(St5Grade == 3.0);

		double St6Grade=0;
		St6Grade= St6Grade + EnrollmentList.get(30).getGrade();
		St6Grade= St6Grade + EnrollmentList.get(31).getGrade();
		St6Grade= St6Grade + EnrollmentList.get(32).getGrade();
		St6Grade= St6Grade + EnrollmentList.get(33).getGrade();
		St6Grade= St6Grade + EnrollmentList.get(34).getGrade();
		St6Grade= St6Grade + EnrollmentList.get(35).getGrade();
		St6Grade= St6Grade/6;

		assertTrue(St6Grade == 3.0);

		double St7Grade=0;
		St7Grade= St7Grade + EnrollmentList.get(36).getGrade();
		St7Grade= St7Grade + EnrollmentList.get(37).getGrade();
		St7Grade= St7Grade + EnrollmentList.get(38).getGrade();
		St7Grade= St7Grade + EnrollmentList.get(39).getGrade();
		St7Grade= St7Grade + EnrollmentList.get(40).getGrade();
		St7Grade= St7Grade + EnrollmentList.get(41).getGrade();
		St7Grade= St7Grade/6;

		assertTrue(St7Grade == 3.5);

		double St8Grade=0;
		St8Grade= St8Grade + EnrollmentList.get(42).getGrade();
		St8Grade= St8Grade + EnrollmentList.get(43).getGrade();
		St8Grade= St8Grade + EnrollmentList.get(44).getGrade();
		St8Grade= St8Grade + EnrollmentList.get(45).getGrade();
		St8Grade= St8Grade + EnrollmentList.get(46).getGrade();
		St8Grade= St8Grade + EnrollmentList.get(47).getGrade();
		St8Grade= St8Grade/6;

		assertTrue(St8Grade == 2.0);

		double St9Grade=0;
		St9Grade= St9Grade + EnrollmentList.get(48).getGrade();
		St9Grade= St9Grade + EnrollmentList.get(49).getGrade();
		St9Grade= St9Grade + EnrollmentList.get(50).getGrade();
		St9Grade= St9Grade + EnrollmentList.get(51).getGrade();
		St9Grade= St9Grade + EnrollmentList.get(52).getGrade();
		St9Grade= St9Grade + EnrollmentList.get(53).getGrade();
		St9Grade= St9Grade/6;

		assertTrue(St9Grade == 3.0);
		
		double St10Grade=0;
		St10Grade= St10Grade + EnrollmentList.get(54).getGrade();
		St10Grade= St10Grade + EnrollmentList.get(55).getGrade();
		St10Grade= St10Grade + EnrollmentList.get(56).getGrade();
		St10Grade= St10Grade + EnrollmentList.get(57).getGrade();
		St10Grade= St10Grade + EnrollmentList.get(58).getGrade();
		St10Grade= St10Grade + EnrollmentList.get(59).getGrade();
		St10Grade= St10Grade/6;

		assertTrue(St10Grade == 3.5);			
	}
	
	@Test
	public void testCourseAverage() throws PersonException {
		double CrsAvg=0;
		CrsAvg = CrsAvg + CourseList.get(0).getGradePoints();
		CrsAvg = CrsAvg + CourseList.get(1).getGradePoints();
		CrsAvg = CrsAvg + CourseList.get(2).getGradePoints();
		CrsAvg = CrsAvg / 3;
		
		assertTrue(CrsAvg == 100);
	}

	@Test
	public void testMajorChange() throws PersonException {
		assertTrue(StudentList.get(0).getMajor() == eMajor.CHEM);
		StudentList.get(0).setMajor(eMajor.NURSING);
		assertTrue(StudentList.get(0).getMajor() == eMajor.NURSING);
	}

}