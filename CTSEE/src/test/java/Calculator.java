import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author:- shaurya
 * @since:- 22/06/2022
 * Java program to send to integer values and check weather the output matches with expected integer value.
 *
 */
public class Calculator {

	@Test
	public void test() {
		/**
		 * @param expexted stores the expected integer value
		 * @param actual stores the calculated value
		 */
		tst t=new tst();
		int expected=3;
		int actual=t.add(2,1);
		assertEquals(actual,expected);
	}

}
