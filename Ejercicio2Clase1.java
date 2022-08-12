//Promedio de 4 notas

package ejercicio2.clase1;

import javax.swing.JOptionPane;

public class Ejercicio2Clase1
{
    public static void main(String[] args)
    {
        double nota1, nota2, nota3, nota4, notaFinal;
        
        nota1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota obtenida por el estudiante en el parcial 1: "));
        nota2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota obtenida por el estudiante en el parcial 2: "));
        nota3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota obtenida por el estudiante en el parcial 3: "));
        nota4=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota obtenida por el estudiante en el parcial 4: "));
        
        notaFinal=(nota1+nota2+nota3+nota4)/4;
        
        JOptionPane.showMessageDialog(null, "La nota final del estudiante es: "+notaFinal);        
    }
}