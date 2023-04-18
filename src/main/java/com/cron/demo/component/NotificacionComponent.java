package com.cron.demo.component;

import com.cron.demo.Utils.AppConstants;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Arrays;
import java.util.Date;

@Component
public class NotificacionComponent {
    @Autowired
    private JavaMailSender emailSender;
    @Autowired
    private TemplateEngine templateEngine;
    private Log logger = LogFactory.getLog(getClass());

    public void main() throws MessagingException {
        logger.info("El envio se esta realizando desde el componente!!");
        Context context = new Context();
        context.setVariable(
                "empleados",
                Arrays.asList(
                        "Arturo"
                        , "Kevin"
                        , "Luis"
                        , "Diego"
                )
        );

        String htmlContent = templateEngine
                .process(AppConstants.EMAIL_TEMPLATE, context);
        notificacionesFlota(htmlContent);

        logger.info("El correo se envió de manera exitosa!!");
    }

    public void notificacionesFlota(String htmlContent) throws MessagingException {
        MimeMessage mimeMessage = emailSender.createMimeMessage();

        MimeMessageHelper message = new MimeMessageHelper(
                mimeMessage
                , true
                , AppConstants.ENCODING
        );

        message.setTo(AppConstants.EMAIL_ADDRESSEE);
        message.setFrom(AppConstants.EMAIL_SENDER);
        message.setSubject(AppConstants.EMAIL_SUBJECT);
        message.setSentDate(new Date());
        message.setText(htmlContent, true);

        this.emailSender.send(mimeMessage);
    }

    public void notificacionesAlmacen(String htmlContent) throws MessagingException {
        MimeMessage mimeMessage = emailSender.createMimeMessage();

        MimeMessageHelper message = new MimeMessageHelper(
                mimeMessage
                , true
                , AppConstants.ENCODING
        );

        message.setTo(AppConstants.EMAIL_ADDRESSEE);
        message.setFrom(AppConstants.EMAIL_SENDER);
        message.setSubject(AppConstants.EMAIL_SUBJECT);
        message.setSentDate(new Date());
        message.setText(htmlContent, true);

        this.emailSender.send(mimeMessage);
    }
}
