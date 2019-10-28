package cn.itheima.dao;

import cn.itheima.domain.Items;
import org.apache.ibatis.annotations.Select;

public interface ItemsMapper {

    @Select("select * from items where id = #{id}")
    public Items findById(Integer id);
}
