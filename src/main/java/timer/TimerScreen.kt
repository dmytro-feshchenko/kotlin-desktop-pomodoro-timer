package timer

import javafx.scene.Parent
import javafx.scene.layout.GridPane
import tornadofx.*

/**
 * TimerScreen
 * Implements screen that displays Tomato timer
 */
class TimerScreen : View() {
    override val root = GridPane()
    val timerController: TimerController by inject()


}