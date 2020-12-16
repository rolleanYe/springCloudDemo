package com.example.cloud.democlient.mapper;


import com.example.cloud.democlient.dataobject.TradeOrderDO;

public interface TradeOrderDAO {


    TradeOrderDO selectByPrimaryKey(String tradeVoucherNo);



}