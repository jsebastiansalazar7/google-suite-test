#Author: js.salazar.aguirre@gmail.com
Feature: Youtube
  As a web user
  I want to use Youtube
  to watch my favorite videos and listen to music

  Scenario: Search an existing video
    Given that Mike wants to watch a video
    When he searches the video Beethoven Symphony 7 + Hubble images
    Then he should see at least 1 video listed
