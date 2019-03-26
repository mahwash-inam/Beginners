import turtle

window = turtle.Screen()
window.bgcolor("orange")
    
angie=turtle.Turtle()
angie.shape("arrow")
angie.color("green")
angie.speed(10)
def draw_shape(length):
    

    for j in range(0,4):
            angie.forward(100)
            angie.right(90)
def show():
    for i in range(1000):
            draw_shape(100)
            angie.right(17)


    window.exitonclick()

show()  
