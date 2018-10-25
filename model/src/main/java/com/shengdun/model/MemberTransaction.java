package com.shengdun.model;


import java.sql.Timestamp;

/**
 * @author wzb
 * @Email: 250513458@qq.com
 * @DATE : 2018-10-23
 * @MESSAGE: 商户交易记录表
 */

public class MemberTransaction {

    private Integer id;
    // 商户id
    private Integer orgId;
    // 用户id
    private Integer memberId;
    // 放款金额
    private Integer lendAmount;
    // 约定利息
    private Integer agreedInterest;
    // 数据修改时间
    private Timestamp updateTime;
    // 借出时间
    private Timestamp lendTime;
    // 约定还款时间
    private Timestamp repayTime;
    // 还款总额
    private Integer repayTotalAmount;
    // 还款利息
    private Integer repayInterest;
    // 订单回款状态 0 进行中 1 已回款
    private Integer status;
    // 第几次借款
    private Integer borrowingsCount;
    // 备注状态 0 没备注 1 已备注
    private Integer isRemark;
    // 上上签签署合同id
    private Integer contractId;
    // 借款申请放款id
    private Integer accuralId;
    // 客服id
    private Integer serviceId;
    // 审核人id
    private Integer auditorId;
    // 放款人id
    private Integer borrowerId;
    // 催收人id
    private Integer collectionId;
    // 渠道唯一标识
    private Integer identId;
    // 放款人所属资金方id
    private Integer investorId;
    // 是否删除 0 没删除 1 已删除
    private Integer isDel;
    // 申请时间/创建时间
    private Timestamp createTime;
    // 创建者
    private Integer creator;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getLendAmount() {
        return lendAmount;
    }

    public void setLendAmount(Integer lendAmount) {
        this.lendAmount = lendAmount;
    }

    public Integer getAgreedInterest() {
        return agreedInterest;
    }

    public void setAgreedInterest(Integer agreedInterest) {
        this.agreedInterest = agreedInterest;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Timestamp getLendTime() {
        return lendTime;
    }

    public void setLendTime(Timestamp lendTime) {
        this.lendTime = lendTime;
    }

    public Timestamp getRepayTime() {
        return repayTime;
    }

    public void setRepayTime(Timestamp repayTime) {
        this.repayTime = repayTime;
    }

    public Integer getRepayTotalAmount() {
        return repayTotalAmount;
    }

    public void setRepayTotalAmount(Integer repayTotalAmount) {
        this.repayTotalAmount = repayTotalAmount;
    }

    public Integer getRepayInterest() {
        return repayInterest;
    }

    public void setRepayInterest(Integer repayInterest) {
        this.repayInterest = repayInterest;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getBorrowingsCount() {
        return borrowingsCount;
    }

    public void setBorrowingsCount(Integer borrowingsCount) {
        this.borrowingsCount = borrowingsCount;
    }

    public Integer getIsRemark() {
        return isRemark;
    }

    public void setIsRemark(Integer isRemark) {
        this.isRemark = isRemark;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public Integer getAccuralId() {
        return accuralId;
    }

    public void setAccuralId(Integer accuralId) {
        this.accuralId = accuralId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(Integer auditorId) {
        this.auditorId = auditorId;
    }

    public Integer getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(Integer borrowerId) {
        this.borrowerId = borrowerId;
    }

    public Integer getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    public Integer getIdentId() {
        return identId;
    }

    public void setIdentId(Integer identId) {
        this.identId = identId;
    }

    public Integer getInvestorId() {
        return investorId;
    }

    public void setInvestorId(Integer investorId) {
        this.investorId = investorId;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
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
