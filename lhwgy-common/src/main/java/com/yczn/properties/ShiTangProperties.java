package com.yczn.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: yz
 * @date: 2018-12-21
 * @time: 12:39
 */
@Component
@ConfigurationProperties(prefix = "lhwy")
// PropertySource默认取application.properties
@PropertySource(value = "shitang.properties")
@Getter
@Setter
public class ShiTangProperties {
    private String ShiTangName;
    private String ShiTangNo;
}
