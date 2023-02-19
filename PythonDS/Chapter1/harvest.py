#Problem 1: In a one-dimesional array, the total number of tons of cereals harvested over each 
#month of the last year has been stored. Write a program that gets and prints the following information.
#a) The annual average of harvested tons.
#b) How many months did they have a harvest above the annual average?
#c) How many months did they have a lower harvest than the annual average?"

import random

def run():
    TonsM = []
    
    for i in range(12):
        TonsM.append(random.randint(1,10))

    count = 0
    for i in TonsM:
        count = count + TonsM[i]

    mean = count/12       

    print("a): ", mean)



if __name__== "__main__":
    run()