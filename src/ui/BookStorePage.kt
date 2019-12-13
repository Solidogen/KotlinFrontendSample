package ui

import model.Book
import org.w3c.dom.HTMLDivElement
import util.isVisible
import kotlin.browser.document

class BookStorePage(private val presenter: BookStoreContract.Presenter) : BookStoreContract.View {

    private val loader = document.getElementById("loader") as HTMLDivElement
    private val content = document.getElementById("content") as HTMLDivElement

    override fun showBooks(books: List<Book>) {
    }

    override fun showLoader() {
        loader.isVisible = true
    }

    override fun hideLoader() {
        loader.isVisible = false
    }
}
