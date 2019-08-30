@abc
Feature: Login

  Scenario Outline: login with different role
    Given user logs in  with a '<username>' and '<password>'
    Examples:
      | username          | password |
      | hrusername        | hrpassword |
      | marketingusername | marketingpassword |
      | helpdeskusername  | helpdeskpassword |


































#  @verify_title
#  Feature: Verify page titles
#  Verify page titles when user logs in as a different role
#
#  Scenario Outline: Login with a different role and verify page title
#    Given  user logs in  as a "<role>"
#    When click to a "<module>"
#    Then title of the page should be "<title>"
#    Examples:
#      | role      | module  | title   |
#      | hr        | Company | Company |
#      | marketing | Company | Company |