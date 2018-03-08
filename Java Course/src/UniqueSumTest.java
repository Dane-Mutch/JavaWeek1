import junit.framework.TestCase;

public class UniqueSumTest extends TestCase {
	
	@Test
	public void TestAddNums() {
		int result = UniqueSum.sumReturn(3, 2, 8);
		assertEquals(13, result);
	}

}
