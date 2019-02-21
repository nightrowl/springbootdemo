package com.jokerkiki.demo;

import com.jokerkiki.demo.config.DemoConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootConfigApplicationTests {

	/**
	 * 获取bean
	 */
	@Test
	public void contextLoads() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DemoConfig.class);
		System.out.println(ctx.getBean("demo"));
	}

}
