package com.zhang.sort;


/**
 * @author Zhangbro
 * <p>
 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
 */
public class SelectionSort extends AbstractSortable {
    @Override
    public void sort() {
        sort2();
    }

    private void sort(int j) {
        int min = arr[j];
        int index = 0;
        //find the least
        for (int i = j; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        if (index > 0) {
            swap(arr, j, index);
        }
        if (j < arr.length - 1) {
            sort(j + 1);
        }

    }

    /**
     * 每次循环  都保证当前位置的元素为剩下未排序元素的最小
     */
    private void sort2() {
        int cur = 0;
        while (cur < arr.length) {
            int min = cur;
            while (min < arr.length) {
                if (arr[cur] > arr[min]) {
                    swap(arr, cur, min);
                }
                min++;
            }
            cur++;
        }
    }
}
