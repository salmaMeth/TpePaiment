package ecr.web.app.server.impl;


import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import ecr.web.app.client.services.MessageServices;
@Service("SendMessagesService")
public class MessageServicesImp extends RemoteServiceServlet implements MessageServices
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 
        public String sendMail(String text, String mailFrom, String mailTo, String subject,final String Username,final String Password) throws Exception {
    		String outpus = null;
    		try {
    	        Properties props = System.getProperties();
    	        props.setProperty("mail.smtp.port", "587");
    	        props.setProperty("mail.smtp.socketFactory.port", "587");
    	        props.setProperty("mail.smtp.host", "smtp.gmail.com");
    	        props.setProperty("mail.smtp.starttls.enable", "true");
    	        props.setProperty("mail.smtp.auth", "true");
    	  
    	       
    	        Session smtpSession = Session.getInstance(props, new javax.mail.Authenticator() {
    				protected PasswordAuthentication getPasswordAuthentication() {
    					return new PasswordAuthentication(Username,Password);
    				}
    			});
    	        smtpSession.setDebug(false);
    	  
    	        MimeMessage message = new MimeMessage(smtpSession);
    	        message.setFrom(new InternetAddress(mailFrom));
    	        message.addRecipient(Message.RecipientType.TO, new InternetAddress(mailTo));
    	  
    	        final String encoding = "UTF-8";
    	  
    	        message.setSubject(subject, encoding);
    	        message.setText(text, encoding);
    	        Transport.send(message);
    	    } catch (Exception e) {
    	        outpus=e.toString();
    	    }
    		return outpus;
    	}
    	  
    	static class MyAuthenticator extends Authenticator {
    	    public PasswordAuthentication getPasswordAuthentication() {
    	        String username = "txt_mail";
    	        String password = "741741741741";
    	  
    	        return new PasswordAuthentication(username, password);
    	    }
    	}
}
