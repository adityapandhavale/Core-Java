package interfaces;

//An interface is a kind of class which supports the
//multiple inheritances by allowing a class the implementation
//of one or more classes
class ClassImplementingTheInterface implements Data,SpecialData{
    @Override
    public void add() {
        System.out.println(a+b);
    }

    @Override
    public void sub() {
        System.out.println(a-b);
    }
}
