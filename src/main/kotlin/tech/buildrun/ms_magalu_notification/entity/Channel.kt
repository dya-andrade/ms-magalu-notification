package tech.buildrun.ms_magalu_notification.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "tb_channel")
data class Channel(
    @Id
    private val channelId: Long? = null,
    private val description: String,
) {
    enum class Values(
        private val id: Long,
        private val description: String
    ) {
        EMAIL(1L, "email"),
        SMS(2L, "sms"),
        PUSH(3L, "push"),
        WHATSAPP(4L, "whatsapp");

        fun toChannel(): Channel = Channel(id, description)
    }
}
