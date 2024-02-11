


 abstract class animal {
    public int age;
    public String gender;
    public void isMammal(){
        System.out.println("this is a public method isMammal() from the animal class");
    }
    public void mate(){
        System.out.println("this is a public method mate() from the animal class");
    }
    
}
interface plant{
    
    private void photosynthesis( boolean sunlight){
        if (sunlight==true);
            System.out.println("yummy :)");
    }
}
class flower implements plant{
    private void photosynthesis(){

    }
} 
class tree implements plant{
    private void photosynthesis(){

    }
} 
class fish extends animal{
    private float sizeInFeet;
    private void caneat(){
        System.out.println("This is a private method canEat() from class fish");
        
    }
}
class zebra extends animal{
    public boolean is_wild;
    public void run(){
        System.out.println("this is a public method run() from the zebra class");
    }
}
interface water{
    public void flows();
    
}
class lake implements water{
    public void flows(){
        System.out.println("*silence*");
    }
}
class river implements water{
    public void flows(){
        System.out.println("*fwooosh*");
    }
}
abstract class human{
    protected String name;
    protected int height;
    protected int age;
}