package com.xzh.clothes.shopCarModule;

import com.xzh.clothes.CommodityModule.CommodityDo;
import com.xzh.clothes.CommodityModule.CommodityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopCarServiceImpl implements ShopCarService {

    @Autowired
    private ShopCarMapper shopCarMapper;
    @Autowired
    private CommodityMapper commodityMapper;


    @Override
    public List<CommodityDo> queryShopList(int userId) {

        List<Integer> commodityIdList = shopCarMapper.queryShopList(userId);
        System.out.println(commodityIdList);
        return commodityMapper.selectCommodityList(commodityIdList);
    }

    @Override
    public Integer deleteShopList(int userId, int shopList) {

        return shopCarMapper.deleteShopList(userId,shopList);
    }

    @Override
    public Integer insertCommodity(ShopCarDo shopCarDo) {
        Integer integerCommodity=0;
        CommodityDo commodityDo = new CommodityDo();
        commodityDo.setCommodityId(shopCarDo.getShopList());
        commodityDo.setCommodityNum(shopCarDo.getNum());
        integerCommodity = commodityMapper.updateNum(commodityDo);
        if (integerCommodity == 0){
            return 0;
        } else {
            return shopCarMapper.insertCommodity(shopCarDo);
        }
    }
}
