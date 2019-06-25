Feature: Login Test for Facebook Account


Background:
Given Open the browser
And Maximize the browser
And Set Timeouts
And Open the URL

Scenario Outline: TC001 Sucessful Login
And Provide username as <uname>
And Provide password as <pwd>
And Click login
Then Verify sucessful login
But Verify Unsucessful login

Examples:
|uname|pwd|
|wolverine.joseph@gmail.com|Riya.jj23|
|wolverine.joseph@gmail.com|Riya.jj|
