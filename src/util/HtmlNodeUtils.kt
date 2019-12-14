package util

import org.w3c.dom.css.ElementCSSInlineStyle
import org.w3c.dom.events.Event
import org.w3c.dom.events.EventTarget

var ElementCSSInlineStyle.isVisible: Boolean
    get() = style.visibility == "visible"
    set(value) {
        style.visibility = if (value) "visible" else "hidden"
    }

fun EventTarget.addClickListener(options: dynamic = null, onClick: (Event) -> Unit) {
    addEventListener("click", onClick)
}
