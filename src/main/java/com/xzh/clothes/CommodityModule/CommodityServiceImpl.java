package com.xzh.clothes.CommodityModule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
@Service
public class CommodityServiceImpl implements CommodityService {
    @Autowired
    private CommodityMapper commodityMapper;

    @Override
    public Integer updateCommodity(CommodityDo commodityDo) {
        return commodityMapper.updateCommodity(commodityDo);
    }

    @Override
    public List<CommodityDo> queryCommodity(int commodityId, String commodityBrand) {
        return commodityMapper.queryCommodity(commodityId,commodityBrand);
    }

    @Override
    public Integer deleteCommodity(int commodityId) {
        return commodityMapper.deleteCommodity(commodityId);
    }

    @Override
    public Integer insertCommodity(CommodityDo commodityDo, MultipartFile file) {
        try{
            commodityDo.setCommodityImage(file.getBytes());
        }catch (IOException e){
            System.out.println(e);
            return 0;
        }
        return commodityMapper.insertCommodity(commodityDo);
    }

    @Override
    public List<CommodityDo> selectCommodityList(List<Integer> commodityIdList) {
        return commodityMapper.selectCommodityList(commodityIdList);
    }
}
