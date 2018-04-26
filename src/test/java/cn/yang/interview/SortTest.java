package cn.yang.interview;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

	private Sort sort;

	@Before
	public void init() {
		sort = new Sort();
	}

	@Test
	public void selectSort() throws Exception {
		int[] array = new int[]{1,4,2,3};
		sort.selectSort(array);
		printArray(array);
	}

	private void printArray(int[] array){
		for (int i =0;i<array.length;i++) {
			if(i ==  array.length-1){
				System.out.print(array[i]);
				return;
			}
			System.out.print(array[i]+",");
		}
	}

}