package 排序算法;

import java.util.Arrays;

public class Java 自带的排序api {

	public static void main(String[] args) {
		Integer[] a = { 5, 3, 7, 3, 7, 32, 7, 4, 23, 12, 6, 8, 5, 3, 7, 3, 7 };
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
