package com.riverluoo.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author wangyang
 * @since 2019-01-16 16:49
 */
@Component
public class CronJob {
    private static final Logger logger = LoggerFactory.getLogger(CronJob.class);

    @Scheduled(cron = "0/5 * * * * ?")
    public void checkState1() {
        logger.info(">>>>> cron每5秒检查开始....");
        logger.info(">>>>> cron每5秒检查完成....");
    }
}
