//Jose Retamal -2017 
package threads;

public class TestSyncTest
{

	public TestSyncTest()
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		TestSync job = new TestSync();
		Thread threadA = new Thread(job);
		Thread threadB = new Thread(job);
		threadA.setName("Thread A");
		threadB.setName("Thread B");
		threadA.start();
		threadB.start();
	}

}
