package com.cfets.client.net.simpleimpl.forward;

import imix.field.*;
import imix.imix10.ExecutionReport;
import imix.imix10.component.*;

/**
 * IMIX远期交易新增
 * Created with IntelliJ IDEA.
 * User: qixin
 * Date: 13-3-1
 * Time: 下午4:48
 */
public class AddForwardTradeTest {
    private ExecutionReport message;

    public AddForwardTradeTest() {
        message = new ExecutionReport();
        buildIMixProposal();
    }

    private void buildIMixProposal() {
//        DealSerialNo field10019 = new DealSerialNo("201207190000000294");//成交流水号
//        message.set(field10019);
        TradeRequestID tradeRequestID = new TradeRequestID("20");
        message.set(tradeRequestID);
        MarketActionInitiato field11071 = new MarketActionInitiato("0");
        message.set(field11071);
        SecurityID field48 = new SecurityID("EUR.USD");//USD/CAD 货币对
        message.set(field48);
        SpotDate field10296 = new SpotDate("20121023");
        message.set(field10296);
        TrdType field828 = new TrdType("1");
        message.set(field828);

        Currency1 field10064 = new Currency1("EUR");//交易货币
        message.set(field10064);
        Currency2 field10065 = new Currency2("USD");//对应货币
        message.set(field10065);
        Side field54 = new Side('1');//交易方向
        message.set(field54);
        DealTransType field10105 = new DealTransType('0');//成交单状态
        message.set(field10105);
        ExecID field17 = new ExecID("5.1.3747522");//业务成交编号
        message.set(field17);
        TradeDate field75 = new TradeDate("20111231");//交易日期
        message.set(field75);
        TradeTime field10318 = new TradeTime("11:15:34");//交易时间
        message.set(field10318);
        SettlDate field64 = new SettlDate("20121023");//起息日
        message.set(field64);
        LastSpotRate field194 = new LastSpotRate("1.3416");//即期成交汇率
        message.set(field194);
        PrincipalPaymentRate field10241 = new PrincipalPaymentRate("1.3410");//即期成本汇率
        LastPx field31 = new LastPx("1.218094");
        message.set(field31);
        message.set(field10241);
        TrdPurpose field10993 = new TrdPurpose(4);//交易目的
        message.set(field10993);
        TradeInstrument field10315 = new TradeInstrument('6');
        message.set(field10315);
        TradeMethod field10317= new TradeMethod(6);
        message.set(field10317);
//        IntervenceDate field10832 = new IntervenceDate("20120719");//进入系统日期
//        message.set(field10832);
//        AssignStatus field11058 = new AssignStatus("0");
//        message.set(field11058);
        LastQty field32 = new LastQty("700000");
        message.set(field32);
        CalculatedCcyLastQty field1056 = new CalculatedCcyLastQty("1341600");
        message.set(field1056);
        DealID field10041 = new DealID("hh100100");
        message.set(field10041);
//        TradeMethod
//        TradeInstrument
        MarketIndicator field10176 = new MarketIndicator("14");//银行间即期交易-Forward
        message.set(field10176);
        DataSourceString field10687 = new DataSourceString("E");
        message.set(field10687);
        MarketID field1301 = new MarketID("B");
        message.set(field1301);
//        NetGrossInd
//        NoUsernames
        LiquidatIndicator field11057 = new LiquidatIndicator("0");//是否允许送后台清算
        message.set(field11057);
//        TradeSubType
//        ComplexEventStartTime
//        UpdateTime
        RiskLastQty field10248 = new RiskLastQty("700000");//折美元金额
        message.set(field10248);
        Text field58 = new Text("asdff");
        message.set(field58);
        MaturityDate field541 = new MaturityDate("20121023");
        message.set(field541);
        SettlType field63 = new SettlType("3M");
        message.set(field63);

        MiscFeesGrp.NoMiscFees component136 = new MiscFeesGrp.NoMiscFees();
        MiscFeeAmt field137_1 = new MiscFeeAmt("0");
        FeeRateType field10923_1 = new FeeRateType('4');
        FeeRate	field10405_1 = new FeeRate("1.218090");
        component136.set(field137_1);
        component136.set(field10923_1);
        component136.set(field10405_1);
        message.addGroup(component136);

        component136.clear();
        MiscFeeAmt field137_2 = new MiscFeeAmt("0");
        FeeRateType field10923_2 = new FeeRateType('5');
        FeeRate	field10405_2 = new FeeRate("1.218090");
        component136.set(field137_2);
        component136.set(field10923_2);
        component136.set(field10405_2);
        message.addGroup(component136);

        component136.clear();
        MiscFeeAmt field137_3 = new MiscFeeAmt("0");
        FeeRateType field10923_3 = new FeeRateType('6');
        FeeRate	field10405_3 = new FeeRate("1.218090");
        component136.set(field137_3);
        component136.set(field10923_3);
        component136.set(field10405_3);
        message.addGroup(component136);

        SettlCurrGrp.NoCurrencies component10496 = new SettlCurrGrp.NoCurrencies();
        SettlCurrency field120_1 = new SettlCurrency("EUR");
        SettlCurrAmt field119_1 = new SettlCurrAmt("900000");
        SettledAmtType field11065_1 = new SettledAmtType("1");
        component10496.set(field120_1);
        component10496.set(field119_1);
        component10496.set(field11065_1);
        message.addGroup(component10496);

        component10496.clear();
        SettlCurrency field120_2 = new SettlCurrency("USD");
        SettlCurrAmt field119_2 = new SettlCurrAmt("1096284.6");
        SettledAmtType field11065_2 = new SettledAmtType("1");
        component10496.set(field120_2);
        component10496.set(field119_2);
        component10496.set(field11065_2);
        message.addGroup(component10496);


        LinkCurrGrp.NoLinkCurrency component11055 = new LinkCurrGrp.NoLinkCurrency();
//        SecurityID field48_1 = new SecurityID("USD.CNY");//货币对
        LinkSecurityID field11068_1 = new LinkSecurityID("1");
        LinkCurrency field11070_1 = new LinkCurrency("CNY");//交易的拆分货币
        LinkSymbol field11069_1 = new LinkSymbol("EUR.CNY");
        RelatedCurrRatType field11062_1 = new RelatedCurrRatType("0");
        RelatedCurrRate field11056_1 = new RelatedCurrRate("1.3459");//货币1对拆分货币的拆分汇率
        component11055.set(field11068_1);
        component11055.set(field11070_1);
        component11055.set(field11069_1);
        component11055.set(field11062_1);
        component11055.set(field11056_1);
        message.addGroup(component11055);

        component11055.clear();
        LinkSecurityID field11068_2 = new LinkSecurityID("2");
        LinkCurrency field11070_2 = new LinkCurrency("CNY");//交易的拆分货币
        LinkSymbol field11069_2 = new LinkSymbol("EUR.CNY");
        RelatedCurrRatType field11062_2 = new RelatedCurrRatType("1");
        RelatedCurrRate field11056_2 = new RelatedCurrRate("2.3459");//货币1对拆分货币的拆分汇率
        component11055.set(field11068_2);
        component11055.set(field11070_2);
        component11055.set(field11069_2);
        component11055.set(field11062_2);
        component11055.set(field11056_2);
        message.addGroup(component11055);

        component11055.clear();
        LinkSecurityID field11068_3 = new LinkSecurityID("3");
        LinkCurrency field11070_3 = new LinkCurrency("CNY");//交易的拆分货币
        LinkSymbol field11069_3 = new LinkSymbol("USD.CNY");
        component11055.set(field11068_3);
        component11055.set(field11070_3);
        component11055.set(field11069_3);
        message.addGroup(component11055);

//        DeliveryStatus//结算状态
//        PortfolioID//投组编号
        PortfolioName field10676 = new PortfolioName("IFDSJL");//投组名称
        message.set(field10676);
//        PortfolioStatus//投组交易状态
//        DealRltnType//成交关联类型
//        NoRelatedReference

        Parties.NoPartyIDs component453 = new Parties.NoPartyIDs();
        PartyID field448_1 = new PartyID("TEST BANK");//本方机构编码
        PartyRole field452_1 = new PartyRole(114);//受市方Market-Taker
        PtysSubGrp.NoPartySubIDs component802_1 = new PtysSubGrp.NoPartySubIDs();
        PartySubID field523_11 = new PartySubID("test.pdealer@test");
        PartySubIDType field803_11 = new PartySubIDType(101);//本方交易员姓名
        PartySubID field523_12 = new PartySubID("EBBC");
        PartySubIDType field803_12 = new PartySubIDType(102);//本方机构英文简称
        PartySubID field523_13 = new PartySubID("dfaf");
        PartySubIDType field803_13 = new PartySubIDType(125);//本方机构中文简称
        PartySubID field523_14 = new PartySubID("0");
        PartySubIDType field803_14 = new PartySubIDType(168);//分支机构代码
        PartySubID field523_15 = new PartySubID("2131");
        PartySubIDType field803_15 = new PartySubIDType(135);//分支机号
        Description field10434_1 = new Description("收款");
        Description field10434_2 = new Description("付款");

        PartySubID field523_16 = new PartySubID("USD");//本方收款账号货币
        PartySubIDType field803_16 = new PartySubIDType(138);
        PartySubID field523_17 = new PartySubID("EUR ACCOUNT");//本方收款账户英文名称
        PartySubIDType field803_17 = new PartySubIDType(23);
        PartySubID field523_18 = new PartySubID("EUR账户");//本方收款账户中文名称
        PartySubIDType field803_18 = new PartySubIDType(118);
        PartySubID field523_19 = new PartySubID("JPMORGAN CHASE BANK");//本方收款指定清算银行的英文名称
        PartySubIDType field803_19 = new PartySubIDType(110);
        PartySubID field523_110 = new PartySubID("JPMORGAN CHASE BANK");//本方收款指定清算银行的中文名称
        PartySubIDType field803_110 = new PartySubIDType(169);
        PartySubID field523_111 = new PartySubID("CHINA EVERBRIGHT BANK HEAD OFFICE BEIJING");//本方付款资金账号
        PartySubIDType field803_111 = new PartySubIDType(15);
        PartySubID field523_112 = new PartySubID("EVERCNBJXXX A/C:400208601");//本方收款大额支付系统行号
        PartySubIDType field803_112 = new PartySubIDType(150);
        PartySubID field523_113 = new PartySubID("EVERCNBJXXX A/C:400208601");//本方收款指定清算银行的SWIFT代码
        PartySubIDType field803_113 = new PartySubIDType(166);

        component802_1.set(field523_11);
        component802_1.set(field803_11);
        component453.addGroup(component802_1);
        component802_1.set(field523_12);
        component802_1.set(field803_12);
        component453.addGroup(component802_1);
        component802_1.set(field523_13);
        component802_1.set(field803_13);
        component453.addGroup(component802_1);
        component802_1.set(field523_14);
        component802_1.set(field803_14);
        component453.addGroup(component802_1);
        component802_1.set(field523_15);
        component802_1.set(field803_15);
        component453.addGroup(component802_1);
        component802_1.set(field523_16);
        component802_1.set(field10434_1);
        component802_1.set(field803_16);
        component453.addGroup(component802_1);
        component802_1.set(field523_17);
        component802_1.set(field10434_1);
        component802_1.set(field803_17);
        component453.addGroup(component802_1);
        component802_1.set(field523_18);
        component802_1.set(field10434_1);
        component802_1.set(field803_18);
        component453.addGroup(component802_1);
        component802_1.set(field523_19);
        component802_1.set(field10434_1);
        component802_1.set(field803_19);
        component453.addGroup(component802_1);
        component802_1.set(field523_110);
        component802_1.set(field10434_1);
        component802_1.set(field803_110);
        component453.addGroup(component802_1);
        component802_1.set(field523_111);
        component802_1.set(field10434_1);
        component802_1.set(field803_111);
        component453.addGroup(component802_1);
        component802_1.set(field523_112);
        component802_1.set(field10434_1);
        component802_1.set(field803_112);
        component453.addGroup(component802_1);
        component802_1.set(field523_113);
        component802_1.set(field10434_1);
        component802_1.set(field803_113);
        component453.addGroup(component802_1);
        component453.set(field448_1);
        component453.set(field452_1);
        message.addGroup(component453);

        component453.clear();
        component802_1.set(field523_11);
        component802_1.set(field803_11);
        component453.addGroup(component802_1);
        component802_1.set(field523_12);
        component802_1.set(field803_12);
        component453.addGroup(component802_1);
        component802_1.set(field523_13);
        component802_1.set(field803_13);
        component453.addGroup(component802_1);
        component802_1.set(field523_14);
        component802_1.set(field803_14);
        component453.addGroup(component802_1);
        component802_1.set(field523_15);
        component802_1.set(field803_15);
        component453.addGroup(component802_1);
        component802_1.set(field523_16);
        component802_1.set(field10434_2);
        component802_1.set(field803_16);
        component453.addGroup(component802_1);
        component802_1.set(field523_17);
        component802_1.set(field10434_2);
        component802_1.set(field803_17);
        component453.addGroup(component802_1);
        component802_1.set(field523_18);
        component802_1.set(field10434_2);
        component802_1.set(field803_18);
        component453.addGroup(component802_1);
        component802_1.set(field523_19);
        component802_1.set(field10434_2);
        component802_1.set(field803_19);
        component453.addGroup(component802_1);
        component802_1.set(field523_110);
        component802_1.set(field10434_2);
        component802_1.set(field803_110);
        component453.addGroup(component802_1);
        component802_1.set(field523_111);
        component802_1.set(field10434_2);
        component802_1.set(field803_111);
        component453.addGroup(component802_1);
        component802_1.set(field523_112);
        component802_1.set(field10434_2);
        component802_1.set(field803_112);
        component453.addGroup(component802_1);
        component802_1.set(field523_113);
        component802_1.set(field10434_2);
        component802_1.set(field803_113);
        component453.addGroup(component802_1);
        component453.set(field448_1);
        component453.set(field452_1);
        message.addGroup(component453);

        component453.clear();
        PartyID field448_2 = new PartyID("212121212121212121213");//对手方机构编码
        PartyRole field452_2 = new PartyRole(113);//做市方Market-Maker
        PtysSubGrp.NoPartySubIDs component802_2 = new PtysSubGrp.NoPartySubIDs();
        PartySubID field523_21 = new PartySubID("testa.dealer@testa");
        PartySubIDType field803_21 = new PartySubIDType(101);//对手方交易员姓名
        PartySubID field523_22 = new PartySubID("TESTA");
        PartySubIDType field803_22 = new PartySubIDType(102);//对手方机构英文简称
        PartySubID field523_23 = new PartySubID("gggg");
        PartySubIDType field803_23 = new PartySubIDType(125);//对手方机构中文简称
        PartySubID field523_24 = new PartySubID("gggggggg");
        PartySubIDType field803_24 = new PartySubIDType(168);//对手方机构编码

        PartySubID field523_25 = new PartySubID("USD");
        PartySubIDType field803_25 = new PartySubIDType(138);
        PartySubID field523_26 = new PartySubID("USD ACCOUNT");
        PartySubIDType field803_26 = new PartySubIDType(23);
        PartySubID field523_27 = new PartySubID("USD账户");
        PartySubIDType field803_27 = new PartySubIDType(118);
        PartySubID field523_28 = new PartySubID("BANK OF AMERICA,FRANKFURT");
        PartySubIDType field803_28 = new PartySubIDType(110);
        PartySubID field523_29 = new PartySubID("BANK OF AMERICA,FRANKFURT");
        PartySubIDType field803_29 = new PartySubIDType(169);
        PartySubID field523_30 = new PartySubID("CHINA EVERBRIGHT BANK HEAD OFFICE BEIJING");//本方付款资金账号
        PartySubIDType field803_30 = new PartySubIDType(15);
        PartySubID field523_31 = new PartySubID("PCBCCNBJ,601914943011");
        PartySubIDType field803_31 = new PartySubIDType(150);
        PartySubID field523_32 = new PartySubID("CHINA CONDTRUCTION BANK CORPRATION");
        PartySubIDType field803_32 = new PartySubIDType(166);
        component802_2.set(field523_21);
        component802_2.set(field803_21);
        component453.addGroup(component802_2);
        component802_2.set(field523_22);
        component802_2.set(field803_22);
        component453.addGroup(component802_2);
        component802_2.set(field523_23);
        component802_2.set(field803_23);
        component453.addGroup(component802_2);
        component802_2.set(field523_24);
        component802_2.set(field803_24);
        component453.addGroup(component802_2);
        component802_2.set(field523_25);
        component802_2.set(field10434_1);
        component802_2.set(field803_25);
        component453.addGroup(component802_2);
        component802_2.set(field523_26);
        component802_2.set(field10434_1);
        component802_2.set(field803_26);
        component453.addGroup(component802_2);
        component802_2.set(field523_27);
        component802_2.set(field10434_1);
        component802_2.set(field803_27);
        component453.addGroup(component802_2);
        component802_2.set(field523_28);
        component802_2.set(field10434_1);
        component802_2.set(field803_28);
        component453.addGroup(component802_2);
        component802_2.set(field523_29);
        component802_2.set(field10434_1);
        component802_2.set(field803_29);
        component453.addGroup(component802_2);
        component802_2.set(field523_30);
        component802_2.set(field10434_1);
        component802_2.set(field803_30);
        component453.addGroup(component802_2);
        component802_2.set(field523_31);
        component802_2.set(field10434_1);
        component802_2.set(field803_31);
        component453.addGroup(component802_2);
        component802_2.set(field523_32);
        component802_2.set(field10434_1);
        component802_2.set(field803_32);
        component453.addGroup(component802_2);
        component453.set(field448_2);
        component453.set(field452_2);
        message.addGroup(component453);

//        component453.clear();
//        PartyID field448_3 = new PartyID("TEST BANK");//机构编码
//        PartyRole field452_3 = new PartyRole(129);//付款方用
//
//        PtysSubGrp.NoPartySubIDs component802_3 = new PtysSubGrp.NoPartySubIDs();
//        PartySubID field523_31 = new PartySubID("USD");//本方付款账号货币
//        PartySubIDType field803_31 = new PartySubIDType(138);
//        PartySubID field523_32 = new PartySubID("USD ACCOUNT");//本方付款账户英文名称
//        PartySubIDType field803_32 = new PartySubIDType(23);
//        PartySubID field523_33 = new PartySubID("USD账户");//本方付款账户中文名称
//        PartySubIDType field803_33 = new PartySubIDType(118);
//        PartySubID field523_34 = new PartySubID("BANK OF CHINA");//本方付款指定清算银行的英文名称
//        PartySubIDType field803_34 = new PartySubIDType(110);
//        PartySubID field523_35 = new PartySubID("BANK OF CHINA");//本方付款指定清算银行的中文名称
//        PartySubIDType field803_35 = new PartySubIDType(169);
//        PartySubID field523_36 = new PartySubID("CHINA EVERBRIGHT BANK HEAD OFFICE BEIJING");//本方付款资金账号
//        PartySubIDType field803_36 = new PartySubIDType(15);
//        PartySubID field523_37 = new PartySubID("EVERCNBJXXX A/C:1001186004");//本方付款大额支付系统行号
//        PartySubIDType field803_37 = new PartySubIDType(150);
//        PartySubID field523_38 = new PartySubID("EVERCNBJXXX A/C:1001186004");//本方付款指定清算银行的SWIFT代码
//        PartySubIDType field803_38 = new PartySubIDType(166);
//        component802_3.set(field523_31);
//        component802_3.set(field803_31);
//        component453.addGroup(component802_3);
//        component802_3.set(field523_32);
//        component802_3.set(field803_32);
//        component453.addGroup(component802_3);
//        component802_3.set(field523_33);
//        component802_3.set(field803_33);
//        component453.addGroup(component802_3);
//        component802_3.set(field523_34);
//        component802_3.set(field803_34);
//        component453.addGroup(component802_3);
//        component802_3.set(field523_35);
//        component802_3.set(field803_35);
//        component453.addGroup(component802_3);
//        component802_3.set(field523_36);
//        component802_3.set(field803_36);
//        component453.addGroup(component802_3);
//        component802_3.set(field523_37);
//        component802_3.set(field803_37);
//        component453.addGroup(component802_3);
//        component802_3.set(field523_38);
//        component802_3.set(field803_38);
//        component453.addGroup(component802_3);
//        component453.set(field448_3);
//        component453.set(field452_3);
//        message.addGroup(component453);
//
//        component453.clear();
//        PartyID field448_4 = new PartyID("TEST BANK");//本方机构编码
//        PartyRole field452_4 = new PartyRole(130);//本方收款方用
//        PtysSubGrp.NoPartySubIDs component802_4 = new PtysSubGrp.NoPartySubIDs();
//        PartySubID field523_41 = new PartySubID("USD");//本方收款账号货币
//        PartySubIDType field803_41 = new PartySubIDType(138);
//        PartySubID field523_42 = new PartySubID("EUR ACCOUNT");//本方收款账户英文名称
//        PartySubIDType field803_42 = new PartySubIDType(23);
//        PartySubID field523_43 = new PartySubID("EUR账户");//本方收款账户中文名称
//        PartySubIDType field803_43 = new PartySubIDType(118);
//        PartySubID field523_44 = new PartySubID("JPMORGAN CHASE BANK");//本方收款指定清算银行的英文名称
//        PartySubIDType field803_44 = new PartySubIDType(110);
//        PartySubID field523_45 = new PartySubID("JPMORGAN CHASE BANK");//本方收款指定清算银行的中文名称
//        PartySubIDType field803_45 = new PartySubIDType(169);
//        PartySubID field523_46 = new PartySubID("CHINA EVERBRIGHT BANK HEAD OFFICE BEIJING");//本方付款资金账号
//        PartySubIDType field803_46 = new PartySubIDType(15);
//        PartySubID field523_47 = new PartySubID("EVERCNBJXXX A/C:400208601");//本方收款大额支付系统行号
//        PartySubIDType field803_47 = new PartySubIDType(150);
//        PartySubID field523_48 = new PartySubID("EVERCNBJXXX A/C:400208601");//本方收款指定清算银行的SWIFT代码
//        PartySubIDType field803_48 = new PartySubIDType(166);
//        component802_4.set(field523_41);
//        component802_4.set(field803_41);
//        component453.addGroup(component802_4);
//        component802_4.set(field523_42);
//        component802_4.set(field803_42);
//        component453.addGroup(component802_4);
//        component802_4.set(field523_43);
//        component802_4.set(field803_43);
//        component453.addGroup(component802_4);
//        component802_4.set(field523_44);
//        component802_4.set(field803_44);
//        component453.addGroup(component802_4);
//        component802_4.set(field523_45);
//        component802_4.set(field803_45);
//        component453.addGroup(component802_4);
//        component802_4.set(field523_46);
//        component802_4.set(field803_46);
//        component453.addGroup(component802_4);
//        component802_4.set(field523_47);
//        component802_4.set(field803_47);
//        component453.addGroup(component802_4);
//        component802_4.set(field523_48);
//        component802_4.set(field803_48);
//        component453.addGroup(component802_4);
//        component453.set(field448_4);
//        component453.set(field452_4);
//        message.addGroup(component453);
//
//        component453.clear();
//        PartyID field448_5 = new PartyID("212121212121212121213");//对手方机构编码
//        PartyRole field452_5 = new PartyRole(130);//对手放收款方用
//        imix.imix10.ExecutionReport.NoPartyIDs.NoPartySubIDs component802_5 = new imix.imix10.ExecutionReport.NoPartyIDs.NoPartySubIDs();
//        PartySubID field523_51 = new PartySubID("USD");
//        PartySubIDType field803_51 = new PartySubIDType(138);
//        PartySubID field523_52 = new PartySubID("USD ACCOUNT");
//        PartySubIDType field803_52 = new PartySubIDType(23);
//        PartySubID field523_53 = new PartySubID("USD账户");
//        PartySubIDType field803_53 = new PartySubIDType(118);
//        PartySubID field523_54 = new PartySubID("BANK OF AMERICA,FRANKFURT");
//        PartySubIDType field803_54 = new PartySubIDType(110);
//        PartySubID field523_55 = new PartySubID("BANK OF AMERICA,FRANKFURT");
//        PartySubIDType field803_55 = new PartySubIDType(169);
//        PartySubID field523_56 = new PartySubID("CHINA EVERBRIGHT BANK HEAD OFFICE BEIJING");//本方付款资金账号
//        PartySubIDType field803_56 = new PartySubIDType(15);
//        PartySubID field523_57 = new PartySubID("PCBCCNBJ,601914943011");
//        PartySubIDType field803_57 = new PartySubIDType(150);
//        PartySubID field523_58 = new PartySubID("CHINA CONDTRUCTION BANK CORPRATION");
//        PartySubIDType field803_58 = new PartySubIDType(166);
//        component802_5.set(field523_51);
//        component802_5.set(field803_51);
//        component453.addGroup(component802_5);
//        component802_5.set(field523_52);
//        component802_5.set(field803_52);
//        component453.addGroup(component802_5);
//        component802_5.set(field523_53);
//        component802_5.set(field803_53);
//        component453.addGroup(component802_5);
//        component802_5.set(field523_54);
//        component802_5.set(field803_54);
//        component453.addGroup(component802_5);
//        component802_5.set(field523_55);
//        component802_5.set(field803_55);
//        component453.addGroup(component802_5);
//        component802_5.set(field523_56);
//        component802_5.set(field803_56);
//        component453.addGroup(component802_5);
//        component802_5.set(field523_57);
//        component802_5.set(field803_57);
//        component453.addGroup(component802_5);
//        component802_5.set(field523_58);
//        component802_5.set(field803_58);
//        component453.addGroup(component802_5);
//        component453.set(field448_5);
//        component453.set(field452_5);
//        message.addGroup(component453);

        component453.clear();
        PartyID field448_6 = new PartyID("ZZ");//清算机构
        PartyRole field452_6 = new PartyRole(4);
        component453.set(field448_6);
        component453.set(field452_6);
        message.addGroup(component453);

        message.toString();
    }

    public ExecutionReport getMessage() {
        return this.message;
    }
}
