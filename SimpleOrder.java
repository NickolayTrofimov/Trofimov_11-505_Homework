public class SimpleOrder {
    private int number;
    private int date;
    private String status;
    private int sumOfOrder;
    private Product[] tovar;
    private int count;


    public void setOrder(int number, int date, int maxItems){
        this.number = number;
        this.date = date;
        this.status = "Новый";
        this.tovar = new Product[maxItems];
        this.count = 0;
        this.sumOfOrder = 0;
    }

    public int getNumber() {
        return this.number;
    }

    public int getDate() {
        return this.date;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String newStatus) {
        if (canChangeStatus(newStatus)){
            this.status = newStatus;
            System.out.println(newStatus);
        }
        else {
            System.out.println("Статус изменить нельзя!");
        }
    }

    private boolean canChangeStatus(String newStatus) {
        if (this.status.equals("Доставлен")){
            return false;
        }

        String[] haveStatus = {"Новый", "В обработке", "Отправлен", "Доставлен"};
        int currentIndex = -1;
        int newIndex = -1;

        for(int i = 0; i < haveStatus.length; i++){
            if (haveStatus[i].equals(this.status)){
                currentIndex = i;
            }
            if (haveStatus[i].equals(newStatus)){
                newIndex = i;
            }
        }
        return newIndex > currentIndex;
    }

    public int getCount(){
        return count;
    }

    public Product[] getTovar() {
        Product[] copy = new Product[count];
        for(int i = 0; i < count; i++) {
            copy[i] = tovar[i];
        }
        return copy;
    }

    public void addProduct(Product product) {
        if (count >= tovar.length) {
            increaseArray();
        }
        if (count < tovar.length) {
            tovar[count] = product;
            count = count + 1;
        }
        else {
            System.out.println("Нельзя добавить больше товаров!");
        }
    }

    private void increaseArray(){
        int newMaxItems = tovar.length * 2;
        Product[] newTovar = new Product[newMaxItems];
        for(int i = 0; i < tovar.length; i++) {
            newTovar[i] = tovar[i];
        }
        tovar = newTovar;
    }

    public void setTovar(Product[] tovar) {
        this.tovar = new Product[tovar.length];
        for(int i = 0; i < tovar.length; i++) {
            this.tovar[i] = tovar[i];
        }
        this.count = tovar.length;
    }

    public int getSumOfOrder() {
        int total = 0;
        for(int i = 0; i < count; i++){
            total += tovar[i].getTotalPrice();
        }
        sumOfOrder = total;
        return sumOfOrder;
    }
}
