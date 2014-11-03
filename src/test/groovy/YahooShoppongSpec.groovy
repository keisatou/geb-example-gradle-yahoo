class YahooShoppingSpec extends YahooCommonSpec {
    def "can get to the top page of Yahoo! Shopping"() {
        given:
        to YahooTopPage

        when:
        shoppingLink.click()

        then:
        at YahooShoppingPage
    }
}

