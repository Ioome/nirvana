package com.sutton.inner.Parcell;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 成员内部类
 * @author: Mr.wang.sutton
 * @create: 2022-11-04 09:35
 **/
public class Parcel1 {
    /**
     * Parcel1保护了 person
     */
    public class person {
        private int i = 1;

        public int getI() {
            return i;
        }
    }

    /**
     * 返回一个 person
     *
     * @return person
     */
    public  person getPerson() {
        return new person();
    }

    public static void main(String[] args) {
        Parcel1 p1 = new Parcel1();
        Parcel1.person person = p1.getPerson();
        System.out.println(person.i);
    }
}
