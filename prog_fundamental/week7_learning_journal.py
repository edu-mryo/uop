# a list of baby food to give every weekdays. Key is day and value is a list of baby foods we give everyday.
baby_food={"monday":["Apple","Carrot"],"tuesday":["Pumpkin","Chickpea"],"wednesday":["Grape","Spinach"],"thursday":["Banana","Cherry"],"friday":["Broccoli","Sweet Potatoe"]}


def invert_dict(d):
     inverse = dict()
     #iterate the key in dictionary
     for key in d:
         #assign list value to val
          val = d[key]
          
          # iterate value list
          for i in val:
              #if the value is not in the inverse dictionary
              if i not in inverse:
                  #assign key as value. 
                  inverse[i] = [key]
              else:
                  inverse[i].append(key)
     return inverse     

print("Original :", baby_food)
print("Inverted :", invert_dict(baby_food))
