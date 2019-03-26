import turtle

def square(vari):
    for i in range(0,4):
        vari.forward(100)
        vari.right(90)

def show():
    window = turtle.Screen()
    window.bgcolor("gray")
    
    var = turtle.Turtle()
    var.color("pink")
    var.shape("classic")
    var.speed(10)
    for j in range(37):
        square(var)
        var.right(10)

    window.exitonclick()

show()        
    
