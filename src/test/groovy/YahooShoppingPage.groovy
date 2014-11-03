import geb.Page

class YahooShoppingPage extends Page {

    static url = 'http://shopping.yahoo.co.jp/'
    static at = { title.startsWith("Yahoo!ショッピング -") }
}
