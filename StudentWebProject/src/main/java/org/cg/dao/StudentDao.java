package org.cg.dao;

import java.util.List;

import org.cg.model.Student;

public interface StudentDao {
//	public List<Student> createStudent(Student s);
//	public List<Student> getAllStudent();
	public List<Student> getStudentByName(String name);
}
