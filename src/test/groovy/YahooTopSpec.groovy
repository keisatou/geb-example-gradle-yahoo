import spock.lang.*
import geb.spock.GebReportingSpec

class YahooTopSpec extends GebReportingSpec {
    def "can get to the top page of Yahoo! Japan"() {
        when:
        to YahooTopPage

        then:
        at YahooTopPage
    }

    def "can get to the top page of Yahoo! Shopping"() {
        given:
        to YahooTopPage

        when:
        shoppingLink.click()

        then:
        at YahooShoppingPage
    }

    def "can get to the top page of Yahoo! Search"() {
        given:
        to YahooSearchTopPage

        when:
        loginLink.click()

        then:
        at YahooLoginPage
    }
}

class YahooTopOnlySpec extends GebReportingSpec {
    def "can get to the top page of Yahoo! Japan"() {
        when:
        to YahooTopPage

        then:
        at YahooTopPage
    }
}
