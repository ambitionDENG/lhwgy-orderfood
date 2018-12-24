package com.yczn.feign;

import com.yczn.feignclient.FeignClientFallback;
import com.yczn.toolkit.ReturnJsonTemplate;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: yz
 * @date: 2018-12-19
 * @time: 10:14
 */
@FeignClient(name = "lhwgy-provider-up",fallback = FeignClientFallback.class)
public interface DcDishStyleFeign {

    @GetMapping("/shitang/todatFood")
    ReturnJsonTemplate todatFood();
}
