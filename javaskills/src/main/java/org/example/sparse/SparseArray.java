package org.example.sparse;

import java.util.Arrays;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 稀疏数组
 * @author: Mr.wang.sutton
 * @create: 2022-11-13 17:03
 **/
public class SparseArray {
    public static void main(String[] args) {
        //TODO:创建一个原始的二维数组 [11][11]
        int[][] array = new int[11][11];
        //0 代码无值  1  代表有值
        array[1][2] = 1;
        array[2][3] = 2;
        array[10][2]=3;
        //打印
        extracted(array);
        //返回数值
        int count = getCount(array);
        //创建稀疏数组
        createSparse(array, count);
    }

    private static void createSparse(int[][] array, int count) {
        //创建稀疏数组
        int[][] sparearr = new int[count + 1][3];
        //给稀疏数组赋值
        sparearr[0][0] = array.length;
        sparearr[0][1] = array.length;
        sparearr[0][2] = count;
        int loop = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != 0) {
                    loop++;
                    sparearr[loop][0] = i;
                    sparearr[loop][1] = j;
                    sparearr[loop][2] = array[i][j];
                }
            }
        }
        //使用 Consumer  遍历数组
        Arrays.stream(sparearr).forEach(t -> System.out.println(Arrays.toString(t)));
    }

    /**
     * 获取稀疏数组的数量
     *
     * @param array 原数组
     * @return 返回存在  >  0 数量
     */
    private static int getCount(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                //如果大于等于0
                if (array[i][j] > 0) {
                    //叠加数字
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * 打印
     *
     * @param array 原数组
     */
    private static void extracted(int[][] array) {
        for (int[] row : array) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
    }
}
