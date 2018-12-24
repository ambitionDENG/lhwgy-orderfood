package com.yczn.feignclient;

import com.yczn.feign.DcDishStyleFeign;
import com.yczn.toolkit.ReturnJsonTemplate;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * 回退类FeignClientFallback需实现Feign Client接口
 * FeignClientFallback也可以是public class，没有区别
 *
 * @description:
 * @author: yz
 * @date: 2018-12-19
 * @time: 10:19
 */

@Component
public class FeignClientFallback implements DcDishStyleFeign {

    @Override
    public ReturnJsonTemplate todatFood() {
        return new ReturnJsonTemplate("feign调用失败！", 404, null);
    }
}
