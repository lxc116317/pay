package com.example.alipaydemo.config;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author: ZhangXiang
 * @dare: 2021/4/19 19:55
 * @description:
 */
@Configuration
@ConfigurationProperties(prefix = "alipay")
@NoArgsConstructor
@AllArgsConstructor
public class AlipayConfig {

    // 应用ID，您的APPID
    private String appId;

    // 商户私钥，您的PKCS8格式RSA2私钥
    private String appPrivateKey;

    // 支付宝公钥，对应APPID下的支付宝公钥。
    private String alipayPublicKey;

    // 服务器异步通知页面路径
    private String notifyUrl;

    // 页面跳转同步通知页面路径(支付成功后返回的页面)
    private String returnUrl;

    // 签名方式
    private String signType;

    // 支付宝网关
    private String getWayUrl;

    // 支付宝网关协议
    private String protocol;

    // 支付宝网关主机地址
    private String gatewayHost;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppPrivateKey() {
        return appPrivateKey;
    }

    public void setAppPrivateKey(String appPrivateKey) {
        this.appPrivateKey = appPrivateKey;
    }

    public String getAlipayPublicKey() {
        return alipayPublicKey;
    }

    public void setAlipayPublicKey(String alipayPublicKey) {
        this.alipayPublicKey = alipayPublicKey;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getGetWayUrl() {
        return getWayUrl;
    }

    public void setGetWayUrl(String getWayUrl) {
        this.getWayUrl = getWayUrl;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getGatewayHost() {
        return gatewayHost;
    }

    public void setGatewayHost(String gatewayHost) {
        this.gatewayHost = gatewayHost;
    }
}
