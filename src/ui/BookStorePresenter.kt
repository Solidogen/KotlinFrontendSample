package ui

import API_URL
import model.Book
import org.w3c.xhr.XMLHttpRequest

class BookStorePresenter : BookStoreContract.Presenter {

    private lateinit var view: BookStoreContract.View

    override fun attach(view: BookStoreContract.View) {
        this.view = view
    }

    override fun loadBooks() {
        view.showLoader()
        getAsync(API_URL) { response ->
            val books = JSON.parse<Array<Book>>(response)
            view.hideLoader()
            view.showBooks(books.toList())
        }
    }

    private fun getAsync(url: String, callback: (String) -> Unit) {
        XMLHttpRequest().run {
            open("GET", url)
            onload = {
                if (readyState == 4.toShort() && status == 200.toShort()) {
                    callback.invoke(responseText)
                }
            }
            send()
        }
    }
}
