package com.zhang.sort;

/**
 * @author Zhangbro
 *
 */
public class InsertSort extends AbstractSortable {
    /**
     * 利用当前位置 “ i ”将i 放置于正确位置后   i 做桥接  顺序挪i的正确位置之后的元素
     */
    @Override
    public void sort() {
        for (int i = 1; i < arr.length; i++) {
            boolean swaped = false;
            for (int j = 0; j < i; j++) {
                if (swaped || arr[i] < arr[j]) {
                    swap(arr, i, j);
                    swaped = true;
                }
            }
        }
    }
}
