class prime {
    public static boolean prime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num=1;
        if(prime(num)){
            System.out.println("It's a Prime");
        }
        else{
            System.out.println("Not a Prime");
        }
    }
}
