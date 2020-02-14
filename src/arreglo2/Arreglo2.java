package arreglo2;

public class Arreglo2 {

    public static void main(String[] args) {

        int array[] = new int[]{2,5,3,11,8,10,9,7,4};
        int par = 0, impar = 0, sumaPar = 0, sumaImpar = 0, total = 0, max=0, min=0, cont=0;
        //max = min = array[0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] % 2 == 0) {
                    par++;
                    sumaPar = sumaPar + array[i];
                    if (array[i] > max) {
                        max = array[i];
                    }
                    break;
                } else {
                    impar++;
                    sumaImpar = sumaImpar + array[i];
                    if (array[i] < min) {
                        min = array[i];
                    }
                    break;
                }
            }
        }


        total = sumaImpar + sumaPar;
        System.out.println(par + " números son pares");
        System.out.println(impar + " números son impares");
        System.out.println("La suma de números que son pares es " + sumaPar);
        System.out.println("La suma de números que son impares " + sumaImpar);
        System.out.println("La sumatoría de num pares e impares es " + total);
        System.out.println("El nùmero par mayor es: " + max);
        System.out.println("El nùmero impar menor es: " + min);
        
        for (int i = 0; i < array.length; i++) {
            if (esPrimo(array[i])) {
                System.out.println("Nùmero primo: " + array[i]);
                cont++;
            }
        }
        System.out.println("Total números primos : " +  cont);
        
    }
    
    private static boolean esPrimo(int num) {
        boolean primo = (num == 1) ? false : true;
        int divisor = 2;
        while (primo && divisor <= Math.sqrt(num)) {
            if (num % divisor == 0) {
                primo = false;
            }
            divisor++;
        }
        return primo;
    }
}
