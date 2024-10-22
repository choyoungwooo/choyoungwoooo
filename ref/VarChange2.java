package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        //a = 10,b = 10
        System.out.println("dataA 참조값 = "+dataA);
        System.out.println("dataB 참조값 = "+dataB);
        System.out.println("dataA.value : "+dataA.value);
        System.out.println("dataB.value : "+dataB.value);

        //dataA 변경
        //a = 20 b =20
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = "+dataA.value);
        System.out.println("dataB.value = "+dataB.value);

        //dataB변경
        //a = 30 b = 30;
        dataB.value = 30;
        System.out.println("변경 dataB.value = "+dataB.value);
        System.out.println("dataA.value = " +dataA.value);
        System.out.println("dataB.value = " +dataB.value);
    }
}
