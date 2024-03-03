package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * 收集当前有多少台能够提供服务的机器，ServiceInstance 服务实例
 * @author:厚积薄发
 * @create:2022-05-12-21:07
 */
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
