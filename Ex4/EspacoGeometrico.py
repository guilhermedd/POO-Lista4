from ObjetoSobrepostoException import ObjetoSobrepostoException
from Ponto2D import Ponto2D
from Reta import Reta


class EspacoGeometrico():

    def __init__(self):
        self.__retas = []
        self.__pontos = []

    def adicionar_reta(self, reta: Reta):

        if not self.__retas:
            self.__retas.append(reta)
        else:
            for r in self.__retas:
                try:
                    if r.intercepta(reta):
                        raise ObjetoSobrepostoException('Retas Sobrepostos!')
                except ObjetoSobrepostoException:
                    raise ObjetoSobrepostoException('Retas Sobrepostos!')

            # So pede para verificar se a reta cruza outra reta
            self.__retas.append(reta)

    def adicionar_ponto(self, ponto: Ponto2D):

        if not self.__retas:
            self.__pontos.append(ponto)
        else:
            for r in self.__retas:
                try:
                    if r.esta_na_reta(ponto):
                        raise ObjetoSobrepostoException('Objetos Sobrepostos!')
                except ObjetoSobrepostoException:
                    raise ObjetoSobrepostoException('Objetos Sobrepostos!')

            # So pede para verificar se o ponto cruza alguma reta
            self.__pontos.append(ponto)

    def retas(self):
        return len(self.__retas)
