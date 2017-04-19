/*
 * 死锁
 * 结果可知  每次出现3次数不同   当出现死锁时  print 3的个数到不掉40
 * */

package Thread;

    public class test2 implements Runnable{
	int a,b;
	public test2(int a,int b)
	{
	  this.a = a;
	  this.b = b;
	}
	public void run() {
	  	synchronized(Integer.valueOf(a)) //多次调用Integer.valueOf(a) 会返回同一个Integer对象
	  	 {synchronized(Integer.valueOf(b))
	  		{
	  		 System.out.println(a+b);
	  		}
	  	 }
	}
	public static void main(String[] args) {
    for(int i =0;i<20;i++)
	{new Thread(new test2(1,2)).start();
	 new Thread(new test2(2,1)).start();
	}
   }
}