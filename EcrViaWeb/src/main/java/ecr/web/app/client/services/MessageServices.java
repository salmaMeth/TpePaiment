package ecr.web.app.client.services;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("springGwtServices/SendMessagesService")


public interface MessageServices extends RemoteService {
	public String sendMail(String text, String mailFrom, String mailTo, String subject,String Username,String Password) throws Exception;
}
