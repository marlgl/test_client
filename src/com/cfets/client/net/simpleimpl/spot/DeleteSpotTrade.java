package com.cfets.client.net.simpleimpl.spot;

import imix.field.*;
import imix.imix10.ExecutionReport;
import imix.imix10.component.Parties;
import imix.imix10.component.PtysSubGrp;

/**
 * IMIX即期交易删除
 * Created with IntelliJ IDEA.
 * User: qixin
 * Date: 13-2-27
 * Time: 上午11:18
 */
public class DeleteSpotTrade {
    private ExecutionReport message;

    public DeleteSpotTrade() {
        message = new ExecutionReport();
        buildIMixProposal();
    }

    private void buildIMixProposal() {
        MarketIndicator field10176 = new MarketIndicator("12");//银行间即期交易-Spot
        message.set(field10176);
        DealTransType field10105 = new DealTransType('2');//成交单状态 2：删除
        message.set(field10105);
        DealID field10041 = new DealID("qixin3013");//接口第三方交易编号
        message.set(field10041);
        TradeRequestID tradeRequestID = new TradeRequestID("30");
        message.set(tradeRequestID);

        Parties.NoPartyIDs component453 = new Parties.NoPartyIDs();
        PartyID field448_1 = new PartyID("TEST BANK");//本方机构编码
        PartyRole field452_1 = new PartyRole(114);//受市方Market-Taker
        PtysSubGrp.NoPartySubIDs component802_1 = new PtysSubGrp.NoPartySubIDs();
        PartySubID field523_11 = new PartySubID("0");
        PartySubIDType field803_11 = new PartySubIDType(168);//分支机构号
        PartySubID field523_12 = new PartySubID("1");
        PartySubIDType field803_12 = new PartySubIDType(135);//机构号
        component802_1.set(field523_11);
        component802_1.set(field803_11);
        component453.addGroup(component802_1);
        component802_1.set(field523_12);
        component802_1.set(field803_12);
        component453.addGroup(component802_1);
        component453.setField(field448_1);
        component453.setField(field452_1);
        message.addGroup(component453);

        message.toString();
    }

    public ExecutionReport getMessage() {
        return this.message;
    }
}
