package kosta.test;

import static org.junit.Assert.*;

import org.junit.Test;

import test.DataUtil;

public class DateUtilTest {

	@Test
	public void test() {
		String today = DataUtil.getCurrentData();
		// assertNotNull(today);
//		assertNull(today);
		
		// 20181120
		assertEquals("20181120", today);
//		assertEquals("20181121", today);
		
	}

}
