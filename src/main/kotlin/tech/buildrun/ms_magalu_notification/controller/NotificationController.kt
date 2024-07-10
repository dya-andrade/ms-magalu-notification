package tech.buildrun.ms_magalu_notification.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import tech.buildrun.ms_magalu_notification.controller.dto.ScheduleNotificationDto
import tech.buildrun.ms_magalu_notification.service.NotificationService

@RestController
@RequestMapping("/notifications")
class NotificationController(
    private val notificationService: NotificationService
) {

    @PostMapping
    fun scheduleNotification(@RequestBody dto: ScheduleNotificationDto): ResponseEntity<Void> {
        notificationService.scheduleNotification(dto)

        return ResponseEntity.accepted().build()
    }
}