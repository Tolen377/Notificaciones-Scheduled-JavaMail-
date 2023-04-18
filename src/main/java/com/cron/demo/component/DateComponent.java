package com.cron.demo.component;
import org.springframework.stereotype.Component;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Component
public class DateComponent {
    private DateFormat formateador= new SimpleDateFormat("dd/MM/yyyy");

    public void calculoFechaTramite() {
        try {
            // convierte un String en formato fecha en una fecha real
            Date fecha= formateador.parse("10/01/2022");
            // creamos un calendario
            Calendar calendario= new GregorianCalendar();
            //hacemos calculos sobre el calendario
            calendario.setTime(fecha);
            //movemos el ccalendario
            calendario.add(Calendar.DATE,28);
            //usamos el formateador y volvemos a mostrar la fecha
            System.out.println(formateador.format(calendario.getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
