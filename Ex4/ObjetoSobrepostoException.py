class ObjetoSobrepostoException(Exception):
     def __init__(self):
          super().__init__()

     def __str__(self):
          return 'Objetos Sobrepostos!'