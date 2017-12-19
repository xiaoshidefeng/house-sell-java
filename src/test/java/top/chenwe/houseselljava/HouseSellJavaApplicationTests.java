package top.chenwe.houseselljava;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.chenwe.houseselljava.domain.House;
import top.chenwe.houseselljava.domain.Users;
import top.chenwe.houseselljava.service.HouseService;
import top.chenwe.houseselljava.service.Impl.HouseServiceImpl;
import top.chenwe.houseselljava.service.Impl.UsersServiceImpl;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HouseSellJavaApplicationTests {

	@Autowired
	private HouseServiceImpl houseService;

	@Autowired
	private UsersServiceImpl usersService;

	@Test
	public void houseServiceTest() {
//		System.out.println(houseService.addHouse(new House(
//				"1",
//				2,
//				3,
//				false,
//				"5",
//				"6",
//				"7"
//		)).toString());
//		houseService.updateHouse(new House(
//				2,
//				"1",
//				2,
//				3,
//				true,
//				"5",
//				"6",
//				"7"
//		));
		System.out.println(houseService.findUserHouse(2).toString());

	}

	@Test
	public void userServiceTest() {
//		System.out.println(usersService.login());
//		usersService.login("aaa", "qqq");

//		usersService.register(new Users("aaa", "qqq"));
	}


}
