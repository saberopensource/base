package com.shengdun.web;

import com.shengdun.service.MemberTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author baiyang
 * @Email: 1419408386@qq.com
 * @DATE : 2018-10-23
 * @MESSAGE: 如果看不懂先debug，不知道就来问我
 */

@Controller
@RequestMapping("/memberTransaction")
public class MemberTransactionController {

    @Autowired
    private MemberTransactionService memberTransactionService;

    @RequestMapping("/index")
    @ResponseBody
    public List<Map<String, Object>> index() {
        List<Map<String, Object>> list = memberTransactionService.getAll();
        return list;
    }


}
