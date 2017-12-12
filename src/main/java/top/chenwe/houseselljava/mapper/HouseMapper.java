package top.chenwe.houseselljava.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.chenwe.houseselljava.domain.House;

import java.util.List;

@Mapper
public interface HouseMapper {

    int save(House house);

    void delete(int id);

    void update();

    List<House> findAll();
}
