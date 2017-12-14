# Practical test for AutoQA candidates

<h3>Usage</h3>
Tests can be run with the following gradlew command:

```
$ ./gradlew runAllTests
```

<br>This task will run all TestNg tests and create allure report at tne end.
<br>You should see failed tests and generated Allure XML files in build/reports/allure-report directory.
<br><i>Note:</i> To see report you should open build/reports/allure-report/index.html in Firefox browser.(or any other browser, not Chrome)
To open in default browser please run ./gradlew allureServe command in console.  
<h3>Tasks</h3>
 <i><b>runAllTests</i></b> - runs all TestNg tests
 <br><b><i>runLoginTests</i></b> - run TestNG tests with 'login' group
 <br><b><i>runSoapTests</i></b> - run TestNG tests with 'soapApi' group
<br><b><i>runRestTests</i></b> - run TestNG tests with 'restApi' group
<h3>Overview</h3>
Created test framework based on:

```
Java
TestNG
Allure
Gradle
RESTAssured
Selenium 2.53

```

## Restrictions
UI test can be run on two browsers:
Chrome -  62.0 version
Firefox - 46.0 version

# Practical test:

## SOAP API

Please use a freely selected language (Java preferred) to create simple test which sends an HTTP POST Request to: http://www.webservicex.net/uszip.asmx?op=GetInfoByCity (set city as New York) and asserts that in the response payload number of ZIP codes is greater then 2.

API description available here: http://www.webservicex.net/uszip.asmx?op=GetInfoByCity

## REST API

Please use a freely selected language (Java preferred) to create a simple tests which sends an HTTP GET 
to https://restcountries.eu/rest/v2/capital/Berlin
and assert that in the JSON response altSpellings is equal to:

     "altSpellings": [
            "DE",
            "Federal Republic of Germany",
            "Bundesrepublik Deutschland"
        ],

## UI testing

Please use a freely picked language (Java preferred) combined with Selenium WebDriver to prepare two simple scenarios for the https://my.finiata.pl/sign-in

1. Unsuccessful login scenario: Create a simple scenario that inputs incorrect credentials (e-mail and pass), hits login and asserts that login is unsuccessful
1. Brute force scenario: Generate 10 random sets of e-mail and password and use those credentials to login to the  https://my.finiata.pl/sign-in
