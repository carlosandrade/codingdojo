import unittest
from placarTenis import Placar

class PlacarTenisTest(unittest.TestCase):

    def setUp(self):
        self.placar = Placar('jogad1','jogad2')
   
    def testePlacar0x0(self):
        self.assertEquals(self.placar.getplacar(),"0x0")
    def testeSeExistem2Jogadores(self):
        self.assertEquals(self.placar.jogador1,"jogad1")
        self.assertEquals(self.placar.jogador2,"jogad2")
        
    def testeSejogadorPontuou(self):
        self.placar.pontuar('jogad1')
        self.assertEquals(self.placar.getplacar(),"15x0")
        self.placar.pontuar('jogad2')
        self.assertEquals(self.placar.getplacar(),"15x15")

    def teste30X15(self):
        self.setUp()
        self.placar.pontuar('jogad1')
        self.placar.pontuar('jogad1')
        self.placar.pontuar('jogad2')
        self.assertEquals(self.placar.getplacar(),"30x15")    
        
    def teste40X30(self):
        self.setUp()
        self.placar.pontuar('jogad1')
        self.placar.pontuar('jogad1')
        self.placar.pontuar('jogad2')
        self.placar.pontuar('jogad1')
        self.placar.pontuar('jogad2')
        self.assertEquals(self.placar.getplacar(),"40x30")
        
    def testeQuarentaIguais(self):
        self.setUp()
        self.placar.pontuar('jogad1')
        self.placar.pontuar('jogad1')
        self.placar.pontuar('jogad2')
        self.placar.pontuar('jogad1')
        self.placar.pontuar('jogad2')
        self.placar.pontuar('jogad2')
        self.assertEquals(self.placar.getplacar(),"quarenta iguais")
        
    def testeVantagemJogador1(self):
        self.placar.pontuar('jogad1')
        self.asserEquals(self.placar.getplacar(),"vantagem do jogador 1")
    
if __name__ == '__main__':
    unittest.main()

