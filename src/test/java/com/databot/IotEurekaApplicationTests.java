package com.databot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.databot.IotEurekaApplication;

@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = IotEurekaApplication.class)
@WebAppConfiguration
public class IotEurekaApplicationTests {

	@Test
	public void contextLoads() {
	}

}
