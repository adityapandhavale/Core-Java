package Enum;

public enum UseOfConstructorUsingEnum  {
    Mackbook(2000),XPS(2200),ThinPad(1000),Surface()
            {
                int price =100;
            };
    int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    UseOfConstructorUsingEnum(int price){
         this.price=price;
    }

    UseOfConstructorUsingEnum() {
    }
}