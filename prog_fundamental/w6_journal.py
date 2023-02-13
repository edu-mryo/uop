
#part1

print("=========== Part I =========")

s="Wishing you a happy holiday"
print(s)

#split the list using split
print("split list")
s=s.split()
print(s)

#Delete three words using different operations
print("Delete three words")
s.pop()
print(s)

del s[2]
print(s)

s.remove('you')
print(s)


#Add new words ( three or more ) using different operations
print("Add new words")
s.append("Holiday")
print(s)

nl=["to","everyone"]
s.extend(nl)
print(s)

s[5:]=["and","a","great","2023"]
print(s)

#Turn the list of words back into a single string using join. 
print("Turn tge list of words back into a single string")
delimiter=' '
s=delimiter.join(s)
print(s)

print()
print("========== Part II =========")

#part2

#Nested lists
print("Nested List")
s= ["a",["b"],["c",["d"]]]
print(s)

#The “*” operator
print("The '*' operator")
s=["Can","I get", "an Espresso","Please ?"]*4
print(s)

#List slices
print("List Slices")
sl=["I","Like","Python","but","not","the","snake"]
print(sl[1:4])

#The “+=” operator 
print("The “+=” operator")
l1=["I'm","Singing"]
l1+=["in","the","rain"]

print(l1)

#A list filter 
print("A list filter")
n=[1,3,5,8,12,20]
even=[]
for i in n:
    if i % 2 ==0:
        even.append(i)
print(even)


#A list operation that is legal but does the "wrong" thing, and not what the programmer expects 
print("A list operation that is legal but does the wrong thing, and not what the programmer expects")

n=["a","z","g","l","A","Gone"]
#programmer expects the list to be sorted alphabetically
n.sort()
print(n)






