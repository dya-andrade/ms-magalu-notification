package tech.buildrun.ms_magalu_notification.service

import org.springframework.stereotype.Service
import tech.buildrun.ms_magalu_notification.controller.dto.ScheduleNotificationDto
import tech.buildrun.ms_magalu_notification.repository.NotificationRepository

@Service
class NotificationService(
    private val notificationRepository: NotificationRepository
) {
    fun scheduleNotification(dto: ScheduleNotificationDto) {
        notificationRepository.save(dto.toNotification())
    }
}