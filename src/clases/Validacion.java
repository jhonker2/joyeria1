/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Guaman
 */
public class Validacion {
    private static final int NUMERO_DE_PROVINCIAS = 24; 
    
 public void sololetras(KeyEvent ke) { 
             
             
             char c=ke.getKeyChar(); 
             
         
          if(Character.isDigit(c)) { 
               
              ke.consume(); 
                            
          } 
                                 
        }   
public void solonumeros(KeyEvent ke) { 
            char c=ke.getKeyChar(); 
        
                 if(Character.isLetter(c)) { 
                             ke.consume();
        } 
}


public void solocedulasycelular(KeyEvent ev, String cad)
{
char car = ev.getKeyChar();
if(cad.length()>=10) ev.consume();
if((car<'0' || car>'9')) ev.consume();

}
public void solotelefonos(KeyEvent ev, String cad)
{
char car = ev.getKeyChar();
if(cad.length()>=9) ev.consume();
if((car<'0' || car>'9')) ev.consume();
}
public void soloruc(KeyEvent ev, String cad)
{
char car = ev.getKeyChar();
if(cad.length()>=13) ev.consume();
if((car<'0' || car>'9')) ev.consume();
}

public void solodecimales(KeyEvent ev, String cad)
{
 char caracter = ev.getKeyChar();
                if(cad.length()>=5) ev.consume();
                if(((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE)
                                && (caracter !='.')){
                /* lo que deseo colocar aqui es si ya se pulso el caracter (.) el mismo no se pueda repetir*/
                ev.consume();
}
}

public void solohora(KeyEvent ev, String cad)
{
 char caracter = ev.getKeyChar();
 if(cad.length()>=5) ev.consume();
                if(((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE)
                                && (caracter !=':')){
                /* lo que deseo colocar aqui es si ya se pulso el caracter (.) el mismo no se pueda repetir*/
                ev.consume();
}
}
public  static boolean esCedulaValida(String cedula) {
      
        if (!((cedula.length() == 10) && cedula.matches("^[0-9]{10}$"))) {
            return false;
        }
        
        //verifica que los dos primeros dígitos correspondan a un valor entre 1 y NUMERO_DE_PROVINCIAS
        int prov = Integer.parseInt(cedula.substring(0, 2));

        if (!((prov > 0) && (prov <= NUMERO_DE_PROVINCIAS))) {
            return false;
        }

        //verifica que el último dígito de la cédula sea válido
        int[] d = new int[10];

        //Asignamos el string a un array
        for (int i = 0; i < d.length; i++) {
            d[i] = Integer.parseInt(cedula.charAt(i) + "");
        }
        
        int aviso1 = 0, aviso2 = 0, contador1 = 0, contador2 = 0; 
        //validamos  cedulas de todos numero pares
        for (int i = 0; i < d.length; i++) {
            if (d[i] % 2 == 0){
                aviso1 = 1;
                contador1 = contador1 + 1;
            }
        }
        
        //validamos  cedulas de todos numero pares en posiciones pares
        for (int i = 1; i < d.length; i=i+2) {
            if (d[i] % 2 == 0){
                aviso2 = 1;
                contador2 = contador2 + 1;
            }
        }
        
        //verificamos los resultados y mostramos resultado
        if ((aviso1 == 1 && contador1 == 10) || (aviso2 == 1 && contador2 == 5)) {
            //JOptionPane.showMessageDialog(null, "La cédula ingresada es Incorrecta");
            return false;
        }

        int imp = 0;
        int par = 0;

        //sumamos los duplos de posición impar
        for (int i = 0; i < d.length; i += 2) {
            d[i] = ((d[i] * 2) > 9) ? ((d[i] * 2) - 9) : (d[i] * 2);
            imp += d[i];
        }

        //sumamos los digitos de posición par
        for (int i = 1; i < (d.length - 1); i += 2) {
            par += d[i];
        }

        //Sumamos los dos resultados
        int suma = imp + par;

        //Restamos de la decena superior
        int d10 = Integer.parseInt(String.valueOf(suma + 10).substring(0, 1) +
                "0") - suma;

        //Si es diez el décimo dígito es cero
        d10 = (d10 == 10) ? 0 : d10;

        //si el décimo dígito calculado es igual al digitado la cédula es correcta
        if (d10 == d[9]) {
        	return true;
        }else {
        	//JOptionPane.showMessageDialog(null, "La cédula ingresada es Incorrecta");
        	return false;
        }
  }


public void cerrar(JFrame x){
    try {
        x.setDefaultCloseOperation(x.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e){
        confirmarSalida();
        }
        });
        x.setVisible(true);
    } catch (Exception e) {
      e.printStackTrace();
    }
    
}public void confirmarSalida(){
int valor = JOptionPane.showConfirmDialog(null,"¿Esta seguro de salir del Sistema" );
        if(valor==JOptionPane.YES_OPTION)
            {
            JOptionPane.showMessageDialog(null, "Gracias por su visita, Hasta Pronto","Gracias",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
            }
}
}
