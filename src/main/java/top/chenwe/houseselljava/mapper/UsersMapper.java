package top.chenwe.houseselljava.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.chenwe.houseselljava.domain.Users;
import top.chenwe.houseselljava.utils.Result.Result;

import java.util.List;

@Mapper
public interface UsersMapper {

    void save(@Param("user") Users user);

    void update();

    void delete();

    List<Users> findAll();

    Users login(@Param("name") String name, @Param("password") String password);

    void saveToken(@Param("token") String token, @Param("user_id") int id);

    Users findByUserName(@Param("user_name") String user_name);

    String findUserIdByUserToken(@Param("token") String token);
}
