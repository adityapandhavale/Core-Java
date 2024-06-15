package interfaces;

public interface Data {
//    Every varible in interface is static and final
    int a = 10;
    int b = 2;
//    Every method in interface is public and abstract
    void add();
}

interface SpecialData extends Data{
    void sub();
}
