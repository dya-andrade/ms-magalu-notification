package tech.buildrun.ms_magalu_notification.repository

import org.springframework.data.jpa.repository.JpaRepository
import tech.buildrun.ms_magalu_notification.entity.Notification
import tech.buildrun.ms_magalu_notification.entity.Status
import java.time.LocalDateTime

interface NotificationRepository: JpaRepository<Notification, Long> {

    fun findByStatusInAndDateTimeBefore(listOf: List<Status>, dateTime: LocalDateTime): List<Notification>
}