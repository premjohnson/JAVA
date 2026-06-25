class Sqr{
    public static void main(String[] args){
        int n = 3;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < n; j++){
                System.out.print("*");
                if(j!=n-1){
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}