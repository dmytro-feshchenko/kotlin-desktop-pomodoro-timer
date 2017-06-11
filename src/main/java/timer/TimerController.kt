package timer

import tornadofx.Controller
import tornadofx.FX

/**
 * TimerController
 * Implements controller for Tomato timer
 */
class TimerController : Controller() {
    val timerScreen: TimerScreen by inject()

    fun init() {
        showTimerScreen()
    }

    fun showTimerScreen() {
        if (FX.primaryStage.scene.root != timerScreen.root) {
            FX.primaryStage.scene.root = timerScreen.root
            FX.primaryStage.sizeToScene()
            FX.primaryStage.centerOnScreen()
        }


    }

    companion object {
        val TASK = "task"
    }
}