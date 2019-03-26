import turtle
my_turtle = turtle.Turtle()
my_turtle.speed(0)

def square(length):
    for j in range(4):
        my_turtle.forward(length)
        my_turtle.left(90)

for i in range(10000):
    square(100)
    my_turtle.left(17)

#A complete circle is 360 degree. So divide 360 by a prime no so it can't repeat.
    
