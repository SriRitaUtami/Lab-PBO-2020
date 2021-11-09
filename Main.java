class Main
{
    public static void main(String args[])
    {
        Cat kucing = new Kucing();
        Duck bebek = new Bebek();
  
        // Wrap a cat in a CatAdapter so that it 
        // behaves like duck
  
        System.out.print("Yesterday voice of cat is ");
        kucing.voice();
  
        System.out.print("Yesterday voice of duck is ");
        bebek.suara();
  
        // duck behaving like a cat
        Duck CatAdapter = new CatAdapter(kucing); 
        System.out.print("Today voice of duck is ");
        CatAdapter.suara();
    }
}