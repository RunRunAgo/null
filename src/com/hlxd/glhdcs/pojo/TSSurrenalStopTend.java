package com.hlxd.glhdcs.pojo;

import java.util.Date;

/**
 * 停产物资维护表
 * TSSurrenalStopTend
 * 数据库表：T_S_SURRENAL_STOP_TEND
 */
public class TSSurrenalStopTend {

    /**
     * 停产物ID
     * 表字段 : T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE_ID
     */
    private String stopSupplieId;

    /**
     * 停产物资名称
     * 表字段 : T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE_NAME
     */
    private String stopSupplieName;

    /**
     * 物料编码
     * 表字段 : T_S_SURRENAL_STOP_TEND.MATERIAL_CODE
     */
    private String materialCode;

    /**
     * 规格型号
     * 表字段 : T_S_SURRENAL_STOP_TEND.EM_MODEL_NAME
     */
    private String emModelName;

    /**
     * 停产物资类型
     * 表字段 : T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE_TYPE
     */
    private String stopSupplieType;

    /**
     * 停产物资供应商
     * 表字段 : T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE _ SUPPLIER
     */
    private String stopSupplieSupplier;

    /**
     * 停产原因
     * 表字段 : T_S_SURRENAL_STOP_TEND.STOP_CAUSE
     */
    private String stopCause;

    /**
     * 是否启用
     * 表字段 : T_S_SURRENAL_STOP_TEND.IS_ENABLE
     */
    private Boolean isEnable;

    /**
     * 停产时间
     * 表字段 : T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE _ DOWNTIME
     */
    private Date stopSupplieDowntime;

    /**
     * 记录添加时间
     * 表字段 : T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE _ WRITETIME
     */
    private Date stopSupplieWritetime;

    /**
     * 获取 停产物ID 字段:T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE_ID
     *
     * @return T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE_ID, 停产物ID
     */
    public String getStopSupplieId() {
        return stopSupplieId;
    }

    /**
     * 设置 停产物ID 字段:T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE_ID
     *
     * @param stopSupplieId the value for T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE_ID, 停产物ID
     */
    public void setStopSupplieId(String stopSupplieId) {
        this.stopSupplieId = stopSupplieId == null ? null : stopSupplieId.trim();
    }

    /**
     * 获取 停产物资名称 字段:T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE_NAME
     *
     * @return T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE_NAME, 停产物资名称
     */
    public String getStopSupplieName() {
        return stopSupplieName;
    }

    /**
     * 设置 停产物资名称 字段:T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE_NAME
     *
     * @param stopSupplieName the value for T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE_NAME, 停产物资名称
     */
    public void setStopSupplieName(String stopSupplieName) {
        this.stopSupplieName = stopSupplieName == null ? null : stopSupplieName.trim();
    }

    /**
     * 获取 物料编码 字段:T_S_SURRENAL_STOP_TEND.MATERIAL_CODE
     *
     * @return T_S_SURRENAL_STOP_TEND.MATERIAL_CODE, 物料编码
     */
    public String getMaterialCode() {
        return materialCode;
    }

    /**
     * 设置 物料编码 字段:T_S_SURRENAL_STOP_TEND.MATERIAL_CODE
     *
     * @param materialCode the value for T_S_SURRENAL_STOP_TEND.MATERIAL_CODE, 物料编码
     */
    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode == null ? null : materialCode.trim();
    }

    /**
     * 获取 规格型号 字段:T_S_SURRENAL_STOP_TEND.EM_MODEL_NAME
     *
     * @return T_S_SURRENAL_STOP_TEND.EM_MODEL_NAME, 规格型号
     */
    public String getEmModelName() {
        return emModelName;
    }

    /**
     * 设置 规格型号 字段:T_S_SURRENAL_STOP_TEND.EM_MODEL_NAME
     *
     * @param emModelName the value for T_S_SURRENAL_STOP_TEND.EM_MODEL_NAME, 规格型号
     */
    public void setEmModelName(String emModelName) {
        this.emModelName = emModelName == null ? null : emModelName.trim();
    }

    /**
     * 获取 停产物资类型 字段:T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE_TYPE
     *
     * @return T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE_TYPE, 停产物资类型
     */
    public String getStopSupplieType() {
        return stopSupplieType;
    }

    /**
     * 设置 停产物资类型 字段:T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE_TYPE
     *
     * @param stopSupplieType the value for T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE_TYPE, 停产物资类型
     */
    public void setStopSupplieType(String stopSupplieType) {
        this.stopSupplieType = stopSupplieType == null ? null : stopSupplieType.trim();
    }

    /**
     * 获取 停产物资供应商 字段:T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE _ SUPPLIER
     *
     * @return T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE _ SUPPLIER, 停产物资供应商
     */
    public String getStopSupplieSupplier() {
        return stopSupplieSupplier;
    }

    /**
     * 设置 停产物资供应商 字段:T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE _ SUPPLIER
     *
     * @param stopSupplieSupplier the value for T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE _ SUPPLIER, 停产物资供应商
     */
    public void setStopSupplieSupplier(String stopSupplieSupplier) {
        this.stopSupplieSupplier = stopSupplieSupplier == null ? null : stopSupplieSupplier.trim();
    }

    /**
     * 获取 停产原因 字段:T_S_SURRENAL_STOP_TEND.STOP_CAUSE
     *
     * @return T_S_SURRENAL_STOP_TEND.STOP_CAUSE, 停产原因
     */
    public String getStopCause() {
        return stopCause;
    }

    /**
     * 设置 停产原因 字段:T_S_SURRENAL_STOP_TEND.STOP_CAUSE
     *
     * @param stopCause the value for T_S_SURRENAL_STOP_TEND.STOP_CAUSE, 停产原因
     */
    public void setStopCause(String stopCause) {
        this.stopCause = stopCause == null ? null : stopCause.trim();
    }

    /**
     * 获取 是否启用 字段:T_S_SURRENAL_STOP_TEND.IS_ENABLE
     *
     * @return T_S_SURRENAL_STOP_TEND.IS_ENABLE, 是否启用
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    /**
     * 设置 是否启用 字段:T_S_SURRENAL_STOP_TEND.IS_ENABLE
     *
     * @param isEnable the value for T_S_SURRENAL_STOP_TEND.IS_ENABLE, 是否启用
     */
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    /**
     * 获取 停产时间 字段:T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE _ DOWNTIME
     *
     * @return T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE _ DOWNTIME, 停产时间
     */
    public Date getStopSupplieDowntime() {
        return stopSupplieDowntime;
    }

    /**
     * 设置 停产时间 字段:T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE _ DOWNTIME
     *
     * @param stopSupplieDowntime the value for T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE _ DOWNTIME, 停产时间
     */
    public void setStopSupplieDowntime(Date stopSupplieDowntime) {
        this.stopSupplieDowntime = stopSupplieDowntime;
    }

    /**
     * 获取 记录添加时间 字段:T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE _ WRITETIME
     *
     * @return T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE _ WRITETIME, 记录添加时间
     */
    public Date getStopSupplieWritetime() {
        return stopSupplieWritetime;
    }

    /**
     * 设置 记录添加时间 字段:T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE _ WRITETIME
     *
     * @param stopSupplieWritetime the value for T_S_SURRENAL_STOP_TEND.STOP_SUPPLIE _ WRITETIME, 记录添加时间
     */
    public void setStopSupplieWritetime(Date stopSupplieWritetime) {
        this.stopSupplieWritetime = stopSupplieWritetime;
    }
}