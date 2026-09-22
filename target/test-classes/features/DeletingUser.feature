Feature: Delete User Functionality
    We will check if a user is deleted successfully.

    Scenario: Successfully delete a user
        Given I have the user's id
        When I send a DELETE request
        Then the user should be deleted successfully
        And the response status code should be 200