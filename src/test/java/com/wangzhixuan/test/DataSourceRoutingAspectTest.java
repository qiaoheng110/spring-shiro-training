package com.wangzhixuan.test;

import com.wangzhixuan.service.SlaveService;
import com.wangzhixuan.test.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description：DataSourceRoutingAspectTest
 * @author：Wangzhixuan 
 * @date：2015年8月19日 下午5:23:24
 */
public class DataSourceRoutingAspectTest extends BaseTest {

    @Autowired
    private SlaveService slaveService;

    /**
     * 参考链接：Spring MVC测试框架详解——服务端测试
     * <URL>http://jinnianshilongnian.iteye.com/blog/2004660</URL>
     */

    @Test
    public void testFindAllShop() {
        Integer count = slaveService.count();
        System.out.println(count);
    }
}

