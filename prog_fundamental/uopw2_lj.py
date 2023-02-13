def print_volume(r):
    pi = 3.141592653589793
    print(4/3*pi*r**3)


print_volume(10)
print_volume(5)
print_volume(9)


def print_variation(w:str):
    w = w.upper()
    print("Upper Case: "+w)
    w = w.lower()
    print("Lower Case: "+w)
    w = len(w) - w.count(' ')
    print("Letter Count: "+str(w))

print_variation("test")
print_variation("hello world")
print_variation("December is my favourite month of the year")



def print_variation_two(w:str):
    if isinstance(w,str):
        w = w.upper()
        print("Upper Case: "+w)
        w = w.lower()
        print("Lower Case: "+w)
        w = len(w) - w.count(' ')
        print("Letter Count: "+str(w))
    else:
        print("Wrong Input. Please enter string")

print_variation_two("spam")
print_variation_two(10)
print_variation_two("100")