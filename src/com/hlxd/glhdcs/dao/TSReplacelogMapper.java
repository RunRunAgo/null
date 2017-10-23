package com.hlxd.glhdcs.dao;

import com.hlxd.glhdcs.pojo.TSReplacelog;
import com.hlxd.glhdcs.pojo.TSReplacelogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSReplacelogMapper {
    /**
     *  根据指定的条件获取数据库记录数,T_S_REPLACELOG
     *
     * @param example
     */
    int countByExample(TSReplacelogExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,T_S_REPLACELOG
     *
     * @param example
     */
    int deleteByExample(TSReplacelogExample example);

    /**
     *  根据主键删除数据库的记录,T_S_REPLACELOG
     *
     * @param replacelogId
     */
    int deleteByPrimaryKey(String replacelogId);

    /**
     *  新写入数据库记录,T_S_REPLACELOG
     *
     * @param record
     */
    int insert(TSReplacelog record);

    /**
     *  动态字段,写入数据库记录,T_S_REPLACELOG
     *
     * @param record
     */
    int insertSelective(TSReplacelog record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,T_S_REPLACELOG
     *
     * @param example
     */
    List<TSReplacelog> selectByExample(TSReplacelogExample example);

    /**
     *  根据指定主键获取一条数据库记录,T_S_REPLACELOG
     *
     * @param replacelogId
     */
    TSReplacelog selectByPrimaryKey(String replacelogId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,T_S_REPLACELOG
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") TSReplacelog record, @Param("example") TSReplacelogExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,T_S_REPLACELOG
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") TSReplacelog record, @Param("example") TSReplacelogExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,T_S_REPLACELOG
     *
     * @param record
     */
    int updateByPrimaryKeySelective(TSReplacelog record);

    /**
     *  根据主键来更新符合条件的数据库记录,T_S_REPLACELOG
     *
     * @param record
     */
    int updateByPrimaryKey(TSReplacelog record);
}