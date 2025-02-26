public class Book{
    String title;
    String author;
    public Book()
    {
        title="good day";
        author="Nila";
        System.out.println("the title is  "+title+  "  and the author is"+author);
    }
    public Book(String mytitle,String myauthor)
    {
this.title=mytitle;
this.author=myauthor;
System.out.println("the title is  "+title+"  and the author is"+author);
}
public static void main(String args[])
{
    Book p1=new Book();
    Book p2=new Book("Happy","Nila");
}
}
