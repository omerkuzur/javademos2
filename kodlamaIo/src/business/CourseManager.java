package business;

import java.util.ArrayList;
import java.util.List;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {

	
	private CourseDao courseDao;
	private Logger[] loggers;
	private ArrayList<String> courses = new ArrayList<String>();
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course)throws Exception{
		for(String courseA : courses) {
			if (course.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Kurs ismi ayný olamaz");
			}
		}
	courseDao.add(course);
	for(Logger logger : loggers) {
		logger.log(course.getCourseName());
	}

	}
}
