package top.chenwe.houseselljava.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.chenwe.houseselljava.domain.House;
import top.chenwe.houseselljava.mapper.HouseMapper;
import top.chenwe.houseselljava.service.HouseService;
import top.chenwe.houseselljava.utils.Result.Result;
import top.chenwe.houseselljava.utils.Result.ResultUtil;
@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    HouseMapper houseMapper;

    @Override
    public Result getHouseList() {
        return ResultUtil.success(houseMapper.findAll());
    }

    @Override
    public Result addHouse(House house) {
        houseMapper.save(house);
        return ResultUtil.success();
    }

    @Override
    public Result deleteHouse(int id) {
        houseMapper.delete(id);
        return ResultUtil.success();
    }

    @Override
    public Result updateHouse(House house) {
        houseMapper.update(house);
        return ResultUtil.success();
    }

    @Override
    public Result findUserHouse(int id) {
        return ResultUtil.success(houseMapper.findByUserId());
    }
}
