package by.htp.main.service;

import java.util.List;

import by.htp.main.entity.Course;
import by.htp.main.entity.Instructor;

public interface CoursesService {

	public List<Instructor> getInstructors();

	public void saveCourse (Course course);

	public Course courseFindById(int id);

	public void deleteCourse(int id);
	
}
