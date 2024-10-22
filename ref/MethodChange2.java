package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 : data.value ="+dataA.value);
        System.out.println("dataA = "+dataA);
        changeReference(dataA);
        //20으로 변경 value값이 변경됐기 떄문에
        System.out.println("메서드 호출 후 : dataA.value = "+dataA.value);
    }

    public static void changeReference(Data dataX){
        System.out.println("dataX =" +dataX);
        dataX.value=20;
    }
}
