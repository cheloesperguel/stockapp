package controlador;

import java.awt.event.MouseListener;
import javax.swing.JList;
import modelo.Articulo;
import vista.Ventas;

public class ListaBusquedaController implements MouseListener {

    private JList listaResultado;
    private Ventas ventana;

    public ListaBusquedaController(JList listaResultado, Ventas ventana) {
        this.listaResultado = listaResultado;
        this.ventana = ventana;
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent me) {

        if (listaResultado.getSelectedIndex() != -1) {
            Articulo articulo = ventana.metodo(listaResultado.getSelectedIndex());

            ventana.getNombreLB().setText(articulo.getNombre());
            ventana.getValorLB().setText(String.valueOf(articulo.getPrecio_venta()));
            ventana.getNumeroLB().setText("2"); //agregar numero al articulo
            ventana.getCategoriaLB().setText("clase"); //agregar a articulo la categoria
            ventana.getStockLB().setText(String.valueOf(articulo.getStock()));
            
        }

    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent me) {
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent me) {
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent me) {
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent me) {
    }

}
