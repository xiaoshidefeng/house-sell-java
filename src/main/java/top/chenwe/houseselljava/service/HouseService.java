package top.chenwe.houseselljava.service;

import top.chenwe.houseselljava.domain.House;
import top.chenwe.houseselljava.utils.Result.Result;



public interface HouseService {
    Result getHouseList();

    Result addHouse(House house);

    Result deleteHouse(int id);

    Result updateHouse(House house);

    Result findUserHouse(int id);

    Result findByHouseName(String name);

    Result findByHouseId(int id);

    Result findHouseBySell();

}
