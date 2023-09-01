package com.itplh.oshi.controller;

import cn.hutool.system.oshi.OshiUtil;
import com.itplh.oshi.domain.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oshi")
public class OshiController {

    @GetMapping("/cpuInfo")
    public Result cpuInfo() {
        return Result.ok(OshiUtil.getCpuInfo());
    }

    @GetMapping("/currentProcess")
    public Result currentProcess() {
        return Result.ok(OshiUtil.getCurrentProcess());
    }

    @GetMapping("/diskStores")
    public Result diskStores() {
        return Result.ok(OshiUtil.getDiskStores());
    }

    @GetMapping("/hardware")
    public Result hardware() {
        return Result.ok(OshiUtil.getHardware());
    }

    @GetMapping("/memory")
    public Result memory() {
        return Result.ok(OshiUtil.getMemory());
    }

    @GetMapping("/networkIFs")
    public Result networkIFs() {
        return Result.ok(OshiUtil.getNetworkIFs());
    }

    @GetMapping("/os")
    public Result os() {
        return Result.ok(OshiUtil.getOs());
    }

    @GetMapping("/processor")
    public Result processor() {
        return Result.ok(OshiUtil.getProcessor());
    }

    @GetMapping("/sensors")
    public Result sensors() {
        return Result.ok(OshiUtil.getSensors());
    }

    @GetMapping("/system")
    public Result system() {
        return Result.ok(OshiUtil.getSystem());
    }

}
