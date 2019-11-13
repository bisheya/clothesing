package com.xzh.clothes.Trade;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TradeMapper {

    Integer addTrade(TradeDo tradeDo);

    List<TradeDo> queryTrade(@Param(value = "userId") int userId, @Param(value = "tradeState") int tradeState);

    Integer deleteTrade( @Param(value = "tradeId") String  tradeId );

    Integer  updateTrade(TradeDo tradeDo);


}
