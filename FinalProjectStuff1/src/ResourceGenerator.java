public class ResourceGenerator 
{
	private int resources;

	public ResourceGenerator()
	{
		resources = 0;
	}
	public void addResources(int r) 
	{
		resources += r;
	}
	public int getResources()
	{
		return resources;
	} 
	//need this method to let GUI display health value in textArea
    public String toString()
	{
		return Integer.toString(resources);
	}
}