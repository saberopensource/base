package com.shengdun.model;

import java.sql.Timestamp;

/**
 * @author wzb
 * @Email: 250513458@qq.com
 * @DATE : 2018-10-23
 * @MESSAGE: 商户还款利息明细表
 */
public class MemberTranRepayPenalty {

    private Integer id;
    /**
     * 订单id
     */
    private Integer tranId;
    /**
     * 用户实际到账金额
     */
    private Integer actualAmount;
    /**
     * 正常利息
     */
    private Integer normalInterest;
    /**
     * 是否提前还款，0-否，1-是
     */
    private Integer isPrepayAmount;
    /**
     * 已还本金
     */
    private Integer repayAmount;
    /**
     * 未还本金
     */
    private Integer noRepayAmount;
    /**
     * 已还利息
     */
    private Integer repayInterest;
    /**
     * 是否展期， 0-否，1-是
     */
    private Integer isExtension;
    /**
     * 展期次数
     */
    private Integer extensionCount;
    /**
     * 展期总天数
     */
    private Integer extensionTotalDay;
    /**
     * 展期总费用
     */
    private Integer extensionTotalAmount;
    /**
     * 是否逾期，0-否，1-是
     */
    private Integer isOverdue;
    /**
     * 逾期天数
     */
    private Integer overdueDay;
    /**
     * 逾期利息
     */
    private Integer overdueInterest;
    /**
     * 逾期罚息违约金
     */
    private Integer overdueFineAmount;
    /**
     * 提前还款违约金
     */
    private Integer prepayAmount;
    /**
     * 已还违约金
     */
    private Integer repayPenaltyAmount;
    /**
     * 正常服务费总额
     */
    private Integer normalServiceFee;
    /**
     * 平台服务费
     */
    private Integer platformServiceFee;
    /**
     * 账户管理费
     */
    private Integer accountManageFee;
    /**
     * 支付信审费
     */
    private Integer payFee;
    /**
     * 是否删除 0 没删除 1 已删除
     */
    private Integer isDel;
    /**
     * 数据修改时间
     */
    private Timestamp updateTime;
    /**
     * 申请时间/创建时间
     */
    private Timestamp createTime;
    /**
     * 创建者
     */
    private Integer creator;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTranId() {
        return tranId;
    }

    public void setTranId(Integer tranId) {
        this.tranId = tranId;
    }

    public Integer getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(Integer actualAmount) {
        this.actualAmount = actualAmount;
    }

    public Integer getNormalInterest() {
        return normalInterest;
    }

    public void setNormalInterest(Integer normalInterest) {
        this.normalInterest = normalInterest;
    }

    public Integer getIsPrepayAmount() {
        return isPrepayAmount;
    }

    public void setIsPrepayAmount(Integer isPrepayAmount) {
        this.isPrepayAmount = isPrepayAmount;
    }

    public Integer getRepayAmount() {
        return repayAmount;
    }

    public void setRepayAmount(Integer repayAmount) {
        this.repayAmount = repayAmount;
    }

    public Integer getNoRepayAmount() {
        return noRepayAmount;
    }

    public void setNoRepayAmount(Integer noRepayAmount) {
        this.noRepayAmount = noRepayAmount;
    }

    public Integer getRepayInterest() {
        return repayInterest;
    }

    public void setRepayInterest(Integer repayInterest) {
        this.repayInterest = repayInterest;
    }

    public Integer getIsExtension() {
        return isExtension;
    }

    public void setIsExtension(Integer isExtension) {
        this.isExtension = isExtension;
    }

    public Integer getExtensionCount() {
        return extensionCount;
    }

    public void setExtensionCount(Integer extensionCount) {
        this.extensionCount = extensionCount;
    }

    public Integer getExtensionTotalDay() {
        return extensionTotalDay;
    }

    public void setExtensionTotalDay(Integer extensionTotalDay) {
        this.extensionTotalDay = extensionTotalDay;
    }

    public Integer getExtensionTotalAmount() {
        return extensionTotalAmount;
    }

    public void setExtensionTotalAmount(Integer extensionTotalAmount) {
        this.extensionTotalAmount = extensionTotalAmount;
    }

    public Integer getIsOverdue() {
        return isOverdue;
    }

    public void setIsOverdue(Integer isOverdue) {
        this.isOverdue = isOverdue;
    }

    public Integer getOverdueDay() {
        return overdueDay;
    }

    public void setOverdueDay(Integer overdueDay) {
        this.overdueDay = overdueDay;
    }

    public Integer getOverdueInterest() {
        return overdueInterest;
    }

    public void setOverdueInterest(Integer overdueInterest) {
        this.overdueInterest = overdueInterest;
    }

    public Integer getOverdueFineAmount() {
        return overdueFineAmount;
    }

    public void setOverdueFineAmount(Integer overdueFineAmount) {
        this.overdueFineAmount = overdueFineAmount;
    }

    public Integer getPrepayAmount() {
        return prepayAmount;
    }

    public void setPrepayAmount(Integer prepayAmount) {
        this.prepayAmount = prepayAmount;
    }

    public Integer getRepayPenaltyAmount() {
        return repayPenaltyAmount;
    }

    public void setRepayPenaltyAmount(Integer repayPenaltyAmount) {
        this.repayPenaltyAmount = repayPenaltyAmount;
    }

    public Integer getNormalServiceFee() {
        return normalServiceFee;
    }

    public void setNormalServiceFee(Integer normalServiceFee) {
        this.normalServiceFee = normalServiceFee;
    }

    public Integer getPlatformServiceFee() {
        return platformServiceFee;
    }

    public void setPlatformServiceFee(Integer platformServiceFee) {
        this.platformServiceFee = platformServiceFee;
    }

    public Integer getAccountManageFee() {
        return accountManageFee;
    }

    public void setAccountManageFee(Integer accountManageFee) {
        this.accountManageFee = accountManageFee;
    }

    public Integer getPayFee() {
        return payFee;
    }

    public void setPayFee(Integer payFee) {
        this.payFee = payFee;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }
}
