package com.smart.editor;

import java.beans.PropertyEditorSupport;

public class CustomerCarEditor extends PropertyEditorSupport{

    // 1.将字面值转化为属性类型对象
    public void setAsText(String text) {
        if (text == null && text.indexOf(",") == -1) {
            throw new IllegalArgumentException("设置的字符串格式不正确");
        }
        String[] info = text.split(",");
        Car car = new Car();
        car.setBrand(info[0]);
        car.setMaxSpeed(Integer.parseInt(info[1]));
        car.setPrice(Double.parseDouble(info[2]));

        // 2.调用父类的setValue()方法设置转换后的属性对象
        setValue(car);
    }

}
