package com.xzh.clothes.CommodityModule;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CommodityMapper {

    //更新
    Integer updateCommodity(CommodityDo commodityDo);
    //查询
    List<CommodityDo> queryCommodity (@Param(value = "commodityId") int commodityId, @Param(value = "commodityBrand") String commodityBrand);
    //删除
    Integer deleteCommodity(@Param(value = "commodityId") int  commodityId );
    //插入
    Integer  insertCommodity (CommodityDo commodityDo);
    List<CommodityDo> selectCommodityList (List<Integer> commodityIdList);
    Integer  updateNum (CommodityDo commodityDo);

}
