package ecr.web.app.shared;

import java.util.Currency;
import java.util.Locale;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

import com.google.gwt.user.client.ui.Label;


import uk.co.ingenico.ecr.ECRException;
import uk.co.ingenico.ecr.MalformedMessageException;
import uk.co.ingenico.ecr.MessageTooLargeException;
import uk.co.ingenico.ecr.ProtocolMismatchException;
import uk.co.ingenico.ecr.ResponseDataMissingException;
import uk.co.ingenico.ecr.ResponseTypeMismatchException;
import uk.co.ingenico.ecr.TagValueTooLargeException;
import uk.co.ingenico.ecr.TerminalTimeoutException;
import uk.co.ingenico.ecr.UnableToConnectException;
import uk.co.ingenico.ecr.UnknownMessageTypeException;
import uk.co.ingenico.ecr.UnknownTagException;

public class EcrUtils {
	public static final int EURO_CURRENCY_CODE = 976;
	public static final int GBP_CURRENCY_CODE = 826;
	public static final int USD_CURRENCY_CODE = 840;
	
	public enum ErespStatus
	{
		OK,
		UNABLE_TO_CONNECT,
		UNABLE_TO_SEND_REQUEST,
		BAD_REQUEST_FORMAT,
		RECEPTION_TIMEOUT,
		RECEPTION_ERROR,
		BAD_RESPONSE_FORMAT,
		BAD_RESPONSE_SIZE,
		PED_NOT_AUTHENTICATED ,
		NO_RECEIVED_DATA;
		/*******************************************************************************************
		 * METHOD     :  getRespStatus
		 *
		 * DESCRIPTION  :  get ECR Response Status.
		 *
		 * @return ErespStatus
		 *
		 *******************************************************************************************/
		public static ErespStatus getErespStatus(ECRException e)
		{
			if (e instanceof UnableToConnectException) 
			{
				System.out.println("UnableToConnectException" );
				return UNABLE_TO_CONNECT;	
				
			}

			else if((e instanceof TerminalTimeoutException)||
					(e instanceof ECRException))
			{
				if(e instanceof TerminalTimeoutException)
				{
					System.out.println("TerminalTimeoutException" );
				}
				else
				{
					System.out.println("ECRException, Exception traces :" + e.getMessage() );
				}
				
				return NO_RECEIVED_DATA;
			}

			else if((e instanceof MalformedMessageException) ||
					(e instanceof ProtocolMismatchException) ||
					(e instanceof ResponseDataMissingException)||
					(e instanceof ResponseTypeMismatchException)||
					(e instanceof UnknownTagException)||
					(e instanceof UnknownMessageTypeException)) 
					
			{
				System.out.println("Exception traces :" + e.getMessage() );
				return BAD_RESPONSE_FORMAT;
			}

			else if((e instanceof MessageTooLargeException)||
					(e instanceof TagValueTooLargeException))
			{
				if(e instanceof MessageTooLargeException)
				{
					System.out.println("MessageTooLargeException" );
				}
				else
				{
					System.out.println("TagValueTooLargeException" );
				}
				System.out.println("Exception traces :" + e.getMessage() );
				return BAD_REQUEST_FORMAT;
			}			
		
			else
			{
				System.out.println("Unknown exception, Exception traces :" + e.getMessage() );
				return RECEPTION_ERROR;
			}
				
		}		
	}
	/*******************************************************************************************
	 * METHOD     :  ConvertReceivedData
	 *
	 * DESCRIPTION  :  Convert Received Data
	 *
	 * @param responseData
	 * 
	 * return String
	 *******************************************************************************************/
	public static String convertReceivedData(Object responseData)
	{
		String recvData = "";
		
		if(responseData != null)
		{
				recvData = responseData.toString();	
		}
		return recvData;
	}

/*******************************************************************************************
 * METHOD     :  getCurrencySymbol
 *
 * DESCRIPTION  :  get Currency Symbol.
 *
 * @return String Currency Symbol.
 *
 *******************************************************************************************/
public static String getCurrencySymbol(int CurrencyCode)
{
	String CurrencySymbol = "";
	switch (CurrencyCode) 
	{
		case GBP_CURRENCY_CODE:
		{
			Locale.setDefault(Locale.UK);
			CurrencySymbol  = Currency.getInstance("GBP").getSymbol();
		}
		break;
		
		case EURO_CURRENCY_CODE:
		{
			Locale.setDefault(Locale.FRANCE);
			CurrencySymbol  = Currency.getInstance("EUR").getSymbol();
		}
		break;
		case USD_CURRENCY_CODE:
		{
			Locale.setDefault(Locale.US);
			CurrencySymbol  = Currency.getInstance("USD").getSymbol();
		}
		break;

		default:
		break;
	}

	return CurrencySymbol ;
}

public static Color getColor(int colorBlue) {
   final  Display display = new Display();
	Color color = display.getSystemColor (colorBlue);
	return color;
}
}
