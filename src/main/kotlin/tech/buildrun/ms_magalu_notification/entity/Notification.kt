package tech.buildrun.ms_magalu_notification.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "tb_notifications")
data class Notification(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val notificationId: Long? = null,
    val dateTime: LocalDateTime,
    val destination: String,
    val message: String,
    @ManyToOne
    @JoinColumn(name = "channel_id")
    val channel: Channel,
    @ManyToOne
    @JoinColumn(name = "status_id")
    val status: Status
)


