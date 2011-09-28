import unittest
from placarTenis import Placar

class PlacarTenisTest(unittest.TestCase):

    def setUp(self):
        self.placar = Placar('jogad1','jogad2')
   
    def testePlacar0x0(self):
        self.assertEquals(self.placar.getplacar(),"0x0")
        
    
if __name__ == '__main__':
    unittest.main()

