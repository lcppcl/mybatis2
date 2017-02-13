package com.java;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.java.mappers.StudentMapper;
import com.java.model.Student;
import com.java.util.SqlSessionFactoryUtil;


//�������ݿ�����
public class StudentTest {
	private static Logger logger = Logger.getLogger(StudentTest.class);
	private SqlSession sqlSession = null;//�����ݿ�����
	private StudentMapper studentMapper = null; //ӳ����
	@Before   //���Է���ִ��֮ǰ����
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		studentMapper = sqlSession.getMapper(StudentMapper.class);
	}

	@After    //���Է���ִ��֮�����
	public void tearDown() throws Exception {
		sqlSession.close();
	}

	/*@Test   ����if
	public void testSearch() {
		logger.info("��ѯѧ������������");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("gradeId", 2);
		map.put("name", "%��%");
		map.put("age",11);
		List<Student> studentList=studentMapper.searchStudents(map);
		for(Student student:studentList){
			System.out.println(student);
		}
	}*/
	
/*	@Test   //choose��when, otherwise���� 
	public void testSearch2() {
		logger.info("��ѯѧ������������");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("searchBy","age");
		map.put("gradeId", 2);
		map.put("name", "%��%");
		map.put("age",11);
		List<Student> studentList=studentMapper.searchStudents2(map);
		for(Student student:studentList){
			System.out.println(student);
		}
	}*/
	
	/*@Test   //where
	public void testSearch3() {
		logger.info("��ѯѧ������������");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("gradeId", 2);
		//map.put("name", "%��%");
		//map.put("age",11);
		List<Student> studentList=studentMapper.searchStudents3(map);
		for(Student student:studentList){
			System.out.println(student);
		}
	}*/
	
	/*@Test   //trim
	public void testSearch4() {
		logger.info("��ѯѧ������������");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("gradeId", 2);
		//map.put("name", "%��%");
		//map.put("age",11);
		List<Student> studentList=studentMapper.searchStudents4(map);
		for(Student student:studentList){
			System.out.println(student);
		}
	}*/
	
	/*@Test   //foreach
	public void testSearch5() {
		logger.info("��ѯѧ������������");
		Map<String, Object> map = new HashMap<String, Object>();
		List<Integer> gradeIds = new ArrayList<Integer>();
		gradeIds.add(1);
		gradeIds.add(2);
		map.put("gradeIds", gradeIds);
		//map.put("name", "%��%");
		//map.put("age",11);
		List<Student> studentList=studentMapper.searchStudents5(map);
		for(Student student:studentList){
			System.out.println(student);
		}
	}*/
	
	@Test    //����set
	public void testUpdateStudent(){
		logger.info("����ѧ������������");
		Student student = new Student();
		student.setId(1);
		student.setName("����");
		studentMapper.updateStudent(student);
		sqlSession.commit();
		
	}

}
