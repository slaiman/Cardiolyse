package com.CardiolyseTest;


import static org.assertj.core.api.Assertions.assertThat;

import com.CardiolyseTest.Controller.ReverseController;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


@SpringBootTest
class ReverseControllerTests {

	@InjectMocks
	ReverseController reverseController;

	@Test
	void testNullReverse()
	{
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		String response = "";
		String test = null;

		response = reverseController.reverse(test);
		assertThat(null == response);
	}

	@Test
	void testSingleNumberReverse() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		String response = "";
		String test = "1";

		response = reverseController.reverse(test);
		assertThat(response.equals("1"));
	}

	@Test
	void testSingleCharacterReverse()
	{
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		String response = "";
		String test = "a";

		response = reverseController.reverse(test);
		assertThat(response.equals("a"));

	}

	@Test
	void testAnyNonStringReverse()
	{
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		String response = "";
		String test = "Mike ate the apple";

		response = reverseController.reverse(test);
		assertThat(response.equals("elppa eht eta ekiM"));
	}

}
