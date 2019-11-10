package com.xzh.clothes.shopCarModule;

import com.xzh.clothes.CommodityModule.CommodityDo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopCarMapper {

    List<Integer> queryShopList (@Param(value = "userId") int userId);

    Integer deleteShopList( int  userId , int shopList );

    Integer  insertCommodity (ShopCarDo shopCarDo );
}
