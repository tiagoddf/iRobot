import java.io.IOException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSender {
    public static void main(String[]args) throws IOException {
        final String username = "tduarte@basilioadvogados.com.br";
        final String password = "mypass";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "outlook.office365.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("tduarte@basilioadvogados.com.br"));
            message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse("vlemos@basilioadvogados.com.br"));
            message.setSubject("Alocação de Advogado - iRobot Mail");
            
            String msg = "<font face=\"calibri\" color=\"#2471a3\" size=\"3\">Prezadas,<br/><br/>Chegou um novo advogado chamado <b>Tiago Duarte</b>.<br/><br/>Poderiam aloca-lo no sistema <i>iRobot</i>?<br/><br/><br/></font><font face=\"arial\" color=\"0\" size=\"1\">Esse e-mail foi enviado automaticamente através do programa <b>iRobot</b> por favor não responda.";
            message.setContent(msg, "text/html; charset=utf-8");
            
            Transport.send(message);
            System.out.println("Done");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}