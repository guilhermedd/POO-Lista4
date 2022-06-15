import Ponto2D


class Reta:
    def __init__(self, a: float, b: float):
        self.__a = a
        self.__b = b

    def get_b(self):
        return self.__b

    def get_a(self):
        return self.__a

    def intercepta(self, reta):
        if self.__a == reta.get_a() and self.__b != reta.get_b():
            # Se forem paralelas, com todos os pontos diferentes (a = a' e b != b') nao se interceptam, caso contrario se interceptam.
            return False
        return True

    def esta_na_reta(self, ponto: Ponto2D):
        if ponto.get_y() == self.__a * ponto.get_x() + self.__b:
            return True
        return False

    def __str__(self):
        return 'A: {} B: {}'.format(self.__a, self.__b)
