[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=17380684)
# OOC1 Project

**Title:** Soccer Teams  
**Name:** Devlin O'Toole
**Student ID:** G00417177 

## Application Function

this application llows users to manage soccer teams. It provides a menu-driven interface for:

Adding a new soccer team.
Deleting an existing team by name.
Listing all teams.
Finding a team by its name.
Counting the total number of teams.
Calculating the strength of a specific team.
The application ensures simplicity and ease of use for soccer team data management.

## Running the Application

Provide step by step instructions on how to run your applicaiton. Are there any prerequisite softwares required?

```list
List the instructions step by step
    1. Locate the Main class in the ie.atu.project package
    2. Compile and execute the Main class.
    3. Use the menu-driven interface to interact with the application
    4. Select options 1 to 7 for specific features.
    5. Follow the on-screen prompts to input team details or perform operations.
            :
            :
```

## Minimum Project Requirements

Describe how you have met all minimum project requirements below:

* The repository contains, at minimum, two commits per week .
* Code and documentation are fully contained in the provided GitHub repository.
*Required Methods:
 Add Team: Add a new soccer team to the manager.
Delete Team: Remove a team by name.
Count Teams: Show the total number of teams.
Search Teams: Find and display a team by name.
Quit: Exit the program.
* The code compiles successfully.
* The code adheres to a consistent and clean formatting style.
* All classes, methods, and variables include appropriate comments for clarity.
* The documentation and comments have been thoroughly proofread.

## Project Requirements above and beyond

The following features and design choices demonstrate additional effort beyond the minimum requirements:

Team Strength Calculation:

Implemented a method to calculate team strength based on attributes such as budget, number of players, and championship status.
Abstract Class and Inheritance:

Created an abstract class Team to enforce a consistent structure for all team types.
SoccerTeam extends Team and implements additional methods.

## Application Architecture

Main Class

Contains the menu-driven interface for user interaction.
Handles user input and calls appropriate methods in SoccerTeamManager.

SoccerTeamManager Class

Manages a list of SoccerTeam objects.
Methods:
addTeam(): Adds a new team.
deleteTeam(): Removes a team by name.
listAllTeams(): Displays all teams.
findTeam(): Finds a team by name.
countTeams(): Returns the total number of teams.
Team Class (Abstract)

Base class for all team types.
Contains common attributes: teamName, country, and foundedYear.
Enforces the method calculateTeamStrength() in subclasses.
SoccerTeam Class

Extends the Team class.
Adds soccer-specific attributes: numberOfPlayers, league, coachName, isChampion, and teamBudget.
Implements calculateTeamStrength() based on team budget, players, and championship status.


## Roadblocks and Unfinished Functionality

There was a lot of difficulties when coding this as it was a bigger task then I was used too. Most of the issues was having ideas like the team strength and not knowing how to impimplementit. A way I got around these issues was asking chat gpt how to fix my issues and explain to me where I was going wrong. I also maybe could of added in an update feature to update teams.

## Resources

Provide links to resources used:

* [ChatGPT](https://chatgpt.com/) - I found chatgpt really helpful for explaining where I was going wrong
