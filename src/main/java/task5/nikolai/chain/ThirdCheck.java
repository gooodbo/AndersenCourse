package task5.nikolai.chain;

import java.util.logging.Level;
import java.util.logging.Logger;


//третья проверка пароля
public class ThirdCheck extends Notifiere{

    private Notifiere next;

    private static Logger log = Logger.getLogger(ThirdCheck.class.getName());

    public ThirdCheck() {
        super();
    }

    @Override
    public void setNextNotifire(Notifiere next) {
        super.setNextNotifire(next);
    }

    @Override
    public void checkPassword(String pass) {
        log.log(Level.FINE, "Вы зарегистрированы !");
    }


}
