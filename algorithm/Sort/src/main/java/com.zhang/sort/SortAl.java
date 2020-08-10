package com.zhang.sort;

/**
 * @author Zhangbro
 */
public interface SortAl {

    /**
     * @param sorted       生成的数组是否有序
     * @param asc          生成的数组是否升序（当sorted=true时才生效）
     * @param duplicatable 生成的数组是否可重复（当sorted=true时才生效）
     * @param size         生成的数组大小
     */
    void go(boolean sorted, boolean asc, boolean duplicatable, int size);

    /**
     * @param arr
     */
    void go(int[] arr);

    /**
     * @return 获得当前数组
     */
    int[] dumpArr();

    /**
     * @return 获得当前数组
     */
    int[] dumpArr(boolean sorted, boolean asc, boolean duplicatable, int size);
}
