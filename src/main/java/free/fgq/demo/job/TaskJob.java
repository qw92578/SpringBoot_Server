package free.fgq.demo.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时器
 */
@Component
@EnableScheduling
public class TaskJob {

    private static final Logger LOGGER = LoggerFactory.getLogger(TaskJob.class);

    @Scheduled(cron = "0 0 0 1/1 * ?")
    private void updateTaskStatusScheduled() {
        LOGGER.info(" 定时任务开始，时间："+System.currentTimeMillis());
//        Date date = new Date();
       //逻辑处理
    }
}
