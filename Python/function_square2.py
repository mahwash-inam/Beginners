import turtle
my_turtle = turtle.Turtle()

def square(length, angle):
   
    my_turtle.forward(length)
    my_turtle.left(angle)
    my_turtle.forward(length)
    my_turtle.left(angle)
    my_turtle.forward(length)
    my_turtle.left(angle)
    my_turtle.forward(length)

square(300,90)
square(100,90)
square(150,90)

