package cn.yang.interview;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

	private Sort sort;

	private int[] array = new int[]{1,6,7,234,12,3,2,1};

	@Before
	public void init() {
		sort = new Sort();
	}

	@Test
	public void selectSort() throws Exception {
		sort.selectSort(array);
		printArray(array);
	}

	@Test
	public void bubbleSort() throws Exception {
		sort.bubbleSort(array);
		printArray(array);
	}

	@Test
	public void quickSort() throws Exception {
		sort.quickSort(array,0,array.length-1);
		printArray(array);
	}

	@Test
	public void heapSort() throws Exception {
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