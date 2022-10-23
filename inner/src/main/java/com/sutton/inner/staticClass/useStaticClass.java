package com.sutton.inner.staticClass;

import com.sutton.inner.Parcell.Contents;
import com.sutton.inner.Parcell.Destination;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 嵌套类不与外部建立联系
 * static
 * @author: Mr.wang.sutton
 * @create: 2022-10-22 19:39
 **/
public class useStaticClass {

    private static class PraceContents implements Contents {

        private int i = 11;

        /**
         * @return
         */
        @Override
        public int value() {
            return i;
        }
    }

    protected static class ParceDestination  implements Destination{
        private String label;

        private ParceDestination(String label) {
            this.label = label;
        }

        public static void f(){}

        static  int x=10;

        /**
         * @return
         */
        @Override
        public String readLabel() {
            return label;
        }

        static  class AnotherLevel{
            public static  void f(){}
            static int x=10;
        }
    }

    public static Destination destination(String s){
        return  new ParceDestination(s);
    }

    public static Contents contents(){
        return new PraceContents();
    }

    public static void main(String[] args) {
        Contents contents=contents();
        Destination destination=destination("hello");
    }
}
