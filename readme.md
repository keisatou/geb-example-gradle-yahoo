[![Build Status](https://drone.io/github.com/keisatou/geb-example-gradle-yahoo/status.png)](https://drone.io/github.com/keisatou/geb-example-gradle-yahoo/latest)

# Description

This is an example of incorporating Geb into a Gradle build. It shows the use of Spock and JUnit 4 tests.

The build is setup to work with Firefox, Chrome and PhantomJS. Have a look at the `build.gradle` and the `src/test/resources/GebConfig.groovy` files.

# Usage

The following commands will launch the tests with the individual browsers:

    ./gradle chromeTest
    ./gradle firefoxTest
    ./gradle phantomJsTest

To run single test:

    gradle -DfirefoxTest.single=YahooShoppingSpec firefoxTest
    gradle -DfirefoxTest.single=YahooSearchSpec firefoxTest
    gradle -DfirefoxTest.single=YahooCommonSpec firefoxTest

To run with all, you can run:

    ./gradle test

Replace `./gradlew` with `gradlew.bat` in the above examples if you're on Windows.

# Questions and issues

Please ask questions on [Geb user mailing list](http://xircles.codehaus.org/lists/user@geb.codehaus.org) and raise issues in [Geb issue tracker](https://jira.codehaus.org/browse/GEB).
