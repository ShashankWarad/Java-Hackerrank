
class Solution{
    
    public static void result(int a, int b, int n){
        int res = a + (1 * b);
            System.out.print(res+" ");
            for(int j=2;j<(Math.pow(2,n));j*=2){
                res = res + (j*b);
                System.out.print(res+" ");
            }
    }
    
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            result(a, b, n);
            System.out.println();
        }
        in.close();
    }
}
