package com.sutton.inner.Button;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-22 00:39
 **/

//匿名内部类必须继承或实现一个已有的接口
interface ActionListener {
    public void onAction();
}


public class Button {
    public void click(final int params) {
        new ActionListener() {

            /**
             *
             */
            @Override
            public void onAction() {
                System.out.println("click action..." + params);
            }
        }.onAction();

    }

    public static void main(String[] args) {
        Button button = new Button();
        button.click(10);
    }
}
