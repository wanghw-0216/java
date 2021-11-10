package 枚举;

import java.sql.SQLOutput;

public class Pizza {
    private PizzaStatus status;

    public enum PizzaStatus{
        ORDERED(5){
            @Override
            public boolean isOrdered(){
                return true;
            }
        },
        READY(2){
            @Override
            public boolean isReady(){
                return true;
            }
        },
        DELIVERED(0){
            @Override
            public boolean isDelivered(){
                return true;
            }
        };
        private int timeToDelivery;

        public boolean isOrdered(){
            return false;
        }
        public boolean isReady(){
            return false;
        }
        public boolean isDelivered(){
            return false;
        }

        public int getTimeToDelivery(){
            return timeToDelivery;
        }

        PizzaStatus (int timeToDelivery){
            this.timeToDelivery = timeToDelivery;
        }
    }


    public boolean isDeliverable(){
        return this.status.isReady();
    }

    public void printTimeToDelivery(){
        System.out.println(
                "Time to delivery is " + this.status.getTimeToDelivery());
    }

    public PizzaStatus getStatus() {
        return status;
    }

    public void setStatus(PizzaStatus status) {
        this.status = status;
    }
}




class test {
    public static void main(String[] args) {
        Pizza testPz = new Pizza();
        testPz.setStatus(Pizza.PizzaStatus.ORDERED);
        System.out.println(testPz.isDeliverable());
    }
}
