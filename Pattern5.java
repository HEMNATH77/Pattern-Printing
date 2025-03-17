class Pattern5{
public static void main(String[] args){

int n = 5;
int a = 2 * n-1;
for(int i = 1;i<=a;i++){
int b = (i <= n) ? i : (2 * n -i);
for(int j = 1;j<=b;j++){
System.out.print("*");

}
System.out.println();
}

}
}