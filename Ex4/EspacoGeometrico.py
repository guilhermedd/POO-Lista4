import ObjetoSobrepostoException
import Ponto2D
import Reta

class EspacoGeometrico():
     def __init__(self):
          self.__retas = []
          self.__pontos = []

     def adicionarReta(self, reta: Reta):
          if self.__retas == []:
               self.__retas.append(reta)
          else:
               for r in self.__retas:
                    if r.intercepta(reta):
                         raise ObjetoSobrepostoException
               self.__retas.append(reta)

     def adicionarPonto(self, ponto: Ponto2D):
          if self.__retas == []:
               self.__retas.append(ponto)
          else:
               for r in self.__retas:
                    if r.estaNaReta(ponto):
                         raise ObjetoSobrepostoException
               self.__pontos.append(ponto)