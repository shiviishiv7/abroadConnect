package com.example.AdmissionAboard.services;


import com.example.AdmissionAboard.util.Mail;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.nio.charset.StandardCharsets;

@Service
public class EmailSenderService {

    private JavaMailSender javaMailSender;

    private SpringTemplateEngine templateEngine;

    public EmailSenderService(JavaMailSender javaMailSender, SpringTemplateEngine templateEngine) {
        this.javaMailSender = javaMailSender;
        this.templateEngine = templateEngine;
    }

    @Async
    public void sendEmail(Mail mail) throws MessagingException {
        MimeMessage message = getMimeMessage(mail);
        javaMailSender.send(message);
    }

    private MimeMessage getMimeMessage(Mail mail) throws MessagingException {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper =
                new MimeMessageHelper(
                        message,
                        MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
                        StandardCharsets.UTF_8.name());

        Context context = new Context();
        context.setVariables(mail.getModel());
        String html = templateEngine.process("email-template", context);

        helper.setTo(mail.getTo());
        helper.setText(html, true);
        helper.setSubject(mail.getSubject());
        helper.setFrom(mail.getFrom());
        return message;
    }
}

