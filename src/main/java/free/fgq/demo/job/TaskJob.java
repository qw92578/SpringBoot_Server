package free.fgq.demo.job;

import free.fgq.demo.dao.IndexDao;
import free.fgq.demo.dto.IndexDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 定时器
 */
@Component
@EnableScheduling
public class TaskJob {

    private static final Logger LOGGER = LoggerFactory.getLogger(TaskJob.class);

    @Autowired
    IndexDao indexDao;

    @Scheduled(cron = "0 0 0 1/1 * ?")
    private void updateTaskStatusScheduled() {
        LOGGER.info(" 定时任务开始");
        Date date = new Date();
        IndexDto indexDto = new IndexDto();
       //逻辑处理

    }
}
