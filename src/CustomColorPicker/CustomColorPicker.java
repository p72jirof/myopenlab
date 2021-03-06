/*
MyOpenLab by Carmelo Salafia www.myopenlab.de
Copyright (C) 2004  Carmelo Salafia cswi@gmx.de

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/


package CustomColorPicker;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import javax.swing.ButtonModel;
import javax.swing.JColorChooser;

/**
 *
 * @author  Salafia
 */
public class CustomColorPicker extends javax.swing.JDialog
{
    
    ColorPanel myPanel;
    
    /**
     * Creates new form CustomColorPicker
     */
    public CustomColorPicker(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        
        myPanel=new ColorPanel();
        
        Image img =new javax.swing.ImageIcon(getClass().getResource("/CustomColorPicker/gitter.gif")).getImage();     
        
        BufferedImage bImage = new BufferedImage(img.getWidth(null),img.getHeight(null), BufferedImage.TYPE_INT_RGB); 
        Graphics2D g2 = bImage.createGraphics(); 
        g2.drawImage(img,null,null); 
        
        
        myPanel.image=bImage;
        
        this.getContentPane().add(myPanel);
        
        jPanel3.setBackground(myPanel.color1);
        jPanel4.setBackground(myPanel.color2);
        
        myPanel.color1Transparency=jSlider1.getValue();                
        myPanel.color2Transparency=jSlider1.getValue();
        myPanel.updateUI();        
        
        jToggleButton1.setSelected(true);
        makeSelection();        
        
               
    }

    
    public void init()
    {
        myPanel.modus=modus;
        myPanel.p1=p1;
        myPanel.p2=p2;
        myPanel.color1=color1;
        myPanel.color2=color2;
        myPanel.color1Transparency=color1Transparency;
        myPanel.color2Transparency=color2Transparency;
        myPanel.wiederholung=wiederholung;    
        
        if (modus==ColorPanel.MODE_FLAT) jToggleButton1.setSelected(true);
        if (modus==ColorPanel.MODE_LINEAR) jToggleButton2.setSelected(true);
        if (modus==ColorPanel.MODE_RADIAL) jToggleButton3.setSelected(true);
            
        if (wiederholung) jCheckBox1.setSelected(true);
        jPanel3.setBackground(color1);
        jPanel4.setBackground(color2);
        
        jPanel3.updateUI();
        jPanel4.updateUI();
        
        jSlider1.setValue(color1Transparency);
        jSlider2.setValue(color2Transparency);
        makeSelection();        
    }
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
        jSlider2 = new javax.swing.JSlider();
        jPanel2 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(java.util.ResourceBundle.getBundle("CustomColorPicker/CustomColorPicker").getString("Advanced_Color_Picker"));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 100));
        jButton1.setText(java.util.ResourceBundle.getBundle("CustomColorPicker/CustomColorPicker").getString("Color1"));
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(java.util.ResourceBundle.getBundle("CustomColorPicker/CustomColorPicker").getString("Color2"));
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 26, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 23, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 26, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 23, Short.MAX_VALUE)
        );

        jSlider1.setMaximum(255);
        jSlider1.setValue(255);
        jSlider1.setBorder(javax.swing.BorderFactory.createTitledBorder(java.util.ResourceBundle.getBundle("CustomColorPicker/CustomColorPicker").getString("Color1_Transparenz")));
        jSlider1.addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {
            public void propertyChange(java.beans.PropertyChangeEvent evt)
            {
                jSlider1PropertyChange(evt);
            }
        });
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                jSlider1StateChanged(evt);
            }
        });

        jSlider2.setMaximum(255);
        jSlider2.setValue(255);
        jSlider2.setBorder(javax.swing.BorderFactory.createTitledBorder(java.util.ResourceBundle.getBundle("CustomColorPicker/CustomColorPicker").getString("Color2_Transparenz")));
        jSlider2.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                jSlider2StateChanged(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jButton2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .add(jButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jSlider1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .add(jSlider2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButton2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSlider1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSlider2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        getContentPane().add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel2.setPreferredSize(new java.awt.Dimension(0, 40));
        buttonGroup1.add(jToggleButton1);
        jToggleButton1.setText(java.util.ResourceBundle.getBundle("CustomColorPicker/CustomColorPicker").getString("Flat"));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jToggleButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jToggleButton2);
        jToggleButton2.setText(java.util.ResourceBundle.getBundle("CustomColorPicker/CustomColorPicker").getString("Linear"));
        jToggleButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jToggleButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jToggleButton3);
        jToggleButton3.setText(java.util.ResourceBundle.getBundle("CustomColorPicker/CustomColorPicker").getString("Radial"));
        jToggleButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jCheckBox1.setText(java.util.ResourceBundle.getBundle("CustomColorPicker/CustomColorPicker").getString("Repeat"));
        jCheckBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jCheckBox1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jToggleButton1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jToggleButton2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jToggleButton3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jCheckBox1)
                .addContainerGap(262, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jToggleButton2)
                    .add(jToggleButton3)
                    .add(jCheckBox1)
                    .add(jToggleButton1))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel5.setPreferredSize(new java.awt.Dimension(100, 40));
        jButton3.setText(java.util.ResourceBundle.getBundle("CustomColorPicker/CustomColorPicker").getString("OK"));
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText(java.util.ResourceBundle.getBundle("CustomColorPicker/CustomColorPicker").getString("Cancel"));
        jButton4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton4ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(384, Short.MAX_VALUE)
                .add(jButton3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton4)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton4)
                    .add(jButton3))
                .addContainerGap())
        );
        getContentPane().add(jPanel5, java.awt.BorderLayout.SOUTH);

        jPanel6.setPreferredSize(new java.awt.Dimension(10, 100));
        org.jdesktop.layout.GroupLayout jPanel6Layout = new org.jdesktop.layout.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 10, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 218, Short.MAX_VALUE)
        );
        getContentPane().add(jPanel6, java.awt.BorderLayout.EAST);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-524)/2, (screenSize.height-325)/2, 524, 325);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton4ActionPerformed
    {//GEN-HEADEREND:event_jButton4ActionPerformed
        result=false;
        
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
        result=true;
        
        
        color1=myPanel.color1;
        color2=myPanel.color2;
        
        color1Transparency=myPanel.color1Transparency;
        color2Transparency=myPanel.color2Transparency;
        
        modus=myPanel.modus;
        
        p1=myPanel.p1;
        p2=myPanel.p2;
        wiederholung=myPanel.wiederholung;
        
        dispose();
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBox1ActionPerformed
    {//GEN-HEADEREND:event_jCheckBox1ActionPerformed
        myPanel.wiederholung=jCheckBox1.isSelected();
        myPanel.updateUI();
    }//GEN-LAST:event_jCheckBox1ActionPerformed


    private void makeSelection()    
    {
        ButtonModel model=buttonGroup1.getSelection();
        if (jToggleButton1.isSelected())
        {            
          myPanel.modus=ColorPanel.MODE_FLAT;
          myPanel.updateUI();
          jCheckBox1.setVisible(false);
          
          jButton2.setEnabled(false);
          jSlider2.setEnabled(false);
        }
        if (jToggleButton2.isSelected())
        {
          myPanel.modus=ColorPanel.MODE_LINEAR;
          jCheckBox1.setVisible(true);
          myPanel.updateUI();

          jButton2.setEnabled(true);
          jSlider2.setEnabled(true);
          
        }
        if (jToggleButton3.isSelected())
        {
          myPanel.modus=ColorPanel.MODE_RADIAL;
          jCheckBox1.setVisible(false);
          myPanel.updateUI();

          jButton2.setEnabled(true);
          jSlider2.setEnabled(true);
        }
        
    }    
    
    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jToggleButton3ActionPerformed
    {//GEN-HEADEREND:event_jToggleButton3ActionPerformed
        makeSelection();
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jToggleButton2ActionPerformed
    {//GEN-HEADEREND:event_jToggleButton2ActionPerformed
        makeSelection();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jToggleButton1ActionPerformed
    {//GEN-HEADEREND:event_jToggleButton1ActionPerformed
        makeSelection();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_jSlider2StateChanged
    {//GEN-HEADEREND:event_jSlider2StateChanged
        myPanel.color2Transparency=jSlider2.getValue();
        myPanel.updateUI();
    }//GEN-LAST:event_jSlider2StateChanged

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_jSlider1StateChanged
    {//GEN-HEADEREND:event_jSlider1StateChanged
        myPanel.color1Transparency=jSlider1.getValue();
        myPanel.updateUI();
    }//GEN-LAST:event_jSlider1StateChanged

    private void jSlider1PropertyChange(java.beans.PropertyChangeEvent evt)//GEN-FIRST:event_jSlider1PropertyChange
    {//GEN-HEADEREND:event_jSlider1PropertyChange
        
    }//GEN-LAST:event_jSlider1PropertyChange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        Color c = JColorChooser.showDialog(this,"Color", myPanel.color2);
        if (c != null)
        {
            myPanel.color2=c;
            jPanel4.setBackground(c);
            myPanel.updateUI();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        Color c = JColorChooser.showDialog(this,"Color", myPanel.color1);
        if (c != null)
        {
            myPanel.color1=c;
            jPanel3.setBackground(c);
            myPanel.updateUI();
            
            // Panel darf nicht transparent sein
            //panel.setOpaque(true);
            //panel.setBackground(c);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    

    
    public static int modus=0;
    
    public static Point p1=new Point(100,100);
    public static Point p2=new Point(200,200);
    
    public static Color color1 = new Color(255,255,255);
    public static Color color2 = new Color(0,0,0);
    
    
    public static int color1Transparency=255;
    public static int color2Transparency=255;
    
    public static boolean wiederholung=false;
    
    
    
    public static boolean result=false;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    // End of variables declaration//GEN-END:variables
    
}
