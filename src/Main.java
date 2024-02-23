public class Main {
    public static void main(String[] args) {
        Human[] arr = create();
        for( Human i : arr ){
            if( i instanceof Man )
                System.out.println("arr[0] = Man");
            if( i instanceof Woman )
                System.out.println("arr[1] = Woman");
        }
    }

    public static Human[] create(){
        Human[] arr = new Human[2];
        Man Man = new Man();
        arr[0] = Man;
        Woman Woman = new Woman();
        arr[1] = Woman;
        return arr;
    }
}