import time
import webbrowser

repeat=0
print("This program started at"+time.ctime())
while(repeat<3):
    time.sleep(10)
    webbrowser.open("https://www.youtube.com/watch?v=-qlJiGGvPUI")
    repeat = repeat+1
