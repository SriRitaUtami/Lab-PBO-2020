public class CatAdapter implements Duck 
{
    // You need to implement the interface your
    // client expects to use.
    Cat cat;
    public CatAdapter(Cat cat)
    {
        // we need reference to the object we
        // are adapting
        this.cat = cat;
    }
    @Override
    public void suara()
    {
        // translate the methods appropriately
        cat.voice();
    }
}