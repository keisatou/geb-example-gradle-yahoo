import spock.lang.*
import geb.spock.GebReportingSpec

class YahooCommonSpec extends GebReportingSpec {
    @Shared def hoge

    def "can get to the top page of Yahoo! Japan"() {
        when:
        to YahooTopPage

        then:
        at YahooTopPage
    }

    def "hoge"() {
        when:
        hoge = YahooUtil.getHoge()

        then:
        hoge == 'hoge'
    }

    def "piyo"() {
        expect:
        hoge == 'hoge'
    }
}

class YahooUtil {
    public static String getHoge() {
        return 'hoge'
    }
}
