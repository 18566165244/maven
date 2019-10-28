package cn.itheima.controller;

import cn.itheima.domain.Items;
import cn.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;
    @RequestMapping("/itemsDetail")
    public ModelAndView find(Integer id){
        ModelAndView modelAndView = new ModelAndView();
        Items items = itemsService.findById(id);
        modelAndView.addObject("item",items);
        modelAndView.setViewName("itemDetail");
        return modelAndView;
    }
}
