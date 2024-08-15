# Q04(a)

import random

# Get input

productname=str(input("Enter Product name: "))




# Generate a random number between 10 and 30 inclusive
randomint=random.randint(10,30)



# Generate the product code - first three letters of product name and the random number
productcode = f"{productname[:3]}{randomint}"



# Display the product code and the product name

print(f"Product Code: {productcode} and product name is {productname}")


