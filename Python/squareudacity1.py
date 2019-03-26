import turtle

window = turtle.Screen()
window.bgcolor("red")

brad= turtle.Turtle()
brad.shape("turtle")
brad.color("yellow")
brad.speed(5)
  
def draw_square():
    for i in range(0,4):
        brad.forward(100)
        brad.right(90)

def circle():
    brad.circle(80)

def triangle():
    for i in range(0,3):
        brad.backward(100)
        brad.left(120)
def shape():
    draw_square()
    circle()
    triangle()

    window.exitonclick()

shape()
    


