package com.codebygaurav.limits.controller;


import com.codebygaurav.limits.bean.LimitsConfiguration;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private  LimitsConfiguration limitsConfiguration;

    @GetMapping("limits")
    public LimitsConfiguration returnLimits(){
        return new LimitsConfiguration(limitsConfiguration.getMaximum(),limitsConfiguration.getMinimum());
    }
}
