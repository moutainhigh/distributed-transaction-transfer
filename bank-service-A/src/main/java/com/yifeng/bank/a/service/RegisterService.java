package com.yifeng.bank.a.service;

import com.alibaba.fastjson.JSONObject;

public interface RegisterService {

    String registerResourceManager(String serviceName);

    String registerGlobalTransaction(JSONObject payload);

    String registerBranchTransaction();
}