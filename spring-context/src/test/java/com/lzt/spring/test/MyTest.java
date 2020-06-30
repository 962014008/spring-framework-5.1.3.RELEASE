package com.lzt.spring.test;

import com.lzt.spring.bean.Student;
import com.lzt.spring.bean.Teacher;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class MyTest {

	@Resource
	Teacher teacher1;

	@Test
	public void test1() {
		log.info("classpath:" + this.getClass().getResource("/"));
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring.xml");

		Student student = (Student) applicationContext.getBean("student");
		log.info(student.getUsername());

		log.info(teacher1.getUsername());
	}
}
