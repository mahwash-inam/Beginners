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

for i in range(5):
    square(50,90)


