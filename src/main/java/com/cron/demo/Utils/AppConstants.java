package com.cron.demo.Utils;

import org.springframework.stereotype.Component;

@Component
public class AppConstants {
    public static  final String EMAIL_ADDRESSEE="israel.tolentino323@gmail.com";
    public static  final String EMAIL_SENDER="servicio.correo.grotecnik@gmail.com";
    public static  final String EMAIL_SUBJECT="Mensaje de Correo Electronico";
    public static  final String ENCODING="UTF-8";
    public static  final String EMAIL_TEMPLATE="TemplateCorreoElectronico";

    public static  final String CRON_EVERY_MINUTE="0 * * ? * *";
    public static  final String CRON_EVERY_FIVE_MINUTES="0 */5 * ? * *";

}
