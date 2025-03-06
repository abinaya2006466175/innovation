interface playable
{
  void play();
}
class Guitar implements playable
{
  public void play()
{

    System.out.print("Music instruments");
}
}
class Piano implements playable
{
public void play()  
{
  System.out.print("   Music  instrument piano");
}
}
class Main
{
  public static void main(String args[])
  {
    playable G=new Guitar();
    playable P=new Piano();
    G.play();
    P.play();
    
  }
}
