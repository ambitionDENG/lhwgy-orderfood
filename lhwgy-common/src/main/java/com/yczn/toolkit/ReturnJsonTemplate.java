package com.yczn.toolkit;


import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @description: 前端返回参数
 * @author: yz
 * @date: 2018-12-21
 * @time: 16:35
 */
@Data
//@ApiModel(value = "返回参数")
public class ReturnJsonTemplate {

    /**
     * 调用情况
     */
    //  @ApiModelProperty(value = "调用情况", name = "message", example = "调用成功!")
    private String message;
    /**
     * 调用状态
     * 200 成功
     * 500 程序异常
     * 405 程序无异常,内容不成功
     */
    //  @ApiModelProperty(value = "调用状态", name = "state", example = "200")
    private Integer state = 0;
    /**
     * 返回数据
     */
    //  @ApiModelProperty(value = "返回数据", name = "data")
    private List<?> data;

    public ReturnJsonTemplate(String message, Integer state, List<?> data) {
        this.message = message;
        this.state = state;
        this.data = data;
    }

    public ReturnJsonTemplate() {
    }
}
