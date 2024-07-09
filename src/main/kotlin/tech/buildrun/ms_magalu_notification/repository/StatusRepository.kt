package tech.buildrun.ms_magalu_notification.repository

import org.springframework.data.jpa.repository.JpaRepository
import tech.buildrun.ms_magalu_notification.entity.Status

interface StatusRepository: JpaRepository<Status, Long> {
}