package tech.buildrun.ms_magalu_notification.repository

import org.springframework.data.jpa.repository.JpaRepository
import tech.buildrun.ms_magalu_notification.entity.Notification

interface NotificationRepository: JpaRepository<Notification, Long> {
}