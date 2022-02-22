package courses.anderson.task3.patterns.bridge;

import org.junit.Assert;
import org.junit.Test;

public class BridgeMainTest {

    @Test
    public void testMailWithSmallNumbersOfSymbols_shouldReturnSms(){
        // 1. Create actual Mail object
        Mail mail = new MessageManager(15);
        // 2. Create expected object
        Sms sms = new Sms(15);
        // 3. Verify result
        Assert.assertEquals(mail.sendMail(), sms.sendMail());
    }

    @Test
    public void testMailWithNumbersOfSymbols_shouldReturnTelegram(){
        // 1. Create actual Mail object
        Mail mail = new MessageManager(75);
        // 2. Create expected object
        Telegram telegram = new Telegram(75);
        // 3. Verify result
        Assert.assertEquals(mail.sendMail(), telegram.sendMail());
    }

    @Test
    public void testMailWithLargeNumbersOfSymbols_shouldReturnEmail(){
        // 1. Create actual Mail object
        Mail mail = new MessageManager(250);
        // 2. Create expected object
        Email email = new Email(250);
        // 3. Verify result
        Assert.assertEquals(mail.sendMail(), email.sendMail());
    }

}