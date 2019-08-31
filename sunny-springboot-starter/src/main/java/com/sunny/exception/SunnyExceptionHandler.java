package com.sunny.exception;

import com.sunny.model.JSONResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by sunlei on 2019/8/31.
 */
@ControllerAdvice
public class SunnyExceptionHandler {

    public static final String ERROR_VIEW = "error";

    /*@ExceptionHandler(value = Exception.class)*/
    /*public Object errorHandler(HttpServletRequest request, HttpServletResponse response, Exception e) throws Exception
    {
        e.printStackTrace();

        ModelAndView mav = new ModelAndView();
        mav.addObject("exception",e);
        mav.addObject("url",request.getRequestURL());
        mav.setViewName(ERROR_VIEW);
        return mav;


    }*/

    @ExceptionHandler(value = Exception.class)
    public Object errorHandler(HttpServletRequest request, HttpServletResponse response, Exception e)throws Exception
    {
        e.printStackTrace();

        if(isAjax(request))
        {
            return JSONResult.errorException(e.getMessage());
        }
        else
        {
            ModelAndView mav = new ModelAndView();
            mav.addObject("exception",e);
            mav.addObject("url",request.getRequestURL());
            mav.setViewName(ERROR_VIEW);
            return mav;
        }
    }

    /**
     * 判断是否是ajax请求
     * @param request
     * @return
     */
    public static boolean isAjax(HttpServletRequest request) {
        return (null!=request.getHeader("X-Requested-With") && "XMLHttpRequest".equals(request.getHeader("X-Requested-With").toString()));
    }
}
