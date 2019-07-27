package com.kunluntop.common.response;

public class ResultUtil {


    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
       // result.setMsg(msg);
        result.setData(object);
        return result;
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}