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


//测试数据库连接
public class StudentTest {
	private static Logger logger = Logger.getLogger(StudentTest.class);
	private SqlSession sqlSession = null;//打开数据库连接
	private StudentMapper studentMapper = null; //映射器
	@Before   //测试方法执行之前调用
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		studentMapper = sqlSession.getMapper(StudentMapper.class);
	}

	@After    //测试方法执行之后调用
	public void tearDown() throws Exception {
		sqlSession.close();
	}

	/*@Test   测试if
	public void testSearch() {
		logger.info("查询学生（带条件）");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("gradeId", 2);
		map.put("name", "%李%");
		map.put("age",11);
		List<Student> studentList=studentMapper.searchStudents(map);
		for(Student student:studentList){
			System.out.println(student);
		}
	}*/
	
/*	@Test   //choose，when, otherwise条件 
	public void testSearch2() {
		logger.info("查询学生（带条件）");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("searchBy","age");
		map.put("gradeId", 2);
		map.put("name", "%李%");
		map.put("age",11);
		List<Student> studentList=studentMapper.searchStudents2(map);
		for(Student student:studentList){
			System.out.println(student);
		}
	}*/
	
	/*@Test   //where
	public void testSearch3() {
		logger.info("查询学生（带条件）");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("gradeId", 2);
		//map.put("name", "%李%");
		//map.put("age",11);
		List<Student> studentList=studentMapper.searchStudents3(map);
		for(Student student:studentList){
			System.out.println(student);
		}
	}*/
	
	/*@Test   //trim
	public void testSearch4() {
		logger.info("查询学生（带条件）");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("gradeId", 2);
		//map.put("name", "%李%");
		//map.put("age",11);
		List<Student> studentList=studentMapper.searchStudents4(map);
		for(Student student:studentList){
			System.out.println(student);
		}
	}*/
	
	/*@Test   //foreach
	public void testSearch5() {
		logger.info("查询学生（带条件）");
		Map<String, Object> map = new HashMap<String, Object>();
		List<Integer> gradeIds = new ArrayList<Integer>();
		gradeIds.add(1);
		gradeIds.add(2);
		map.put("gradeIds", gradeIds);
		//map.put("name", "%李%");
		//map.put("age",11);
		List<Student> studentList=studentMapper.searchStudents5(map);
		for(Student student:studentList){
			System.out.println(student);
		}
	}*/
	
	@Test    //测试set
	public void testUpdateStudent(){
		logger.info("更新学生（带条件）");
		Student student = new Student();
		student.setId(1);
		student.setName("掌上");
		studentMapper.updateStudent(student);
		sqlSession.commit();
		
	}

}
