package top.chenwe.houseselljava.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.chenwe.houseselljava.domain.Users;

import java.util.List;

@Mapper
public interface OrderMapper {

    void save();

    void update();

    void delete();

    List<Users> findAll();
}
