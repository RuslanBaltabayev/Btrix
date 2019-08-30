Feature: Create a New Task from Activity Stream
  As a user I should be able to create a new task from Activity Stream
@addtask
  Scenario: Create a new task,upload a file and image or link,add checklist
    Given user logs in  as a "helpdesk"
    Then user goes to My Task and click plus icon
    And user uploads a document to a "example"
    Then user sets up a deadline due "25"th of any month for a "example" task


     #Verify that user can create new task by clicking on tasks on activity stream.
     #ØVerify that user can upload a file and image or link or add checklist regarding to new task.
     #ØVerify that user should be able to set up a deadline for new task.