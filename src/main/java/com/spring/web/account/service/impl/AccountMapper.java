package com.spring.web.account.service.impl;

import org.apache.ibatis.annotations.Mapper;

import com.spring.web.vo.memberVO;

@Mapper
public interface AccountMapper {

	int getIdCnt(memberVO searchVO);

	void insertMember(memberVO searchVO);
}
