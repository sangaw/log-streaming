package com.samples.streaming;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StreamingApplicationTests {

	@Test
	public void contextLoads() {
		SpringBootKafkaLogApplication springBootKafkaLogApplication = new SpringBootKafkaLogApplication();
		springBootKafkaLogApplication.performTasks();
	}

}
