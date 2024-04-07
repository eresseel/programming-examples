# A példa bemutatja, hogyan kell ahhoz eljárnunk, hogy az egérrel a vászonra
# rajzolt objektumokat manipulálni tudjunk
from tkinter import *
from random import randrange
class Draw(Frame):
    "A program f ablakát definiáló osztály"
    def __init__(self):
        Frame.__init__(self)
        # A vászon létrehozása  15 színes ellipszis rajzolása :
        self.c = Canvas(self, width =400, height =300, bg ='ivory')
        self.c.pack(padx =5, pady =3)
        for i in range(15):
            # Véletlenszer en kisorsolunk egy színt : ű
            coul =['brown','red','orange','yellow','green','cyan','blue',
            'violet', 'purple'][randrange(9)]
            # Véletlen koordinátájú ellipszis rajzolása :
            x1, y1 = randrange(300), randrange(200)
            x2, y2 = x1 + randrange(10, 150), y1 + randrange(10, 150)
            self.c.create_oval(x1, y1, x2, y2, fill =coul)
        # Az <egéresemények> hozzákapcsolása a <canevas> (vászon) widget-hez :
        self.c.bind("<Button-1>", self.mouseDown)
        self.c.bind("<Button1-Motion>", self.mouseMove)
        self.c.bind("<Button1-ButtonRelease>", self.mouseUp)
        # A kilépésgomb létrehozása :
        b_fin = Button(self, text ='Befejezés', bg ='royal blue', fg ='white',
        font =('Helvetica', 10, 'bold'), command =self.quit)
        b_fin.pack(pady =2)
        self.pack()

    def mouseDown(self, event):
        "Balegérgomb lenyomására végrehajtandó m velet"
        self.currObject =None
        # event.x és event.y tartalmazzák a kattintás koordinátáit :
        self.x1, self.y1 = event.x, event.y
        # <find_closest> a legközelebbi rajz referenciáját adja meg :
        self.selObject = self.c.find_closest(self.x1, self.y1)
        # Módosítjuk a rajz körvonalának a vastagságát :
        self.c.itemconfig(self.selObject, width =3)
        # <lift> átviszi a rajzot az el térbe : ő
        self.c.lift(self.selObject)

    def mouseMove(self, event):
        "Lenyomott balgombbal mozgó egérrel végrehajtandó m velet"
        x2, y2 = event.x, event.y
        dx, dy = x2 -self.x1, y2 -self.y1
        if self.selObject:
            self.c.move(self.selObject, dx, dy)
            self.x1, self.y1 = x2, y2
    
    def mouseUp(self, event):
        "A balegérgomb fölengedésekor végrehajtandó m velet"
        if self.selObject:
            self.c.itemconfig(self.selObject, width =1)
            self.selObject =None

if __name__ == '__main__':
    Draw().mainloop()