import java.util.ArrayList;

public class Program {
    public static void main(String[] args){
        System.out.println("Goods: ");
        printList(getGoods());
        System.out.println("Food: ");
        printList(getFood());
        System.out.println("Hygiene: ");
        printList(getHygiene());
        System.out.println("Drinks: ");
        printList(getDrink());
        System.out.println("Child Goods: ");
        printList(getChildGoods());
        System.out.println("Diapers: ");
        printList(getDiapers());
        System.out.println("Milk: ");
        printList(getMilk());
        System.out.println("Baby pacifiers: ");
        printList(getBabyPacifier());
        System.out.println("Toilet papers: ");
        printList(getToiletPaper());
        System.out.println("Bread: ");
        printList(getBread());
        System.out.println("Eggs: ");
        printList(getEggs());
        System.out.println("Lemonades: ");
        printList(getLemonade());
    }

    static void printList(ArrayList list){
        for (var item : list ) {
            System.out.println(item.toString());
        }
        System.out.println();
    }
    static ArrayList getGoods(){
        ArrayList<Goods> goods = new ArrayList<>();
        goods.add( new Goods("Metal Dog", "шт"));
        goods.add(new Goods("Bad Cat", 20, "шт"));
        goods.add(new Goods("Golden Fish", 12.45F, 12, "шт"));
        return goods;
    }

    static ArrayList getFood(){
        ArrayList<Goods> food = new ArrayList<>();
        food.add(new Food("Olivie", "г", 1));
        food.add(new Food("pizza with pineapple", "г", 1));
        food.add(new Food("Pineapple", 3.45F,200,"шт", 5));
        return food;
    }
    static ArrayList getHygiene(){
        ArrayList<Goods> hygiene = new ArrayList<>();
        hygiene.add(new Hygiene("Liquid soap", "1", 1));
        hygiene.add(new Hygiene("Soap", "шт", 1));
        hygiene.add(new Hygiene("Shampoo", 5.99F,200,"шт", 1));
        return hygiene;
    }

    static ArrayList getDrink(){
        ArrayList<Drink> drinks = new ArrayList<>();
        drinks.add(new Drink("Juice", "шт", 1.05F));
        drinks.add(new Drink("Sparkled water", "шт", 1F));
        drinks.add(new Drink("Water", 5.99F,200,"шт", 0.5F));
        return drinks;
    }

    static ArrayList getChildGoods(){
        ArrayList<ChildGoods> childGoods = new ArrayList<>();
        childGoods.add(new ChildGoods("childGoods1", "шт", true));
        childGoods.add(new ChildGoods("childGoods2", 200, "шт", true));
        childGoods.add(new ChildGoods("childGoods3", 10.34F, 200,"шт", true));
        childGoods.add(new ChildGoods("childGoods4", "шт", 3, true));
        childGoods.add(new ChildGoods("childGoods5",  200,"шт", 3, true));
        childGoods.add(new ChildGoods("childGoods6", 14.88F, 200,"шт", 5, true));
        return childGoods;
    }
    static ArrayList getDiapers(){
        ArrayList<Diapers> diapers = new ArrayList<>();
        diapers.add(new Diapers("Diapers1", "packs", true, 2, "single-use"));
        diapers.add(new Diapers("Diapers2", 200, "packs", true, 1, "single-use"));
        diapers.add(new Diapers("Diapers3", 15.99F, 200,"packs", true, 3, "single-use"));
        diapers.add(new Diapers("Diapers4", 200, "packs", 5, true, 1, "single-use"));
        diapers.add(new Diapers("Diapers5", 15.99F, 200,"packs", 4, true, 3, "single-use"));
        diapers.add(new Diapers("Diapers6",  "шт", true, 3, 3, 9,"single-use"));
        diapers.add(new Diapers("Diapers7", 200,"packs", true, 3, 4, 18, "single-use"));
        diapers.add(new Diapers("Diapers8", 15.99F, 200,"packs", 4, true, 16, 34, 3, "single-use"));
        diapers.add(new Diapers("Diapers9", "packs", 4, true, 3, "single-use"));
        return diapers;
    }

    static ArrayList getMilk(){
        ArrayList<Milk> milk = new ArrayList<>();
        milk.add(new Milk("Milk1", "packs", 0.9F, 1.5F, 7));
        milk.add(new Milk("Milk2", 200, "packs", 0.9F, 1.0F, 7));
        milk.add(new Milk("Milk3", 3.8F, 200,"packs", 1.5F, 3.2F, 5));
        return milk;
    }

    static ArrayList getBabyPacifier(){
        ArrayList<BabyPacifier> babyPacifiers = new ArrayList<>();
        babyPacifiers.add(new BabyPacifier("babyPacifier1", "шт", true));
        babyPacifiers.add(new BabyPacifier("babyPacifier2", 200, "шт", true));
        babyPacifiers.add(new BabyPacifier("babyPacifier3", 10.34F, 200,"шт", true));
        babyPacifiers.add(new BabyPacifier("babyPacifier4", "шт", 3, true));
        babyPacifiers.add(new BabyPacifier("babyPacifier5",  200,"шт", 3, true));
        babyPacifiers.add(new BabyPacifier("babyPacifier6", 14.88F, 200,"шт", 5, true));
        return babyPacifiers;
    }

    static ArrayList getToiletPaper(){
        ArrayList<ToiletPaper> toiletPapers = new ArrayList<>();
        toiletPapers.add(new ToiletPaper("toiletPaper1", "1", 4 ,3));
        toiletPapers.add(new ToiletPaper("toiletPaper2", "шт", 8, 2));
        toiletPapers.add(new ToiletPaper("toiletPaper3", 5.99F,200,"шт", 12, 1));
        return toiletPapers;
    }

    static ArrayList getBread(){
        ArrayList<Bread> breads = new ArrayList<>();
        breads.add(new Bread("White", "шт", 1, "white"));
        breads.add(new Bread("Black", 100, "шт", 1, "black"));
        breads.add(new Bread("Grey", 0.98F,3,"шт",2, "grey"));
        return breads;
    }

    static ArrayList getEggs(){
        ArrayList<Eggs> eggs = new ArrayList<>();
        eggs.add(new Eggs("C0", "packs", 15, 10));
        eggs.add(new Eggs("C1", 100, "packs", 15, 15));
        eggs.add(new Eggs("C2", 3.02F,3,"packs",15, 30));
        return eggs;
    }

    static ArrayList getLemonade(){
        ArrayList<Lemonade> lemonades = new ArrayList<>();
        lemonades.add(new Lemonade("lemonade1", "1", 1.05F));
        lemonades.add(new Lemonade("lemonade2", "шт", 1F));
        lemonades.add(new Lemonade("lemonade3", 1.44F,200,"шт", 0.5F));
        return lemonades;
    }



}
