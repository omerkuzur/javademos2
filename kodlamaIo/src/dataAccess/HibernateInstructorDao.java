package dataAccess;

import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("E�itmen hibernate ile veritaban�na eklendi");
		
	}
}
