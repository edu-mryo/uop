def my_sqrt(a):
    x=3
    while True:
        y = (x + a/x) / 2.0
        if y == x:
            break
        x = y
        return x

x=my_sqrt(10)

print(x)
