package com.reige.controller;

import java.util.List;

import com.reige.pojo.ItemsCustom;
import com.reige.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/json")
@Api(value = "/json", tags = "测试", description = "这里是描述")
public class JsonTestController {

    //请求的json响应json，请求商品信息，商品信息用json格式，输出商品信息
    @RequestMapping(value = "/requestJson",method = RequestMethod.POST)
    @ApiOperation(value = "根据id获取用户信息2", notes = "根据id获取用户信息2", response = ItemsCustom.class)
    @ResponseBody
    public ItemsCustom requestJson(@RequestBody ItemsCustom itemsCustom) throws Exception {


        return itemsCustom;

    }

    @ApiOperation(value = "根据id获取用户信息3", notes = "根据id获取用户信息3", response = ItemsCustom.class)
    //请求key/value响应json
    @RequestMapping(value = "/responseJson",method = RequestMethod.POST)
    @ResponseBody
    public ItemsCustom responseJson(ItemsCustom itemsCustom) throws Exception {

        return itemsCustom;
    }
}
