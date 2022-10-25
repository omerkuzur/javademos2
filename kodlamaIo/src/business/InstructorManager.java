package business;

import java.util.ArrayList;
import java.util.List;

import core.logging.Logger;
import dataAccess.InstructorDao;
import entities.Instructor;

public class InstructorManager {

	private InstructorDao instructorDao;
	private Logger[] loggers;

	private ArrayList<String> instructors = new ArrayList<String>();
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) throws Exception { 

		for(String instructorA : instructors) {
			if (instructor.getName().equals(instructor.getName())) {
				throw new Exception("Eðitmen ismi ayný olamaz");
			}
		}
		instructorDao.add(instructor);
	for(Logger logger : loggers) {
		logger.log(instructor.getName());
	}



	}

	
	
	
}
