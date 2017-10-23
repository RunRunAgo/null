package com.hlxd.glhdcs.dao;

import com.hlxd.glhdcs.pojo.TSSurrenalStopTend;
import com.hlxd.glhdcs.pojo.TSSurrenalStopTendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSSurrenalStopTendMapper {
    /**
     *  根据指定的条件获取数据库记录数,T_S_SURRENAL_STOP_TEND
     *
     * @param example
     */
    int countByExample(TSSurrenalStopTendExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,T_S_SURRENAL_STOP_TEND
     *
     * @param example
     */
    int deleteByExample(TSSurrenalStopTendExample example);

    /**
     *  根据主键删除数据库的记录,T_S_SURRENAL_STOP_TEND
     *
     * @param stopSupplieId
     */
    int deleteByPrimaryKey(String stopSupplieId);

    /**
     *  新写入数据库记录,T_S_SURRENAL_STOP_TEND
     *
     * @param record
     */
    int insert(TSSurrenalStopTend record);

    /**
     *  动态字段,写入数据库记录,T_S_SURRENAL_STOP_TEND
     *
     * @param record
     */
    int insertSelective(TSSurrenalStopTend record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,T_S_SURRENAL_STOP_TEND
     *
     * @param example
     */
    List<TSSurrenalStopTend> selectByExample(TSSurrenalStopTendExample example);

    /**
     *  根据指定主键获取一条数据库记录,T_S_SURRENAL_STOP_TEND
     *
     * @param stopSupplieId
     */
    TSSurrenalStopTend selectByPrimaryKey(String stopSupplieId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,T_S_SURRENAL_STOP_TEND
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") TSSurrenalStopTend record, @Param("example") TSSurrenalStopTendExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,T_S_SURRENAL_STOP_TEND
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") TSSurrenalStopTend record, @Param("example") TSSurrenalStopTendExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,T_S_SURRENAL_STOP_TEND
     *
     * @param record
     */
    int updateByPrimaryKeySelective(TSSurrenalStopTend record);

    /**
     *  根据主键来更新符合条件的数据库记录,T_S_SURRENAL_STOP_TEND
     *
     * @param record
     */
    int updateByPrimaryKey(TSSurrenalStopTend record);
}