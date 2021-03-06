package com.crejo.movie.review.service;

import java.util.HashMap;
import java.util.Map;

import com.crejo.movie.review.constants.MovieReviewConstants;
import com.crejo.movie.review.interfaces.IUserService;
import com.crejo.movie.review.model.UserEntity;

public class UserService implements IUserService {

	MovieReviewConstants movieReviewConstants = new MovieReviewConstants();

	public Map<String, UserEntity> userMap = new HashMap<>();

	public Boolean addUser(String userName) {
		UserEntity entity = new UserEntity(userName);
		entity.setType(movieReviewConstants.getUserTypeViewer());
		userMap.put(userName, entity);
		return true;
	}

	@Override
	public Map<String, UserEntity> getUserMap() {
		return userMap;
	}

}
