package top.chenwe.houseselljava.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.chenwe.houseselljava.domain.House;
import top.chenwe.houseselljava.domain.Users;
import top.chenwe.houseselljava.mapper.HouseMapper;
import top.chenwe.houseselljava.service.HouseService;
import top.chenwe.houseselljava.utils.Enums.ResultEnums;
import top.chenwe.houseselljava.utils.IsNull;
import top.chenwe.houseselljava.utils.Result.Result;
import top.chenwe.houseselljava.utils.Result.ResultUtil;

import java.util.List;

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
        if (house == null) {
            return ResultUtil.error(ResultEnums.INPUT_NULL);
        }
        if (IsNull.isNullField(house.getHouse_address(), house.getHouse_desc(), house.getHouse_name())) {
            return ResultUtil.error(ResultEnums.INPUT_NULL);
        }
        if (IsNull.isNullField(house.getHouse_size())) {
            return ResultUtil.error(ResultEnums.INPUT_NULL);
        }
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
        return ResultUtil.success(houseMapper.findByUserId(id));
    }

    @Override
    public Result findByHouseName(String name) {
        if (IsNull.isNullField(name)) {
            return ResultUtil.success(houseMapper.findAll());
        }
        List<House> houseList = houseMapper.findHouseByHouseName(name);
        if (houseList == null || houseList.size() == 0) {
            return ResultUtil.error(ResultEnums.NOT_FIND_DORM);
        }
        return ResultUtil.success(houseMapper.findHouseByHouseName(name));
    }

    @Override
    public Result findByHouseId(int id) {
        House house = houseMapper.findHouseByHouseId(id);
        if (house == null) {
            return ResultUtil.error(ResultEnums.NOT_FIND_DORM);
        }

        return ResultUtil.success(house);
    }

    @Override
    public Result findHouseBySell() {
        return ResultUtil.success(houseMapper.findHouseBySell());
    }


}
