package org.example.clearif;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 处理分支操作
 * @author: Mr.wang.sutton
 * @create: 2022-11-02 09:25
 **/
@FunctionalInterface
public interface BranchHandle {


    /**
     *
     */
    void trueOrFalseHandle(Runnable trueRunnable, Runnable falseRunable);
}
