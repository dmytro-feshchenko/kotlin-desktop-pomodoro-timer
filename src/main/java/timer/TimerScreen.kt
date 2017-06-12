package timer

import javafx.scene.Parent
import javafx.scene.layout.GridPane
import javafx.scene.paint.Color
import javafx.scene.text.TextAlignment
import tornadofx.*

/**
 * TimerScreen
 * Implements screen that displays Tomato timer
 */
class TimerScreen : View() {
    override val root = GridPane()
    val timerController: TimerController by inject()

    init {
        title = "Tomato Timer"

        with(root) {
            row {
                label {
                    text = "Tomato Timer"
                    textFill = Color.BROWN
                    textAlignment = TextAlignment.CENTER
                }
            }
            row {
                label {
                    text = "Work"
                    textFill = Color.RED
                    textAlignment = TextAlignment.CENTER
                }
            }
            row {
                label {
                    text = "25 : 00"
                    textAlignment = TextAlignment.CENTER
                }
            }
            row {
                button("Start") {
                    isDefaultButton = true

                    setOnAction {
                        timerController.startTimer()
                    }
                }
                button("Pause") {
                    setOnAction {
                        timerController.pauseTimer()
                    }
                }
                button("Stop") {
                    setOnAction {
                        timerController.stopTimer()
                    }
                }
            }
        }
    }
}