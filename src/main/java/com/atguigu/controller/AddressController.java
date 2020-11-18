package com.atguigu.controller;

import com.atguigu.pojo.Address;
import com.atguigu.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author oono
 * @date 2020 11 17
 */

@Controller
@RequestMapping(value = "/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @RequestMapping(value = "/list")
    @ResponseBody //返回Json
    public List<Address> getAddressList(){
        return addressService.getAddressList();
    }


}
