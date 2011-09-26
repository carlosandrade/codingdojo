public class PlacarDomino {

	String placarAtual = "0X0";

	public String batidaSimples(int dupla) {
		// TODO Auto-generated method stub
		if(placarAtual.equals("3X0"))
		{	
			this.placarAtual = "5X0";
			
		}else if(placarAtual.equals("5X0")){
			placarAtual = "pX0";
			
		}else{
			placarAtual = "3X0";
		}
		return placarAtual;
	}

	public String mostraPlacar() {
		// TODO Auto-generated method stub
		return placarAtual;
	}

}
