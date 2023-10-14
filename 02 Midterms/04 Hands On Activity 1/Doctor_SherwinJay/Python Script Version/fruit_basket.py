basket = []

print("\nCatch and eat any of these fruits: [ 'Apple' | 'Orange' | 'Mango' | 'Guava' ] \n ")

numOfFruits = int(input("How many fruits would you like to catch?: "))

print("\n\nChoose a fruit to catch. Enter [ A, O, M, or G ]")

FruitNum = 1
maxNumOfFruits = numOfFruits
STRFruitNum = str(FruitNum)
STRmaxNumOfFruits = str(maxNumOfFruits)
message1 = "Fruit " + STRFruitNum + " of " + STRmaxNumOfFruits + ": "

while numOfFruits != 0:
    chosenFruit = input(message1)

    if chosenFruit == "a" or chosenFruit == "A":
        basket.append("Apple")

    if chosenFruit == "o" or chosenFruit == "O":
        basket.append("Orange")

    if chosenFruit == "m" or chosenFruit == "M":
        basket.append("Mango")

    if chosenFruit == "g" or chosenFruit == "G":
        basket.append("guava")

    numOfFruits -= 1

def isEmpty(basket):
        return basket.size == 0

print("Your basket now has: ", basket)

while basket.isEmpty() != true:
    print("\n\nEnter 'E' to eat a fruit: ")
    basket.pop()
    print("Fruit(s) in the basket: ", basket)

    if basket.isEmpty():
        print("No more fruits")
        exit()