/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import static java.lang.System.in;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author marce
 */
public class Gui_Player extends javax.swing.JFrame {

    DefaultListModel modelo = new DefaultListModel();

    /**
     * Creates new form Gui_Player
     */
    public Gui_Player() {
        initComponents();
        setTitle("Reproductor de Musica En Java "); //Cambia el nombre al la ventana
        setLocationRelativeTo(null); //centra la ventana en el medio de la pantalla
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pause = new javax.swing.JButton();
        Stop = new javax.swing.JButton();
        Play = new javax.swing.JButton();
        barraProgreso = new javax.swing.JProgressBar();
        volumen = new javax.swing.JSlider();
        Before = new javax.swing.JButton();
        Next = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaCanciones = new javax.swing.JList<>();
        menuBar = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        buscarCancion = new javax.swing.JMenuItem();
        btnItemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));
        setIconImage(getIconImage());
        setResizable(false);

        Pause.setText("Pausa");
        Pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PauseActionPerformed(evt);
            }
        });

        Stop.setText("Parar");

        Play.setText("Reproducir");
        Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayActionPerformed(evt);
            }
        });

        barraProgreso.setMaximum(500500);

        volumen.setOrientation(javax.swing.JSlider.VERTICAL);

        Before.setText("Anterior");
        Before.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeforeActionPerformed(evt);
            }
        });

        Next.setText("Siguiente");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(ListaCanciones);

        archivo.setText("Archivo");
        archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoActionPerformed(evt);
            }
        });

        buscarCancion.setText("Buscar Cancion");
        buscarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCancionActionPerformed(evt);
            }
        });
        archivo.add(buscarCancion);

        btnItemSalir.setText("Salir de DoME");
        btnItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItemSalirActionPerformed(evt);
            }
        });
        archivo.add(btnItemSalir);

        menuBar.add(archivo);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barraProgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Play, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Pause, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Stop, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addComponent(Before, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(10, 10, 10)
                .addComponent(volumen, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volumen, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(barraProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Play)
                    .addComponent(Pause)
                    .addComponent(Stop)
                    .addComponent(Before)
                    .addComponent(Next))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayActionPerformed
        String cancionReproducir = ListaCanciones.getSelectedValue(); //Metodo que obtiene el texto seleccionado de la lista

        if (cancionReproducir == null) { //si la variable cancionReproducir es nula (no se selecciono ninguna cancion)
            JOptionPane.showMessageDialog(null, "No ha seleccionado una cancion");
        } else {

            Thread reproduccion = new Thread() {  //instancia abstracta de la clase Thread (Funciona pero no es lo mas recomendable implementarla asi, para efectos practicos lo manejaremos asi por ahora)
                public void run() {

                    try {  //Try es un bloque de manejo de excepciones es util (y necesario) en toda aquella operacion que podria hacer que tu programa tuviera un error,
                        //la sentencia catch le permite capturar la Excepcion y ejecutar código alternativo en caso de que hubiera algun error
                        Player apl = new Player(new FileInputStream(cancionReproducir)); //Cancion Reproducir es la variable que guarda el valor seleccionado de la lista de canciones
                        //Hilo progreso q muestra el progreso de la cancion y el imprime en milisegundos
                        Thread progreso = new Thread() {
                            public void run() {
                                while (apl.isComplete() == false) {
                                    barraProgreso.setValue(apl.getPosition());
                                    System.out.println(apl.getPosition());
                                }
                            }
                        };
                        
                        progreso.start(); //inicia el hilo progreso
                        apl.play();  //Inicia la reproduccion
                        
                    } catch (FileNotFoundException ex) {
                        JOptionPane.showMessageDialog(null, "El archivo no se ha encontrado");
                    } catch (JavaLayerException ex) {
                        JOptionPane.showMessageDialog(null, "Error con la libreria de reproduccion: " + ex);
                    }
                }
            };
            reproduccion.start();//ejecuta el hilo

        }

    }//GEN-LAST:event_PlayActionPerformed

    private void BeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeforeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BeforeActionPerformed

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NextActionPerformed

    private void PauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PauseActionPerformed

        Thread reproduccion = new Thread() {  //instancia abstracta de la clase Thread (Funciona pero no es lo mas recomendable implementarla asi, para efectos practicos lo manejaremos asi por ahora)

            public void run() {
                try {
                    JOptionPane.showMessageDialog(null, "Este es el JButton Pause");
                    //Player a = new Player(in);
                    //int position = a.getPosition();
                    //System.out.println(position);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }//fun metodo run
        };//fin Thread
        try {
            reproduccion.sleep(5000);//ejecuta el hilo
        } catch (InterruptedException ex) {
            Logger.getLogger(Gui_Player.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_PauseActionPerformed

    private void archivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoActionPerformed

    }//GEN-LAST:event_archivoActionPerformed

    private void buscarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCancionActionPerformed
        JFileChooser selector = new JFileChooser(); //Creacion de un objeto FileChooser
        selector.setFileSelectionMode(JFileChooser.FILES_ONLY);//Solo puede abrir Archivos
        //selector.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);//Solo puede abrir Directorios
        //selector.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);//Abre archivos y directorios
        FileNameExtensionFilter filtroArchivos = new FileNameExtensionFilter("Archivos de audio MP3", "mp3"); //Establece que tipo de archivos se podran abrir
        //FileNameExtensionFilter filtroArchivos = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif"); 
        selector.setFileFilter(filtroArchivos); //Establece el filtro anterior al objeto filechooser

        int result = selector.showOpenDialog(this); //muestra el cuadro de dialogo de seleccion asignando un valor a la variable result (contiene informacion sobre si el cuadro de dialogo se pudo abrir o no)

        if (result == JFileChooser.APPROVE_OPTION) { //Si el cuadro de dialogo si se desplego (Approve_option)

            File archivoSeleccionado = selector.getSelectedFile();//Crea un objeto de la clase File que sera el que tu puedes usar para obtener informacion 
            String rutaArchivo = archivoSeleccionado.getAbsoluteFile().toString();//obtiene la ruta del archivo y la convierte a un String para que lo puedas usar mas adelante
            String nombreArchivo = archivoSeleccionado.getName();//obtiene el nombre para que lo puedas usar mas adelante

            //Este codigo es de la lista que creaste anteriormente
            modelo.addElement(rutaArchivo);//Agregas al modelo de la lista la ruta del archivo
            ListaCanciones.setModel(modelo);
            //modelo.addElement(nombreArchivo);//Lo mismo que el de arriba pero con solo el nombre
        }
    }//GEN-LAST:event_buscarCancionActionPerformed

    private void btnItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItemSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnItemSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui_Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui_Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui_Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui_Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui_Player().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Before;
    private javax.swing.JList<String> ListaCanciones;
    private javax.swing.JButton Next;
    private javax.swing.JButton Pause;
    private javax.swing.JButton Play;
    private javax.swing.JButton Stop;
    private javax.swing.JMenu archivo;
    private javax.swing.JProgressBar barraProgreso;
    private javax.swing.JMenuItem btnItemSalir;
    private javax.swing.JMenuItem buscarCancion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JSlider volumen;
    // End of variables declaration//GEN-END:variables
}
