package com.lexicon.emil.WebSchoolManager;

import java.sql.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="course")
public class Course {

	@Id
	@Column(name="idCourse")
	private int idCourse;
	
	@Column(name="courseName")
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String courseName;
	
	@Column(name="startDate")
	@NotNull(message="is required")
	private Date startDate;
	
	@Column(name="weekDuration")
	@NotNull(message="is required")
	@Min(value=1, message="can not be zero")
	private int weekDuration;
	
	private List<Student> students;

	public Course() {
		students = new LinkedList<>();
	}

	public Course( String courseName, Date startDate, int weekDuration, List<Student> students) {
		this.courseName = courseName;
		this.startDate = startDate;
		this.weekDuration = weekDuration;
		this.students = students;
	}

	public int getIdCourse() {
		return idCourse;
	}

	public void setIdCourse(int idCourse) {
		this.idCourse = idCourse;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public int getWeekDuration() {
		return weekDuration;
	}

	public void setWeekDuration(int weekDuration) {
		this.weekDuration = weekDuration;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
}
