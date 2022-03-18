package by.htp.main.dao;

import java.util.List;

import by.htp.main.entity.Course;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import by.htp.main.entity.Instructor;

@Repository
public class CoursesDAOImpl implements CoursesDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Instructor> getInstructors() {

        Session currentSession = sessionFactory.getCurrentSession();

        Query<Instructor> theQuery =
                currentSession.createQuery("from Instructor order by lastName",
                        Instructor.class);

        List<Instructor> instructors = theQuery.getResultList();


        return instructors;
    }


    //@Override
    public void saveCourse(Course Course) {

        // get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // save/upate the customer ... finally LOL
        currentSession.saveOrUpdate(Course);

    }

    //@Override
    public Course courseFindById(int theId) {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // now retrieve/read from database using the primary key
        Course course = currentSession.get(Course.class, theId);

        return course;
    }

    //@Override
    public void deleteCourse(int theId) {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // delete object with primary key
        Query theQuery =
                currentSession.createQuery("delete from Course where id=:courseId");
        theQuery.setParameter("courseId", theId);

        theQuery.executeUpdate();
    }

}











