import org.junit.Assert;

public class Test {

    @org.junit.Test
    public void shouldThrowException() {
        SmsGateway smsGateway = new SmsGateway();
        Assert.assertThrows(
                "Bramka przeciążona",
                SMSGatewayException.class,
                () -> smsGateway.wyslijSms("666666666", "test")
        );
    }

}
