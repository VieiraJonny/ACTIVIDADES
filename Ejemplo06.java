import java.util.*;
public class Ejemplo06 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double nota;
System.out.println("Introduzca una nota entre 0 y 10: ");
nota = sc.nextDouble();
System.out.println("La calificaci�n del alumno es ");
if(nota < 0 || nota > 10)
System.out.println("Nota no v�lida");
else if(nota==10)
System.out.println("Matr�cula de Honor");
else if (nota >= 9)
System.out.println("Sobresaliente");
else if (nota >= 8)
System.out.println("Notable");
else if (nota >= 7)
System.out.println("Notable");
else
System.out.println("Suspenso");
}
}