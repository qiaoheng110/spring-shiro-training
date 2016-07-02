package com.wangzhixuan.service;

import com.wangzhixuan.model.SysLog;
import com.wangzhixuan.commons.utils.PageInfo;

/**
 * @description：操作日志
 * @author：zhixuan.wang
 * @date：2015/10/30 10:35
 */
public interface LogService {

    void insertLog(SysLog sysLog);

    void findDataGrid(PageInfo pageInfo);
}
