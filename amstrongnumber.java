class HelloWorld {
    public static int count(int n){
        return Integer.toString(n).length();
    } 
    public static int amstrong(int n,int l){
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans=ans+(int) Math.pow(rem,l);
            n=n/10;
        }
        System.out.println(ans);
        return ans;
    } 
    public static void main(String[] args) {
        int n=407;
        int cnt=count(n);
        if(n==amstrong(n,cnt)){
            System.out.println("ITS IS A AMSTRONG NUMBER");
        }
        else{
            System.out.println("NOT AMSTRONG NUMBER");
        }
    }
}
