def new_line():
    print('.')

#print three dots
def three_lines():
    new_line()
    new_line()
    new_line()

#print nine dots
def nine_lines():
    three_lines()
    three_lines()
    three_lines()

#print twenty five dots
def clear_screen():
    nine_lines()
    nine_lines()
    three_lines()
    three_lines()
    new_line()


print("Calling nine_lines to print nine lines")
nine_lines()  # print nine lines of "."
print("Calling clear_screen to print twenty five lines")
clear_screen()  # print twety-five lines of "."
print("End of call")
