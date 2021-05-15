package com.klu.student.StudentValidation;

public class StudentCheck {
	public String check(int idno) {
		if(idno>3000)
		{
			return "You are CSE Student";
		}
		else {
			return "you belongs to other dept";
		}

		
	}
	}
