Feature: validate login functionality

Background: description
Given launch browser

@smoke  @regression 
Scenario: Validate login functionality with valid data

Given Launch browser and navigurl
When Enter user name and password
Then validate login screen



