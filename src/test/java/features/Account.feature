Feature: account section

@smoke
Scenario: Home page default Login
Given User is on Home landing page
When User login into application with "nagaraju" and "tester"
Then Home page is populated
And Cards are displayed "true"

@piv
Scenario: Home page default Login
Given User is on Home landing page
When User login into application with "nagaraju" and "tester"
Then Home page is populated
And Cards are displayed "false"

@mobileTest
Scenario: Home page default Login
Given User is on Home landing page
When User login into application with "nagaraju" and "tester"
Then Home page is populated
And Cards are displayed "false"

@webTest
Scenario: Home page default Login
Given User is on Home landing page
When User login into application with "nagaraju" and "tester"
Then Home page is populated
And Cards are displayed "true"