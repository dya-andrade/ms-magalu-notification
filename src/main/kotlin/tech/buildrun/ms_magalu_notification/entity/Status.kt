package tech.buildrun.ms_magalu_notification.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "tb_status")
data class Status(
    @Id
    private val statusId: Long? = null,
    private val description: String,
) {
    enum class Values(
        private val id: Long,
        private val description: String
    ) {
        PENDING(1L, "pending"),
        SUCCESS(2L, "success"),
        ERROR(3L, "error"),
        CANCELED(4L, "canceled");

        fun toStatus(): Status = Status(id, description)
    }
}
