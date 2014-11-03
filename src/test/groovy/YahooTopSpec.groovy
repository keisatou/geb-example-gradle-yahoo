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

