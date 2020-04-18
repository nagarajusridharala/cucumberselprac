Feature: Application Login

Background: pre req for each scenario
Given validate the browser
When Broser is started
Then check if broser is started

@smoke
Scenario: Home page default Login
Given User is on Home landing page
When User login into application with "nagaraju" and "tester"
Then Home page is populated
And Cards are displayed "true"

@regression
Scenario: Home page default Login
Given User is on Home landing page
When User login into application with "nagaraju" and "tester"
Then Home page is populated
And Cards are displayed "false"

@smoke
Scenario: Home page default Login
Given User is on Home landing page
When User Sign Up with following details
| Naga | nagaraju@gmail.com | 9912272422 | Hyderabad | TG | IND |
Then Home page is populated
And Cards are displayed "false"

@regression
Scenario Outline: Home page default Login
Given User is on Home landing page
When User login into banking application with <Username> and <Password>
Then Home page is populated
And Cards are displayed "true"

Examples:
|Username	|Password	|
|User1		|pass1		|
|User2		|pass2		|
|User3		|pass3		|