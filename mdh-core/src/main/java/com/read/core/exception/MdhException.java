package com.read.core.exception;

public class MdhException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    private String msg;
    private int code = 500;

    public MdhException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public MdhException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public MdhException(String msg, int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public MdhException(String msg, int code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
