package org.example.eventprojectt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AppConfig {

@Bean
  public BCryptPasswordEncoder passwordEncoder(){
     return new BCryptPasswordEncoder();

     //PasswordEncoder, Spring Security'nin şifre işlemleri için kullandığı arayüzdür.
    //BCryptPasswordEncoder, bu arayüzün en yaygın implementasyonlarından biridir.
    //Kullanıcının şifresi veritabanına düz metin olarak değil, BCrypt hash'i olarak kaydedilir.
    }
}
