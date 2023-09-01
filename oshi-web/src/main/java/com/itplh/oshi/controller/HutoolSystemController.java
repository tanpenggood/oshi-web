package com.itplh.oshi.controller;

import cn.hutool.system.SystemUtil;
import com.alibaba.fastjson2.JSONObject;
import com.itplh.oshi.domain.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hs")
public class HutoolSystemController {

    @GetMapping("/jvmSpecInfo")
    public Result jvmSpecInfo() {
        return Result.ok(SystemUtil.getJvmSpecInfo());
    }

    @GetMapping("/jvmInfo")
    public Result jvmInfo() {
        return Result.ok(SystemUtil.getJvmInfo());
    }

    @GetMapping("/javaSpecInfo")
    public Result javaSpecInfo() {
        return Result.ok(SystemUtil.getJavaSpecInfo());
    }

    @GetMapping("/javaInfo")
    public Result javaInfo() {
        return Result.ok(SystemUtil.getJavaInfo());
    }

    @GetMapping("/javaRuntimeInfo")
    public Result javaRuntimeInfo() {
        return Result.ok(SystemUtil.getJavaRuntimeInfo());
    }

    @GetMapping("/osInfo")
    public Result osInfo() {
        return Result.ok(SystemUtil.getOsInfo());
    }


    @GetMapping("/userInfo")
    public Result userInfo() {
        return Result.ok(SystemUtil.getUserInfo());
    }

    @GetMapping("/hostInfo")
    public Result hostInfo() {
        return Result.ok(SystemUtil.getHostInfo());
    }

    @GetMapping("/runtimeInfo")
    public Result runtimeInfo() {
        return Result.ok(JSONObject.parse(JSONObject.toJSONString(SystemUtil.getRuntimeInfo())));
    }

}
