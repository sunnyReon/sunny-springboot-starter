package com.sunny.exception;

import com.sunny.model.JSONResult;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;

/**
 * Created by sunlei on 2019/8/31.
 */
/*@RestControllerAdvice*/
public class AjaxExceptionHandler {

   /* @ExceptionHandler(value = Exception.class)*/
    public JSONResult defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception
    {
        e.printStackTrace();

        return JSONResult.errorException(e.getMessage());
    }


}
