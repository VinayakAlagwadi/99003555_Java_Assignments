public class Company 
{
	private String name;
	private String employees;
	private String teamlead;
	
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name = n;
	}
	
	public String getemp()
	{
		return employees;
	}
	public void setemp(String emp)
	{
		employees=emp;
	}
	
	public String getTL()
	{
		return teamlead;
	}
	public void setTL(String tl)
	{
		teamlead = tl;
	}
	
	public void Display(String[] arr)
	{
		
		for (int i=0;i<arr.length;i++) {
			
		
		if(teamlead.equals(arr[i]))
		{
			System.out.println("Name: "+getName());
			System.out.println("Employees: "+getemp());
			System.out.println("Lead: "+getTL());
		}
		
		//if(teamlead.equals(arr[i])==false){
	
		
			//System.out.println("Invalid Input");
		
	}
}
}


