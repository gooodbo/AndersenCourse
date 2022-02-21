package task4.nikolai.decorator;

import java.util.Date;

public class LoggedAdditor extends AdditorDecorator{


    public LoggedAdditor(Additor additor) {
        super(additor);
    }

    public String getLogs(int a, int b){
        return "Время : " + new Date() + " ;\nСкладываемые числа: " + a + ", " + b +";";
    }

    @Override
    public int sum(int a, int b) {
        System.out.println(getLogs(a, b));
        return super.sum(a, b);
    }
}
