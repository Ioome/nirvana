package com.sutton.inner.Sequence;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 *
 *  多继承的实现
 * @author: Mr.wang.sutton
 * @create: 2022-10-21 23:33
 **/
public class Squence {

    //items of Object
    private Object[] items;
    //next
    private int next = 0;

    public Squence(int size) {
        items = new Object[size];
    }

    /**
     * 增加 项
     *
     * @param x
     */
    public void add(Object x) {
        //判断大小
        if (next < items.length) {
            //赋值
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        /**
         * @return
         */
        @Override
        public boolean end() {
            return i == items.length;
        }

        /**
         * @return
         */
        @Override
        public Object current() {
            return items[i];
        }

        /**
         *
         */
        @Override
        public void next() {
            if (i < items.length) {
                i++;
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Squence squence=new Squence(10);
        for (int i = 0; i <10; i++) {
            squence.add(Integer.toString(i));
        }
        Selector selector=squence.selector();
        while (!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }
    }
}
