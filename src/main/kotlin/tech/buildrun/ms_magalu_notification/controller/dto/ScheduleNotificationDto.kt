package tech.buildrun.ms_magalu_notification.controller.dto

import tech.buildrun.ms_magalu_notification.entity.Channel
import tech.buildrun.ms_magalu_notification.entity.Notification
import tech.buildrun.ms_magalu_notification.entity.Status
import java.time.LocalDateTime

data class ScheduleNotificationDto(
    val dateTime: LocalDateTime,
    val destination: String,
    val message: String,
    val channel: Channel.Values
) {
    fun toNotification(): Notification =
        Notification(
            dateTime = this.dateTime,
            destination = this.destination,
            message = this.message,
            channel = this.channel.toChannel(),
            status = Status.Values.PENDING.toStatus()
        )
}
