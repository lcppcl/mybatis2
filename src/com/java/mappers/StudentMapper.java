package com.java.mappers;

import java.util.List;
import java.util.Map;
import com.java.model.Student;
//�ӿ�
public interface StudentMapper {
	
	
	
	//����if
		public List<Student> searchStudents(Map<String,Object> map);
		//����choose��when, otherwise���� 
		public List<Student> searchStudents2(Map<String,Object> map);
		//����where
		public List<Student> searchStudents3(Map<String,Object> map);
		//����trim
		public List<Student> searchStudents4(Map<String,Object> map);
		//����foreach
		public List<Student> searchStudents5(Map<String,Object> map);
		//����set
		public int updateStudent(Student student);
	
	
	

}
