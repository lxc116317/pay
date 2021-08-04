package com.example.alipaydemo.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PayVo {


    // 单号
    private String out_trade_no;
    // 总金额
    private String total_amount;
    // 订单名称
    private String subject;
    // 订单描述
    private String body;
    // 销售产品代码
    // 1.电脑网站支付产品alipay.trade.page.pay接口中，product_code为：FAST_INSTANT_TRADE_PAY
    // 2.手机网站支付产品alipay.trade.wap.pay接口中，product_code为：QUICK_WAP_WAY
    // 3.当面付条码支付产品alipay.trade.pay接口中，product_code为：FACE_TO_FACE_PAYMENT
    // 4.APP支付产品alipay.trade.app.pay接口中，product_code为：QUICK_MSECURITY_PAY
    private String product_code;


    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }
}
