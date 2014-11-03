class YahooSearchSpec extends YahooCommonSpec {
    def "can get to the top page of Yahoo! Search"() {
        given:
        to YahooSearchTopPage

        when:
        loginLink.click()

        then:
        at YahooLoginPage
    }
}

