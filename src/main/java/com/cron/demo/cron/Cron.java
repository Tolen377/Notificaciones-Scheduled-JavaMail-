package com.cron.demo.cron;

import com.cron.demo.Utils.AppConstants;
import com.cron.demo.component.NotificacionComponent;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Cron {
    @Autowired
    private NotificacionComponent notificacionComponent;
    private Log logger = LogFactory.getLog(getClass());

    @Scheduled(cron = AppConstants.CRON_EVERY_FIVE_MINUTES)
    public void methodWithCronExpression() {
        try {
            notificacionComponent.main();
        } catch (Exception e) {
            logger.info(e);
        }
    }
}
