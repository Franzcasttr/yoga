package nsquare;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SendMail  {
 /**
 * Utility method to send image in email body
 * @param session
 * @param toEmail
 * @param subject
 * @param body
 */
public static void sendhrEmail(String toEmail, String subject, String body,String port_no,String host,final String fromEmail,final String pwd,String filename){
	try{
        Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", port_no);
                
                props.put("mail.smtp.user", fromEmail);
props.put("mail.smtp.host", host);
props.put("mail.smtp.port", port_no);
props.put("mail.smtp.starttls.enable","true");
props.put("mail.smtp.debug", "true");
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.socketFactory.port", "465");
props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
props.put("mail.smtp.socketFactory.fallback", "false");


                Session session1 = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, pwd);
			}
		  });
//Session session1 = Session.getInstance(props, auth);
          
        try {

			Message message = new MimeMessage(session1);
			message.setFrom(new InternetAddress(fromEmail));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(toEmail));
			message.setSubject(subject);
//			message.setText(body);
//                        message.setContent(body, "text/html");
                        message.setContent(body,"text/html" );  

//                        BodyPart messageBodyPart1 = new MimeBodyPart();
//                        messageBodyPart1.setText(body.replace("<br>", "\n"));
//                        Multipart multipart = new MimeMultipart();
//                        
//                          /*====================================================File Attachment================================================*/
//                        if(filename!=null && filename.length()>0){
//                        MimeBodyPart messageBodyPart2 = new MimeBodyPart();
//                         
//                        System.out.println("file loc:"+filename);
//                        String file_path = filename;
//                        System.out.println("File attached path: "+filename);
//                        DataSource source = new FileDataSource(filename);
//                        messageBodyPart2.setDataHandler(new DataHandler(source));
//                        messageBodyPart2.setFileName("Offer for - "+"Offer"+".pdf");
//                        
//                        multipart.addBodyPart(messageBodyPart2);
//                        
//                        }
//                        /*====================================================File Attachment================================================*/
//			multipart.addBodyPart(messageBodyPart1);
//                        message.setContent(multipart);
                        Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
                     //insert="fail";
			throw new RuntimeException(e);
                       
		}
             }catch(Exception e){
                 //insert="fail";
                 System.out.println("error in email is "+e);
             }
         //System.out.println("EMail Sent Successfully with image!!");
}
    

}

