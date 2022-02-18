package com.lidaye.mybatis.generator;

import com.lidaye.mybatis.generator.dao.PosUserMapper;
import com.lidaye.mybatis.generator.entity.PosUser;
import com.lidaye.mybatis.generator.entity.PosUserExample;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class GeneratorApplicationTests {
    @Resource
    private PosUserMapper posUserMapper;

    @Test
    void insert() {
        // 映射对象
        PosUser posUser = new PosUser();
        // 方式一：直接写入
        posUserMapper.insert(posUser);
        // 方式二：有值校验，去除前后空格
        posUserMapper.insertSelective(posUser);
    }

    @Test
    void delete() {
        // 自定义条件
        PosUserExample example = new PosUserExample();
        PosUserExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(27);
        // 根据条件删除
        posUserMapper.deleteByExample(example);
        // 根据id删除
        posUserMapper.deleteByPrimaryKey(27);
    }

    @Test
    void update() {
        // 映射对象
        PosUser posUser = new PosUser();
        // 自定义条件
        PosUserExample example = new PosUserExample();
        PosUserExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(27);
        // 根据条件修改所有字段
        posUserMapper.updateByExample(posUser,example);
        // 根据条件修改，过滤空字段
        posUserMapper.updateByExampleSelective(posUser,example);
        // 根据id修改所有字段
        posUserMapper.updateByPrimaryKey(posUser);
        // 根据id修改，过滤空字段
        posUserMapper.updateByPrimaryKeySelective(posUser);
    }

    @Test
    void select() {
        // 自定义条件
        PosUserExample example = new PosUserExample();
        PosUserExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(27);
        // 根据条件搜索
        List<PosUser> posUsers = posUserMapper.selectByExample(example);
        // 根据id搜索
        PosUser posUser = posUserMapper.selectByPrimaryKey(27);
    }

    /**
     * 生成框架文件
     */
    /*public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<>();
        boolean overwrite = true;
        File configFile = new File("./src/main/resources/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }*/

}
