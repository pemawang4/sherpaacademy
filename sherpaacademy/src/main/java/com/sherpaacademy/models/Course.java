package com.sherpaacademy.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long courseId;
	private String courseName;
	private String courseDescription;
	private String syllabus;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "category_id", nullable = false)
	Category category;

	public Course(String courseName, String courseDescription, String syllabus, Category category) {
		super();
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.syllabus = syllabus;
		this.category = category;
	}

	
}
