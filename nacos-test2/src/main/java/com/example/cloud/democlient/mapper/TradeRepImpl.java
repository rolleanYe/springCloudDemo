package com.example.cloud.democlient.mapper;

import com.example.cloud.democlient.dataobject.TradeOrderDO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: yejun
 * @create: 2020/12/14 19:34
 * @version: 1.0
 **/
@Component
public class TradeRepImpl {

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    public TradeOrderDO selectOne(String tradeVoucherNo){
        Map<String,String> map = new HashMap();
        map.put("tradeVoucherNo",tradeVoucherNo);
        return sqlSessionTemplate.selectOne("selectOneTest",map);
    }

}
