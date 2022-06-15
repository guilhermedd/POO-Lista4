from Ponto2D import Ponto2D
from Reta import Reta
from EspacoGeometrico import EspacoGeometrico
from ObjetoSobrepostoException import ObjetoSobrepostoException


A = Ponto2D(3, 4)
B = Ponto2D(2, 3)
C = Ponto2D(4, 6)
VERMELHO = Reta(1, 2)
VERDE = Reta(1, 1)
AZUL = Reta(2, -2)
espaco = EspacoGeometrico()

try:
    espaco.adicionar_reta(VERMELHO)
    espaco.adicionar_reta(VERDE)
    espaco.adicionar_reta(AZUL)
    espaco.adicionar_ponto(A)
    espaco.adicionar_ponto(B)
    espaco.adicionar_ponto(C)
except ObjetoSobrepostoException as e:
    print(e)

