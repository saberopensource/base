package com.shengdun.service.impl;

import com.shengdun.dao.MemberTransationMapper;
import com.shengdun.service.MemberTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author baiyang
 * @Email: 1419408386@qq.com
 * @DATE : 2018-10-23
 * @MESSAGE: 如果看不懂先debug，不知道就来问我
 */
@Service
public class MemberTransactionServiceImpl implements MemberTransactionService {

    @Autowired
    private MemberTransationMapper memberTransationMapper;

    @Override
    public List<Map<String, Object>> getAll() {
        return memberTransationMapper.getAll();
    }
}
