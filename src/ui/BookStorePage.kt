package ui

import model.Book
import org.w3c.dom.HTMLDivElement
import ui.view.CardBuilder
import util.isVisible
import kotlin.browser.document

class BookStorePage(private val presenter: BookStoreContract.Presenter) : BookStoreContract.View {

    private val loader = document.getElementById("loader") as HTMLDivElement
    private val content = document.getElementById("content") as HTMLDivElement
    private val cardBuilder = CardBuilder()

    override fun showBooks(books: List<Book>) {
        books.forEach { book ->
            val card = cardBuilder.build(book)
            content.append(card)
        }
    }

    override fun showLoader() {
        loader.isVisible = true
    }

    override fun hideLoader() {
        loader.isVisible = false
    }

    fun show() {
        presenter.run {
            attach(this@BookStorePage)
            loadBooks()
        }
    }
}
