class Pattern11{
public static void main(String[] args){


int n = 5, a= 2*n;

for(int i =1;i<=a-1;i++){

int num = ( i<=n)? i : a - i;

for(int j =1;j <=num;j++){

System.out.print(j);

}
System.out.println();
}
}
}