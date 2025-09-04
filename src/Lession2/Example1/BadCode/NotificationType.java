package Lession2.Example1.BadCode;

public enum NotificationType {

    SMS,
    EMAIL,
    WHATSAPP ;

    public void sendSMSNotification(){
        System.out.println("Sending sms");

    }

    public void sendEmailNotification(){
        System.out.println("Sending Email");

    }

    public void sendWhatsappNotification(){
        System.out.println("Sending WhatsApp ");
    }
}
