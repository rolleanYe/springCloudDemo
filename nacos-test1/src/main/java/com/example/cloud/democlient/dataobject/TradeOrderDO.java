package com.example.cloud.democlient.dataobject;

import java.math.BigDecimal;
import java.util.Date;

public class TradeOrderDO {
    /**
     * 交易凭证号
     */
    private String tradeVoucherNo;

    /**
     * 交易原始凭证号
     */
    private String tradeSrcVoucherNo;

    /**
     * 原交易凭证号
     */
    private String origTradeVoucherNo;

    private String bizNo;

    /**
     * 产品编码
     */
    private String bizProductCode;

    /**
     * 交易金额
     */
    private BigDecimal tradeAmount;

    /**
     * 交易类型
     */
    private String tradeType;

    /**
     * 交易发起时间
     */
    private Date gmtSubmit;

    /**
     * 买家客户ID
     */
    private String buyerId;

    /**
     * 买家客户名称
     */
    private String buyerName;

    /**
     * 卖家客户ID
     */
    private String sellerId;

    /**
     * 卖家客户名称
     */
    private String sellerName;

    /**
     * 卖家账户
     */
    private String sellerAccountNo;

    /**
     * 平台方客户ID
     */
    private String partnerId;


    /**
     * 租户Id
     */
    private String tenantId;
    /**
     * 租户业务码
     */
    private String bizCode;

    /**
     * 平台方客户名称
     */
    private String partnerName;

    /**
     * 终端类型
     */
    private String accessChannel;

    /**
     * 扩展信息
     */
    private String extension;

    /**
     * 前交易状态
     */
    private String preStatus;

    /**
     * 交易状态
     */
    private String status;

    /**
     * 结果备注
     */
    private String tradeMemo;

    private String resultMemo;

    /**
     * 错误编码
     */
    private String errorCode;

    /**
     * 错误信息
     */
    private String errorMsg;

    /**
     * 交易过期时间
     */
    private Date gmtInvalid;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;



    /**
     * 当前状态的通知情况
Y-已通知
N-未通知
     */
    private String isNotified;

    /**
     * 商品信息
     */
    private String prodDesc;

    /**
     * 商品展示URL
     */
    private String prodShowUrl;

    /**
     * 关联交易凭证号（对应合并支付的交易）
     */
    private String relatedTradeVoucherNo;

    /**
     * 处理器ID
     */
    private String processorId;

    private String batchNo;

    private String submitId;
    /**
     * 冻结标识
     */
    private String freezeFlag;

    public String getTradeVoucherNo() {
        return tradeVoucherNo;
    }

    public void setTradeVoucherNo(String tradeVoucherNo) {
        this.tradeVoucherNo = tradeVoucherNo == null ? null : tradeVoucherNo.trim();
    }

    public String getTradeSrcVoucherNo() {
        return tradeSrcVoucherNo;
    }

    public void setTradeSrcVoucherNo(String tradeSrcVoucherNo) {
        this.tradeSrcVoucherNo = tradeSrcVoucherNo == null ? null : tradeSrcVoucherNo.trim();
    }

    public String getOrigTradeVoucherNo() {
        return origTradeVoucherNo;
    }

    public void setOrigTradeVoucherNo(String origTradeVoucherNo) {
        this.origTradeVoucherNo = origTradeVoucherNo == null ? null : origTradeVoucherNo.trim();
    }

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    public String getBizProductCode() {
        return bizProductCode;
    }

    public void setBizProductCode(String bizProductCode) {
        this.bizProductCode = bizProductCode == null ? null : bizProductCode.trim();
    }

    public BigDecimal getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(BigDecimal tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType == null ? null : tradeType.trim();
    }

    public Date getGmtSubmit() {
        return gmtSubmit;
    }

    public void setGmtSubmit(Date gmtSubmit) {
        this.gmtSubmit = gmtSubmit;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId == null ? null : buyerId.trim();
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    public String getSellerAccountNo() {
        return sellerAccountNo;
    }

    public void setSellerAccountNo(String sellerAccountNo) {
        this.sellerAccountNo = sellerAccountNo == null ? null : sellerAccountNo.trim();
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId == null ? null : partnerId.trim();
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName == null ? null : partnerName.trim();
    }

    public String getAccessChannel() {
        return accessChannel;
    }

    public void setAccessChannel(String accessChannel) {
        this.accessChannel = accessChannel == null ? null : accessChannel.trim();
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension == null ? null : extension.trim();
    }

    public String getPreStatus() {
        return preStatus;
    }

    public void setPreStatus(String preStatus) {
        this.preStatus = preStatus == null ? null : preStatus.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getTradeMemo() {
        return tradeMemo;
    }

    public void setTradeMemo(String tradeMemo) {
        this.tradeMemo = tradeMemo == null ? null : tradeMemo.trim();
    }

    public String getResultMemo() {
        return resultMemo;
    }

    public void setResultMemo(String resultMemo) {
        this.resultMemo = resultMemo == null ? null : resultMemo.trim();
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode == null ? null : errorCode.trim();
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg == null ? null : errorMsg.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getIsNotified() {
        return isNotified;
    }

    public void setIsNotified(String isNotified) {
        this.isNotified = isNotified == null ? null : isNotified.trim();
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc == null ? null : prodDesc.trim();
    }

    public String getProdShowUrl() {
        return prodShowUrl;
    }

    public void setProdShowUrl(String prodShowUrl) {
        this.prodShowUrl = prodShowUrl == null ? null : prodShowUrl.trim();
    }

    public String getRelatedTradeVoucherNo() {
        return relatedTradeVoucherNo;
    }

    public void setRelatedTradeVoucherNo(String relatedTradeVoucherNo) {
        this.relatedTradeVoucherNo = relatedTradeVoucherNo == null ? null : relatedTradeVoucherNo.trim();
    }

    public String getProcessorId() {
        return processorId;
    }

    public void setProcessorId(String processorId) {
        this.processorId = processorId == null ? null : processorId.trim();
    }

    public Date getGmtInvalid() {
        return gmtInvalid;
    }

    public void setGmtInvalid(Date gmtInvalid) {
        this.gmtInvalid = gmtInvalid;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }

    public String getSubmitId() {
        return submitId;
    }

    public void setSubmitId(String submitId) {
        this.submitId = submitId == null ? null : submitId.trim();
    }

    public String getFreezeFlag() {
        return freezeFlag;
    }

    public void setFreezeFlag(String freezeFlag) {
        this.freezeFlag = freezeFlag;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }
}