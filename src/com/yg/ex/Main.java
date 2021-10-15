package com.yg.ex;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hella");

        int[] arr = {1, 2, 3};
        permutation(arr, 0, 3, 2);
    }

    // 순서 없이 n 개중에서 r 개를 뽑는 경우
// 사용 예시: permutation(arr, 0, n, 4);
    static void permutation(int[] arr, int depth, int n, int r) {
        if (depth == r) {
            print(arr, r);
            return;
        }

        for (int i=depth; i<n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r);
            swap(arr, depth, i);
        }
    }

    static void print(int[] arr, int d) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ") ;
        }
        System.out.println();
    }

    static void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }
}
