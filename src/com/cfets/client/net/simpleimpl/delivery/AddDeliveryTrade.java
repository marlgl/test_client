package com.cfets.client.net.simpleimpl.delivery;

import imix.field.*;
import imix.imix10.ExecutionReport;
import imix.imix10.component.MiscFeesGrp;
import imix.imix10.component.Parties;
import imix.imix10.component.PtysSubGrp;
import imix.imix10.component.RelatedReferenceGrp;


/**
 * 3.3.2.3 择期交割交易 - 新增
 */
public class AddDeliveryTrade {
    private ExecutionReport message;

    public AddDeliveryTrade() {
        message = new ExecutionReport();
        buildImixProposal();
    }

    private void buildImixProposal() {
    	//<!-- 568 TradeRequestID	请求号 -->
        TradeRequestID tradeRequestID = new TradeRequestID("20");
        message.set(tradeRequestID);
        
        /*<!-- 成交单状态
		FMS
			A：新交易
			U：交易被修改
			D：交易被删除
			R：反向交易，用来通知周边系统，自己的原交易被删除。
			M：已到期交易，交易全部完成交割后，由A状态置为M状态
		IMIX
			0-新交易
			1-交易被修改
			2-交易被删除
			R：反向交易，用来通知周边系统，自己的原交易被删除。
			M：已到期交易，交易全部完成交割后，由A状态置为M状态
	 	-->*/
        DealTransType field10105 = new DealTransType('0');//成交单状态
        message.set(field10105);
        MarketIndicator field10176 = new MarketIndicator("14");//14-外汇远期市场
        message.set(field10176);
        
        /*
         * 暂时用 11064，待IMIX协议确定
         * <!-- ??? XXX DeliveryIndicator 是否交割交易 optn_dlvry_deal_indc -->
         * <!-- 11064 DeliveryStatus 2	结算状态 -->
         */
        DeliveryStatus fieldTemp = new DeliveryStatus("Test");
        message.set(fieldTemp);
        
        /*
         * 743			DeliveryDate	20120719	交割日期
         * XXX			DeliveryTime	15:17:36	交割时间
         */
        DeliveryDate field743 = new DeliveryDate("20130306");//交割日期
        message.set(field743);
        TradeTime field10318 = new TradeTime("14:05:00");//交割时间
        message.set(field10318);
        
        Side field54 = new Side('1');//交易方向
        message.set(field54);
        
        Symbol field55 = new Symbol("USD.CNY");//55 Symbol USD.CNY 货币对
        message.set(field55);
        
        Currency field15 = new Currency("USD");//<!-- 15 Currency USD 交易货币 -->
        message.set(field15);
        SettlCurrency field120 = new SettlCurrency("CNY");//<!-- 120 SettlCurrency 对应货币 -->
        message.set(field120);
        
        LastQty field32 = new LastQty("1000000.00");//<!-- 32 LastQty	700000 交易货币金额(货币1金额) -->
        message.set(field32);
        CalculatedCcyLastQty field1056 = new CalculatedCcyLastQty("6210000.00");
        message.set(field1056);
       
        RelatedReferenceGrp.NoRelatedReference component10866 = new RelatedReferenceGrp.NoRelatedReference();
        //<!-- 10869	RelatedReferenceType	2  原始交易修改删除链接的交易流水号 -->
        RelatedReferenceType field10869_1 = new RelatedReferenceType(2);
        //!-- 10535 RelatedReference -->
        RelatedReference field10535_1 = new RelatedReference("5.1.1000231");
        component10866.set(field10535_1);
        component10866.set(field10869_1);
        
        //<!-- 10869	RelatedReferenceType ???  交割流水号 -->
        RelatedReferenceType field10869_2 = new RelatedReferenceType(3);
        //!-- 10535 RelatedReference -->
        RelatedReference field10535_2 = new RelatedReference("5.1.3906359");
        component10866.set(field10535_2);
        component10866.set(field10869_2);
        message.addGroup(component10866);
        
        
        MiscFeesGrp.NoMiscFees component136 = new MiscFeesGrp.NoMiscFees();
        MiscFeeAmt field137_1 = new MiscFeeAmt("0");
        FeeRateType field10923_1 = new FeeRateType('4');
        FeeRate	field10405_1 = new FeeRate("1.218090");
        component136.set(field137_1);
        component136.set(field10923_1);
        component136.set(field10405_1);
        message.addGroup(component136);

        Parties.NoPartyIDs component453 = new Parties.NoPartyIDs();
        PartyID field448_1 = new PartyID("69");//本方机构编码
        PtysSubGrp.NoPartySubIDs component802_1 = new PtysSubGrp.NoPartySubIDs();
        PartySubID field523_14 = new PartySubID("0");
        PartySubIDType field803_14 = new PartySubIDType(168);//分支机构号
        component802_1.set(field523_14);
        component802_1.set(field803_14);
        
        PartySubID field523_15 = new PartySubID("1");
        PartySubIDType field803_15 = new PartySubIDType(135);//机构号
        component802_1.set(field523_15);
        component802_1.set(field803_15);
        
        component453.addGroup(component802_1);
        component453.set(field448_1);
        
        message.addGroup(component453);

        message.toString();
    }

    public ExecutionReport getMessage() {
        return this.message;
    }
}
