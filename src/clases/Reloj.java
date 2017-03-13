/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JLabel;

/**
 *
 * @author Ing. Sornoza
 */
public class Reloj extends Thread {
    private JLabel lbl;
    public Reloj (JLabel lbl){
    this.lbl=lbl;}
    
    public void run(){
        Calendar calendario = new GregorianCalendar();
        String ampm;
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";
        while(true)
        {
        Date hoy=new Date();
        SimpleDateFormat s=new SimpleDateFormat("hh:mm:ss");
        lbl.setText(s.format(hoy)+" "+ampm);
        try 
        {
        sleep(1000);
        }catch(Exception ex){}
        }
    }   
    
    

}
