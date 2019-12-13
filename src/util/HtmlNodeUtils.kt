package util

import org.w3c.dom.css.ElementCSSInlineStyle

var ElementCSSInlineStyle.isVisible: Boolean
    get() = style.visibility == "visible"
    set(value) {
        style.visibility = if (value) "visible" else "hidden"
    }
