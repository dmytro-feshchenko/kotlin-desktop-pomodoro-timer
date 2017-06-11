package timer

import tornadofx.box
import tornadofx.Stylesheet
import tornadofx.cssclass
import tornadofx.px

/**
 * Created by dmitryi on 6/11/17.
 */
class Styles : Stylesheet() {
    companion object {
        val timerScreen by cssclass()
    }

    init {
        select(timerScreen) {
            padding = box(15.px)
            vgap = 7.px
            hgap = 10.px
        }
    }
}