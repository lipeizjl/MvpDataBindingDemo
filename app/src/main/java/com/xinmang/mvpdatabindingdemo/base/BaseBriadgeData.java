package com.xinmang.mvpdatabindingdemo.base;

import com.xinmang.mvpdatabindingdemo.bean.TextBean;

import java.util.List;

/**
 * Created by 李佩
 * @date 2018/01/27
 * @description Model层和Presenter数据交互的桥梁
 */

public interface BaseBriadgeData<T> {

    void addData(T mList);

    void error(String error);

    /**
     * 无需自定义的话,就直接基础BaseBriadgeData
     */
    interface mainData extends BaseBriadgeData<TextBean>{};

//    /**
//     * 自定义的跟下面的写法一样
//     */
//    interface maincustomizeData {
//        void addData(TextBean textBean);
//
//    };

}
