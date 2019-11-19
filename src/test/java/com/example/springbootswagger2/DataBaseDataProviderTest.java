package com.example.springbootswagger2;

import com.example.springbootswagger2.controller.DBDataProviderRestController;
import com.example.springbootswagger2.controller.Swagger2DemoRestController;
import com.example.springbootswagger2.model.Student;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataBaseDataProviderTest {
    @Autowired
    private DBDataProviderRestController dataProviderRestController ;

    @Test
    public void testQuery(){
        List<Map<String, Object>> list = dataProviderRestController.queryForList("select * from dual");
        Assert.assertEquals(1,list.size());
    }


}
