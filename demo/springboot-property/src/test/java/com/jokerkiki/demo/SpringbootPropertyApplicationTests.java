package com.jokerkiki.demo;

import com.jokerkiki.demo.property.DemoProperty;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootPropertyApplicationTests {

	@Autowired
	DemoProperty demoProperty;
	@Test
	public void contextLoads() {
		System.out.println("hello world ,this is id = :" + demoProperty.getId() + " and name = "+demoProperty.getName());
	}

}
