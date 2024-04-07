from tkinter import *
from math import pi

class ChoiceVibra(Frame):
    """Cursor-ok egy rezgés frekvenciájának, fázisának és amplitúdójának kiv.hoz"""
    def __init__(self, boss =None, colo ='red'):
        Frame.__init__(self) # a szülöosztály constructora
        # Néhány példány-attribútum inicializálása :
        self.freq, self.phase, self.ampl, self.colo = 0, 0, 0, colo
        # A checkbox állapotváltozója :
        self.chk = IntVar() # Tkinter 'objektum-változó'
        Checkbutton(self, text='Rajzol', variable=self.chk, fg = self.colo, command = self.setCurve).pack(side=LEFT)
        # A 3 cursor-widget definíciója :
        Scale(self, length=150, orient=HORIZONTAL, sliderlength =25,
        label ='Frekvencia (Hz) :', from_=1., to=9., tickinterval =2,
        resolution =0.25,
        showvalue =0, command = self.setFrequency).pack(side=LEFT)
        Scale(self, length=150, orient=HORIZONTAL, sliderlength =15,
        label ='Fázis (fok) :', from_=-180, to=180, tickinterval =90,
        showvalue =0, command = self.setPhase).pack(side=LEFT)
        Scale(self, length=150, orient=HORIZONTAL, sliderlength =25,
        label ='Amplitúdó :', from_=1, to=9, tickinterval =2,
        showvalue =0, command = self.setAmplitude).pack(side=LEFT)

    def setCurve(self):
        self.event_generate('<Control-Z>')

    def setFrequency(self, f):
        self.freq = float(f)
        self.event_generate('<Control-Z>')

    def setPhase(self, p):
        pp =float(p)
        self.phase = pp*2*pi/360 # fok -> radián átalakítás
        self.event_generate('<Control-Z>')

    def setAmplitude(self, a):
        self.ampl = float(a)
        self.event_generate('<Control-Z>')

#### Kód az osztály teszteléséhez : ###

if __name__ == '__main__':
    def showAll(event=None):
        lab.configure(text = '%s - %s - %s - %s' %
        (fra.chk.get(), fra.freq, fra.phase, fra.ampl))
    root = Tk()
    fra = ChoiceVibra(root,'navy')
    fra.pack(side =TOP)
    lab = Label(root, text ='test')
    lab.pack()
    root.bind('<Control-Z>', showAll)
    root.mainloop()