package com.example.springbootswagger2.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface DataBaseDataMapper {
    @Select(value = "${_parameter}")
    List<Map<String, Object>> queryForList(String sql);

    @Update(value = "${_parameter}")
    Integer update(String sql);

    @Delete(value = "${_parameter}")
    Integer delete(String sql);

    @Insert(value = "${_parameter}")
    Integer insert(String sql);
}
