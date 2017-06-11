package timer

import javafx.application.Application
import javafx.stage.Stage
import tornadofx.*

/**
 * PomodoroApp
 */
class PomodoroApp : App(TimerScreen::class) {
    val timerController: TimerController by inject()

    override fun start(stage: Stage) {
        importStylesheet(Styles::class)
        super.start(stage)
        timerController.init()
    }

    fun main(args: Array<String>) {
        Application.launch(PomodoroApp::class.java, *args)
    }
}

fun main(args: Array<String>) {
    Application.launch(PomodoroApp::class.java, *args)
}