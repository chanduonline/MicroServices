package com.chanduonline.OnlineCourseCatalog.model;

import java.util.Arrays;
import java.util.List;

public class StudentRating {
	private String studentId;
	private List<Rating> ratings;
	
	public StudentRating() {}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public void initData(String studentId) {
		this.setStudentId(studentId);
		this.setRatings(Arrays.asList(new Rating("Java", 4), new Rating("Hibernate", 4)));
	}

}
