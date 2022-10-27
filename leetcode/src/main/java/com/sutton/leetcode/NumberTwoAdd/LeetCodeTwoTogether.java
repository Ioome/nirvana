package com.sutton.leetcode.NumberTwoAdd;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 两数相加
 * 1.条件: 两个非空的链表，表示两个非负的整数.每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储一位数字
 * 2.功能: 两数相加
 * 3.功能详情: 两个数相加，并以相同形式返回一个表示和的链表.逆序相加的链表最终都要返回一个正序的数字
 * 4.目标: 两数相加，可以不受类型的限制.
 * 5.额外条件:你可以假设除了数字 0 之外，这两个数都不会以 0 开头。也就是不存在 065这种情况
 * 每个链表的节点数在范围[1,100]
 * 0<= Node.val<=9
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
        //定义一个头节点
        ListNode dummyHead = new ListNode(0);
        //指向两个节点,并创建一个结果链表指针
        ListNode p = l1, q = l2, curr = dummyHead;
        //进位默认值
        int carry = 0;
        while (p != null || q != null) {
            //链表 1的值,如果q到最后是null 默认值为0
            int x = (p != null) ? p.val : 0;
            //链表 2的值
            int y = (q != null) ? q.val : 0;
            //得到相加后的值 + 进位
            int sum = x + y + carry;
            carry = sum / 10;
            //创建一个 取余后的值,头指向它
            curr.next = new ListNode(sum % 10);
            //curr向后移动
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        /**
         * 243
         */
        ListNode listNode2 = new ListNode(2);
        listNode2.next = null;
        ListNode listNode4 = new ListNode(4, listNode2);
        ListNode listNode3 = new ListNode(3, listNode4);

        /**
         * 564
         */
        ListNode listNodeFive = new ListNode(5);
        listNodeFive.next = null;
        ListNode listNodeSex = new ListNode(6, listNodeFive);
        ListNode listNodeFour = new ListNode(4, listNodeSex);

        //342+642
        ListNode listNode = addTwoNumbers(listNode3, listNodeFour);
        while (listNode.next!=null){
           listNode=listNode.next;
            System.out.println(listNode.val);

        }
    }

}

