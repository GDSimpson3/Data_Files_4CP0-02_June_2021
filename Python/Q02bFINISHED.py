# Q02(b)

# Initialise variables
booksSold = 0
profit = 0

booksSold = int(input("Enter the number of books sold: "))
profit = int(input("Enter the profit made: "))

# Add your code
if (booksSold < 10 or profit <5): 
    print("Poor performance this week")
elif (booksSold > 20 and profit >=20): 
    print("Sales and profit are excellent this week")
elif (booksSold >=5 and profit >=10): 
    print("Sales and profit are good this week")
else:
    print("Alert manager")
