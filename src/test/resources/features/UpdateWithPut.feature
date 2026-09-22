Feature: Update User Subject Functionality
    We will check if a user's subject is updated successfully.

    Scenario: Successfully update a user's subject
        Given I have the updated subject and the other details of a user
        When I send a PUT request to update the user's subject
        Then the user's subject should be updated successfully with status code 200