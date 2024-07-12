package tech.buildrun.ms_magalu_notification.service

import org.springframework.stereotype.Service
import tech.buildrun.ms_magalu_notification.controller.dto.ScheduleNotificationDto
import tech.buildrun.ms_magalu_notification.entity.Notification
import tech.buildrun.ms_magalu_notification.entity.Status
import tech.buildrun.ms_magalu_notification.repository.NotificationRepository
import java.time.LocalDateTime
import java.util.*
import java.util.function.Consumer

@Service
class NotificationService(
    private val notificationRepository: NotificationRepository
) {
    fun scheduleNotification(dto: ScheduleNotificationDto) {
        notificationRepository.save(dto.toNotification())
    }

    fun findById(notificationId: Long): Optional<Notification> =
        notificationRepository.findById(notificationId)

    fun cancelNotification(notificationId: Long) {
        findById(notificationId).map {
            val notification = it.copy(
                status = Status.Values.CANCELED.toStatus()
            )
            notificationRepository.save(notification)
        }
    }

    fun checkAndSend(dateTime: LocalDateTime) {
        notificationRepository.findByStatusInAndDateTimeBefore(
            listOf(
                Status.Values.PENDING.toStatus(), Status.Values.CANCELED.toStatus()
            ),
            dateTime
        ).forEach(sendNotification())
    }

    private fun sendNotification(): Consumer<Notification> =
        Consumer { n ->
            // TODO - REALIZAR O ENVIO DA NOTIFICAÇÃO

            val notification = n.copy(
                status = Status.Values.SUCCESS.toStatus()
            )
            notificationRepository.save(notification)
        }
}