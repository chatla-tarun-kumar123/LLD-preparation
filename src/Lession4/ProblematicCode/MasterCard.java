package Lession4.ProblematicCode;

public class MasterCard extends CreditCard{
        @Override
        public void tapAndPay() {
            System.out.println("Tap and Pay impl of Master Card");
        }

        @Override
        public void onlineTransfer() {
            System.out.println("Online transfer impl of Master Card");

        }

        @Override
        public void swipeAndPay() {
            System.out.println("Swipe and Pay impl of Master Card");

        }

        @Override
        public void mandatePayments() {
            System.out.println("Mandate Payment impl of Master Card");

        }


}
