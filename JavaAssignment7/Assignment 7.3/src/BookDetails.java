public class BookDetails extends SampleConcrete implements Book {

    void chapter(Chapter chapter)
    {
        System.out.println("This is chapter");
    }
    void index(Index index)
    {
        System.out.println("This is index");
    }
    void dimensions(Dimensions dimensions)
    {
        System.out.println("This is dimensions");
    }
    void book(Book book)
    {
        System.out.println("This is book");
    }

    @Override
    public void goodBook() {
       System.out.println("It is a goodBook");
    }

    @Override
    public void significance() {
     System.out.println("Important chapter");
    }

    @Override
    public void difficulty() {
    System.out.println("Too difficult");
    }

    @Override
    public void height() {
   System.out.println("height is "+15);
    }

    @Override
    public void width() {
    System.out.println("Width is "+20);
    }

    @Override
    public void coversAllChapters() {
   System.out.println("covers all chapters");
    }

    @Override
    public void includesSubChapters() {
    System.out.println("it includes all sub chapters");
    }
}
