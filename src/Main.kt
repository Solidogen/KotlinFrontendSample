import ui.BookStorePage
import ui.BookStorePresenter

fun main() {
    println("Initializing...")
    val presenter = BookStorePresenter()
    val page = BookStorePage(presenter)
    page.show()
}

val API_URL = js("getApiUrl()") as String
