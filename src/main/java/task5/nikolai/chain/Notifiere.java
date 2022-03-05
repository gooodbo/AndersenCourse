package task5.nikolai.chain;

public abstract class Notifiere {

    private Notifiere next;

    public Notifiere(){
    }

    public void setNextNotifire(Notifiere next){
        this.next = next;
    }

    public void checkPassword(String pass){
    }

}
