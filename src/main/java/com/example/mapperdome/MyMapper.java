package com.example.mapperdome;

        import tk.mybatis.mapper.common.Mapper;
        import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Description
 * @Since JDK1.8
 * @Createtime 2018/11/30 15:02
 * @Author xie
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
