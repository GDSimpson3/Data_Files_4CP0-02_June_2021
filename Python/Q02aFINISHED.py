# Q02a

# Initialise variables
username = "bard423"
password = "nX2934"
# Print prompts, take and check input from user
inputedusername = input("Enter Username: ")
inputedpassword = input("Enter Password: ")

while(username != inputedusername or password != inputedpassword):
    print("Incorrect Credentials")
    inputedusername = input("Enter Username: ")
    inputedpassword = input("Enter Password: ")


print("Welcome")


