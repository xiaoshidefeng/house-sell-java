package top.chenwe.houseselljava.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.chenwe.houseselljava.domain.House;

import java.util.List;

@Mapper
public interface HouseMapper {

    int save(@Param("house") House house);

    void delete(int id);

    void update(House house);

    List<House> findAll();

    List<House> findByUserId(int id);

    List<House> findHouseByHouseName(@Param("name") String name);

    House findHouseByHouseId(@Param("id") int id);

    void updateHouseUser(@Param("user_id") int user_id, @Param("house_id") int house_id);

    List<House> findHouseBySell();
}
