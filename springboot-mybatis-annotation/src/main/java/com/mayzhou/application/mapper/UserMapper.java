package com.mayzhou.application.mapper;

import java.util.List;

import com.mayzhou.application.entity.UserEntity;

public interface UserMapper {
	List<UserEntity> getAll();

	UserEntity getOne(Long id);

	void insert(UserEntity user);

	void update(UserEntity user);

	void delete(Long id);
}
