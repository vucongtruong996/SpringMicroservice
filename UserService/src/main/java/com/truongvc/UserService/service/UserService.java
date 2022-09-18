package com.truongvc.UserService.service;


import org.springframework.stereotype.Service;

import com.truongvc.UserService.entity.User;
import com.truongvc.UserService.vo.ResponseUserDepartmentVo;

public interface UserService {

	public User saveUser(User user);
	
	public ResponseUserDepartmentVo getUserWithDepartment(Long userId);
}
