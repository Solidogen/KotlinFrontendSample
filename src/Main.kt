fun main(args: Array<String>) {
    println(API_URL)
}

val API_URL = js("getApiUrl()") as String