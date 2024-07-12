package tech.buildrun.ms_magalu_notification.scheduler

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import tech.buildrun.ms_magalu_notification.service.NotificationService
import java.time.LocalDateTime
import java.util.concurrent.TimeUnit

@Component
class MagaluTaskScheduler(
    private val logger: Logger = LoggerFactory.getLogger(MagaluTaskScheduler::class.java),
    private val notificationService: NotificationService
) {

    @Scheduled(fixedDelay = 1, timeUnit = TimeUnit.MINUTES)
    fun checkTasks() { // vai rodar de 1min em 1min
        val dateTime = LocalDateTime.now()
        logger.info("Running at $dateTime")

        notificationService.checkAndSend(dateTime)
    }
}