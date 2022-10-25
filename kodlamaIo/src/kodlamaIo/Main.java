package kodlamaIo;

import business.CategoriesManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import dataAccess.HibernateCourseDao;
import dataAccess.JdbcCategoriesDao;
import dataAccess.JdbcInstructorDao;
import entities.Categories;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception{
		Course course = new Course("Ja",10);
		Course course2 = new Course("C",20);
		
		Categories category = new Categories("Programlama");
		Instructor instructor = new Instructor(4,"Kamil","Ali");
		Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course2);
		courseManager.add(course);
		
		CategoriesManager categoryManager = new CategoriesManager(new JdbcCategoriesDao(), loggers);
		categoryManager.add(category);
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.add(instructor);

	}

}
