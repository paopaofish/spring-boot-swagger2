package com.example.springbootswagger2;

import com.example.springbootswagger2.controller.Swagger2DemoRestController;
import com.example.springbootswagger2.model.Student;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootSwagger2ApplicationTests {

	@Autowired
	private Swagger2DemoRestController sc;

	@Test
	public void contextLoads() {
		List<Student> lits = sc.getStudents();
		Assert.assertEquals("数量是否一致",4,lits.size());
	}

}
