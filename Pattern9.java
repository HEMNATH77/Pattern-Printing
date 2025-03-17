class Pattern9{
public static void main(String[] args){

int n = 5;

for(int i = 1;i<=n;i++){
for(int j = 1;j<=i;j++){
System.out.print("{");
for(int k = 1; k<j;k++){
System.out.print("{");
}
if ( j > 1){
System.out.print("}");
}
}
System.out.print("}");
System.out.println();
}
}
}
