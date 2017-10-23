package com.hlxd.glhdcs.pojo;

import java.util.Date;

/**
 * 替代记录表
 * TSReplacelog
 * 数据库表：T_S_REPLACELOG
 */
public class TSReplacelog {

    /**
     * 替代记录编号(主键)
     * 表字段 : T_S_REPLACELOG.REPLACELOG_ID
     */
    private String replacelogId;

    /**
     * 替代方案编号(外键)
     * 表字段 : T_S_REPLACELOG.SOLUTION_ID
     */
    private String solutionId;

    /**
     * 淘汰物资编号(外键)
     * 表字段 : T_S_REPLACELOG.OBSOLETE_UNIT_CODE
     */
    private String obsoleteUnitCode;

    /**
     * 淘汰物资名称
     * 表字段 : T_S_REPLACELOG.OBSOLETE_UNIT_NAME
     */
    private String obsoleteUnitName;

    /**
     * 淘汰物资类型
     * 表字段 : T_S_REPLACELOG.OBSOLETE_UNIT_TYPE
     */
    private String obsoleteUnitType;

    /**
     * 淘汰物资规格
     * 表字段 : T_S_REPLACELOG.OBSOLETE_UNIT_MODEL
     */
    private String obsoleteUnitModel;

    /**
     * 淘汰物资供应商
     * 表字段 : T_S_REPLACELOG.OBSOLETE_UNIT_SUPPLIER
     */
    private String obsoleteUnitSupplier;

    /**
     * 替代物资编号(外键)
     * 表字段 : T_S_REPLACELOG.REPLACE_UNIT_CODE
     */
    private String replaceUnitCode;

    /**
     * 替代物资名称
     * 表字段 : T_S_REPLACELOG.REPLACE_UNIT_NAME
     */
    private String replaceUnitName;

    /**
     * 替代物资类型
     * 表字段 : T_S_REPLACELOG.REPLACE_UNIT_TYPE
     */
    private String replaceUnitType;

    /**
     * 替代物资规格
     * 表字段 : T_S_REPLACELOG.REPLACE_UNIT_MODEL
     */
    private String replaceUnitModel;

    /**
     * 替代物资供应商
     * 表字段 : T_S_REPLACELOG.REPLACE_UNIT_SUPPLIER
     */
    private String replaceUnitSupplier;

    /**
     * 替代时间
     * 表字段 : T_S_REPLACELOG.REPLACE_TIME
     */
    private Date replaceTime;

    /**
     * 淘汰设备编码
     * 表字段 : T_S_REPLACELOG.OBSOLETE_EQUIPMENT_CODE
     */
    private String obsoleteEquipmentCode;

    /**
     * 获取 替代记录编号(主键) 字段:T_S_REPLACELOG.REPLACELOG_ID
     *
     * @return T_S_REPLACELOG.REPLACELOG_ID, 替代记录编号(主键)
     */
    public String getReplacelogId() {
        return replacelogId;
    }

    /**
     * 设置 替代记录编号(主键) 字段:T_S_REPLACELOG.REPLACELOG_ID
     *
     * @param replacelogId the value for T_S_REPLACELOG.REPLACELOG_ID, 替代记录编号(主键)
     */
    public void setReplacelogId(String replacelogId) {
        this.replacelogId = replacelogId == null ? null : replacelogId.trim();
    }

    /**
     * 获取 替代方案编号(外键) 字段:T_S_REPLACELOG.SOLUTION_ID
     *
     * @return T_S_REPLACELOG.SOLUTION_ID, 替代方案编号(外键)
     */
    public String getSolutionId() {
        return solutionId;
    }

    /**
     * 设置 替代方案编号(外键) 字段:T_S_REPLACELOG.SOLUTION_ID
     *
     * @param solutionId the value for T_S_REPLACELOG.SOLUTION_ID, 替代方案编号(外键)
     */
    public void setSolutionId(String solutionId) {
        this.solutionId = solutionId == null ? null : solutionId.trim();
    }

    /**
     * 获取 淘汰物资编号(外键) 字段:T_S_REPLACELOG.OBSOLETE_UNIT_CODE
     *
     * @return T_S_REPLACELOG.OBSOLETE_UNIT_CODE, 淘汰物资编号(外键)
     */
    public String getObsoleteUnitCode() {
        return obsoleteUnitCode;
    }

