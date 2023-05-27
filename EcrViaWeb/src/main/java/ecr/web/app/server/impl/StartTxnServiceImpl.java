package ecr.web.app.server.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import uk.co.ingenico.ecr.DoTransactionReq;
import uk.co.ingenico.ecr.DoTransactionResp;
import uk.co.ingenico.ecr.ECRException;
import uk.co.ingenico.ecr.ECRFactory;
import uk.co.ingenico.ecr.Terminal;
import uk.co.ingenico.ecr.TxnType;

import com.google.common.net.InetAddresses;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import ecr.web.app.client.services.StartTxnService;
import ecr.web.app.shared.EcrUtils;
import ecr.web.app.shared.TerminalIpAdr;
import ecr.web.app.shared.TransactionDataIn;
import ecr.web.app.shared.EcrUtils.ErespStatus;
import ecr.web.app.shared.dto.TxnResponseDTO;

/**
 * The server side implementation of the RPC service.
 */
@Service("startransaction")

public class StartTxnServiceImpl extends RemoteServiceServlet implements StartTxnService {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Logger log = LoggerFactory.getLogger(StartTxnServiceImpl.class);
	DoTransactionReq tranReq;
	DoTransactionResp tranResp = null;
	Terminal terminal;
	ErespStatus requestOutput;
	public TxnResponseDTO Startransaction(String termIpAdr,TransactionDataIn data) {
		
			tranReq = new DoTransactionReq();
				
				tranReq.setReqMessageNumber(data.getMessage());
				tranReq.setReqReference(String.valueOf(data.getRef()));
				tranReq.setReqTransactionType(TxnType.SALE);
				tranReq.setAmount1Label(data.getAmountlabel());
				tranReq.setAmount1(data.getAmount());
		
						
			terminal = ECRFactory.getTerminal(InetAddresses.forString(termIpAdr));
				requestOutput = ErespStatus.OK;

				try {
					tranResp = terminal.executeCommand(tranReq);
					}
					catch (InterruptedException e1) 
					{
						log.warn("Interrupted", e1);
					} 
					catch (ECRException e)
					{
						requestOutput = ErespStatus.getErespStatus(e);
						
					}		

				return GetRespTransaction(tranResp,requestOutput);

					}
	
	public TxnResponseDTO GetRespTransaction(DoTransactionResp tranResp, ErespStatus requestOutput) {
		TxnResponseDTO data =new TxnResponseDTO();
		if(requestOutput == ErespStatus.OK)
		{
			//Merchant ID
			data.setTxt_MerID(tranResp.getAcquirerMID());
			//Merchant Name
			data.setTxt_MerchantName(tranResp.getMerchantName());
			//Merchant Addr1
		    data.setTxt_MerchantAdr1(tranResp.getMerchantAddress1());
			//Merchant Addr2
		    data.setTxt_MerchantAdr2(tranResp.getMerchantAddress2());
			//Message Number
			data.setTxt_MessageNum(String.valueOf(tranResp.getRespMessageNumber()));
			//Card Scheme Name
			data.setTxt_CardName(tranResp.getCardSchemeName());
			//Reference
			data.setTxt_Reference(tranResp.getRespReference());		
			//Transaction Status
			data.setTxt_TranSta(tranResp.getTransactionStatus().toString());		
			//PAN
			data.setTxt_Pan(tranResp.getPAN());	
			//Currency
		   if(tranResp.getCurrency() != 0)
			{data.setTxt_Currency(EcrUtils.getCurrencySymbol(tranResp.getCurrency()));}
		   // GEMS Receipt ID 
			data.setTxt_Receipt(String.valueOf(tranResp.getGemsReceiptID()));
			// Authorization Code 
			data.setTxt_Authoode(tranResp.getAuthCode());
			// Acquirer Response Code 
			data.setTxt_RespCode(tranResp.getRespReference());
			// Receipt Number 
			data.setTxt_ReceipNum(String.valueOf(tranResp.getReceiptNumber()));
			// AID 
			data.setTxt_Aid(tranResp.getAID());
			// Date And Time 
			data.setTxt_DateTxn(String.valueOf(tranResp.getDateTime()));
			// Entry Method 
			data.setTxt_EntryMethod(String.valueOf(tranResp.getEntryMethod()));
			// Expiry Date 
			data.setTxt_ExpiryDate(String.valueOf(tranResp.getExpiryDate()));
			data.setTxt_PanNum(tranResp.getPANSequenceNum());
			// Start Date 
			data.setTxt_StarDate(String.valueOf(tranResp.getStartDate()));
			// Terminal Identity 
			data.setTxt_TerminalID(tranResp.getTerminalIdentity());
			// Transaction Amount 
			data.setTxt_TranAmou(String.valueOf(tranResp.getTransactionAmount()));
			// Loyalty (tranResp 
			 //Is Converted Txn 
			data.setTxt_IsDccTran(String.valueOf(tranResp.isConvertedTxn()));
			// Converted Amount 
			data.setTxt_DccAm(String.valueOf(tranResp.getConvertedAmount()));
			// Converted Currency Exponent 
			data.setTxt_DccCurrExp(String.valueOf(tranResp.getConvertedCurrencyExponent()));
			// FX Rate Scale 
			data.setTxt_FxExpApp(String.valueOf(tranResp.getFXRateScale()));
			// FX Rate Applied 
			data.setTxt_FxRateApp(String.valueOf(tranResp.getFXRateApplied()));
			data.setTxt_IsLoyTran(String.valueOf(tranResp.isLoyaltyTxn()));
			data.setTxt_DonaAmount(String.valueOf(tranResp.getDonationAmount()));
			data.setTxt_RedeeAmou(String.valueOf(tranResp.getRedeemedAmount()));

			// Advanced (tranResp 

			// Transaction Type 
			data.setTxt_TranTyp(String.valueOf(tranResp.getRespTransactionType()));
			// Gratuity Amount 
			data.setTxt_Cash(String.valueOf(tranResp.getGratuityAmount()));
			// Cash Amount 
			data.setTxt_cashAmount(String.valueOf(tranResp.getCashAmount()));
			 //Total Amount 
			data.setTxt_TotalAmount(String.valueOf(tranResp.getTotalAmount()));
			// CVM 
			data.setTxt_cvm("Verified By " + String.valueOf(tranResp.getCardholderVerificationMethod()));
			// ICC App file Name 
			data.setTxt_IccFileName(tranResp.getAppLabel());
			// ICC App Preferred Name 
			data.setTxt_IccPrefName(tranResp.getAppPreferredName());
			// Host Message 
			data.setTxt_msginp(tranResp.getHostMessage());
		}
		
			data.setTxt_ReqOutput(String.valueOf(requestOutput));
			

		return data;		
	}
		
	}

	
		
	

