package com.sutton.inner.Sequence;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-21 23:28
 **/
public interface Selector {
    boolean end();

    Object current();

    void next();
}
