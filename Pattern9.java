class Pattern9{
public static void main(String[] args){

int n = 5;
int a = 2 * n;
for(int i=1; i <= a - 1;i++){
int b = (i < n)? i : a - i;
for(int j =1 ; j <= n - b;j++){
System.out.print(" ");
}
for(int j =1; j <= b;j++){
System.out.print("* ");
}
System.out.println();
}

}
}
