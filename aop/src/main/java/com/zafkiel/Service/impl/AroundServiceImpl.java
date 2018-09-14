package com.zafkiel.Service.impl;

import com.zafkiel.POJO.AroundServiceReqVO;
import com.zafkiel.POJO.AroundServiceRspVO;
import com.zafkiel.Service.IAroundService;
import org.springframework.stereotype.Service;

@Service
public class AroundServiceImpl implements IAroundService {

    @Override
    public AroundServiceRspVO aroundService(AroundServiceReqVO reqVO, String fruit, int count) {
        System.out.println(("What is \" this\" here:")+this);
        System.out.println(getClass().getName());
         AroundServiceRspVO rspVO=new AroundServiceRspVO();
         rspVO.setAlterNero("alterNero");
         rspVO.setAlterSaber("alterSaber");
         System.out.println("args[1] fruit :"+fruit);
          if("homula".equals(fruit)){
              rspVO.setAlterNero("alterHomula");
              rspVO.setAlterSaber("alterHomula");
          }
         return  rspVO;
    }
    @Override
    public String  toString(){
        return (getClass().getName()+"@"+hashCode());
    }

}
