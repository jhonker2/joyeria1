/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
        /**
 *
 * @author Guaman
 */
public class Registro_Base {
 	DefaultTableModel model;     
         
   
    public int InsertaRegistro(String nomTabla,Object[]campos, Object[] datos)
{
	
	int FilasAfectadas=0;
	try{

	String CadenaInsercion="INSERT INTO "+nomTabla+"( "+campos[0]+"";
                for(int x=1; x<=campos.length;x++)
                {
                    if (x<campos.length){
                    CadenaInsercion +=","+campos[x]+"";
                    }else CadenaInsercion +="";
                }
                CadenaInsercion+=") VALUES ("+"'"+datos[0]+"'";

	for(int i=1; i<=datos.length;i++)
		{

		if(i<datos.length){
                                    CadenaInsercion +=",'"+datos[i]+"'";
		}else
				CadenaInsercion+=")";
		}
		Statement SentenciaInsert=joyeria1.Joyeria1.con.conectar().createStatement();
		FilasAfectadas = SentenciaInsert.executeUpdate(CadenaInsercion);
                System.out.println("SE HA REGISTRADO CORRECTAMENTE  "+nomTabla);

	}catch(Exception ex){
		JOptionPane.showMessageDialog(null, ex);	
	}
	return FilasAfectadas;
}
    
 
    
}

