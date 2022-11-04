package com.sutton.inner.Parcell;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 还是不明白
 * @author: Mr.wang.sutton
 * @create: 2022-11-04 09:39
 **/
public class InnerParcel2 {

    //私有
    private static int i = 11;


    /**
     * 处理外部类的静态成员
     */
    public class ParcelInner {
        public ParcelInner() {
            i++;
        }

        public int getValue() {
            return i;
        }

        public InnerParcel2 getInnerParcel2() {
            return InnerParcel2.this;
        }
    }

    /**
     * 返回内部成员
     *
     * @return ParcelInner
     */
    public ParcelInner parcel2Inner() {
        return new ParcelInner();
    }

    public static void main(String[] args) {
        InnerParcel2 innerParcel2 = new InnerParcel2();
        for (int j = 0; j < 10; j++) {
            innerParcel2.parcel2Inner();
        }
        //返回对象引用
        System.out.println(innerParcel2.parcel2Inner().getInnerParcel2());

        System.out.println(innerParcel2);
        System.out.println(InnerParcel2.i);
    }

}
