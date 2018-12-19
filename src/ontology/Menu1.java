/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontology;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.query.*;
import com.hp.hpl.jena.rdf.model.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.HyperlinkEvent;

/**
 *
 * @author Team Bioinformatic Ontology
 */
public class Menu1 extends JFrame {

    /**
     * Creates new form Menu1
     */
    public Menu1() {
        this.ontologies = new LinkedList<>();
        this.ontologiesName = new LinkedList<>();
        initComponents();

        jEditorPane1.addHyperlinkListener(e -> {
            if (HyperlinkEvent.EventType.ACTIVATED.equals(e.getEventType())) {
                Desktop desktop = Desktop.getDesktop();
                try {
                    desktop.browse(e.getURL().toURI());
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        jEditorPane1.setEditable(false);
        caricaOntologie();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    boolean[] choosenOnto = {false, false, false, false};
    LinkedList<OntModel> ontologies;
    LinkedList<String> ontologiesName;
    HashMap<Info, LinkedList<String>> icon;
    HashMap<Info, Resource> specificResult;
    Info clickedInfo;

    public static void main(String args[]) throws FileNotFoundException, UnsupportedEncodingException {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu1().setVisible(true);
            }

        });

        //carico ontologie
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Cerca = new javax.swing.JButton();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        campoCerca = new javax.swing.JTextField();
        Ontologia = new javax.swing.JLabel();
        jCheckBox_Ontologia1 = new javax.swing.JCheckBox();
        jCheckBox_Ontologia2 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        ReadME = new javax.swing.JButton();
        jButton_Save_as = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton_Search = new javax.swing.JButton();
        jCheckBox_Ontologia3 = new javax.swing.JCheckBox();
        jCheckBox_Ontologia4 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<Info>();
        jButton1 = new javax.swing.JButton();

        jButton_Cerca.setText("Cerca");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ontology Browser");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setForeground(java.awt.Color.white);
        setLocation(new java.awt.Point(400, 200));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(950, 750));
        setPreferredSize(new java.awt.Dimension(950, 750));
        setSize(new java.awt.Dimension(950, 750));

        campoCerca.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        campoCerca.setText("Type a word to search...");
        campoCerca.setName("patternToSearch"); // NOI18N
        campoCerca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoCercaMouseClicked(evt);
            }
        });

        Ontologia.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Ontologia.setText("Ontologie:");

        jCheckBox_Ontologia1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCheckBox_Ontologia1.setForeground(new java.awt.Color(255, 0, 0));
        jCheckBox_Ontologia1.setText("GO");
        jCheckBox_Ontologia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Ontologia1ActionPerformed(evt);
            }
        });

        jCheckBox_Ontologia2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCheckBox_Ontologia2.setForeground(new java.awt.Color(255, 0, 0));
        jCheckBox_Ontologia2.setText("ReXo");
        jCheckBox_Ontologia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Ontologia2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Result");

        ReadME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ReadME.setText("README");
        ReadME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReadMEMouseClicked(evt);
            }
        });

        jButton_Save_as.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Save_as.setText("Export");
        jButton_Save_as.setActionCommand("");
        jButton_Save_as.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_Save_asMousePressed(evt);
            }
        });
        jButton_Save_as.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Save_asActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ontology/giphy.gif"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jButton_Search.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_Search.setText("Search");
        jButton_Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_SearchMousePressed(evt);
            }
        });

        jCheckBox_Ontologia3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCheckBox_Ontologia3.setForeground(new java.awt.Color(255, 0, 0));
        jCheckBox_Ontologia3.setText("EDAM");
        jCheckBox_Ontologia3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Ontologia3ActionPerformed(evt);
            }
        });

        jCheckBox_Ontologia4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCheckBox_Ontologia4.setForeground(new java.awt.Color(255, 0, 0));
        jCheckBox_Ontologia4.setText("GeXo");
        jCheckBox_Ontologia4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Ontologia4ActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ontology/ontlogo.jpg"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(150, 300));

        jEditorPane1.setEditable(false);
        jEditorPane1.setBorder(null);
        jEditorPane1.setContentType("text/html"); // NOI18N
        jEditorPane1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jEditorPane1.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body vlink=\"red\">\r\n    <p style=\"margin-top: 0\">\r\n      \r\n    </p>\r\n  </body>\r\n</html>\r\n");
        jEditorPane1.setMinimumSize(new java.awt.Dimension(350, 400));
        jScrollPane1.setViewportView(jEditorPane1);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ontology/logo_standard.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(600, 400));

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(jList1);

        jButton1.setText("Leggenda");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ReadME, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jButton_Save_as, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(campoCerca)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Ontologia, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox_Ontologia1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox_Ontologia2)
                                .addGap(8, 8, 8)
                                .addComponent(jCheckBox_Ontologia3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox_Ontologia4)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jCheckBox_Ontologia1, jCheckBox_Ontologia2, jCheckBox_Ontologia3, jCheckBox_Ontologia4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoCerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ontologia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox_Ontologia1)
                            .addComponent(jCheckBox_Ontologia2)
                            .addComponent(jCheckBox_Ontologia3)
                            .addComponent(jCheckBox_Ontologia4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Save_as, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReadME)
                    .addComponent(jButton1))
                .addGap(15, 15, 15))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jCheckBox_Ontologia1, jCheckBox_Ontologia2, jCheckBox_Ontologia3, jCheckBox_Ontologia4});

        getAccessibleContext().setAccessibleName("                Ontology Browser");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    MouseListener mouseListener = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent mouseEvent) {
            JList<String> theList = (JList) mouseEvent.getSource();
            if (mouseEvent.getClickCount() == 2) {
                int index = theList.locationToIndex(mouseEvent.getPoint());
                if (index >= 0) {
                    Object o = theList.getModel().getElementAt(index);
                    clickedInfo = (Info) o;
                    TitledBorder titleBorder = new TitledBorder(new LineBorder(Color.BLACK), clickedInfo.getLabel() + " | " + clickedInfo.getId() + " | " + clickedInfo.getSubClass());
                    titleBorder.setTitleJustification(TitledBorder.CENTER);
                    titleBorder.setTitleFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
                    jScrollPane1.setBorder(titleBorder);
                    //cambiare il colore dello sfondo
                    //jEditorPane1.setBackground(new Color(209, 235, 255));
                    specificResPrint();
                }
            }
        }
    };

    public void specificResPrint() {
        String result = "<br>";
        Resource r = specificResult.get(clickedInfo);
        HashMap<Property, LinkedList<RDFNode>> table = new HashMap<>();
        for (StmtIterator lP = r.listProperties(); lP.hasNext();) {
            Statement s = lP.nextStatement();
            Property p = s.getPredicate();
            RDFNode o = s.getObject();
            if (table.containsKey(p)) {
                table.get(p).add(o);
            } else {
                LinkedList<RDFNode> list = new LinkedList<>();
                list.add(o);
                table.put(p, list);
            }
        }
        for (Property p : table.keySet()) {
            String obj = "", pred = "";
            Property label = null;
            String listOnto = icon.get(clickedInfo).getFirst();
            int indexOnto = ontologiesName.indexOf(listOnto);
            if (indexOnto + 1 == 2 || indexOnto + 1 == 4) {
                label = ontologies.get(indexOnto).getProperty("http://www.w3.org/2004/02/skos/core#prefLabel");
            } else if (indexOnto + 1 == 1 || indexOnto + 1 == 3) {
                label = ontologies.get(indexOnto).getProperty("http://www.w3.org/2000/01/rdf-schema#label");
            }
            if (p.isResource()) {
                if (p.asResource().hasProperty(label)) {
                    pred = ("   <a href='" + p.asResource().getURI() + "/'style=\"color:blue\">"
                            + p.asResource().getRequiredProperty(label).getObject() + ":</a>      ");
                } else {
                    pred = ((p.getLocalName() + ":"));
                }
            } else {
                pred = ((p.toString() + ":"));
            }
            for (RDFNode o : table.get(p)) {
                if (o.isResource()) {
                    if (o.asResource().hasProperty(label)) {
                        obj += ("  <a href='" + o.asResource().getURI() + "/'style=\"color:blue\">"
                                + o.asResource().getRequiredProperty(label).getObject() + "</a>");
                    } else {
                        obj += ((o.asResource().getLocalName()));
                    }
                } else {
                    obj += ((o.toString()));
                }
                if (table.get(p).getLast().equals(o)) {
                    obj += ".<br>";
                } else {
                    obj += ";<br>";
                }
            }
            if (indexOnto+1 == 1) {
                pred = pred.replace("^^http://www.w3.org/2001/XMLSchema#string", "");
                obj = obj.replace("^^http://www.w3.org/2001/XMLSchema#string", "");
            }
//possibilità uno tutto in colonna 
            result = result.concat("<h1 align=\"center\"><font size = '6' color='#008080' face = 'arial'>" + pred + "</font></h1>"
                    + "<h3 align=\"center\"><font size = '5' face = 'arial'>" + obj + "</font></h3><hr><br>");
//possibilità due predicato : oggetto in colonna
//            result = result.concat("<h1 align=\"center\"><font size = '5' color='blue' face = 'arial'>" + pred + "  :  </font>"
//                    + "<font size = '5' face = 'arial'>" + obj + "</font></h1><br><hr><br>");
        }
        jEditorPane1.setText(result);
    }

    private void createListInfo() {
        DefaultListModel<Info> model = new DefaultListModel<>();
        icon.keySet().forEach((i) -> {
            model.addElement(i);
        });
        // create JList with model
        jList1.setModel(model);
        jList1.addMouseListener(mouseListener);
        // set cell renderer
        jList1.setCellRenderer(new StatementRender());
        jList1.setVisible(true);
    }

    private void searchInOnto() {
        String cerca = campoCerca.getText();
        if (!cerca.equals("Type a word to search...") && jButton_Search.isEnabled() && !cerca.equals("")) {
            if (((choosenOnto[0]) == false) && ((choosenOnto[1]) == false) && ((choosenOnto[2]) == false) && ((choosenOnto[3]) == false)) {
                JOptionPane.showMessageDialog(null, "Attenzione! Selezionare almeno un'ontologia!", "ERRORE", JOptionPane.ERROR_MESSAGE);
            } else {
                jScrollPane1.setBorder(new TitledBorder(""));
                jEditorPane1.setText("");
                TitledBorder titleBorder = new TitledBorder("Campo cercato : " + campoCerca.getText());
                titleBorder.setTitleFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
                jScrollPane2.setBorder(titleBorder);
                Menu1.getFrames()[0].setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
                jEditorPane1.setText("");
                icon = new HashMap<>();
                specificResult = new HashMap<>();
                for (int i = 0; i < choosenOnto.length; i++) {
                    if (choosenOnto[i]) {
                        querying(ontologies.get(i), i + 1);
                    }
                }
                if (icon.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "La ricerca non ha prodotto alcun risultato", "ERRORE", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    icon.keySet().forEach((i) -> {
                        i.setIconName(icon.get(i).toString());
                    });
                    createListInfo();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Attenzione! Inserire una parola chiave!", "ERRORE", JOptionPane.ERROR_MESSAGE);
        }
        Menu1.getFrames()[0].setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }
    private void jCheckBox_Ontologia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Ontologia2ActionPerformed
        // TODO add your handling code here:
        choosenOnto[1] = jCheckBox_Ontologia2.isSelected();
    }//GEN-LAST:event_jCheckBox_Ontologia2ActionPerformed

    private void ReadMEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReadMEMouseClicked
        // TODO add your handling code here:
        String path = "ReadMe.pdf";
        File ReadMe = new File(path);
        try {
            Desktop.getDesktop().open(ReadMe);
        } catch (IOException ex) {
            Logger.getLogger(Menu1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ReadMEMouseClicked


    private void jCheckBox_Ontologia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Ontologia1ActionPerformed
        // TODO add your handling code here:
        choosenOnto[0] = jCheckBox_Ontologia1.isSelected();
    }//GEN-LAST:event_jCheckBox_Ontologia1ActionPerformed

    private void jCheckBox_Ontologia3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Ontologia3ActionPerformed
        // TODO add your handling code here:
        choosenOnto[2] = jCheckBox_Ontologia3.isSelected();
    }//GEN-LAST:event_jCheckBox_Ontologia3ActionPerformed

    private void jCheckBox_Ontologia4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Ontologia4ActionPerformed
        // TODO add your handling code here:
        choosenOnto[3] = jCheckBox_Ontologia4.isSelected();
    }//GEN-LAST:event_jCheckBox_Ontologia4ActionPerformed


    private void campoCercaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoCercaMouseClicked
        // TODO add your handling code here:
        campoCerca.setText("");
    }//GEN-LAST:event_campoCercaMouseClicked

    private void jButton_SearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_SearchMousePressed
        // TODO add your handling code here:
        searchInOnto();
    }//GEN-LAST:event_jButton_SearchMousePressed

    public void querying(OntModel m_ont, int ontoNum) {
        String search = campoCerca.getText();
        String queryString = "SELECT DISTINCT ?x  WHERE { ?x ?y ?z . FILTER (regex(?z,\"" + search + "\",'i'))}";
        Query query = QueryFactory.create(queryString, Syntax.syntaxARQ);
        QueryExecution qexec = QueryExecutionFactory.create(query, m_ont);
        Property label = null;
        Property definition = null;
        Property id = null;
        if (ontoNum == 2 || ontoNum == 4) {
            label = m_ont.getProperty("http://www.w3.org/2004/02/skos/core#prefLabel");
            definition = m_ont.getProperty("http://www.w3.org/2004/02/skos/core#definition");
            id = m_ont.getProperty("http://www.geneontology.org/formats/oboInOwl#id");
        } else if (ontoNum == 1) {
            label = m_ont.getProperty("http://www.w3.org/2000/01/rdf-schema#label");
            definition = m_ont.getProperty("http://purl.obolibrary.org/obo/IAO_0000115");
            id = m_ont.getProperty("http://www.geneontology.org/formats/oboInOwl#id");
        } else if (ontoNum == 3) {
            label = m_ont.getProperty("http://www.w3.org/2000/01/rdf-schema#label");
            definition = m_ont.getProperty("http://www.geneontology.org/formats/oboInOwl#hasDefinition");
            id = label;
        }
        Property subclass = m_ont.getProperty("http://www.w3.org/2000/01/rdf-schema#subClassOf");
        for (ResultSet results = qexec.execSelect(); results.hasNext();) {
            QuerySolution soln = results.nextSolution();
            RDFNode node = soln.get("?x");
            Resource r = node.asResource();
            String l, ID, def, sub;
            if (r.isResource()) {
                if (r.asResource().hasProperty(label)) {
                    l = r.getRequiredProperty(label).getObject().toString() + " ";
                } else {
                    l = r.getLocalName() + " ";
                }
                if (r.asResource().hasProperty(id)) {
                    ID = r.getRequiredProperty(id).getObject().toString() + " ";

                } else {
                    ID = r.getLocalName() + " ";
                }
                if (r.asResource().hasProperty(definition)) {
                    def = r.getRequiredProperty(definition).getObject().toString() + " ";
                } else {
                    def = r.getLocalName() + " ";
                }
                if (r.asResource().hasProperty(subclass)) {
                    RDFNode subc = r.getRequiredProperty(subclass).getObject();
                    if (subc.isResource()) {
                        if (subc.asResource().hasProperty(label)) {
                            sub = r.getRequiredProperty(subclass).getObject().asResource().getRequiredProperty(label).getObject().toString() + " ";
                        } else {
                            sub = subc.asResource().getLocalName() + "";
                        }
                    } else {
                        sub = subc.toString() + " ";
                    }
                } else {
                    sub = r.getLocalName() + " ";
                }
            } else {
                l = r.toString() + " ";
                ID = r.toString() + " ";
                def = r.toString() + " ";
                sub = r.toString() + " ";
            }
            if (ontoNum == 1) {
                l = l.replace("^^http://www.w3.org/2001/XMLSchema#string", "");
                ID = ID.replace("^^http://www.w3.org/2001/XMLSchema#string", "");
                def = def.replace("^^http://www.w3.org/2001/XMLSchema#string", "");
                sub = sub.replace("^^http://www.w3.org/2001/XMLSchema#string", "");
            }
            //eliminate label  NULL
            if (l.contains("null")) {
                l = l.replace("null", "Blank Node");
            }
            if (ID.contains("null")) {
                ID = ID.replace("null", "N.A.");
            }
            if (sub.contains("null")) {
                sub = sub.replace("null", "N.A.");
            }
            if (def.contains("null")) {
                def = l.replace("null", "Node without a specific description");
            }
            if (l.equals(ID)) {
                ID = "N.A.";
            }
            Info info = new Info(l, ID, def, sub);
            if (icon.containsKey(info)) {
                icon.get(info).add(ontologiesName.get(ontoNum - 1));
            } else {
                LinkedList<String> list = new LinkedList<>();
                list.add(ontologiesName.get(ontoNum - 1));
                icon.put(info, list);
                specificResult.put(info, r);
            }
        }
    }


    private void jButton_Save_asMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Save_asMousePressed
        if (!"".equals(jEditorPane1.getText())) {
            sceglifile(jEditorPane1.getText());
        } else {
        }
    }//GEN-LAST:event_jButton_Save_asMousePressed

    private void jButton_Save_asActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Save_asActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Save_asActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Le informazioni principali sono presentate nel riquadro"
                + " result nel formato :\n   Label | ID | is_a\n\n N.A. = Not Avaiable", "Leggenda", JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void caricaOntologie() {
        OntModel o1 = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM, null);
        o1.read("..//go.owl");
        ontologies.add(o1);
        ontologiesName.add("go");
        jCheckBox_Ontologia1.setForeground(Color.blue);
        OntModel o2 = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM, null);
        o2.read("..//rexo.owl");
        ontologies.add(o2);
        ontologiesName.add("rexo");
        OntModel o3 = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM, null);
        o3.read("..//EDAM.owl");
        ontologies.add(o3);
        ontologiesName.add("edam");
        jCheckBox_Ontologia3.setForeground(Color.black);
        OntModel o4 = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM, null);
        o4.read("..//gexo.owl");
        ontologies.add(o4);
        ontologiesName.add("gexo");
        jCheckBox_Ontologia4.setForeground(Color.green);
        jButton_Search.setEnabled(true);

    }

    public void sceglifile(String resultToPDF) {
        String filename;
        JFileChooser savefile = new JFileChooser();
        int returnVal = savefile.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File pr = savefile.getSelectedFile();
            filename = pr.getName();
            String path = savefile.getCurrentDirectory().getAbsolutePath() + "//" + filename + ".html";
            try {
                scriviHTML(path, "<h1>" + clickedInfo.getLabel() + "</h1><br>" + resultToPDF);
            } catch (IOException ex) {
                Logger.getLogger(Menu1.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public static void scriviHTML(String path, String tesxtFromResult) throws IOException {

        Writer writer = null;

        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(path)));
            writer.write(tesxtFromResult);
        } catch (IOException ex) {
            // Report
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ontologia;
    private javax.swing.JButton ReadME;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campoCerca;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Cerca;
    private javax.swing.JButton jButton_Save_as;
    private static javax.swing.JButton jButton_Search;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    static javax.swing.JCheckBox jCheckBox_Ontologia1;
    static javax.swing.JCheckBox jCheckBox_Ontologia2;
    static javax.swing.JCheckBox jCheckBox_Ontologia3;
    static javax.swing.JCheckBox jCheckBox_Ontologia4;
    private static javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<Info> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
