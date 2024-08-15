#      Q05

def displayMenu():
     # Completed subprogram that displays the menu
    
    print("                  Menu                    ")
    print("------------------------------------------")
    print("[1] Add player name")
    print("[2] Play guess the capital city")
    print("[3] End game")
    print("------------------------------------------")

def getMenuChoice():
    # Completed subprogram that gets and validates the menu choice
    choices = [1,2,3]
    mChoice = 0
    
    # Menu choice is validated
    while mChoice not in choices:
        mChoice = int(input("Input your menu choice: "))

    # Valid menu option returned to the main menu
    return mChoice
     
def addPlayerName():
    # Add your code to:
    #   ensure a player name is input
    #   return the player name to the main menu
    playername = str(input("Enter Player Name: "))
    return playername


def guessCapital():
    # Partially completed subprogram to:
    #   display questions
    #   check guesses
    #   return final score
    
    # Arrays holding question numbers, countries and their capital cities
    questions = [1,2,3,4,5,6,7,8,9]
    countries = ["England","France","Spain","Italy","Germany","Scotland","Wales","United Arab Emirates","China"]
    capitals = ["London","Paris","Madrid","Rome","Berlin","Edinburgh","Cardiff","Abu Dhabi","Beijing"]

    questionCount = 1
    questionScore = 0

    # Add your code here

    completedquestions = [0]

    print("Answer 5 questions, select your option by entering the corresponding number::::")

    while questionCount != 6:

        for i in questions:
            for l in completedquestions:
                if (i != l):
                    print(f"{i}) Capital city of {countries[i-1]}")
                else:
                    print(f"{i}) Capital city of {countries[i-1] - DONE}")

        choice = int(input("Enter Number: "))
        print(f"What is the Capital city of {countries[choice-1]}")
        guess = str(input(""))
    



    
    return 

menuChoice = 0
score = 0
playerName = ""

while menuChoice != 3:
    displayMenu()
    menuChoice = getMenuChoice()
    
    #print("MENTU",menuChoice)
    if (menuChoice == 1):
        playerName = addPlayerName()
    elif (menuChoice ==2):
        guessCapital()

    # Add your code to:
    #   call the relevant subprogram if the menu choice is 1 or 2
    #   display the player name and the score if the menu choice is 3


    
        
