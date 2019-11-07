package com.xzh.clothes.CommodityModule;

import java.util.List;

public interface CommodityService {

    Integer updateCommodity(CommodityDo commodityDo);
    List<CommodityDo> queryCommodity(int commodityId , String commodityBrand);
    Integer deleteCommodity( int  commodityId );
    Integer  insertCommodity (CommodityDo commodityDo);

}
