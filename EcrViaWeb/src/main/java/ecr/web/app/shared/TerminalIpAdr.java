package ecr.web.app.shared;

import java.io.Serializable;


@SuppressWarnings("serial")
public class TerminalIpAdr implements Serializable {
	private String ipAdr;
	
	public TerminalIpAdr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIpAdr() {
		return ipAdr;

	}

	public void setIpAdr(String ipAdr) {
		this.ipAdr = ipAdr;
	}
	public void verifyIpAddressFormat(String ipAdr ) throws NumberFormatException {

		if(ipAdr.equals("0.0.0.0"))
		{
			throw new NumberFormatException("Invalid IP address: ");
		}
		
		/* IP */
		String[] strIpAddr = ipAdr.split("\\.");

		if (strIpAddr.length != 4)
			throw new NumberFormatException("Invalid IP address: ");

		for (int n = 0; n < strIpAddr.length; n++) {

			int value = Integer.parseInt(strIpAddr[n]);

			if (value != (value & 0xff)) {

				throw new NumberFormatException("Invalid IP address: ");
			}

		}
	}

}
