package asdf;

public class ToppingDecorator extends Sandwich{
    private Sandwich sandwich;

    public ToppingDecorator(Sandwich sandwich){
        this.sandwich = sandwich;
    }

    public void make(){
    	System.out.println(sandwich);
        sandwich.make();
    }
    
}
