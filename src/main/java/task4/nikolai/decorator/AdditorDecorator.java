package task4.nikolai.decorator;

public class AdditorDecorator implements Additor{

    private Additor additor;

    public AdditorDecorator(Additor additor){
        this.additor = additor;
    }


    @Override
    public int sum(int a, int b) {
         return additor.sum(a , b);
    }


}
