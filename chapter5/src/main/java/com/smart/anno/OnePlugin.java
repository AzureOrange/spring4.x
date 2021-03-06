package com.smart.anno;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 1) //指定加载的顺序，值越小，优先被加载
public class OnePlugin implements Plugin {
}