    /**
     * 设置 淘汰物资编号(外键) 字段:T_S_REPLACELOG.OBSOLETE_UNIT_CODE
     *
     * @param obsoleteUnitCode the value for T_S_REPLACELOG.OBSOLETE_UNIT_CODE, 淘汰物资编号(外键)
     */
    public void setObsoleteUnitCode(String obsoleteUnitCode) {
        this.obsoleteUnitCode = obsoleteUnitCode == null ? null : obsoleteUnitCode.trim();
    }

    /**
     * 获取 淘汰物资名称 字段:T_S_REPLACELOG.OBSOLETE_UNIT_NAME
     *
     * @return T_S_REPLACELOG.OBSOLETE_UNIT_NAME, 淘汰物资名称
     */
    public String getObsoleteUnitName() {
        return obsoleteUnitName;
    }

    /**
     * 设置 淘汰物资名称 字段:T_S_REPLACELOG.OBSOLETE_UNIT_NAME
     *
     * @param obsoleteUnitName the value for T_S_REPLACELOG.OBSOLETE_UNIT_NAME, 淘汰物资名称
     */
    public void setObsoleteUnitName(String obsoleteUnitName) {
        this.obsoleteUnitName = obsoleteUnitName == null ? null : obsoleteUnitName.trim();
    }

    /**
     * 获取 淘汰物资类型 字段:T_S_REPLACELOG.OBSOLETE_UNIT_TYPE
     *
     * @return T_S_REPLACELOG.OBSOLETE_UNIT_TYPE, 淘汰物资类型
     */
    public String getObsoleteUnitType() {
        return obsoleteUnitType;
    }

    /**
     * 设置 淘汰物资类型 字段:T_S_REPLACELOG.OBSOLETE_UNIT_TYPE
     *
     * @param obsoleteUnitType the value for T_S_REPLACELOG.OBSOLETE_UNIT_TYPE, 淘汰物资类型
     */
    public void setObsoleteUnitType(String obsoleteUnitType) {
        this.obsoleteUnitType = obsoleteUnitType == null ? null : obsoleteUnitType.trim();
    }

    /**
     * 获取 淘汰物资规格 字段:T_S_REPLACELOG.OBSOLETE_UNIT_MODEL
     *
     * @return T_S_REPLACELOG.OBSOLETE_UNIT_MODEL, 淘汰物资规格
     */
    public String getObsoleteUnitModel() {
        return obsoleteUnitModel;
    }

    /**
     * 设置 淘汰物资规格 字段:T_S_REPLACELOG.OBSOLETE_UNIT_MODEL
     *
     * @param obsoleteUnitModel the value for T_S_REPLACELOG.OBSOLETE_UNIT_MODEL, 淘汰物资规格
     */
    public void setObsoleteUnitModel(String obsoleteUnitModel) {
        this.obsoleteUnitModel = obsoleteUnitModel == null ? null : obsoleteUnitModel.trim();
    }

    /**
     * 获取 淘汰物资供应商 字段:T_S_REPLACELOG.OBSOLETE_UNIT_SUPPLIER
     *
     * @return T_S_REPLACELOG.OBSOLETE_UNIT_SUPPLIER, 淘汰物资供应商
     */
    public String getObsoleteUnitSupplier() {
        return obsoleteUnitSupplier;
    }

    /**
     * 设置 淘汰物资供应商 字段:T_S_REPLACELOG.OBSOLETE_UNIT_SUPPLIER
     *
     * @param obsoleteUnitSupplier the value for T_S_REPLACELOG.OBSOLETE_UNIT_SUPPLIER, 淘汰物资供应商
     */
    public void setObsoleteUnitSupplier(String obsoleteUnitSupplier) {
        this.obsoleteUnitSupplier = obsoleteUnitSupplier == null ? null : obsoleteUnitSupplier.trim();
    }

    /**
     * 获取 替代物资编号(外键) 字段:T_S_REPLACELOG.REPLACE_UNIT_CODE
     *
     * @return T_S_REPLACELOG.REPLACE_UNIT_CODE, 替代物资编号(外键)
     */
    public String getReplaceUnitCode() {
        return replaceUnitCode;
    }

    /**
     * 设置 替代物资编号(外键) 字段:T_S_REPLACELOG.REPLACE_UNIT_CODE
     *
     * @param replaceUnitCode the value for T_S_REPLACELOG.REPLACE_UNIT_CODE, 替代物资编号(外键)
     */
    public void setReplaceUnitCode(String replaceUnitCode) {
        this.replaceUnitCode = replaceUnitCode == null ? null : replaceUnitCode.trim();
    }

