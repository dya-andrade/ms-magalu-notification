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
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "channel_id")
    val channel: Channel,
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "status_id")
    val status: Status
)


