package com.yifeng.bank.a.rpc;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "transaction-coordinator", fallback = CoordinatorClientFallback.class)
public interface CoordinatorClient {

    @GetMapping("/coordinator/register-service")
    String registerService(@RequestParam("serviceName") String serviceName);

    @GetMapping("/coordinator/register-global-transaction")
    String registerGlobalTxn(@RequestBody JSONObject payload);

    @GetMapping("/coordinator/register-branch-transaction")
    String registerBranchTransaction();
}