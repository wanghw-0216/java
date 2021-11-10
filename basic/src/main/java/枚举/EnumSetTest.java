package 枚举;

import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * EnumSet 为枚举设计的set类型。有两个实现类，RegularEnumSet 以及JumboEnumSet
 * EnumSet适用于枚举常量集合的操作（取子集，增加、删除、containsAll 以及remove All的操作)
 * Enum.value()适用于迭代。
 */
public class EnumSetTest {
    private static EnumSet<Pizza.PizzaStatus> undeliveredPizzaStatuss = EnumSet.of(Pizza.PizzaStatus.READY , Pizza.PizzaStatus.ORDERED);

    private Pizza.PizzaStatus status;

    public boolean isDeliverable(){
        return this.status.isReady();
    }

    public void printTimeToDeliver(){
        System.out.println("Time to deliver is " + this.getStatus().getTimeToDelivery());
    }


    public Pizza.PizzaStatus getStatus() {
        return status;
    }

    public void setStatus(Pizza.PizzaStatus status) {
        this.status = status;
    }


    //获取所有未交货的pizza
    public static List<Pizza> getAllUndeliveredPizza(List<Pizza> input){
        List<Pizza> collect = input.stream().filter(s -> undeliveredPizzaStatuss.contains(s.getStatus())).collect(Collectors.toList());
        return collect;
    }



}
