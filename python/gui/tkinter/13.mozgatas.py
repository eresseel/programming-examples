from tkinter import *
# általános mozgatóeljárás :
def mozog(gd, hb):
 global x1, y1
 x1, y1 = x1 +gd, y1 +hb
 can1.coords(oval1, x1, y1, x1+30, y1+30)
# eseménykezel k : ő
def mozdit_balra():
 mozog(-10, 0)
def mozdit_jobbra():
 mozog(10, 0)
def mozdit_fel():
 mozog(0, -10)
def mozdit_le():
 mozog(0, 10)
#------ F program ------- ő
# a következ változók globálisak : ő
x1, y1 = 10, 10 # kiindulási koordináták
# A f ("master") widget létrehozása : ő
abl1 = Tk()
abl1.title("Animációs gyakorlat Tkinter-rel")
# "slave" widget-ek létrehozása :
can1 = Canvas(abl1,bg='dark grey',height=300,width=300)
oval1 = can1.create_oval(x1,y1,x1+30,y1+30,width=2,fill='red')
can1.pack(side=LEFT)
Button(abl1,text='Kilép',command=abl1.quit).pack(side=BOTTOM)
Button(abl1,text='Balra',command=mozdit_balra).pack()
Button(abl1,text='Jobbra',command=mozdit_jobbra).pack()
Button(abl1,text='Föl',command=mozdit_fel).pack()
Button(abl1,text='Le',command=mozdit_le).pack()
# eseményfigyel (f hurok) indítása : ő ő
abl1.mainloop()