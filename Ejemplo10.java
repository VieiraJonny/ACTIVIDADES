import java.util.*;
public class Ejemplo10 {
public static void main(String[] args) {
int suma = 0, num;
Scanner sc = new Scanner(System.in);
System.out.print("Introduzca un n�mero: ");
num = sc.nextInt();
while (num >= 0){
suma = suma + num;
System.out.print("Introduzca un n�mero: ");
num = sc.nextInt();
}
System.out.println("La suma es: " + suma );
}
}