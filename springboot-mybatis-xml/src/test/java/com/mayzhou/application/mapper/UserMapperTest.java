package com.mayzhou.application.mapper;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mayzhou.application.entity.UserEntity;
import com.mayzhou.application.enums.UserSexEnum;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
	@Autowired
	private UserMapper UserMapper;

	@Test
	public void testInsert() throws Exception {
		UserMapper.insert(new UserEntity(null, "aa", "a123456", UserSexEnum.MAN, null));
		UserMapper.insert(new UserEntity(null, "bb", "b123456", UserSexEnum.WOMAN, null));
		UserMapper.insert(new UserEntity(null, "cc", "b123456", UserSexEnum.WOMAN, null));
		Assert.assertEquals(12, UserMapper.getAll().size());

	}

	@Test
	public void testQuery() throws Exception {
		List<UserEntity> users = UserMapper.getAll();
		if (users == null || users.size() == 0) {
			System.out.println("is null");
		} else {
			System.out.println(users.toString());
		}

	}

	@Test
	public void testUpdate() throws Exception {
		UserEntity user = UserMapper.getOne((long) 30);
		System.out.println(user);
		user.setNickName("neo");
		UserMapper.update(user);
		Assert.assertTrue(("neo".equals(UserMapper.getOne((long)30).getNickName())));
	}
}
