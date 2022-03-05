package task5.nikolai.chain;

import java.util.logging.Level;
import java.util.logging.Logger;


//вторая проверка пароля
public class SecondCheck extends Notifiere{

    private Notifiere next;

    private static Logger log = Logger.getLogger(SecondCheck.class.getName());

    public SecondCheck() {
        super();
    }

    @Override
    public void setNextNotifire(Notifiere next) {
        super.setNextNotifire(next);
    }

    @Override
    public void checkPassword(String pass) {
        if (pass.matches("[0-9]")) {
            log.log(Level.WARNING, "Пароль не должен содержать цифр");
        }
        else next.checkPassword(pass);
    }

}
