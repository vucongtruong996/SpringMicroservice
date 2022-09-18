package com.truongvc.UserService.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truongvc.UserService.entity.User;
import com.truongvc.UserService.repository.UserRepository;
import com.truongvc.UserService.vo.ResponseUserDepartmentVo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public ResponseUserDepartmentVo getUserWithDepartment(Long userId) {
		// TODO Auto-generated method stub
		Optional<User> item = userRepository.findById(userId);
		User user;
		if(item.isPresent()) {
			user = item.get();
		}
		
		return null;
	} 

	
	
}
