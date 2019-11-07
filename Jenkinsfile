pipeline {

    // Here we set which CI node/agent we want to run on
    agent any

    // Here we can set what environment we're running on, which browser etc...
    parameters {
        string(name: 'tests', defaultValue: 'RunCucumberTest', description: 'cucumber tests')
        string(name: 'url', defaultValue: 'http://toolslist.safebear.co.uk:8080', description: 'test environment')
        string(name: 'browser', defaultValue: 'chrome_headless', description: 'chrome headless')
        string(name: 'sleep', defaultValue: '0', description: 'zero out any sleep commands')
    }

    triggers { pollSCM('* * * * *') } // poll the source code repo every minute.

    stages {

        stage('BDD Requirements Testing') {
            steps {

                // The maven command to run our tests
                bat "mvn -Dtest=${params.tests} test -Durl=${params.url} -Dbrowser=${params.browser} -Dsleep=${params.sleep}"
            }

            // Run this next step after the tests have run
            post {

                // Run this next step even if our tests fail
                always {

                    // The maven command to generate our report
                    bat "mvn cluecumber-report:reporting"

                    // Publish our report in Jenkins
                    publishHTML([
                            allowMissing         : false,
                            alwaysLinkToLastBuild: false,
                            keepAll              : false,
                            reportDir            : 'target/generated-report',
                            reportFiles          : 'index.html',
                            reportName           : 'BDD Report',
                            reportTitles         : ''])
                }
            }
        }

    }
}