package com.xzh.clothes.shopCarModule;

import com.xzh.clothes.CommodityModule.CommodityDo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ShopCarMapper {

    List<Integer> queryShopList (@Param(value = "userId") int userId);

    Integer deleteShopList(@Param(value = "userId") int  userId ,@Param(value = "shopList") int shopList );

    Integer  insertCommodity (ShopCarDo shopCarDo );
}
