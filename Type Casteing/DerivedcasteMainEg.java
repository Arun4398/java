class Pendrive
{
	public void write()
	{
     System.out.println("write");
	}
	public void read()
	{
    System.out.println("Read");
	}
}
class Mouse
{
	public void click()
	{
     System.out.println("click");
	}
	public void scroll()
	{
     System.out.println("scroll");
	}
}
class Usbport
{
	public static void  connectdevice(Object obj)
	{
      if (obj instanceof Mouse)
      {
         Mouse ref1 =(Mouse)obj;
         ref1.click();
         ref1.scroll();
      }
      else
      {
         Pendrive ref2 =(Pendrive)obj;
         ref2.write();
         ref2.read();
      }
	}
}
class DerivedcasteMainEg

{
public static void main(String[] args) 
{
	Mouse m1= new Mouse();
	Usbport.connectdevice(m1);


	Pendrive p1= new Pendrive();
	Usbport.connectdevice(p1);
}
}