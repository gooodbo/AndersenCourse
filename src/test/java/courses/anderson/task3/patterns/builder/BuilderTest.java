package courses.anderson.task3.patterns.builder;

import org.junit.Assert;
import org.junit.Test;

public class BuilderTest {

    @Test
    public void testSmsBuilder_ShouldReturnCorrectResult(){
        // 1. Create expected sms object
        Sms sms = new Sms("Eugene","+375291234567", "Dear client,\n" +
                "Your payment has been received\n" +
                "Best regards");

        // 2. test creation
        Sms actualSms = new SmsBuilder()
                .setCode(375)
                .setPhoneNumber("291234567")
                .setReceiverName("Eugene")
                .setMessage("Your payment has been received")
                .build();

        // 3. verify result
        Assert.assertEquals(sms.getPhoneNumber(), actualSms.getPhoneNumber());
        Assert.assertEquals(sms.getReceiverName(), actualSms.getReceiverName());
        Assert.assertEquals(sms.getMessage(), actualSms.getMessage());
    }

    @Test
    public void testSmsBuilder_ShouldReturnIncorrectResult(){
        // 1. Create expected sms object
        Sms sms = new Sms("Alex","+375291234567","Your payment has been received" );

        // 2. Create actual object
        Sms actualSms = new SmsBuilder()
                .setCode(375)
                .setPhoneNumber("291234567")
                .setReceiverName("Eugene")
                .setMessage("Your payment has been received")
                .build();

        // 3. verify result
        Assert.assertFalse(sms.getReceiverName(),false);
        Assert.assertFalse(sms.getPhoneNumber(),false);
        Assert.assertFalse(sms.getMessage(),false);
    }

}