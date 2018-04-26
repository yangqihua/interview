package cn.yang.interview;

/**
 * User: yangqihua
 * Date: 2018-04-26
 * Time: 下午4:23
 * 参考：https://www.cnblogs.com/10158wsj/p/6782124.html?utm_source=tuicool&utm_medium=referral
 */

/**
 *  O(n^2):直接插入排序，简单选择排序，冒泡排序。

 　　在数据规模较小时（9W内），直接插入排序，简单选择排序差不多。当数据较大时，冒泡排序算法的时间代价最高。性能为O(n^2)的算法基本上是相邻元素进行比较，基本上都是稳定的。

 　　O(nlogn):快速排序，归并排序，希尔排序，堆排序。

 　　其中，快排是最好的， 其次是归并和希尔，堆排序在数据量很大时效果明显。
 */
public class Sort {

	/**
	 * 1.冒泡排序
	 * 将序列中所有元素两两比较，将最大的放在最后面。将剩余序列中所有元素两两比较，将最大的放在最后面。重复第二步，直到只剩下一个数。
	 * @param array the array
	 */
	public void bubbleSort(int[] array) {
		int length = array.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	/**
	 * 2.快速排序
	 * 遍历整个序列，将最小的数放在最前面。遍历剩下的序列，将最小的数放在最前面。重复第二步，直到只剩下一个数。
	 * @param array the array
	 */
	public void selectSort(int[] array) {
		int length = array.length;
		for (int i = 0; i < length; i++) {
			int min = array[i];
			int position = i;
			for (int j = i; j < length; j++) {
				if (min > array[j]) {
					min = array[j];
					position = j;
				}
			}
			array[position] = array[i];
			array[i] = min;
		}
	}

	/**
	 * 3.快速排序.
	 * 选择第一个数为p，小于p的数放在左边，大于p的数放在右边。递归的将p左边和右边的数都按照第一步进行，直到不能递归
	 * @param array the array
	 * @param start the start
	 * @param end   the end
	 */
	public void quickSort(int[] array, int start, int end) {
		if (start < end) {
			int base = array[start];
			int i = start;
			int j = end;
			while (array[i]<base && i<end){
				i++;
			}
			while(array[j]>base && j>start){
				j--;
			}
			if(i<=j){
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
			if(i<end){
				quickSort(array,i,end);
			}
			if(j>start){
				quickSort(array,start,j);
			}
		}
	}

	/**
	 * 4.堆排序.
	 * 懂原理就行
	 * @param array the array
	 */
	public void heapSort(int[] array) {

	}
}
