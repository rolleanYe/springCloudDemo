package com.example.cloud.democlient;

import com.example.cloud.democlient.dataobject.TradeOrderDO;
import com.example.cloud.democlient.mapper.TradeOrderDAO;
import com.example.cloud.democlient.mapper.TradeRepImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoClientApplicationTests {


	@Autowired
	private TradeOrderDAO tradeOrderDAO;

	@Autowired
	private TradeRepImpl tradeRep;

	@Test
	void contextLoads() {

		TradeOrderDO tradeOrderDO= tradeOrderDAO.selectByPrimaryKey("101156896333985887579");
		System.out.println("====================="+tradeOrderDO);

		tradeOrderDO = tradeRep.selectOne("101156896333985887579");
		System.out.println("=======2222222=============="+tradeOrderDO.getTradeSrcVoucherNo());

	}

}
