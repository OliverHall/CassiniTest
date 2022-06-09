# Oliver Hall Cassini Assessment
This has been built upon a serenity template -> https://github.com/serenity-bdd/serenity-cucumber-starter

### Testing with Serenity and Cucumber

Serenity BDD is a library that makes it easier to write high quality automated acceptance tests, with powerful reporting and living documentation features. It has strong support for both web testing with Selenium, and API testing using RestAssured.

Serenity strongly encourages good test automation design, and supports several design patterns, including classic Page Objects, the newer Lean Page Objects/ Action Classes approach, and the more sophisticated and flexible Screenplay pattern.

The latest version of Serenity supports Cucumber 6.x.

### The project directory structure
This project has build scripts for both Maven and Gradle, and follows the standard directory structure used in most Serenity projects:
However this piece of work is focusing on the Maven build tool!
```Gherkin
src
  + main
  + test
    + java                        Test runners and supporting code
    + resources
      + driver                    Driver locations
      + features                  Feature files

```

## Pre-requisistes

1. Maven is installed (From the command line run "mvn -v")

2. Java is installed (From the command line run "java -version") java JDK 8+ is required

3. Git is installed (From the command line run "git --version")

## Initial Set Up

1. Clone the project to your local folder (https://github.com/OliverHall/CassiniTest.git)

2. Update the (web)drivers folder with your desired wedbdriver version (webdriver version must equal browser version)(the project comes with chromedriver version 80 by default)
   -> resources/drivers/<yourOS>
   included in project is chromedriver 98

3. Set your desired browser you wish you test against. By default driver = chrome. You can also set tests to run headless (true)
   Available drivers:
   | driver	    | Download source                                 |
   | ------------- | ----------------------------------------------- |
   `firefox `	| https://github.com/mozilla/geckodriver/releases
   `chrome`      | http://chromedriver.chromium.org
   -> src/test/resources/serenity.conf
   webdriver {
   driver = chrome
   }
   headless.mode = false

4. Install pom file dependencies using Maven
   -> From the project root, in terminal, execute 'mvn clean install'.
   


## Executing the tests

Once the project has been built successfully, the tests can be executed in a number of ways in Maven in the command line:

| Command																| Description           |
| --------------------------------------------------------------------- | --------------------- |
`mvn clean verify`													| Run all features
`mvn clean verify -Dit.test=Feature01IT`						        | Run a single feature
`mvn failsafe:integration-test -Dit.test=Belly01IT`			        | Run a single scenario, but without recompiling the code
`mvn clean verify -Dcucumber.options="--tags @regression"`	        | Run scenarios with a specific tag (@visaTests, @postcodeTest)
`mvn clean verify -Dit.test=Belly01IT`                                | Run a single test by compiling the code
`mvn failsafe:integration-test -Dit.test=Belly01IT`                   | Run a single test from compiled sources


## The Framework

This framework provides the capability to create and execute business facing tests using the BDD software development process. It provides a wrapper around [Serenity](http://www.thucydides.info), a BDD open source library. The key features provided are:
Serenity has enables us to write cleaner and more maintainable automated acceptance and regression tests faster.

1. Tests can be written in feature files using the "Given, When, Then" structure (by using Gherkin, which is the name of Cucumber's DSL).

2. Webdriver support using [Serenity Page Objects](http://serenity-bdd.info/docs/serenity/#_writing_serenity_page_objects)

3. Support for API testing with RESTAssured


## Serenity Reports

Serenity also uses the test results to produce illustrated, narrative reports that document and describe what your application does and how it works. Serenity tells you not only what tests have been executed, but more importantly, what requirements have been tested.
Once you have executed the tests, Serenity will create reports under the `target/site/serenity/index.html`. Here you can view the test execution status and requirements coverage (if configured in pom.xml).
