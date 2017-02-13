package com.java.mappers;

import java.util.List;
import java.util.Map;
import com.java.model.Student;
//½Ó¿Ú
public interface StudentMapper {
	
	
	
	//²âÊÔif
		public List<Student> searchStudents(Map<String,Object> map);
		//²âÊÔchoose£¬when, otherwiseÌõ¼ş 
		public List<Student> searchStudents2(Map<String,Object> map);
		//²âÊÔwhere
		public List<Student> searchStudents3(Map<String,Object> map);
		//²âÊÔtrim
		public List<Student> searchStudents4(Map<String,Object> map);
		//²âÊÔforeach
		public List<Student> searchStudents5(Map<String,Object> map);
		//²âÊÔset
		public int updateStudent(Student student);
	
	
	

}
