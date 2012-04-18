
public class FizzBuzzPlazz {

	public String compare(int var) {
		// TODO Auto-generated method stub
		String ret = new String();
		
		for (int i=1;i<=var;i++)
		{
			String j = String.valueOf(i);
			if(var==1){
				return j;
			}
			ret = ret +","+ j ;
		}
		
		return ret;
		
	}

}
