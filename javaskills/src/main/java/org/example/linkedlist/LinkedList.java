package org.example.linkedlist;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 单链表
 * @author: Mr.wang.sutton
 * @create: 2022-11-14 15:09
 **/
public class LinkedList {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.add(new HeroNode(1,"小黑","x"));
        singleLinkedList.add(new HeroNode(2,"小白","x"));
        singleLinkedList.add(new HeroNode(3,"小红","x"));
        singleLinkedList.list();
    }
}

class SingleLinkedList {
    //初始化一个头节点
    private HeroNode head = new HeroNode(0, "", "");

    /**
     * @return 返回头节点
     */
    public HeroNode getHead() {
        return head;
    }

    /**
     * 添加节点顺序
     * 不考虑编号顺序
     * 通过辅助变量去查找最后一个
     */
    public void add(HeroNode newHeroNode) {
        //辅助遍历
        HeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = newHeroNode;
    }

    public void list() {
        //判断链表是否为空
        if (head.next == null) {
            System.out.println("linklist is  null");
        }
        //存在了一个
        HeroNode temp = head.next;
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            //移后移
            temp = temp.next;
        }
    }


}
