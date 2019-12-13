package ui

import model.Book

class BookStorePage(private val presenter: BookStoreContract.Presenter) : BookStoreContract.View {

    override fun showBooks(books: List<Book>) {
    }

    override fun showLoader() {
    }

    override fun hideLoader() {
    }
}