    /**
     * 获取 替代物资名称 字段:T_S_REPLACELOG.REPLACE_UNIT_NAME
     *
     * @return T_S_REPLACELOG.REPLACE_UNIT_NAME, 替代物资名称
     */
    public String getReplaceUnitName() {
        return replaceUnitName;
    }

    /**
     * 设置 替代物资名称 字段:T_S_REPLACELOG.REPLACE_UNIT_NAME
     *
     * @param replaceUnitName the value for T_S_REPLACELOG.REPLACE_UNIT_NAME, 替代物资名称
     */
    public void setReplaceUnitName(String replaceUnitName) {
        this.replaceUnitName = replaceUnitName == null ? null : replaceUnitName.trim();
    }

    /**
     * 获取 替代物资类型 字段:T_S_REPLACELOG.REPLACE_UNIT_TYPE
     *
     * @return T_S_REPLACELOG.REPLACE_UNIT_TYPE, 替代物资类型
     */
    public String getReplaceUnitType() {
        return replaceUnitType;
    }

    /**
     * 设置 替代物资类型 字段:T_S_REPLACELOG.REPLACE_UNIT_TYPE
     *
     * @param replaceUnitType the value for T_S_REPLACELOG.REPLACE_UNIT_TYPE, 替代物资类型
     */
    public void setReplaceUnitType(String replaceUnitType) {
        this.replaceUnitType = replaceUnitType == null ? null : replaceUnitType.trim();
    }

    /**
     * 获取 替代物资规格 字段:T_S_REPLACELOG.REPLACE_UNIT_MODEL
     *
     * @return T_S_REPLACELOG.REPLACE_UNIT_MODEL, 替代物资规格
     */
    public String getReplaceUnitModel() {
        return replaceUnitModel;
    }

    /**
     * 设置 替代物资规格 字段:T_S_REPLACELOG.REPLACE_UNIT_MODEL
     *
     * @param replaceUnitModel the value for T_S_REPLACELOG.REPLACE_UNIT_MODEL, 替代物资规格
     */
    public void setReplaceUnitModel(String replaceUnitModel) {
        this.replaceUnitModel = replaceUnitModel == null ? null : replaceUnitModel.trim();
    }

    /**
     * 获取 替代物资供应商 字段:T_S_REPLACELOG.REPLACE_UNIT_SUPPLIER
     *
     * @return T_S_REPLACELOG.REPLACE_UNIT_SUPPLIER, 替代物资供应商
     */
    public String getReplaceUnitSupplier() {
        return replaceUnitSupplier;
    }

    /**
     * 设置 替代物资供应商 字段:T_S_REPLACELOG.REPLACE_UNIT_SUPPLIER
     *
     * @param replaceUnitSupplier the value for T_S_REPLACELOG.REPLACE_UNIT_SUPPLIER, 替代物资供应商
     */
    public void setReplaceUnitSupplier(String replaceUnitSupplier) {
        this.replaceUnitSupplier = replaceUnitSupplier == null ? null : replaceUnitSupplier.trim();
    }

    /**
     * 获取 替代时间 字段:T_S_REPLACELOG.REPLACE_TIME
     *
     * @return T_S_REPLACELOG.REPLACE_TIME, 替代时间
     */
    public Date getReplaceTime() {
        return replaceTime;
    }

    /**
     * 设置 替代时间 字段:T_S_REPLACELOG.REPLACE_TIME
     *
     * @param replaceTime the value for T_S_REPLACELOG.REPLACE_TIME, 替代时间
     */
    public void setReplaceTime(Date replaceTime) {
        this.replaceTime = replaceTime;
    }

    /**
     * 获取 淘汰设备编码 字段:T_S_REPLACELOG.OBSOLETE_EQUIPMENT_CODE
     *
     * @return T_S_REPLACELOG.OBSOLETE_EQUIPMENT_CODE, 淘汰设备编码
     */
    public String getObsoleteEquipmentCode() {
        return obsoleteEquipmentCode;
    }

    /**
     * 设置 淘汰设备编码 字段:T_S_REPLACELOG.OBSOLETE_EQUIPMENT_CODE
     *
     * @param obsoleteEquipmentCode the value for T_S_REPLACELOG.OBSOLETE_EQUIPMENT_CODE, 淘汰设备编码
     */
    public void setObsoleteEquipmentCode(String obsoleteEquipmentCode) {
        this.obsoleteEquipmentCode = obsoleteEquipmentCode == null ? null : obsoleteEquipmentCode.trim();
    }
}