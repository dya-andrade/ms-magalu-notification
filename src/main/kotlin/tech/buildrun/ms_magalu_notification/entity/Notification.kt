package tech.buildrun.ms_magalu_notification.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "tb_notifications")
data class Notification(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val notificationId: Long? = null,
    private val dateTime: LocalDateTime,
    private val destination: String,
    private val message: String,
    @ManyToOne
    @JoinColumn(name = "channel_id")
    private val channel: Channel,
    @ManyToOne
    @JoinColumn(name = "status_id")
    private val status: Status
)


