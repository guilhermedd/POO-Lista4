import EspacoGeometrico
import Ponto2D
import Reta

D = Ponto2D(3,2)
r1 = Reta(1,2)
r2 = Reta(2,-2)

espaco = EspacoGeometrico()
espaco.adicionarReta(r1)
espaco.adicionarPonto(D)