package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMemberCardQueryResponse;

/**
 * ALIPAY API: alipay.member.card.query request
 * 
 * @author auto create
 * @since 1.0, 2014-06-12 17:16:27
 */
public class AlipayMemberCardQueryRequest implements AlipayRequest<AlipayMemberCardQueryResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 支付宝会员卡卡号。

注意：
biz_card_no和card_user_info不能同时为空。
	 */
	private String bizCardNo;

	/** 
	* 发卡商户信息，json格式。
目前仅支持如下key：
merchantUniId：商户唯一标识
merchantUniIdType：支持以下3种取值。
  LOGON_ID：商户登录ID，邮箱或者手机号格式；
  UID：商户的支付宝用户号，以2088开头的16位纯数字组成；
  BINDING_MOBILE：商户支付宝账号绑定的手机号。

注意：
本参数主要用于发卡平台接入场景，request_from为PLATFORM时，不能为空。
	 */
	private String cardMerchantInfo;

	/** 
	* 持卡用户信息，json格式。
目前仅支持如下key：
userUniId：用户唯一标识
userUniIdType：支持以下3种取值。
  LOGON_ID：用户登录ID，邮箱或者手机号格式；
  UID：用户支付宝用户号，以2088开头的16位纯数字组成；
  BINDING_MOBILE：用户支付宝账号绑定的手机号。

注意：
biz_card_no和card_user_info不能同时为空。
	 */
	private String cardUserInfo;

	/** 
	* 扩展参数，json格式。
用于商户的特定业务信息的传递，只有商户与支付宝约定了传递此参数且约定了参数含义，此参数才有效。
	 */
	private String extInfo;

	/** 
	* 请求来源。
PLATFORM：发卡平台商
PARTNER：直联商户
	 */
	private String requestFrom;

	public void setBizCardNo(String bizCardNo) {
		this.bizCardNo = bizCardNo;
	}
	public String getBizCardNo() {
		return this.bizCardNo;
	}

	public void setCardMerchantInfo(String cardMerchantInfo) {
		this.cardMerchantInfo = cardMerchantInfo;
	}
	public String getCardMerchantInfo() {
		return this.cardMerchantInfo;
	}

	public void setCardUserInfo(String cardUserInfo) {
		this.cardUserInfo = cardUserInfo;
	}
	public String getCardUserInfo() {
		return this.cardUserInfo;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo() {
		return this.extInfo;
	}

	public void setRequestFrom(String requestFrom) {
		this.requestFrom = requestFrom;
	}
	public String getRequestFrom() {
		return this.requestFrom;
	}
	private String terminalType;
	private String terminalInfo;	
	private String prodCode;
	private String notifyUrl;
	private String returnUrl;
	private boolean needEncrypt=false;

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getApiVersion() {
		return this.apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}

    public String getTerminalType(){
    	return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    public String getTerminalInfo(){
    	return this.terminalInfo;
    }	

	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}

	public String getProdCode() {
		return this.prodCode; 
	}

	public String getApiMethodName() {
		return "alipay.member.card.query";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_card_no", this.bizCardNo);
		txtParams.put("card_merchant_info", this.cardMerchantInfo);
		txtParams.put("card_user_info", this.cardUserInfo);
		txtParams.put("ext_info", this.extInfo);
		txtParams.put("request_from", this.requestFrom);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<AlipayMemberCardQueryResponse> getResponseClass() {
		return AlipayMemberCardQueryResponse.class;
	}
	

    public boolean isNeedEncrypt() {
    
      return this.needEncrypt;
    }


    public void setNeedEncrypt(boolean needEncrypt) {
    
         this.needEncrypt=needEncrypt;
    }
	
	
}
