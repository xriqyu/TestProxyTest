package com.sharding.mapper;

import com.sharding.DataRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author : wangzhe
 * @date : Created in 2019-09-11 21:26
 * @description :
 */
@Mapper
public interface DataRecordMapper {

    DataRecord selectByPrimaryKey(@Param("uuid") String uuid);

    void insert(DataRecord record);

    void update(DataRecord record);

    void delete(@Param("uuid") String uuid);
}
