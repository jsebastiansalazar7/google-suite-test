#Author: js.salazar.aguirre@gmail.com
Feature: Google Translate
  As a web user
  I want to use Google Translate
  to translate words between different languages

  Scenario: Translate from English to Spanish
    Given that Susan wants to translate a word
    When she translates the word cheese from Inglés to Español
    Then she should see the word queso in the screen

  Scenario: Translate from Spanish to English
    Given that Susan wants to translate a word
    When she translates the word malteada from Español to Inglés
    Then she should see the word milk shake in the screen

  Scenario: Translate from Japanese to English
    Given that Susan wants to translate a word
    When she translates the word はじめまして from Japonés to Inglés
    Then she should see the word Nice to meet you in the screen
