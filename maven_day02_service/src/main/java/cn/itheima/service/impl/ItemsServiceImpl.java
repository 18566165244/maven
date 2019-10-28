package cn.itheima.service.impl;

import cn.itheima.dao.ItemsMapper;
import cn.itheima.domain.Items;
import cn.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;
    public Items findById(Integer id) {
        return itemsMapper.findById(id);
    }
}
