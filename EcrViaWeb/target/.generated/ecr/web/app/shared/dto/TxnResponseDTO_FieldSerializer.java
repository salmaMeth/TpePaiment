package ecr.web.app.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class TxnResponseDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getCmb_TransactionType(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::cmb_TransactionType;
  }-*/;
  
  private static native void setCmb_TransactionType(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::cmb_TransactionType = value;
  }-*/;
  
  private static native java.lang.Long getId(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::id;
  }-*/;
  
  private static native void setId(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.Long value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::id = value;
  }-*/;
  
  private static native java.lang.String getTxtAr_HostMg(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txtAr_HostMg;
  }-*/;
  
  private static native void setTxtAr_HostMg(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txtAr_HostMg = value;
  }-*/;
  
  private static native java.lang.String getTxt_Aid(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_Aid;
  }-*/;
  
  private static native void setTxt_Aid(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_Aid = value;
  }-*/;
  
  private static native java.lang.String getTxt_AmLaInp1(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_AmLaInp1;
  }-*/;
  
  private static native void setTxt_AmLaInp1(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_AmLaInp1 = value;
  }-*/;
  
  private static native java.lang.String getTxt_AmLaInp2(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_AmLaInp2;
  }-*/;
  
  private static native void setTxt_AmLaInp2(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_AmLaInp2 = value;
  }-*/;
  
  private static native java.lang.String getTxt_AmLaInp3(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_AmLaInp3;
  }-*/;
  
  private static native void setTxt_AmLaInp3(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_AmLaInp3 = value;
  }-*/;
  
  private static native java.lang.String getTxt_AmLaInp4(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_AmLaInp4;
  }-*/;
  
  private static native void setTxt_AmLaInp4(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_AmLaInp4 = value;
  }-*/;
  
  private static native java.lang.String getTxt_Authoode(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_Authoode;
  }-*/;
  
  private static native void setTxt_Authoode(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_Authoode = value;
  }-*/;
  
  private static native java.lang.String getTxt_CardName(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_CardName;
  }-*/;
  
  private static native void setTxt_CardName(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_CardName = value;
  }-*/;
  
  private static native java.lang.String getTxt_Cash(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_Cash;
  }-*/;
  
  private static native void setTxt_Cash(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_Cash = value;
  }-*/;
  
  private static native java.lang.String getTxt_CashCeilingLimit(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_CashCeilingLimit;
  }-*/;
  
  private static native void setTxt_CashCeilingLimit(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_CashCeilingLimit = value;
  }-*/;
  
  private static native java.lang.String getTxt_CashElig(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_CashElig;
  }-*/;
  
  private static native void setTxt_CashElig(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_CashElig = value;
  }-*/;
  
  private static native java.lang.String getTxt_Ceiling(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_Ceiling;
  }-*/;
  
  private static native void setTxt_Ceiling(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_Ceiling = value;
  }-*/;
  
  private static native java.lang.String getTxt_CheckAuth(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_CheckAuth;
  }-*/;
  
  private static native void setTxt_CheckAuth(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_CheckAuth = value;
  }-*/;
  
  private static native java.lang.String getTxt_Currency(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_Currency;
  }-*/;
  
  private static native void setTxt_Currency(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_Currency = value;
  }-*/;
  
  private static native java.lang.String getTxt_CurrencySym(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_CurrencySym;
  }-*/;
  
  private static native void setTxt_CurrencySym(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_CurrencySym = value;
  }-*/;
  
  private static native java.lang.String getTxt_DateTxn(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_DateTxn;
  }-*/;
  
  private static native void setTxt_DateTxn(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_DateTxn = value;
  }-*/;
  
  private static native java.lang.String getTxt_DccAm(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_DccAm;
  }-*/;
  
  private static native void setTxt_DccAm(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_DccAm = value;
  }-*/;
  
  private static native java.lang.String getTxt_DccCurrExp(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_DccCurrExp;
  }-*/;
  
  private static native void setTxt_DccCurrExp(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_DccCurrExp = value;
  }-*/;
  
  private static native java.lang.String getTxt_DccCurrency(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_DccCurrency;
  }-*/;
  
  private static native void setTxt_DccCurrency(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_DccCurrency = value;
  }-*/;
  
  private static native java.lang.String getTxt_DonaAmount(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_DonaAmount;
  }-*/;
  
  private static native void setTxt_DonaAmount(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_DonaAmount = value;
  }-*/;
  
  private static native java.lang.String getTxt_EntryMethod(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_EntryMethod;
  }-*/;
  
  private static native void setTxt_EntryMethod(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_EntryMethod = value;
  }-*/;
  
  private static native java.lang.String getTxt_ExpiryDate(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_ExpiryDate;
  }-*/;
  
  private static native void setTxt_ExpiryDate(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_ExpiryDate = value;
  }-*/;
  
  private static native java.lang.String getTxt_FxExpApp(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_FxExpApp;
  }-*/;
  
  private static native void setTxt_FxExpApp(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_FxExpApp = value;
  }-*/;
  
  private static native java.lang.String getTxt_FxRateApp(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_FxRateApp;
  }-*/;
  
  private static native void setTxt_FxRateApp(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_FxRateApp = value;
  }-*/;
  
  private static native java.lang.String getTxt_IccFileName(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_IccFileName;
  }-*/;
  
  private static native void setTxt_IccFileName(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_IccFileName = value;
  }-*/;
  
  private static native java.lang.String getTxt_IccPrefName(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_IccPrefName;
  }-*/;
  
  private static native void setTxt_IccPrefName(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_IccPrefName = value;
  }-*/;
  
  private static native java.lang.String getTxt_IsDccTran(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_IsDccTran;
  }-*/;
  
  private static native void setTxt_IsDccTran(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_IsDccTran = value;
  }-*/;
  
  private static native java.lang.String getTxt_IsLoyTran(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_IsLoyTran;
  }-*/;
  
  private static native void setTxt_IsLoyTran(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_IsLoyTran = value;
  }-*/;
  
  private static native java.lang.String getTxt_MerID(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_MerID;
  }-*/;
  
  private static native void setTxt_MerID(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_MerID = value;
  }-*/;
  
  private static native java.lang.String getTxt_MerchantAdr1(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_MerchantAdr1;
  }-*/;
  
  private static native void setTxt_MerchantAdr1(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_MerchantAdr1 = value;
  }-*/;
  
  private static native java.lang.String getTxt_MerchantAdr2(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_MerchantAdr2;
  }-*/;
  
  private static native void setTxt_MerchantAdr2(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_MerchantAdr2 = value;
  }-*/;
  
  private static native java.lang.String getTxt_MerchantName(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_MerchantName;
  }-*/;
  
  private static native void setTxt_MerchantName(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_MerchantName = value;
  }-*/;
  
  private static native java.lang.String getTxt_MessageNum(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_MessageNum;
  }-*/;
  
  private static native void setTxt_MessageNum(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_MessageNum = value;
  }-*/;
  
  private static native java.lang.String getTxt_NewAdIp(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_NewAdIp;
  }-*/;
  
  private static native void setTxt_NewAdIp(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_NewAdIp = value;
  }-*/;
  
  private static native java.lang.String getTxt_Pan(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_Pan;
  }-*/;
  
  private static native void setTxt_Pan(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_Pan = value;
  }-*/;
  
  private static native java.lang.String getTxt_PanNum(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_PanNum;
  }-*/;
  
  private static native void setTxt_PanNum(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_PanNum = value;
  }-*/;
  
  private static native java.lang.String getTxt_PrintInfos(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_PrintInfos;
  }-*/;
  
  private static native void setTxt_PrintInfos(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_PrintInfos = value;
  }-*/;
  
  private static native java.lang.String getTxt_PrintMarker(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_PrintMarker;
  }-*/;
  
  private static native void setTxt_PrintMarker(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_PrintMarker = value;
  }-*/;
  
  private static native java.lang.String getTxt_ReceipNum(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_ReceipNum;
  }-*/;
  
  private static native void setTxt_ReceipNum(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_ReceipNum = value;
  }-*/;
  
  private static native java.lang.String getTxt_Receipt(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_Receipt;
  }-*/;
  
  private static native void setTxt_Receipt(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_Receipt = value;
  }-*/;
  
  private static native java.lang.String getTxt_RedeeAmou(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_RedeeAmou;
  }-*/;
  
  private static native void setTxt_RedeeAmou(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_RedeeAmou = value;
  }-*/;
  
  private static native java.lang.String getTxt_Reference(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_Reference;
  }-*/;
  
  private static native void setTxt_Reference(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_Reference = value;
  }-*/;
  
  private static native java.lang.String getTxt_ReqOutput(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_ReqOutput;
  }-*/;
  
  private static native void setTxt_ReqOutput(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_ReqOutput = value;
  }-*/;
  
  private static native java.lang.String getTxt_RespCode(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_RespCode;
  }-*/;
  
  private static native void setTxt_RespCode(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_RespCode = value;
  }-*/;
  
  private static native java.lang.String getTxt_StarDate(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_StarDate;
  }-*/;
  
  private static native void setTxt_StarDate(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_StarDate = value;
  }-*/;
  
  private static native java.lang.String getTxt_TerminalID(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_TerminalID;
  }-*/;
  
  private static native void setTxt_TerminalID(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_TerminalID = value;
  }-*/;
  
  private static native java.lang.String getTxt_TotalAmount(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_TotalAmount;
  }-*/;
  
  private static native void setTxt_TotalAmount(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_TotalAmount = value;
  }-*/;
  
  private static native java.lang.String getTxt_TrackData1(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_TrackData1;
  }-*/;
  
  private static native void setTxt_TrackData1(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_TrackData1 = value;
  }-*/;
  
  private static native java.lang.String getTxt_TrackData2(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_TrackData2;
  }-*/;
  
  private static native void setTxt_TrackData2(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_TrackData2 = value;
  }-*/;
  
  private static native java.lang.String getTxt_TrackData3(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_TrackData3;
  }-*/;
  
  private static native void setTxt_TrackData3(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_TrackData3 = value;
  }-*/;
  
  private static native java.lang.String getTxt_TrackStatus1(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_TrackStatus1;
  }-*/;
  
  private static native void setTxt_TrackStatus1(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_TrackStatus1 = value;
  }-*/;
  
  private static native java.lang.String getTxt_TrackStatus2(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_TrackStatus2;
  }-*/;
  
  private static native void setTxt_TrackStatus2(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_TrackStatus2 = value;
  }-*/;
  
  private static native java.lang.String getTxt_TrackStatus3(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_TrackStatus3;
  }-*/;
  
  private static native void setTxt_TrackStatus3(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_TrackStatus3 = value;
  }-*/;
  
  private static native java.lang.String getTxt_TranAmou(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_TranAmou;
  }-*/;
  
  private static native void setTxt_TranAmou(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_TranAmou = value;
  }-*/;
  
  private static native java.lang.String getTxt_TranSta(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_TranSta;
  }-*/;
  
  private static native void setTxt_TranSta(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_TranSta = value;
  }-*/;
  
  private static native java.lang.String getTxt_TranTyp(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_TranTyp;
  }-*/;
  
  private static native void setTxt_TranTyp(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_TranTyp = value;
  }-*/;
  
  private static native java.lang.String getTxt_amountinp1(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_amountinp1;
  }-*/;
  
  private static native void setTxt_amountinp1(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_amountinp1 = value;
  }-*/;
  
  private static native java.lang.String getTxt_amountinp2(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_amountinp2;
  }-*/;
  
  private static native void setTxt_amountinp2(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_amountinp2 = value;
  }-*/;
  
  private static native java.lang.String getTxt_amountinp3(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_amountinp3;
  }-*/;
  
  private static native void setTxt_amountinp3(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_amountinp3 = value;
  }-*/;
  
  private static native java.lang.String getTxt_amountinp4(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_amountinp4;
  }-*/;
  
  private static native void setTxt_amountinp4(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_amountinp4 = value;
  }-*/;
  
  private static native java.lang.String getTxt_cAmount(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_cAmount;
  }-*/;
  
  private static native void setTxt_cAmount(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_cAmount = value;
  }-*/;
  
  private static native java.lang.String getTxt_cAmount1Info(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_cAmount1Info;
  }-*/;
  
  private static native void setTxt_cAmount1Info(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_cAmount1Info = value;
  }-*/;
  
  private static native java.lang.String getTxt_cMessageNumber(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_cMessageNumber;
  }-*/;
  
  private static native void setTxt_cMessageNumber(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_cMessageNumber = value;
  }-*/;
  
  private static native java.lang.String getTxt_cReference(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_cReference;
  }-*/;
  
  private static native void setTxt_cReference(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_cReference = value;
  }-*/;
  
  private static native java.lang.String getTxt_cashAmount(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_cashAmount;
  }-*/;
  
  private static native void setTxt_cashAmount(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_cashAmount = value;
  }-*/;
  
  private static native java.lang.String getTxt_cvm(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_cvm;
  }-*/;
  
  private static native void setTxt_cvm(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_cvm = value;
  }-*/;
  
  private static native java.lang.String getTxt_msginp(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_msginp;
  }-*/;
  
  private static native void setTxt_msginp(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_msginp = value;
  }-*/;
  
  private static native java.lang.String getTxt_refinp(ecr.web.app.shared.dto.TxnResponseDTO instance) /*-{
    return instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_refinp;
  }-*/;
  
  private static native void setTxt_refinp(ecr.web.app.shared.dto.TxnResponseDTO instance, java.lang.String value) 
  /*-{
    instance.@ecr.web.app.shared.dto.TxnResponseDTO::txt_refinp = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, ecr.web.app.shared.dto.TxnResponseDTO instance) throws SerializationException {
    com.google.gwt.core.client.impl.WeakMapping.set(instance, "server-enhanced-data-1", streamReader.readString());
    setCmb_TransactionType(instance, streamReader.readString());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setTxtAr_HostMg(instance, streamReader.readString());
    setTxt_Aid(instance, streamReader.readString());
    setTxt_AmLaInp1(instance, streamReader.readString());
    setTxt_AmLaInp2(instance, streamReader.readString());
    setTxt_AmLaInp3(instance, streamReader.readString());
    setTxt_AmLaInp4(instance, streamReader.readString());
    setTxt_Authoode(instance, streamReader.readString());
    setTxt_CardName(instance, streamReader.readString());
    setTxt_Cash(instance, streamReader.readString());
    setTxt_CashCeilingLimit(instance, streamReader.readString());
    setTxt_CashElig(instance, streamReader.readString());
    setTxt_Ceiling(instance, streamReader.readString());
    setTxt_CheckAuth(instance, streamReader.readString());
    setTxt_Currency(instance, streamReader.readString());
    setTxt_CurrencySym(instance, streamReader.readString());
    setTxt_DateTxn(instance, streamReader.readString());
    setTxt_DccAm(instance, streamReader.readString());
    setTxt_DccCurrExp(instance, streamReader.readString());
    setTxt_DccCurrency(instance, streamReader.readString());
    setTxt_DonaAmount(instance, streamReader.readString());
    setTxt_EntryMethod(instance, streamReader.readString());
    setTxt_ExpiryDate(instance, streamReader.readString());
    setTxt_FxExpApp(instance, streamReader.readString());
    setTxt_FxRateApp(instance, streamReader.readString());
    setTxt_IccFileName(instance, streamReader.readString());
    setTxt_IccPrefName(instance, streamReader.readString());
    setTxt_IsDccTran(instance, streamReader.readString());
    setTxt_IsLoyTran(instance, streamReader.readString());
    setTxt_MerID(instance, streamReader.readString());
    setTxt_MerchantAdr1(instance, streamReader.readString());
    setTxt_MerchantAdr2(instance, streamReader.readString());
    setTxt_MerchantName(instance, streamReader.readString());
    setTxt_MessageNum(instance, streamReader.readString());
    setTxt_NewAdIp(instance, streamReader.readString());
    setTxt_Pan(instance, streamReader.readString());
    setTxt_PanNum(instance, streamReader.readString());
    setTxt_PrintInfos(instance, streamReader.readString());
    setTxt_PrintMarker(instance, streamReader.readString());
    setTxt_ReceipNum(instance, streamReader.readString());
    setTxt_Receipt(instance, streamReader.readString());
    setTxt_RedeeAmou(instance, streamReader.readString());
    setTxt_Reference(instance, streamReader.readString());
    setTxt_ReqOutput(instance, streamReader.readString());
    setTxt_RespCode(instance, streamReader.readString());
    setTxt_StarDate(instance, streamReader.readString());
    setTxt_TerminalID(instance, streamReader.readString());
    setTxt_TotalAmount(instance, streamReader.readString());
    setTxt_TrackData1(instance, streamReader.readString());
    setTxt_TrackData2(instance, streamReader.readString());
    setTxt_TrackData3(instance, streamReader.readString());
    setTxt_TrackStatus1(instance, streamReader.readString());
    setTxt_TrackStatus2(instance, streamReader.readString());
    setTxt_TrackStatus3(instance, streamReader.readString());
    setTxt_TranAmou(instance, streamReader.readString());
    setTxt_TranSta(instance, streamReader.readString());
    setTxt_TranTyp(instance, streamReader.readString());
    setTxt_amountinp1(instance, streamReader.readString());
    setTxt_amountinp2(instance, streamReader.readString());
    setTxt_amountinp3(instance, streamReader.readString());
    setTxt_amountinp4(instance, streamReader.readString());
    setTxt_cAmount(instance, streamReader.readString());
    setTxt_cAmount1Info(instance, streamReader.readString());
    setTxt_cMessageNumber(instance, streamReader.readString());
    setTxt_cReference(instance, streamReader.readString());
    setTxt_cashAmount(instance, streamReader.readString());
    setTxt_cvm(instance, streamReader.readString());
    setTxt_msginp(instance, streamReader.readString());
    setTxt_refinp(instance, streamReader.readString());
    
  }
  
  public static ecr.web.app.shared.dto.TxnResponseDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new ecr.web.app.shared.dto.TxnResponseDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, ecr.web.app.shared.dto.TxnResponseDTO instance) throws SerializationException {
    streamWriter.writeString((String) com.google.gwt.core.client.impl.WeakMapping.get(instance, "server-enhanced-data-1"));
    streamWriter.writeString(getCmb_TransactionType(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getTxtAr_HostMg(instance));
    streamWriter.writeString(getTxt_Aid(instance));
    streamWriter.writeString(getTxt_AmLaInp1(instance));
    streamWriter.writeString(getTxt_AmLaInp2(instance));
    streamWriter.writeString(getTxt_AmLaInp3(instance));
    streamWriter.writeString(getTxt_AmLaInp4(instance));
    streamWriter.writeString(getTxt_Authoode(instance));
    streamWriter.writeString(getTxt_CardName(instance));
    streamWriter.writeString(getTxt_Cash(instance));
    streamWriter.writeString(getTxt_CashCeilingLimit(instance));
    streamWriter.writeString(getTxt_CashElig(instance));
    streamWriter.writeString(getTxt_Ceiling(instance));
    streamWriter.writeString(getTxt_CheckAuth(instance));
    streamWriter.writeString(getTxt_Currency(instance));
    streamWriter.writeString(getTxt_CurrencySym(instance));
    streamWriter.writeString(getTxt_DateTxn(instance));
    streamWriter.writeString(getTxt_DccAm(instance));
    streamWriter.writeString(getTxt_DccCurrExp(instance));
    streamWriter.writeString(getTxt_DccCurrency(instance));
    streamWriter.writeString(getTxt_DonaAmount(instance));
    streamWriter.writeString(getTxt_EntryMethod(instance));
    streamWriter.writeString(getTxt_ExpiryDate(instance));
    streamWriter.writeString(getTxt_FxExpApp(instance));
    streamWriter.writeString(getTxt_FxRateApp(instance));
    streamWriter.writeString(getTxt_IccFileName(instance));
    streamWriter.writeString(getTxt_IccPrefName(instance));
    streamWriter.writeString(getTxt_IsDccTran(instance));
    streamWriter.writeString(getTxt_IsLoyTran(instance));
    streamWriter.writeString(getTxt_MerID(instance));
    streamWriter.writeString(getTxt_MerchantAdr1(instance));
    streamWriter.writeString(getTxt_MerchantAdr2(instance));
    streamWriter.writeString(getTxt_MerchantName(instance));
    streamWriter.writeString(getTxt_MessageNum(instance));
    streamWriter.writeString(getTxt_NewAdIp(instance));
    streamWriter.writeString(getTxt_Pan(instance));
    streamWriter.writeString(getTxt_PanNum(instance));
    streamWriter.writeString(getTxt_PrintInfos(instance));
    streamWriter.writeString(getTxt_PrintMarker(instance));
    streamWriter.writeString(getTxt_ReceipNum(instance));
    streamWriter.writeString(getTxt_Receipt(instance));
    streamWriter.writeString(getTxt_RedeeAmou(instance));
    streamWriter.writeString(getTxt_Reference(instance));
    streamWriter.writeString(getTxt_ReqOutput(instance));
    streamWriter.writeString(getTxt_RespCode(instance));
    streamWriter.writeString(getTxt_StarDate(instance));
    streamWriter.writeString(getTxt_TerminalID(instance));
    streamWriter.writeString(getTxt_TotalAmount(instance));
    streamWriter.writeString(getTxt_TrackData1(instance));
    streamWriter.writeString(getTxt_TrackData2(instance));
    streamWriter.writeString(getTxt_TrackData3(instance));
    streamWriter.writeString(getTxt_TrackStatus1(instance));
    streamWriter.writeString(getTxt_TrackStatus2(instance));
    streamWriter.writeString(getTxt_TrackStatus3(instance));
    streamWriter.writeString(getTxt_TranAmou(instance));
    streamWriter.writeString(getTxt_TranSta(instance));
    streamWriter.writeString(getTxt_TranTyp(instance));
    streamWriter.writeString(getTxt_amountinp1(instance));
    streamWriter.writeString(getTxt_amountinp2(instance));
    streamWriter.writeString(getTxt_amountinp3(instance));
    streamWriter.writeString(getTxt_amountinp4(instance));
    streamWriter.writeString(getTxt_cAmount(instance));
    streamWriter.writeString(getTxt_cAmount1Info(instance));
    streamWriter.writeString(getTxt_cMessageNumber(instance));
    streamWriter.writeString(getTxt_cReference(instance));
    streamWriter.writeString(getTxt_cashAmount(instance));
    streamWriter.writeString(getTxt_cvm(instance));
    streamWriter.writeString(getTxt_msginp(instance));
    streamWriter.writeString(getTxt_refinp(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return ecr.web.app.shared.dto.TxnResponseDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    ecr.web.app.shared.dto.TxnResponseDTO_FieldSerializer.deserialize(reader, (ecr.web.app.shared.dto.TxnResponseDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    ecr.web.app.shared.dto.TxnResponseDTO_FieldSerializer.serialize(writer, (ecr.web.app.shared.dto.TxnResponseDTO)object);
  }
  
}
