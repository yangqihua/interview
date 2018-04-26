package cn.yang.interview;

/**
 * User: yangqihua
 * Date: 2018-04-26
 * Time: 下午4:23
 * 参考：https://www.cnblogs.com/10158wsj/p/6782124.html?utm_source=tuicool&utm_medium=referral
 */
public class Sort {
	/**
	 * Select sort.
	 * 遍历整个序列，将最小的数放在最前面。遍历剩下的序列，将最小的数放在最前面。重复第二步，直到只剩下一个数。
	 * @param array the array
	 */
	public void selectSort(int[] array) {
		int length = array.length;
		for(int i=0;i<length;i++){
			int min = array[i];
			int position = i;
			for(int j =i;j<length;j++){
				if(min>array[j]){
					min = array[j];
					position = j;
				}
			}
			array[position] = array[i];
			array[i] = min;
		}
	}
}
