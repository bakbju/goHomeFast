package com.bakbj.emailSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private JavaMailSender javaMailSender;

    @Autowired
    public NotificationService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendNotification(String email, Long id) throws MailException {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(email);
        mail.setFrom("bakb0j00@gmail.com");
        mail.setSubject("야근하지말자에 가입해주셔서 감사합니다.");
        mail.setText("아래의 링크를 클릭하시면 회원가입이 완료됩니다.\nhttp://www.bakb0.xyz/register/changeRole/" + id);
        javaMailSender.send(mail);
    }
}
