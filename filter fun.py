#program to print names which have length greater than or equal to 4 using filter function 

number=["gokul","yash","vishal","mayur","om",]
g=list(filter(lambda number:len(number)>=4,number))
print(g)
