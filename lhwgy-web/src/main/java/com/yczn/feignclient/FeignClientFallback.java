package com.yczn.feignclient;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: yz
 * @date: 2018-12-19
 * @time: 10:19
 */

import com.yczn.feign.DcDishStyleFeign;
import org.springframework.stereotype.Component;

/**
 * 回退类FeignClientFallback需实现Feign Client接口
 * FeignClientFallback也可以是public class，没有区别
 */
@Component
public class FeignClientFallback implements DcDishStyleFeign {
}
