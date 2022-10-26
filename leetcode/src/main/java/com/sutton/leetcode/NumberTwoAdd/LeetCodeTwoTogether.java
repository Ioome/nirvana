package com.sutton.leetcode.NumberTwoAdd;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 两数相加
 * 1.条件: 两个非空的链表，表示两个非负的整数.每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储一位数字
 * 2.功能: 两数相加
 * 3.功能详情: 两个数相加，并以相同形式返回一个表示和的链表.逆序相加的链表最终都要返回一个正序的数字
 * 4.目标: 两数相加，可以不受类型的限制.
 * 5.额外条件:你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * @author: Mr.wang.sutton
 * @create: 2022-10-26 19:41
 **/
public class LeetCodeTwoTogether {


    /**
     * 静态内部类.
     */
    private static class ListNode {
        /**
         * 值
         */
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * 考虑的问题:当相加溢出之后 如何处理
     * 例子: 342 + 465 =807
     *
     * @param l1 链表 1
     * @param l2 链表 2
     * @return 相加之后得到的数字
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        return null;
    }

    public static void main(String[] args) {
        /**
         * 342
         */
        ListNode listNode2 = new ListNode(4);
        ListNode listNode4 = new ListNode(2, listNode2);
        ListNode listNode3 = new ListNode(3, listNode4);

        /**
         * 465
         */
        ListNode listNodeFive = new ListNode(5);
        ListNode listNodeSex = new ListNode(6, listNode2);
        ListNode listNodeFour = new ListNode(4, listNode4);

        //342+642
        addTwoNumbers(listNode3, listNodeFour);
    }

}

