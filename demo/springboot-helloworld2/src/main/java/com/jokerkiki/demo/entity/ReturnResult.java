package com.jokerkiki.demo.entity;

/**
 * 返回对象
 * @author 70719
 */
public class ReturnResult {
    public static final int SUCCESS_STATUS = 200;
    public static final int DEFAULT_FAIL_STATUS = 400;
    public static final String SUCCESS_MSG = "success";
    private Integer status = 400;
    private String message = "客户端请求的参数错误";
    /**
     * 返回结果集
     */
    private Object data;

    public ReturnResult() {}

    public ReturnResult(Integer status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public ReturnResult(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public static ReturnResult success(Object data) {
        return new ReturnResult(SUCCESS_STATUS, SUCCESS_MSG, data);
    }

    public static ReturnResult success() {
        return new ReturnResult(SUCCESS_STATUS, SUCCESS_MSG);
    }

    public static ReturnResult fail() {
        return new ReturnResult();
    }

    public static ReturnResult fail(String msg) {
        return new ReturnResult(DEFAULT_FAIL_STATUS, msg);
    }

    @Override
    public String toString() {
        return "{" +
                "\"status\":" + status +
                ", \"message\":\"" + message +
                "\", \"data\":" + data +
                '}';
    }

    public static int getSuccessStatus() {
        return SUCCESS_STATUS;
    }

    public static int getDefaultFailStatus() {
        return DEFAULT_FAIL_STATUS;
    }

    public static String getSuccessMsg() {
        return SUCCESS_MSG;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
