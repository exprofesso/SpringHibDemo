package by.htp.main.service;

import java.util.List;

import by.htp.main.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.htp.main.dao.CoursesDAO;
import by.htp.main.entity.Instructor;

@Service
public class CoursesServiceImpl implements CoursesService {

    @Autowired
    private CoursesDAO coursesDAO;

    @Transactional
    public List<Instructor> getInstructors() {
        return coursesDAO.getInstructors();
    }

    //@Override
    @Transactional
    public void saveCourse(Course course) {

        // log

        // check

        coursesDAO.saveCourse(course);
    }

    //@Override
    @Transactional
    public Course courseFindById(int id) {

        return coursesDAO.courseFindById(id);
    }

    //@Override
    @Transactional
    public void deleteCourse(int id) {

        coursesDAO.deleteCourse(id);
    }
}





