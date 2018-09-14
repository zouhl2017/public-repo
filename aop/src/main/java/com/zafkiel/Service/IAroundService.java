package com.zafkiel.Service;

import com.zafkiel.POJO.AroundServiceReqVO;
import com.zafkiel.POJO.AroundServiceRspVO;

public interface IAroundService {

    AroundServiceRspVO aroundService(AroundServiceReqVO reqVO, String fruit, int count);

}
