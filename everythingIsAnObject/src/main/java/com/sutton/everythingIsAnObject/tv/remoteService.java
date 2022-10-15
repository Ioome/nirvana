package com.sutton.everythingIsAnObject.tv;

import jdk.jfr.Name;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 遥控器接口，处理开机 业务
 * @author: Mr.wang.sutton
 * @create: 2022-10-15 16:28
 **/
public interface remoteService  {
    @Name("打开电视机")
    void open(Tv tv);
}
