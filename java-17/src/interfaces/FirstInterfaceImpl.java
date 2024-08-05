package interfaces;

public class FirstInterfaceImpl implements FirstInterface, SecondInterface {


    @Override
    public void firstMethod() {
        System.out.println("FirstInterface Impl of firstMethod");
    }

    @Override
    public void secondMethods() {
        System.out.println("FirstInterface Impl of secondMethod");
    }


    @Override
    public void secondInterfaceMethod() {
        System.out.println("SecondInterface Impl of secondMethod");
    }
}
