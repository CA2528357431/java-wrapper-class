// 包装类

// 将常规数据进行包装可以利用更多的func，比如装换成string
// int、short、double、char等都有自己的包装类

// 一些数据自有的信息也在包装类

public class new01 {
    public static void main(String[] args){
        int maxint = Integer.MAX_VALUE;
        int minint = Integer.MIN_VALUE;
        System.out.println(maxint);
        System.out.println(minint);


        float maxflo = Float.MAX_VALUE;
        float minflo = Float.MIN_VALUE;
        System.out.println(maxflo);
        System.out.println(minflo);

    }
}
