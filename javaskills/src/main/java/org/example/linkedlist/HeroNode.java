package org.example.linkedlist;/**
 * @author loome
 * @version 1.0.1
 * @date
 * @description this is a java file
 **/

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 英雄
 * @author: Mr.wang.sutton
 * @create: 2022-11-14 15:15
 **/
public class HeroNode {
    /**
     * 编号
     */
    public int no;
    /**
     * 名字
     */
    public String name;
    /**
     * 昵称
     */
    public String nickName;
    /**
     * 下一个节点
     */
    public HeroNode next;

    public HeroNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }
    // 为了显示方法，我们重写toString
    @Override
    public String toString() {
        return "HeroNode [no=" + no + ", name=" + name + ", nickName=" + nickName + "]";
    }
}
