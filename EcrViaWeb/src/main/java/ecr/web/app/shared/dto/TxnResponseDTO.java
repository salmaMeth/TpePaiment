package ecr.web.app.shared.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_TransactionOut")
public class TxnResponseDTO implements Serializable{
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "cMessageNumber")
	private String txt_cMessageNumber;
	@Column(name = "cReference")
	private String txt_cReference;
	@Column(name = "cAmount")
	private String txt_cAmount;
	@Column(name = "TransactionType")
	private String cmb_TransactionType;
	@Column(name = "cAmount1Info")
	private String txt_cAmount1Info;
	@Column(name = "MerID")
	private String txt_MerID;
	@Column(name = "cashAmount")
	private String txt_cashAmount;
	@Column(name = "IsDccTran")
	private String txt_IsDccTran;
	@Column(name = "CheckAuth")
	private String txt_CheckAuth;
	@Column(name = "Receipt")
	private String txt_Receipt;
	@Column(name = "ExpiryDate")
	private String txt_ExpiryDate;
	@Column(name = "MerchantName")
	private String txt_MerchantName;
	@Column(name = "erchantAdr1")
	private String txt_MerchantAdr1;
	@Column(name = "MerchantAdr2")
	private String txt_MerchantAdr2;
	@Column(name = "MessageNum")
	private String txt_MessageNum;
	@Column(name = "CardName")
	private String txt_CardName;
	@Column(name = "Reference")
	private String txt_Reference;
	@Column(name = "TranSta")
	private String txt_TranSta;
	@Column(name = "Pan")
	private String txt_Pan;
	@Column(name = "PrintMarker")
	private String txt_PrintMarker;
	@Column(name = "CurrencySym")
	private String txt_CurrencySym;
	@Column(name = "Ceiling")
	private String txt_Ceiling;
	@Column(name = "CashCeilingLimit")
	private String txt_CashCeilingLimit;
	@Column(name = "AmLaInp2")
	private String txt_AmLaInp2;
	@Column(name = "amountinp3")
	private String txt_amountinp3;
	@Column(name = "CashElig")
	private String txt_CashElig;
	@Column(name = "msginp")
	private String txt_msginp;
	@Column(name = "amountinp1")
	private String txt_amountinp1;
	@Column(name = "refinp")
	private String txt_refinp;
	@Column(name = "amountinp2")
	private String txt_amountinp2;
	@Column(name = "ReceipNum")
	private String txt_ReceipNum;
	@Column(name = "AmLaInp3")
	private String txt_AmLaInp3;
	@Column(name = "TotalAmount")
	private String txt_TotalAmount;
	@Column(name = "AmLaInp4")
	private String txt_AmLaInp4;
	@Column(name = "TranTyp")
	private String txt_TranTyp;
	@Column(name = "Cash")
	private String txt_Cash;
	@Column(name = "TranAmou")
	private String txt_TranAmou;
	@Column(name = "cvm")
	private String txt_cvm;
	@Column(name = "Currency")
	private String txt_Currency;
	@Column(name = "DateTxn")
	private String txt_DateTxn;
	@Column(name = "RespCode")
	private String txt_RespCode;
	@Column(name = "Authoode")
	private String txt_Authoode;
	@Column(name = "DccAm")
	private String txt_DccAm;
	@Column(name = "DccCurrency")
	
	private String txt_DccCurrency;
	@Column(name = "EntryMethod")
	private String txt_EntryMethod;
	@Column(name = "DccCurrExp")
	private String txt_DccCurrExp;
	@Column(name = "FxRateApp")
	private String txt_FxRateApp;
	@Column(name = "DonaAmoun")
	private String txt_DonaAmount;
	@Column(name = "IsLoyTran")
	private String txt_IsLoyTran;
	@Column(name = "RedeeAmou")
	private String txt_RedeeAmou;
	@Column(name = "TerminalID")
	private String txt_TerminalID;
	@Column(name = "StarDate")
	private String txt_StarDate;
	@Column(name = "IccFileName")
	private String txt_IccFileName;
	@Column(name = "Aid")
	private String txt_Aid;
	@Column(name = "IccPrefName")
	private String txt_IccPrefName;
	@Column(name = "PanNum")
	private String txt_PanNum;
	@Column(name = "TrackData1")
	private String txt_TrackData1;
	@Column(name = "AmLaInp1")

	private String txt_AmLaInp1;
	@Column(name = "PrintInfos")
	private String txt_PrintInfos;
	@Column(name = "FxExpApp")
	private String txt_FxExpApp;
	@Column(name = "amountinp4")
	private String txt_amountinp4;
	@Column(name = "HostMg")
	private String txtAr_HostMg;
	@Column(name = "NewAdIp")
	private String txt_NewAdIp;
	@Column(name = "TrackStatus1")
	private String txt_TrackStatus1;
	@Column(name = "TrackData2")
	private String txt_TrackData2;
	@Column(name = "TrackStatus2")
	private String txt_TrackStatus2;
	@Column(name = "TrackData3")
	private String txt_TrackData3;
	@Column(name = "TrackStatus3")
	private String txt_TrackStatus3;
	@Column(name = "ReqOutput")
	private String txt_ReqOutput;
	
	private static final long serialVersionUID = 1L;
	
	public TxnResponseDTO() {
	
	}
	public String getTxt_cMessageNumber() {
		return txt_cMessageNumber;
	}
	public void setTxt_cMessageNumber(String txt_cMessageNumber) {
		this.txt_cMessageNumber = txt_cMessageNumber;
	}
	public String getTxt_cReference() {
		return txt_cReference;
	}
	public void setTxt_cReference(String txt_cReference) {
		this.txt_cReference = txt_cReference;
	}
	
	public String getTxt_cAmount1Info() {
		return txt_cAmount1Info;
	}
	public void setTxt_cAmount1Info(String txt_cAmount1Info) {
		this.txt_cAmount1Info = txt_cAmount1Info;
	}
	
	public String getTxt_MerID() {
		return txt_MerID;
	}
	public void setTxt_MerID(String txt_MerID) {
		this.txt_MerID = txt_MerID;
	}
	public String getTxt_cashAmount() {
		return txt_cashAmount;
	}
	public void setTxt_cashAmount(String txt_cashAmount) {
		this.txt_cashAmount = txt_cashAmount;
	}
	public String getTxt_IsDccTran() {
		return txt_IsDccTran;
	}
	public void setTxt_IsDccTran(String txt_IsDccTran) {
		this.txt_IsDccTran = txt_IsDccTran;
	}
	public String getTxt_CheckAuth() {
		return txt_CheckAuth;
	}
	public void setTxt_CheckAuth(String txt_CheckAuth) {
		this.txt_CheckAuth = txt_CheckAuth;
	}
	public String getTxt_Receipt() {
		return txt_Receipt;
	}
	public void setTxt_Receipt(String txt_Receipt) {
		this.txt_Receipt = txt_Receipt;
	}
	public String getTxt_ExpiryDate() {
		return txt_ExpiryDate;
	}
	public void setTxt_ExpiryDate(String txt_ExpiryDate) {
		this.txt_ExpiryDate = txt_ExpiryDate;
	}
	public String getTxt_MerchantName() {
		return txt_MerchantName;
	}
	public void setTxt_MerchantName(String txt_MerchantName) {
		this.txt_MerchantName = txt_MerchantName;
	}
	public String getTxt_MerchantAdr1() {
		return txt_MerchantAdr1;
	}
	public void setTxt_MerchantAdr1(String txt_MerchantAdr1) {
		this.txt_MerchantAdr1 = txt_MerchantAdr1;
	}
	public String getTxt_MerchantAdr2() {
		return txt_MerchantAdr2;
	}
	public void setTxt_MerchantAdr2(String txt_MerchantAdr2) {
		this.txt_MerchantAdr2 = txt_MerchantAdr2;
	}
	public String getTxt_MessageNum() {
		return txt_MessageNum;
	}
	public void setTxt_MessageNum(String txt_MessageNum) {
		this.txt_MessageNum = txt_MessageNum;
	}
	public String getTxt_CardName() {
		return txt_CardName;
	}
	public void setTxt_CardName(String txt_CardName) {
		this.txt_CardName = txt_CardName;
	}
	public String getTxt_Reference() {
		return txt_Reference;
	}
	public void setTxt_Reference(String txt_Reference) {
		this.txt_Reference = txt_Reference;
	}
	public String getTxt_TranSta() {
		return txt_TranSta;
	}
	public void setTxt_TranSta(String txt_TranSta) {
		this.txt_TranSta = txt_TranSta;
	}
	public String getTxt_Pan() {
		return txt_Pan;
	}
	public void setTxt_Pan(String txt_Pan) {
		this.txt_Pan = txt_Pan;
	}
	public String getTxt_PrintMarker() {
		return txt_PrintMarker;
	}
	public void setTxt_PrintMarker(String txt_PrintMarker) {
		this.txt_PrintMarker = txt_PrintMarker;
	}
	public String getTxt_CurrencySym() {
		return txt_CurrencySym;
	}
	public void setTxt_CurrencySym(String txt_CurrencySym) {
		this.txt_CurrencySym = txt_CurrencySym;
	}
	public String getTxt_Ceiling() {
		return txt_Ceiling;
	}
	public void setTxt_Ceiling(String txt_Ceiling) {
		this.txt_Ceiling = txt_Ceiling;
	}
	public String getTxt_CashCeilingLimit() {
		return txt_CashCeilingLimit;
	}
	public void setTxt_CashCeilingLimit(String txt_CashCeilingLimit) {
		this.txt_CashCeilingLimit = txt_CashCeilingLimit;
	}
	public String getTxt_AmLaInp2() {
		return txt_AmLaInp2;
	}
	public void setTxt_AmLaInp2(String txt_AmLaInp2) {
		this.txt_AmLaInp2 = txt_AmLaInp2;
	}
	public String getTxt_amountinp3() {
		return txt_amountinp3;
	}
	public void setTxt_amountinp3(String txt_amountinp3) {
		this.txt_amountinp3 = txt_amountinp3;
	}
	public String getTxt_CashElig() {
		return txt_CashElig;
	}
	public void setTxt_CashElig(String txt_CashElig) {
		this.txt_CashElig = txt_CashElig;
	}
	public String getTxt_msginp() {
		return txt_msginp;
	}
	public void setTxt_msginp(String txt_msginp) {
		this.txt_msginp = txt_msginp;
	}
	public String getTxt_amountinp1() {
		return txt_amountinp1;
	}
	public void setTxt_amountinp1(String txt_amountinp1) {
		this.txt_amountinp1 = txt_amountinp1;
	}
	public String getTxt_refinp() {
		return txt_refinp;
	}
	public void setTxt_refinp(String txt_refinp) {
		this.txt_refinp = txt_refinp;
	}
	public String getTxt_amountinp2() {
		return txt_amountinp2;
	}
	public void setTxt_amountinp2(String txt_amountinp2) {
		this.txt_amountinp2 = txt_amountinp2;
	}
	public String getTxt_ReceipNum() {
		return txt_ReceipNum;
	}
	public void setTxt_ReceipNum(String txt_ReceipNum) {
		this.txt_ReceipNum = txt_ReceipNum;
	}
	public String getTxt_AmLaInp3() {
		return txt_AmLaInp3;
	}
	public void setTxt_AmLaInp3(String txt_AmLaInp3) {
		this.txt_AmLaInp3 = txt_AmLaInp3;
	}
	public String getTxt_TotalAmount() {
		return txt_TotalAmount;
	}
	public void setTxt_TotalAmount(String txt_TotalAmount) {
		this.txt_TotalAmount = txt_TotalAmount;
	}
	public String getTxt_AmLaInp4() {
		return txt_AmLaInp4;
	}
	public void setTxt_AmLaInp4(String txt_AmLaInp4) {
		this.txt_AmLaInp4 = txt_AmLaInp4;
	}
	public String getTxt_TranTyp() {
		return txt_TranTyp;
	}
	public void setTxt_TranTyp(String txt_TranTyp) {
		this.txt_TranTyp = txt_TranTyp;
	}
	public String getTxt_Cash() {
		return txt_Cash;
	}
	public void setTxt_Cash(String txt_Cash) {
		this.txt_Cash = txt_Cash;
	}
	public String getTxt_TranAmou() {
		return txt_TranAmou;
	}
	public void setTxt_TranAmou(String txt_TranAmou) {
		this.txt_TranAmou = txt_TranAmou;
	}
	public String getTxt_cvm() {
		return txt_cvm;
	}
	public void setTxt_cvm(String txt_cvm) {
		this.txt_cvm = txt_cvm;
	}
	public String getTxt_Currency() {
		return txt_Currency;
	}
	public void setTxt_Currency(String txt_Currency) {
		this.txt_Currency = txt_Currency;
	}
	public String getTxt_DateTxn() {
		return txt_DateTxn;
	}
	public void setTxt_DateTxn(String txt_DateTxn) {
		this.txt_DateTxn = txt_DateTxn;
	}
	public String getTxt_RespCode() {
		return txt_RespCode;
	}
	public void setTxt_RespCode(String txt_RespCode) {
		this.txt_RespCode = txt_RespCode;
	}
	public String getTxt_Authoode() {
		return txt_Authoode;
	}
	public void setTxt_Authoode(String txt_Authoode) {
		this.txt_Authoode = txt_Authoode;
	}
	public String getTxt_DccAm() {
		return txt_DccAm;
	}
	public void setTxt_DccAm(String txt_DccAm) {
		this.txt_DccAm = txt_DccAm;
	}
	public String getTxt_DccCurrency() {
		return txt_DccCurrency;
	}
	public void setTxt_DccCurrency(String txt_DccCurrency) {
		this.txt_DccCurrency = txt_DccCurrency;
	}
	public String getTxt_EntryMethod() {
		return txt_EntryMethod;
	}
	public void setTxt_EntryMethod(String txt_EntryMethod) {
		this.txt_EntryMethod = txt_EntryMethod;
	}
	public String getTxt_DccCurrExp() {
		return txt_DccCurrExp;
	}
	public void setTxt_DccCurrExp(String txt_DccCurrExp) {
		this.txt_DccCurrExp = txt_DccCurrExp;
	}
	public String getTxt_FxRateApp() {
		return txt_FxRateApp;
	}
	public void setTxt_FxRateApp(String txt_FxRateApp) {
		this.txt_FxRateApp = txt_FxRateApp;
	}
	public String getTxt_DonaAmount() {
		return txt_DonaAmount;
	}
	public void setTxt_DonaAmount(String txt_DonaAmount) {
		this.txt_DonaAmount = txt_DonaAmount;
	}
	public String getTxt_IsLoyTran() {
		return txt_IsLoyTran;
	}
	public void setTxt_IsLoyTran(String txt_IsLoyTran) {
		this.txt_IsLoyTran = txt_IsLoyTran;
	}
	public String getTxt_RedeeAmou() {
		return txt_RedeeAmou;
	}
	public void setTxt_RedeeAmou(String txt_RedeeAmou) {
		this.txt_RedeeAmou = txt_RedeeAmou;
	}
	public String getTxt_TerminalID() {
		return txt_TerminalID;
	}
	public void setTxt_TerminalID(String txt_TerminalID) {
		this.txt_TerminalID = txt_TerminalID;
	}
	public String getTxt_StarDate() {
		return txt_StarDate;
	}
	public void setTxt_StarDate(String txt_StarDate) {
		this.txt_StarDate = txt_StarDate;
	}
	public String getTxt_IccFileName() {
		return txt_IccFileName;
	}
	public void setTxt_IccFileName(String txt_IccFileName) {
		this.txt_IccFileName = txt_IccFileName;
	}
	public String getTxt_Aid() {
		return txt_Aid;
	}
	public void setTxt_Aid(String txt_Aid) {
		this.txt_Aid = txt_Aid;
	}
	public String getTxt_IccPrefName() {
		return txt_IccPrefName;
	}
	public void setTxt_IccPrefName(String txt_IccPrefName) {
		this.txt_IccPrefName = txt_IccPrefName;
	}
	public String getTxt_PanNum() {
		return txt_PanNum;
	}
	public void setTxt_PanNum(String txt_PanNum) {
		this.txt_PanNum = txt_PanNum;
	}
	public String getTxt_TrackData1() {
		return txt_TrackData1;
	}
	public void setTxt_TrackData1(String txt_TrackData1) {
		this.txt_TrackData1 = txt_TrackData1;
	}
	public String getTxt_AmLaInp1() {
		return txt_AmLaInp1;
	}
	public void setTxt_AmLaInp1(String txt_AmLaInp1) {
		this.txt_AmLaInp1 = txt_AmLaInp1;
	}
	public String getTxt_PrintInfos() {
		return txt_PrintInfos;
	}
	public void setTxt_PrintInfos(String txt_PrintInfos) {
		this.txt_PrintInfos = txt_PrintInfos;
	}
	public String getTxt_FxExpApp() {
		return txt_FxExpApp;
	}
	public void setTxt_FxExpApp(String txt_FxExpApp) {
		this.txt_FxExpApp = txt_FxExpApp;
	}
	public String getTxt_amountinp4() {
		return txt_amountinp4;
	}
	public void setTxt_amountinp4(String txt_amountinp4) {
		this.txt_amountinp4 = txt_amountinp4;
	}
	public String getTxtAr_HostMg() {
		return txtAr_HostMg;
	}
	public void setTxtAr_HostMg(String txtAr_HostMg) {
		this.txtAr_HostMg = txtAr_HostMg;
	}
	public String getTxt_NewAdIp() {
		return txt_NewAdIp;
	}
	public void setTxt_NewAdIp(String txt_NewAdIp) {
		this.txt_NewAdIp = txt_NewAdIp;
	}
	public String getTxt_TrackStatus1() {
		return txt_TrackStatus1;
	}
	public void setTxt_TrackStatus1(String txt_TrackStatus1) {
		this.txt_TrackStatus1 = txt_TrackStatus1;
	}
	public String getTxt_TrackData2() {
		return txt_TrackData2;
	}
	public void setTxt_TrackData2(String txt_TrackData2) {
		this.txt_TrackData2 = txt_TrackData2;
	}
	public String getTxt_TrackStatus2() {
		return txt_TrackStatus2;
	}
	public void setTxt_TrackStatus2(String txt_TrackStatus2) {
		this.txt_TrackStatus2 = txt_TrackStatus2;
	}
	public String getTxt_TrackData3() {
		return txt_TrackData3;
	}
	public void setTxt_TrackData3(String txt_TrackData3) {
		this.txt_TrackData3 = txt_TrackData3;
	}
	public String getTxt_TrackStatus3() {
		return txt_TrackStatus3;
	}
	public void setTxt_TrackStatus3(String txt_TrackStatus3) {
		this.txt_TrackStatus3 = txt_TrackStatus3;
	}
	public String getTxt_ReqOutput() {
		return txt_ReqOutput;
	}
	public void setTxt_ReqOutput(String txt_ReqOutput) {
		this.txt_ReqOutput = txt_ReqOutput;
	}
	@Override
	public String toString() {
		return "TransactionDataOut [id=" + id + ", txt_cMessageNumber="
				+ txt_cMessageNumber + ", txt_cReference=" + txt_cReference
				+ ", txt_cAmount=" + txt_cAmount + ", cmb_TransactionType="
				+ cmb_TransactionType + ", txt_cAmount1Info="
				+ txt_cAmount1Info + ", txt_MerID=" + txt_MerID
				+ ", txt_cashAmount=" + txt_cashAmount + ", txt_IsDccTran="
				+ txt_IsDccTran + ", txt_CheckAuth=" + txt_CheckAuth
				+ ", txt_Receipt=" + txt_Receipt + ", txt_ExpiryDate="
				+ txt_ExpiryDate + ", txt_MerchantName=" + txt_MerchantName
				+ ", txt_MerchantAdr1=" + txt_MerchantAdr1
				+ ", txt_MerchantAdr2=" + txt_MerchantAdr2
				+ ", txt_MessageNum=" + txt_MessageNum + ", txt_CardName="
				+ txt_CardName + ", txt_Reference=" + txt_Reference
				+ ", txt_TranSta=" + txt_TranSta + ", txt_Pan=" + txt_Pan
				+ ", txt_PrintMarker=" + txt_PrintMarker + ", txt_CurrencySym="
				+ txt_CurrencySym + ", txt_Ceiling=" + txt_Ceiling
				+ ", txt_CashCeilingLimit=" + txt_CashCeilingLimit
				+ ", txt_AmLaInp2=" + txt_AmLaInp2 + ", txt_amountinp3="
				+ txt_amountinp3 + ", txt_CashElig=" + txt_CashElig
				+ ", txt_msginp=" + txt_msginp + ", txt_amountinp1="
				+ txt_amountinp1 + ", txt_refinp=" + txt_refinp
				+ ", txt_amountinp2=" + txt_amountinp2 + ", txt_ReceipNum="
				+ txt_ReceipNum + ", txt_AmLaInp3=" + txt_AmLaInp3
				+ ", txt_TotalAmount=" + txt_TotalAmount + ", txt_AmLaInp4="
				+ txt_AmLaInp4 + ", txt_TranTyp=" + txt_TranTyp + ", txt_Cash="
				+ txt_Cash + ", txt_TranAmou=" + txt_TranAmou + ", txt_cvm="
				+ txt_cvm + ", txt_Currency=" + txt_Currency + ", txt_DateTxn="
				+ txt_DateTxn + ", txt_RespCode=" + txt_RespCode
				+ ", txt_Authoode=" + txt_Authoode + ", txt_DccAm=" + txt_DccAm
				+ ", txt_DccCurrency=" + txt_DccCurrency + ", txt_EntryMethod="
				+ txt_EntryMethod + ", txt_DccCurrExp=" + txt_DccCurrExp
				+ ", txt_FxRateApp=" + txt_FxRateApp + ", txt_DonaAmount="
				+ txt_DonaAmount + ", txt_IsLoyTran=" + txt_IsLoyTran
				+ ", txt_RedeeAmou=" + txt_RedeeAmou + ", txt_TerminalID="
				+ txt_TerminalID + ", txt_StarDate=" + txt_StarDate
				+ ", txt_IccFileName=" + txt_IccFileName + ", txt_Aid="
				+ txt_Aid + ", txt_IccPrefName=" + txt_IccPrefName
				+ ", txt_PanNum=" + txt_PanNum + ", txt_TrackData1="
				+ txt_TrackData1 + ", txt_AmLaInp1=" + txt_AmLaInp1
				+ ", txt_PrintInfos=" + txt_PrintInfos + ", txt_FxExpApp="
				+ txt_FxExpApp + ", txt_amountinp4=" + txt_amountinp4
				+ ", txtAr_HostMg=" + txtAr_HostMg + ", txt_NewAdIp="
				+ txt_NewAdIp + ", txt_TrackStatus1=" + txt_TrackStatus1
				+ ", txt_TrackData2=" + txt_TrackData2 + ", txt_TrackStatus2="
				+ txt_TrackStatus2 + ", txt_TrackData3=" + txt_TrackData3
				+ ", txt_TrackStatus3=" + txt_TrackStatus3 + ", txt_ReqOutput="
				+ txt_ReqOutput + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTxt_cAmount() {
		return txt_cAmount;
	}
	public void setTxt_cAmount(String txt_cAmount) {
		this.txt_cAmount = txt_cAmount;
	}
	public TxnResponseDTO(TxnResponseDTO _Obj_defDTO) {		
		// TODO Auto-generated constructor stub
		this.id = _Obj_defDTO.getId();
		this.txt_cMessageNumber = _Obj_defDTO.getTxt_MessageNum();
		this.txt_cReference = _Obj_defDTO.getTxt_cReference();
		this.txt_cAmount = _Obj_defDTO.getTxt_cAmount();
		this.cmb_TransactionType = _Obj_defDTO.getCmb_TransactionType();
		this.txt_cAmount1Info = _Obj_defDTO.getTxt_cAmount1Info();
		this.txt_MerID = _Obj_defDTO.getTxt_MerID();
		this.txt_cashAmount = _Obj_defDTO.getTxt_cashAmount();
		this.txt_IsDccTran = _Obj_defDTO.getTxt_IsDccTran();
		this.txt_CheckAuth =  _Obj_defDTO.getTxt_CheckAuth();
		this.txt_Receipt =  _Obj_defDTO.getTxt_Receipt();
		this.txt_ExpiryDate =_Obj_defDTO.getTxt_ExpiryDate();
		this.txt_MerchantName =_Obj_defDTO.getTxt_MerchantName();
		this.txt_MerchantAdr1 =_Obj_defDTO.getTxt_MerchantAdr1();
		this.txt_MerchantAdr2 =  _Obj_defDTO.getTxt_MerchantAdr2();
		this.txt_MessageNum = _Obj_defDTO.getTxt_MessageNum();
		this.txt_CardName = _Obj_defDTO.getTxt_CardName();
		this.txt_Reference = _Obj_defDTO.getTxt_Reference();
		this.txt_TranSta = _Obj_defDTO.getTxt_TranSta();
		this.txt_Pan = _Obj_defDTO.getTxt_Pan();
		this.txt_PrintMarker = _Obj_defDTO.getTxt_PrintMarker();
		this.txt_CurrencySym =  _Obj_defDTO.getTxt_CurrencySym();
		this.txt_Ceiling = _Obj_defDTO.getTxt_Ceiling();
		this.txt_CashCeilingLimit = _Obj_defDTO.getTxt_CashCeilingLimit();
		this.txt_AmLaInp2 =_Obj_defDTO.getTxt_AmLaInp2();
		this.txt_amountinp3 = _Obj_defDTO.getTxt_amountinp3();
		this.txt_CashElig =_Obj_defDTO.getTxt_CashElig();
		this.txt_msginp =_Obj_defDTO.getTxt_msginp();
		this.txt_amountinp1 = _Obj_defDTO.getTxt_amountinp1();
		this.txt_refinp = _Obj_defDTO.getTxt_refinp();
		this.txt_amountinp2 = _Obj_defDTO.getTxt_amountinp2();
		this.txt_ReceipNum = _Obj_defDTO.getTxt_ReceipNum();
		this.txt_AmLaInp3 =  _Obj_defDTO.getTxt_AmLaInp3();
		this.txt_TotalAmount = _Obj_defDTO.getTxt_TotalAmount();
		this.txt_AmLaInp4 =  _Obj_defDTO.getTxt_AmLaInp4();
		this.txt_TranTyp =  _Obj_defDTO.getTxt_TranTyp();
		this.txt_Cash = _Obj_defDTO.getTxt_Cash();
		this.txt_TranAmou = _Obj_defDTO.getTxt_TranAmou();
		this.txt_cvm = _Obj_defDTO.getTxt_cvm();
		this.txt_Currency =  _Obj_defDTO.getTxt_Currency();
		this.txt_DateTxn = _Obj_defDTO.getTxt_DateTxn();
		this.txt_RespCode = _Obj_defDTO.getTxt_RespCode();
		this.txt_Authoode =  _Obj_defDTO.getTxt_Authoode();
		this.txt_DccAm = _Obj_defDTO.getTxt_DccAm();
		this.txt_DccCurrency =  _Obj_defDTO.getTxt_DccAm();
		this.txt_EntryMethod =  _Obj_defDTO.getTxt_EntryMethod();
		this.txt_DccCurrExp = _Obj_defDTO.getTxt_DccCurrExp();
		this.txt_FxRateApp =  _Obj_defDTO.getTxt_FxRateApp();
		this.txt_DonaAmount =_Obj_defDTO.getTxt_DonaAmount();
		this.txt_IsLoyTran = _Obj_defDTO.getTxt_IsLoyTran();
		this.txt_RedeeAmou =_Obj_defDTO.getTxt_RedeeAmou();
		this.txt_TerminalID = _Obj_defDTO.getTxt_TerminalID();
		this.txt_StarDate = _Obj_defDTO.getTxt_StarDate();
		this.txt_IccFileName =  _Obj_defDTO.getTxt_IccFileName();
		this.txt_Aid =  _Obj_defDTO.getTxt_Aid();
		this.txt_IccPrefName =_Obj_defDTO.getTxt_IccPrefName();
		this.txt_PanNum = _Obj_defDTO.getTxt_IccPrefName();
		this.txt_TrackData1 =_Obj_defDTO.getTxt_TrackData1();
		this.txt_AmLaInp1 =_Obj_defDTO.getTxt_AmLaInp1();
		this.txt_PrintInfos = _Obj_defDTO.getTxt_PrintInfos();
		this.txt_FxExpApp = _Obj_defDTO.getTxt_FxExpApp();
		this.txt_amountinp4 =_Obj_defDTO.getTxt_amountinp4();
		this.txtAr_HostMg = _Obj_defDTO.getTxtAr_HostMg();
		this.txt_NewAdIp = _Obj_defDTO.getTxt_NewAdIp();
		this.txt_TrackStatus1 = _Obj_defDTO.getTxt_TrackStatus1();
		this.txt_TrackData2 = _Obj_defDTO.getTxt_TrackData2();
		this.txt_TrackStatus2 =_Obj_defDTO.getTxt_TrackStatus2();
		this.txt_TrackData3 =  _Obj_defDTO.getTxt_TrackData3();
		this.txt_TrackStatus3 =_Obj_defDTO.getTxt_TrackStatus3();
		this.txt_ReqOutput =_Obj_defDTO.getTxt_ReqOutput();
		
	}
	public String getCmb_TransactionType() {
		return cmb_TransactionType;
	}
	public void setCmb_TransactionType(String cmb_TransactionType) {
		this.cmb_TransactionType = cmb_TransactionType;
	}
}
