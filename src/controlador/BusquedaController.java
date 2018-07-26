/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import modelo.Articulo;

/**
 *
 * @author Marcelo Esperguel
 */
public class BusquedaController implements DocumentListener {

    
    JTextField busquedaTF;
    JComponent resultadosComponent;
    ArrayList<Articulo> resultados = new ArrayList<>();
    
    public BusquedaController(JTextField busquedaTF, JComponent resultadosComponent) {
        this.busquedaTF=busquedaTF;
        this.resultadosComponent=resultadosComponent;
        
        test();
    }
    
   

    @Override
    public void insertUpdate(DocumentEvent e) {
        
        setResponse();
        
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        setResponse();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
          setResponse();
    }
    
    public void setResponse(){
        
        if(resultadosComponent.getClass().equals(javax.swing.JList.class)){
            JList resultadosLista= (JList) resultadosComponent;
            DefaultListModel<String> model = new DefaultListModel<>();
            
            //crear DAO
            //HAcer consulta
            //Poblar lista con la respeusta de la consulta
            
            for(Articulo a : resultados){
                model.addElement(a.getNombre());
            }
            
            
            resultadosLista.setModel(model);
        }
        
    }
    
    public Articulo getArticuloByIndex(int index){
        
        return resultados.get(index);
    }
    
    public void test(){
        
        Articulo a1=new Articulo();
        Articulo a2=new Articulo();
        Articulo a3=new Articulo();
        Articulo a4=new Articulo();
        
        a1.setNombre("Articulo 1");
        a2.setNombre("Articulo 2");
        a3.setNombre("Articulo 3");
        a4.setNombre("Articulo 4");
        
        resultados.add(a1);
        resultados.add(a2);
        resultados.add(a3);
        resultados.add(a4);

    }
    
    
}
