package task5.nikolai.chain;

import java.util.logging.Level;
import java.util.logging.Logger;


//первая проверка пароля
public class FirstCheck extends Notifiere{

    private Notifiere next;

    private static Logger log = Logger.getLogger(FirstCheck.class.getName());

    public FirstCheck() {
        super();
    }

    @Override
    public void setNextNotifire(Notifiere next) {
        super.setNextNotifire(next);
    }

    @Override
    public void checkPassword(String pass) {
        if (pass.matches("[а-я]|[А-Я]")) {
            log.log(Level.WARNING, "Пароль не должен содержать русских символов");
        }
        else next.checkPassword(pass);
    }
}
