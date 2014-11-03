import geb.Page

class YahooSearchTopPage extends Page {

    static url = 'http://search.yahoo.co.jp/'
    static at = { title == "Yahoo!検索" }

    static content = {
        loginLink { $(".sgn > p > a") }
    }
}
