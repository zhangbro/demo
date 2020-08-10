package com.zhang.sort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * @author Zhangbro
 * 排序基类 包含待排序数组
 */
public abstract class AbstractSortable implements SortAl {
    protected Logger logger = LoggerFactory.getLogger("Sortable");
    int[] arr;

    public static void swap(int[] arr, int l, int r) {
        int temp = arr[r];
        arr[r] = arr[l];
        arr[l] = temp;
    }

    public void init(boolean sorted, boolean asc, boolean duplicatable, int size) {
        arr = new int[size];
        if (sorted) {
            if (asc) {
                for (int i = 0; i < size; i++) {
                    arr[i] = i + 1;
                }
            } else {
                for (int i = 0; i < size; i++) {
                    arr[i] = size - i - 1;
                }
            }
        } else {
            byte[] ex = new byte[size];
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                int value;
                do {
                    value = random.nextInt(size) + 1;
                } while (!duplicatable && ex[value - 1] == 1);
                arr[i] = value;
                ex[value - 1] = 1;
            }
        }
    }

    public boolean check() {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void go(boolean sorted, boolean asc, boolean duplicatable, int size) {
        init(sorted, asc, true, size);
        logger.info(">>{}", arr);
        sort();
        if (check()) {
            logger.info("true::{}", arr);
        } else {
            logger.error("false::{}", arr);
        }
    }

    @Override
    public void go(int[] arr) {
        this.arr = arr;
        sort();
    }

    /**
     * sort  implement this method to complete
     */
    public abstract void sort();

    @Override
    public int[] dumpArr() {
        if (arr == null) {
            init(true, true, false, 10);
        }
        return arr;
    }

    @Override
    public int[] dumpArr(boolean sorted, boolean asc, boolean duplicatable, int size) {
        if (duplicatable) {
            init(false, asc, duplicatable, size);
            sort();
        } else {
            init(sorted, asc, duplicatable, size);
        }
        return arr;
    }


}
