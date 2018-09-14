package com.zafkiel.Service;

import com.zafkiel.BaseJunit4Test;
import com.zafkiel.POJO.AroundServiceReqVO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AroundServiceTest extends BaseJunit4Test {
    @Autowired
    private IAroundService aroundService;
    @Test
    public  void  test()  throws  Exception{
        AroundServiceReqVO reqVO=new AroundServiceReqVO();
        reqVO.setNero("Nero");
        reqVO.setSaber("Saber");
        aroundService.aroundService(reqVO,"apple",1);
    }
}
