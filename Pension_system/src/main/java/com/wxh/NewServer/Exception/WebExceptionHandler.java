package com.wxh.NewServer.Exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

//全局异常处理
@ControllerAdvice
@Slf4j
public class WebExceptionHandler {

//    @ExceptionHandler(ModelViewException.class)
//    public ModelAndView viewExceptionHandler(HttpServletRequest request, ModelViewException e){
//        ModelAndView modelAndView = new ModelAndView();
//
//        //将异常信息设置为modelAndView
//        modelAndView.addObject("exception", e);
//        modelAndView.addObject("url", request.getRequestURL());
//        modelAndView.setViewName("error");
//
//        //返回ModelAndView
//        return modelAndView;
//    }

    @ExceptionHandler(MethodArgumentNotValidException.class)//出现哪种异常就对应哪种操作
    @ResponseBody
    public AjaxResponse handleBindException(MethodArgumentNotValidException ex){
        FieldError fieldError = ex.getBindingResult().getFieldError();
        return AjaxResponse.error(new CustomException(CustomExceptionType.USER_INPUT_ERROR,fieldError.getDefaultMessage()));
    }

    @ExceptionHandler(BindException.class)
    @ResponseBody
    public AjaxResponse handleBindException(BindException ex){
        FieldError fieldError = ex.getBindingResult().getFieldError();
        return AjaxResponse.error(new CustomException(CustomExceptionType.USER_INPUT_ERROR,fieldError.getDefaultMessage()));
    }

    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public AjaxResponse customException(CustomException e){
        if (e.getCode() == CustomExceptionType.SYSTEM_ERROR.getCode()){
            //400异常不需要持久化，将异常信息以友好的方式告知用户即可
            //TODO 将500异常信息持久化处理，方便运维人员处理
            log.info("系统错误");
        }
        log.error("用户错误");
        return AjaxResponse.error(e);
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public AjaxResponse exception(Exception e){
        //TODO 将异常信息持久化处理，方便运维人员处理

        return AjaxResponse.error(new CustomException(CustomExceptionType.OTHER_ERROR,"未知异常"));
    }
}
