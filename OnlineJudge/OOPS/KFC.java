/*
Create a class KFC and which has a method friedChickenRecipe( ) which prints the recipe of fried chicken and display( ) which displays the token number whose order has to be delivered next. Create a class FiveStarChicken which inherits the method display() from KFC but doesn't allow the FiveStarChicken class to override friedChickenRecipe().
*/

public class KFC {

    private String recipe;

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    private void friedChickenRecipe(String recipe) {
        this.recipe = recipe;
        System.out.println("Fried Chicken recipe: " + recipe);
    }

    public void display(int n) {
        friedChickenRecipe(recipe);
        System.out.println("KFC token number is " + n);
    }
}

public class FiveStarChicken extends KFC{

    @Override
    public void display(int n) {
        System.out.println("FiveStarChicken token number is "+n);
    }

    public static void main(String[] args){
        KFC kfc=new KFC();
        kfc.setRecipe("Take 200gms boneless chicken  and marinate it with lemon, salt and flour");
        kfc.getRecipe();
        kfc.display(102);

        System.out.println();
        FiveStarChicken fiveStarChicken=new FiveStarChicken();
        fiveStarChicken.display(345);
    }
}


