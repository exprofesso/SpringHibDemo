package by.htp.main.dao;

import java.util.List;

import by.htp.main.entity.Course;
import by.htp.main.entity.Instructor;

public interface CoursesDAO {

	public List<Instructor> getInstructors();

	public void saveCourse (Course course);

	public Course courseFindById(int id);

	public void deleteCourse(int theId);
	
}
