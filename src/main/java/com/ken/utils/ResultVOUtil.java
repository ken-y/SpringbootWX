package com.ken.utils;

import com.ken.vo.ResultVo;

public class ResultVOUtil {

    public static ResultVo success(Object object){
        ResultVo resultVo=new ResultVo();
        resultVo.setData(object);
        resultVo.setCode(0);
        resultVo.setMsg("成功");
        return  resultVo;
    }
    public  static  ResultVo success(){
        return  success(null);
    }

    public static ResultVo error(Integer code,String msg){
        ResultVo resultVo=new ResultVo();
        resultVo.setMsg(msg);
        resultVo.setCode(code);
        return resultVo;
    }
}
