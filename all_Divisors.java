class allDivisors {

    public static void main(String[] args) {
        int a=16;
        for(int i=1;i<=Math.sqrt(a);i++){
            if(a%i==0){
                System.out.print(i+" ");
                if(i!=a/i) System.out.print(a/i+" ");
            }
        }
    }
}
