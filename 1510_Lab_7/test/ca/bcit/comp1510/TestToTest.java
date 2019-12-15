package ca.bcit.comp1510;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import testing.ToTest;

public class TestToTest {

	private ToTest test;
	
	@Before
	public void setUp() throws Exception {
		test = new ToTest();
	}
	
	@Test
	public void testLargest1_2_3() {
		int largest = test.largest(1, 2, 3);
		assertEquals(largest, 3);
	}
	
	@Test
	public void testLargest2_3_1() {
		int largest = test.largest(2, 3, 1);
		assertEquals(largest, 3);
	}
	
	@Test
	public void testLargest3_2_1() {
		int largest = test.largest(3, 2, 1);
		assertEquals(largest, 3);
	}
	
	@Test
	public void testLargestList1_2_3() {
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		
		int largest = test.largest(lst);
		assertEquals(largest, 3);
	}
	
	@Test
	public void testLargestList2_3_1() {
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(2);
		lst.add(3);
		lst.add(1);
		
		int largest = test.largest(lst);
		assertEquals(largest, 3);
	}
	
	@Test
	public void testLargestList3_2_1() {
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(3);
		lst.add(2);
		lst.add(1);
		
		int largest = test.largest(lst);
		assertEquals(largest, 3);
	}
	


}
