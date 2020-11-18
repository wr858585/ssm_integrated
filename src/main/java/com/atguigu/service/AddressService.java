package com.atguigu.service;

import com.atguigu.dao.AddressMapper;
import com.atguigu.pojo.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author oono
 * @date 2020 11 17
 */

@Service
//@Transactional
public class AddressService {

    @Autowired
    private AddressMapper addressMapper;

    public List<Address> getAddressList(){
        return addressMapper.getAddressList();
    }

}
