package org.spring.springboot.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.cluster.LoadBalance;
import com.alibaba.dubbo.rpc.protocol.dubbo.DubboProtocol;
import org.spring.springboot.domain.City;
import org.spring.springboot.dubbo.CityDubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 城市业务 Dubbo 服务层实现层
 *
 * Created by bysocket on 28/02/2017.
 */
// 注册为 Dubbo 服务
@Service(version = "1.0.0",loadbalance = "random" )
public class CityDubboServiceImpl implements CityDubboService {

    public City findCityByName(String cityName) {
        return new City(1L,2L,"温岭Server2","是我的故乡");
    }
}
