package com.sutton.frontknowledge.alg.back;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 递归函数
 *  调用者和被调用者的关系，当调用者调用了自身，调用者将会暂停，
 *  直至被调用者执行完成并将执行代码的权力交换给调用者后，它才能继续执行
 *  factorialMethods调用者  factorialMethod(n - 1) 是被调用者
 *  底层实现是：栈实现的,所以值不能太大,否则会导致栈的溢出.
 * @author: Mr.wang.sutton
 * @create: 2022-10-28 20:15
 **/
public class factorial {

    public static int factorialMethod(int n) {
        //递归出口
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * (factorialMethod(n - 1));
    }

    public static void main(String[] args) {
        int result = factorialMethod(1000);
        System.out.println(result);
    }
}
