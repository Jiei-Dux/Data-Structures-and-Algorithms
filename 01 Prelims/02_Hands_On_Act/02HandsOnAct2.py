#   Python Script
#   02 Hands On Activity - 02HandsOnAct2.py
#   Data Structures and Algorithm
#   Github: https://github.com/Jiei-Dux




#   Recursion
def sumOf_First(n):
    if n < 0:
        return 0

    return n + sumOf_First(n - 1)

# User Input
usrInput = input("Enter a number: ")
n = int(usrInput)

print("The sum of the first", usrInput, "integers is", sumOf_First(n))
