package com.zhang.sort;

/**
 * @author Zhangbro
 * 快速排序  实现
 * <p>
 * 通过一趟排序将待排记录分隔成独立的两部分，其中一部分记录的关键字均比另一部分的关键字小，则可分别对这两部分记录继续进行排序，以达到整个序列有序。
 */
public class QKSort extends AbstractSortable {
    @Override
    public void sort() {
        sort(arr, 0, arr.length - 1);
    }

    private void sort(int[] arr, int l, int r) {
        //left to right
        boolean ltr = false;
        final int ol = l, or = r;
        if (r > l) {
            do {
                if (arr[l] > arr[r]) {
                    ltr = !ltr;
                    swap(arr, l, r);
                }
                if (ltr) {
                    l++;
                } else {
                    r--;
                }
            } while (l < r);
            if (l > ol) {
                sort(arr, ol, r - 1);
            }
            if (r < or) {
                sort(arr, l + 1, or);
            }
        }

    }

}
