import geb.Page

class YahooLoginPage extends Page {

    static at = { title.startsWith("ログイン -") }

}
