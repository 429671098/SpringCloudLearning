package com.zhanghao.servicefeign.service.impl;

import com.zhanghao.servicefeign.service.ScheduleServiceHi;
import org.springframework.stereotype.Service;

@Service
public class ScheduleServiceHiHystrix implements ScheduleServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
