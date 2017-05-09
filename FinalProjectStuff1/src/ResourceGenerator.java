
public class ResourceGenerator {
private int resourcePerSecond;

public ResourceGenerator()
{
	resourcePerSecond = 0;
}
public int setResources(int r)
{
	r = r + 100;
	resourcePerSecond = r;
	return resourcePerSecond;
}
}
