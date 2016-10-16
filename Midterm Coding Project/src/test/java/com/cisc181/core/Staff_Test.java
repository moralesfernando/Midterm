package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void SalaryTest() throws PersonException {
		ArrayList<Staff> StaffList = new ArrayList<Staff>();
		Staff S1 = new Staff("FN1", "MN1", "LN1", new Date(61,1,1), "1 Address Rd.", "000-000-0001", "FML1@udel.edu", "Monday @ 1", 0, 10000, new Date(91,1,1), eTitle.MS);
		StaffList.add(S1);
		Staff S2 = new Staff("FN2", "MN2", "LN2", new Date(62,2,2), "2 Address Ln.", "000-000-0002", "FML2@udel.edu", "Tuesday @ 2", 0, 20000, new Date(92,2,2), eTitle.MRS);
		StaffList.add(S2);
		Staff S3 = new Staff("FN3", "MN3", "LN3", new Date(63,3,3), "3 Address Ct.", "000-000-0003", "FML3@udel.edu", "Wednesday @ 3", 0, 30000, new Date(93,3,3), eTitle.MR);
		StaffList.add(S3);
		Staff S4 = new Staff("FN4", "MN4", "LN4", new Date(64,4,4), "4 Address Ave.", "000-000-0004", "FML4@udel.edu", "Thursday @ 4", 0, 40000, new Date(94,4,4), eTitle.MS);
		StaffList.add(S4);
		Staff S5 = new Staff("FN5", "MN5", "LN5", new Date(65,5,5), "5 Address Blvd.", "000-000-0005", "FML5@udel.edu", "Friday @ 5", 0, 50000, new Date(95,5,5), eTitle.MRS);
		StaffList.add(S5);
		
		double avgSalary = (S1.getSalary() + S2.getSalary() + S3.getSalary() + S4.getSalary() + S5.getSalary()) / 5;

		assertEquals(avgSalary, 30000, 0);
	}

	@Test(expected = PersonException.class)
	public void PhoneTest() throws PersonException {
		Staff InvalidNumber = new Staff("Bad", "Number", "Guy", new Date(80,1,2), "10 BadNumber St.", "000-000-001", "BNG@udel.edu", "Monday @ 10", 0, 30000, new Date(110,10,10), eTitle.MR);
	}
	
	@Test(expected = PersonException.class)
	public void DOBTest() throws PersonException {
		Staff InvalidDOB = new Staff("Super", "Old", "Guy", new Date(10,10,10), "10 OldHead Ave.", "000-000-0001", "SOG@udel.edu", "Monday @ 10", 0, 30000, new Date(35,10,10), eTitle.MR);
	}

}