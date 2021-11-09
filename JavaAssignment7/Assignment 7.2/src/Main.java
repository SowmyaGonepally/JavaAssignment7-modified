public class Main {
    public static void main(String[] args) {
        Cycle[] cycles=new Cycle[3]; //array of cycles

        //upcasting
        Cycle unicycleP=new Unicycle();
        Cycle bicycleP=new Bicycle();
        Cycle tricycleP=new Tricycle();
        cycles[0]=unicycleP;
        cycles[1]=bicycleP;
        cycles[2]=tricycleP;

        cycles[0].balance();
        cycles[1].balance();
        cycles[2].balance();
        //since Cycle does not have balance method, last three lines show error.

        //downcasting
        Unicycle unicycleC=(Unicycle)(unicycleP);
        Bicycle bicycleC=(Bicycle)(bicycleP);
        Tricycle tricycleC=(Tricycle) (tricycleP);
        unicycleC.balance();
        bicycleC.balance();
        tricycleC.balance();  //tricycle does not have balance method so shows error
        cycles[0]=unicycleC;
        cycles[1]=bicycleC;
        cycles[2]=tricycleC;

        cycles[0].balance();
        cycles[1].balance();
        cycles[2].balance();
        //since cycles array is of type Cycle and Cycle does not have balance method, we get errors
        //after assigning child classes (Unicyle,Bicycle and Tricycle) to cycles array.


    }
}
