

def countdown(n):
    if n<=0:
        print('Blastoff!')
    else:
        print(n)
        countdown(n-1)

#countdown(5)


def countup(n):
    if n==0:
        print('Blastoff!')
    else:
        print(n)
        countup(n+1)



#countup(-4)


def launch():
    print("Input a number")
    n =int(input())
    if n ==0 or n>=0:
        print("Initiating countdown")
        countdown(n)
    else:
        print("Initiating countup")
        countup(n)



launch()
