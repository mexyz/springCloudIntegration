package com.xyz;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTurbine
@EnableHystrix
@EnableDiscoveryClient
@EnableHystrixDashboard
public class TurbineDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurbineDashboardApplication.class, args);
    }
}
