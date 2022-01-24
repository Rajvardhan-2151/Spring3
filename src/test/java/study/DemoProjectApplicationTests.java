package study;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoProjectApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testInputIsEven(){
	 assertTrue(DemoProjectApplication.checkIfInputIsAnEvenNumber(22)); // Assertion
	 }

}
