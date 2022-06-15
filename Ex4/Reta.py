import math
import Ponto2D

class Reta:
     def __init__(self, a, b):
          self.__a = a (int)
          self.__b = b (int)
     
     def getB(self):
          return self.__b

     def getA(self):
          return self.__a

     def intercepta(self, reta):
          if self.__a == reta.getA() and self.__b != reta.getB():
               # Se forem paralelas, com todos os pontos diferentes (a = a' e b != b') nao se interceptam, caso contrario se interceptam.
               return False
          return True

     def estaNaReta(self, ponto: Ponto2D):
          if ponto.getY() - (self.__a * ponto.getX()) == self.__b:
               return True
          return False