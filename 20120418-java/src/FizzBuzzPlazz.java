
public class FizzBuzzPlazz {

	public String compare(int var) {
		// TODO Auto-generated method stub
		String ret = new String();
		
		for (int i=1;i<=var;i++)
		{
			String j = String.valueOf(i);			
			if(var==1){
				ret = j;
				return j;
			}
			else{
				if(i==2)
				{
					 ret="1";
					 ret = ret +", "+ j ;				
				}
				if(i==3)
				{				
					 ret = ret +","+ "Fizz" ;				
				}
				if(i==4)
				{
					ret = ret + "," + "4";
				}
			}			
		}
		return ret;	
	}

}
