[![CI Status](https://github.com/se-edu/addressbook-level3/workflows/Java%20CI/badge.svg)](https://github.com/se-edu/addressbook-level3/actions)

![Ui](docs/images/Ui.png)

* ## **Instructions**
  1. Ensure that you have Java 11 or above installed in your computer
  2. Download the latest [App name] from [hyperlink]
  3. Copy the file download location to the folder that you want to use as the home folder for your [App name]
  4. Double click on the file to start the app
  5. Once the app is started, you can begin by typing certain commands in the command box to execute certain actions. E.g: typing help and pressing enter will open the help windows for guidance on some command executions.
      * add module : mc/CS2103 mc/Software Engineering tn/iP Level 10 d/ Feb 15 t/ 1800 will add this module to the list
      * delete module [num list] : delete 3 will delete 3rd task from the listlist : will shown all module tasks
      * mark as done [num list] : mark as done 3 will mark 3rd task from the list as done
      * sort : sort d/ march will sort and show all march tasks on the top of the list and then Jan, Feb … Dec
      * edit task [num list] : edit 3 will allow user to edit the 3rd module task from the list
      * add notes [num list] : add notes 3 will add notes to the 3rd module task from the list
      * Priority tag HIGH/MEDIUM/LOW : pt/HIGH 3 will assign a high priority to the 3rd task on the list. 
      * Time-based alert : alert will show a list of immediate tasks that will be due next week
      * clear : will delete all module tasks on the list

6. Refer to the features for each individual commands for more details 



## **Commands**

1. ### Delete Task : *delete*
  * Format delete[index]
    1. eg: delete 3 will delete the 3rd task on the list
    2. Index to be inserted must be positive, and
    3. Index must be available on the list else an error will be thrown
    4. Example: Using the command list to show all tasks, the user wants to delete the 2nd task. User use command delete 2 to delete the 2nd task from the list 



2. Priority tag: *pt/Priority*
  * Format: pt/HIGH 3
    1. Will assignment a priority of HIGH to the 3rd task on the list
    2. Priority levels LOW -> MEDIUM -> HIGH
    3. Index inserted must be positive, and 
    4. Index must be available on the list else an error will be thrown
    5. Priority tag must be either HIGH, MEDIUM or LOW.
    6. Example: list to show all tasks on the list followed by pt/LOW 2 to assign a priority tag of LOW to the 2nd task on the list followed by sort LOW/low to view the list according to priority level 



3. Module name: *mn/*
  * Format: mn/ {module name}
    1. Sets the module name of a task
    2. Example: mn/Software Engineering. Sets the module name of the task to “Software Engineering”



4. Module code: *mc/*
  * Format: mc/ {module code}
    1. Sets the module code of a task
    2. Module code must be a CS module code 



5. Edit Task: *edit*
  * Format: edit INDEX [tn/TASK NAME] [mn/MODULE NAME] [mc/MODULE CODE] [d/ DEADLINE DATE] [t/DEADLINE TIME] [n/NOTES] [pt/PRIORITY]
    1. Edits the task at the specified index.
    2. The index must be a positive integer
    3. The index must be on the list else an error will be thrown
    4. At least one of the optional fields must be provided
    5. Existing values will be updated to the input values
    6. Example: edit 1 mn/Software Engineering mc/CS2103. Edits the module name and module code of the task at index 1 to be “Software Engineering” and “CS2103” respectively.
    7. Example: edit 2 tn/Finals n/Open Book. Edits the task name and notes of the task at index 2 to be “Finals” and “Open Book” respectively.



6. Clear Application: *clear* 
  * Clears all tasks from the application
  * Format: clear



7. Locating tasks by name: *find*
  * Find tasks whose task name contains any of the given words
  * Format: find KEYWORD[MORE_KEYWORDS]
    1. The search is case-insensitive. e.g Assignment will match assignment
    2. The order of the keywords does not matter. e.g. programming modular will match modular programming
    3. Only the task name is searched.
    4. Only full words will be matched e.g. Java will not match Javascript
    5. Persons matching at least one keyword will be returned (i.e. OR search). e.g. SQL Python will return SQL Quiz, Python Assignment
    6. Example: find C++ will return C++ project and C++ graded quiz
    7. find assignment exam will return Final Assignment, Midterm exam



8. Sort tasks: *sort*
  * Sort tasks according to the specified parameter
  * Format: sort dt/ OR mc/ OR pt/
    1. Task can be sorted according to these three parameters: date & time (/dt), module code (mc/) or priority tag (pt/).
    2. For date & time, the tasks will be sorted in ascending order, with the earliest deadline placed first.
    3. For module code, the tasks will be sorted according to the lexicographical ordering of the module codes.
    4. For priority tag, the tasks will be sorted according to this order: HIGH > MEDIUM > LOW. Tasks with high priority will then be shown at the top of the list.



9. Add notes to tasks: *notes*
  * Adds any additional notes or remarks to an exisiting task
  * Format: notes INDEX [n/NOTES]
    1. Adds user input NOTES to the task at the specified INDEX. The index refers to the index number shown in the displayed task list. The index must be a positive integer 1, 2, 3, …
    2. Adding notes to a task that already has existing notes will overwrite the previous notes.
    3. Example: list followed by notes 2 n/Hello World! adds the note “Hello World!” to the 2nd task in the task list.
    4. Example: find assignment followed by notes 1 n/fooBar adds the note “fooBar” to the 1st task in the results of the find command.
 



## Original README by author

* This is **a sample project for Software Engineering (SE) students**.<br>
  Example usages:
  * as a starting point of a course project (as opposed to writing everything from scratch)
  * as a case study
* The project simulates an ongoing software project for a desktop application (called _AddressBook_) used for managing contact details.
  * It is **written in OOP fashion**. It provides a **reasonably well-written** code base **bigger** (around 6 KLoC) than what students usually write in beginner-level SE modules, without being overwhelmingly big.
  * It comes with a **reasonable level of user and developer documentation**.
* It is named `AddressBook Level 3` (`AB3` for short) because it was initially created as a part of a series of `AddressBook` projects (`Level 1`, `Level 2`, `Level 3` ...).
* For the detailed documentation of this project, see the **[Address Book Product Website](https://se-education.org/addressbook-level3)**.
* This project is a **part of the se-education.org** initiative. If you would like to contribute code to this project, see [se-education.org](https://se-education.org#https://se-education.org/#contributing) for more info.
