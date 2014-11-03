import geb.Page

class YahooTopPage extends Page {

    static url = 'http://www.yahoo.co.jp/'
    static at = { title == "Yahoo! JAPAN" }

    static content = {
        loginLink { $(".sgn > p > a") }
        shoppingLink { $('#yahooservice > ul > li:nth-child(1) > a') }
    }
}
