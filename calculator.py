import tkinter
from tkinter import *
import random

digito = ""  


def press(num):
    global digito  #o global usa a variavel anterior em vez de criar uma variavel local
    digito = digito + str(num) 
    equation.set(digito)
def Resultado():
    global digito
    total = str(eval(digito))
    equation.set(total)
def clear():
    global digito
    digito = ""
    equation.set("")

root = Tk()
root.geometry ('250x200')
backgroundimg = PhotoImage(file = "avanishi.png")
label = Label(root, image= backgroundimg)
label.place(x=0, y=20)
root.title("Calculadora")
equation = StringVar()
expression_field = Entry(root, textvariable=equation)
expression_field.grid(columnspan=10, ipadx=100)
button1 = Button(root, text = '1', fg = "black", bg= "#2E93FF", command=lambda: press(1), height = 2, width = 4)
button1.grid(row= 3, column=0)
button2 = Button(root, text = '2', fg = "black", bg= "#2E93FF", command=lambda: press(2), height = 2, width = 4)
button2.grid(row= 3, column=1)
button3 = Button(root, text = '3', fg = "black", bg= "#2E93FF", command=lambda: press(3), height = 2, width = 4)
button3.grid(row= 3, column=2)
button4 = Button(root, text = '4', fg = "black", bg= "#2E93FF", command=lambda: press(4), height = 2, width = 4)
button4.grid(row= 5, column=0)
button5 = Button(root, text = '5', fg = "black", bg= "#2E93FF", command=lambda: press(5), height = 2, width = 4)
button5.grid(row= 5, column=1)
button6 = Button(root, text = '6', fg = "black", bg= "#2E93FF", command=lambda: press(6), height = 2, width = 4)
button6.grid(row= 5, column=2)
button7 = Button(root, text = '7', fg = "black", bg= "#2E93FF", command=lambda: press(7), height = 2, width = 4)
button7.grid(row= 7, column=0)
button8 = Button(root, text = '8', fg = "black", bg= "#2E93FF", command=lambda: press(8), height = 2, width = 4)
button8.grid(row= 7, column=1)
button9 = Button(root, text = '9', fg = "black", bg= "#2E93FF", command=lambda: press(9), height = 2, width = 4)
button9.grid(row= 7, column=2)
button0 = Button(root, text = '0', fg = "black", bg= "#2E93FF", command=lambda: press(0), height = 2, width = 4)
button0.grid(row= 7, column=3)
Divide= Button(root, text="/", fg="red",bg = "grey", command=lambda: press("/"), height=2, width= 4)
Divide.grid(row= 3, column=3)
Multi= Button(root, text="*", fg="red",bg = "grey", command=lambda: press("*"), height=2, width= 4)
Multi.grid(row= 5, column=3)
Soma= Button(root, text="+", fg="red",bg = "grey", command=lambda: press("+"), height=2, width= 4)
Soma.grid(row= 3, column=4)
dif = Button(root, text="-", fg="red",bg = "grey", command=lambda: press("-"), height=2, width= 4)
dif.grid(row= 5, column=4)
clear = Button(root, text="Clear", fg="white",bg = "black", command= clear, height=2, width= 4)
clear.grid(row= 8, column=1)
Igual = Button(root, text="=", fg="white",bg = "Black", command= Resultado, height=2, width= 4)
Igual.grid(row= 8, column=0)
run = True
root.mainloop()

echo "# Programming" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Sepay/Programming.git
git push -u origin main
