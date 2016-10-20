/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.p18;
import java.util.*;

/**
 *
 * @author Esteban
 */
public class FPP18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Declaracion de variables e impresion de resultado
int a,b,c;
a=pedir("A");
b=pedir("B");
c=pedir("C");
System.out.println("El MCM es " + MCM(a, b, c));
}
public static int pedir(String val){ //Pedida de Datos
Scanner entrada = new Scanner(System.in);
System.out.print("Ingrese el Valor de " + val);
int num=entrada.nextInt();
return num;
}
public static int MCM(int a, int b,int c){ //Dividiendo y sacando el reciduo de los numeros 
int r=1,m;
m=a;
if(m<b)m=b;
if(m<c)m=c;
for (int i=2;i<m;i++){
if (a%i==0||b%i==0||c%i==0){
r=r*i;
if (a%i==0) a=a/i;
if (b%i==0) b=b/i;
if (c%i==0) c=c/i;
}
}
return r; //Regresar MCM
}
}