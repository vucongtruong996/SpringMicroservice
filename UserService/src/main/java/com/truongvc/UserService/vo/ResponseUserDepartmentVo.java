package com.truongvc.UserService.vo;

import com.truongvc.UserService.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseUserDepartmentVo {
	
	private User user;
	private Department department;
}
