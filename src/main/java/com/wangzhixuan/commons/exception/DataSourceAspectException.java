package com.wangzhixuan.commons.exception;

/**
 * @description：
 * @author：zhixuan.wang
 * @date：2016/1/31 13:44
 */
public class DataSourceAspectException extends RuntimeException {

    private static final long serialVersionUID = 1401593546385403721L;

    public DataSourceAspectException() {
        super();
    }

    public DataSourceAspectException(String message) {
        super(message);
    }

    public DataSourceAspectException(Throwable cause) {
        super(cause);
    }

    public DataSourceAspectException(String message, Throwable cause) {
        super(message, cause);
    }
}
