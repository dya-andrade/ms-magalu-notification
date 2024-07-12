package tech.buildrun.ms_magalu_notification

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@EnableScheduling
@SpringBootApplication
class MsMagaluNotificationApplication

fun main(args: Array<String>) {
	runApplication<MsMagaluNotificationApplication>(*args)
}
