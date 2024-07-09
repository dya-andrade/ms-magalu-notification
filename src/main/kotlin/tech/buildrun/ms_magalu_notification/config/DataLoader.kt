package tech.buildrun.ms_magalu_notification.config

import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Configuration
import tech.buildrun.ms_magalu_notification.entity.Channel
import tech.buildrun.ms_magalu_notification.entity.Status
import tech.buildrun.ms_magalu_notification.repository.ChannelRepository
import tech.buildrun.ms_magalu_notification.repository.StatusRepository

@Configuration
class DataLoader(
    private val channelRepository: ChannelRepository,
    private val statusRepository: StatusRepository
): CommandLineRunner {

    override fun run(vararg args: String?) {
        Channel.Values.entries
            .map{it.toChannel()}
            .forEach(channelRepository::save)

        Status.Values.entries
            .forEach {
                statusRepository.save(it.toStatus())
            }
    }
}