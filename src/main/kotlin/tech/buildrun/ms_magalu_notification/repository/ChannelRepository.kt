package tech.buildrun.ms_magalu_notification.repository

import org.springframework.data.jpa.repository.JpaRepository
import tech.buildrun.ms_magalu_notification.entity.Channel

interface ChannelRepository: JpaRepository<Channel, Long> {
}