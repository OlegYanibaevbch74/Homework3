public class Main {
    public static void main(String[] args) {
        var dog=8.0;
        System.out.println(dog);
        var cat=3.6;
        System.out.println(cat);
        var paper=763789;
        System.out.println(paper);

        dog=dog+4;
        System.out.println(dog);
        cat=cat+4;
        System.out.println(cat);
        paper=paper+4;
        System.out.println(paper);

        dog=dog-3.5;
        System.out.println(dog);
        cat=cat-1.6;
        System.out.println(cat);
        paper=paper-7639;
        System.out.println(paper);

        var friend=19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);

        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);

        var weightBoxer1=78.2;
        System.out.println("вес первого боксера"+weightBoxer1+"кг");
        var weightBoxer2=82.7;
        System.out.println("вес второго боксера"+weightBoxer2+"кг");

        var totalWeightOfFighters=weightBoxer1+weightBoxer2;
        System.out.println("общий вес бойцов"+totalWeightOfFighters+"кг");

        var differenceWeight1=weightBoxer1-weightBoxer2;
        System.out.println("разница в весе способ1;"+differenceWeight1+"кг");
        var differenceWeight=weightBoxer2%weightBoxer1;
        System.out.println("разница в весе способ2;"+differenceWeight+"кг");

        var openingHours=640;
        System.out.println("всего часов работы" + openingHours + "часов");
        var dailyRate=8;
        System.out.println("дневная норма"+dailyRate+"ч.");
        var amount=(openingHours/dailyRate);
        System.out.println("Всего работников в компании"+amount+"человек");
        var additive=94;
        System.out.println(additive);
        var total=(amount+additive);
        System.out.println(total);
        var norm=openingHours/total;
        System.out.println("Если в компании работает"+total+"человек, то всего"+openingHours/total+"часа работы может быть поделено между сотрудниками");



















    }
}