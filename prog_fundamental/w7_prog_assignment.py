alphabet = "abcdefghijklmnopqrstuvwxyz"   
test_dups = ["zzz","dog","bookkeeper","subdermatoglyphic","subdermatoglyphics"] 
test_miss = ["zzz","subdermatoglyphic","the quick brown fox jumps over the lazy dog"] 

def histogram(s):
     d = dict()
     for c in s:
          if c not in d:
               d[c] = 1
          else:
               d[c] += 1
     return d 

#part1:

def has_duplicates(s):
    #return True or False if the string has any repeated characters
    for i in histogram(s).values():
        if i >1:
            return True
        else:
            return False

#test
print(has_duplicates("aaa"))
print(has_duplicates("abc"))


#loop through test_dups to print out if there is any duplication or not
for v in histogram(test_dups):
    if has_duplicates(v):
        print("%s has duplicates"% v)
    else:
        print("%s has no duplicates"% v)



#part2: 


def missing_letters(s):
    #call histogram 
    hist = histogram(s)
    #missing list
    missing = []
    #check if the letter is missing in the alphabet
    for l in alphabet:
    # does it exist in histogram dic?
        if l not in hist:
                missing.append(l)

    # if the list uses all the letters, the missing list should be empty
    if len(missing) == 0:
        print(s + " uses all the letters")
    #if not, join the list. Join should make the missing list stringify
    else:
        print(s + " is missing letters " + "".join(missing))

#first iterate the list because the function only accepts string argument
for s in test_miss:
    missing_letters(s)

