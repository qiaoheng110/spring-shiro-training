package com.wangzhixuan.controller;

import com.wangzhixuan.commons.base.BaseController;
import com.wangzhixuan.service.SlaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @description：测试Controller
 * @author：zhixuan.wang
 * @date：2015/10/1 14:51
 */
@Controller
@RequestMapping("/test")
public class TestController extends BaseController {

    @Autowired
    private SlaveService slaveService;

    /**
     * 主重库测试
     * @param model
     * @return
     */
    @RequestMapping(value = "/slave", method = RequestMethod.GET)
    public String slave(Model model) {
        Integer count = slaveService.count();
        model.addAttribute("count", count);
        return "admin/test";
    }

    /**
     * 图标测试
     * @return
     */
    @RequestMapping(value = "/dataGrid", method = RequestMethod.GET)
    public String dataGrid() {
        return "admin/test";
    }

}
