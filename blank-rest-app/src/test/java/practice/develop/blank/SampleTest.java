package practice.develop.blank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SampleTest {

	private String[] nothing;

	@Test
	public void test() {

		BlankApplication.main(nothing);
	}

}
