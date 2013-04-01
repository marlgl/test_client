package com.cfets.client.net.simpleimpl.delivery;

import imix.field.*;
import imix.imix10.ExecutionReport;
import imix.imix10.component.Parties;
import imix.imix10.component.PtysSubGrp;
import imix.imix10.component.RelatedReferenceGrp;

/**
 * Created with IntelliJ IDEA.
 * User: t430
 * Date: 13-3-4
 * Time: 下午9:16
 */
public class DeleteDeliveryTrade {
    private ExecutionReport message;

    public DeleteDeliveryTrade() {
        message = new ExecutionReport();
        buildImixProposal();
    }

    private void buildImixProposal() {
        MarketIndicator field10176 = new MarketIndicator("14");//银行间即期交易-Forward
        message.set(field10176);
        DealTransType field10105 = new DealTransType('2');//成交单状态 2：删除
        message.set(field10105);
        
        DealID field10041 = new DealID("qixin3020");//接口第三方交易编号
        message.set(field10041);
        
        //<!-- 568 TradeRequestID	请求号 -->
        TradeRequestID tradeRequestID = new TradeRequestID("30");
        message.set(tradeRequestID);
        
        /*
         * 暂时用 11064，待IMIX协议确定
         * <!-- ??? XXX DeliveryIndicator 是否交割交易 optn_dlvry_deal_indc -->
         * <!-- 11064 DeliveryStatus 2	结算状态 -->
         */
        DeliveryStatus fieldTemp = new DeliveryStatus("Test");
        message.set(fieldTemp);
        
        /* <!-- 10869	RelatedReferenceType ???  交割流水号 - 接口第三方交割交易编号 --> */
        RelatedReferenceGrp.NoRelatedReference component10866 = new RelatedReferenceGrp.NoRelatedReference();
        //<!-- 10869	RelatedReferenceType ???  交割流水号 -->
        RelatedReferenceType field10869_2 = new RelatedReferenceType(3);
        //!-- 10535 RelatedReference -->
        RelatedReference field10535_2 = new RelatedReference("5.1.3906359");
        component10866.set(field10535_2);
        component10866.set(field10869_2);
        message.addGroup(component10866);

        Parties.NoPartyIDs component453 = new Parties.NoPartyIDs();
        PartyID field448_1 = new PartyID("TEST BANK");//本方机构编码
        component453.setField(field448_1);
        
        PtysSubGrp.NoPartySubIDs component802_1 = new PtysSubGrp.NoPartySubIDs();
        PartySubID field523_11 = new PartySubID("0");
        PartySubIDType field803_11 = new PartySubIDType(168);//分支机构号
        component802_1.set(field523_11);
        component802_1.set(field803_11);
        component453.addGroup(component802_1);
        
        PartySubID field523_12 = new PartySubID("1");
        PartySubIDType field803_12 = new PartySubIDType(135);//机构号
        component802_1.set(field523_12);
        component802_1.set(field803_12);
        component453.addGroup(component802_1);
        
        message.addGroup(component453);

        message.toString();
    }

    public ExecutionReport getMessage() {
        return this.message;
    }
}
