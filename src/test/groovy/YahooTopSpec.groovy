import spock.lang.*
import geb.spock.GebReportingSpec

class YahooCommonSpec extends GebReportingSpec {
    def "can get to the top page of Yahoo! Japan"() {
        when:
        to YahooTopPage

        then:
        at YahooTopPage
    }
}

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
