/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PronosticoQuiniela.java
 *
 * Created on 15-nov-2010, 0:45:04
 */
package practica1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

import jcolibri.cbrcore.CBRQuery;

/**
 *
 * @author grupo 1
 */
@SuppressWarnings("serial")
public class InterfazA extends javax.swing.JFrame {
	
	
    private CBRQuery q;
	private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox13;
    private javax.swing.JComboBox jComboBox14;
    private javax.swing.JComboBox jComboBox15;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
	

    /** Creates new form PronosticoQuiniela */
    public InterfazA() {
        initComponents();
        q = null;
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
    }
    public CBRQuery getQuery(){
    	return q;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jComboBox9 = new javax.swing.JComboBox();
        jComboBox10 = new javax.swing.JComboBox();
        jComboBox11 = new javax.swing.JComboBox();
        jComboBox12 = new javax.swing.JComboBox();
        jComboBox13 = new javax.swing.JComboBox();
        jComboBox14 = new javax.swing.JComboBox();
        jComboBox15 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        
        
		Integer[] listaNumerosPuntosGoles = new Integer[100];
		listaNumerosPuntosGoles[0] = 0;
		listaNumerosPuntosGoles[1] = 1;
		listaNumerosPuntosGoles[2] = 2;
		listaNumerosPuntosGoles[3] = 3;
		listaNumerosPuntosGoles[4] = 4;
		listaNumerosPuntosGoles[5] = 5;
		listaNumerosPuntosGoles[6] = 6;
		listaNumerosPuntosGoles[7] = 7;
		listaNumerosPuntosGoles[8] = 8;
		listaNumerosPuntosGoles[9] = 9;
		listaNumerosPuntosGoles[10] = 10;
		listaNumerosPuntosGoles[11] = 11;
		listaNumerosPuntosGoles[12] = 12;
		listaNumerosPuntosGoles[13] = 13;
		listaNumerosPuntosGoles[14] = 14;
		listaNumerosPuntosGoles[15] = 15;
		listaNumerosPuntosGoles[16] = 16;
		listaNumerosPuntosGoles[17] = 17;
		listaNumerosPuntosGoles[18] = 18;
		listaNumerosPuntosGoles[19] = 19;
		listaNumerosPuntosGoles[20] = 20;
		listaNumerosPuntosGoles[21] = 21;
		listaNumerosPuntosGoles[22] = 22;
		listaNumerosPuntosGoles[23] = 23;
		listaNumerosPuntosGoles[24] = 24;
		listaNumerosPuntosGoles[25] = 25;
		listaNumerosPuntosGoles[26] = 26;
		listaNumerosPuntosGoles[27] = 27;
		listaNumerosPuntosGoles[28] = 28;
		listaNumerosPuntosGoles[29] = 29;
		listaNumerosPuntosGoles[30] = 30;
		listaNumerosPuntosGoles[31] = 31;
		listaNumerosPuntosGoles[32] = 32;
		listaNumerosPuntosGoles[33] = 33;
		listaNumerosPuntosGoles[34] = 34;
		listaNumerosPuntosGoles[35] = 35;
		listaNumerosPuntosGoles[36] = 36;
		listaNumerosPuntosGoles[37] = 37;
		listaNumerosPuntosGoles[38] = 38;
		listaNumerosPuntosGoles[39] = 39;
		listaNumerosPuntosGoles[40] = 40;
		listaNumerosPuntosGoles[41] = 41;
		listaNumerosPuntosGoles[42] = 42;
		listaNumerosPuntosGoles[43] = 43;
		listaNumerosPuntosGoles[44] = 44;
		listaNumerosPuntosGoles[45] = 45;
		listaNumerosPuntosGoles[46] = 46;
		listaNumerosPuntosGoles[47] = 47;
		listaNumerosPuntosGoles[48] = 48;
		listaNumerosPuntosGoles[49] = 49;
		listaNumerosPuntosGoles[50] = 50;
		listaNumerosPuntosGoles[51] = 51;
		listaNumerosPuntosGoles[52] = 52;
		listaNumerosPuntosGoles[53] = 53;
		listaNumerosPuntosGoles[54] = 54;
		listaNumerosPuntosGoles[55] = 55;
		listaNumerosPuntosGoles[56] = 56;
		listaNumerosPuntosGoles[57] = 57;
		listaNumerosPuntosGoles[58] = 58;
		listaNumerosPuntosGoles[59] = 59;
		listaNumerosPuntosGoles[60] = 60;
		listaNumerosPuntosGoles[61] = 61;
		listaNumerosPuntosGoles[62] = 62;
		listaNumerosPuntosGoles[63] = 63;
		listaNumerosPuntosGoles[64] = 64;
		listaNumerosPuntosGoles[65] = 65;
		listaNumerosPuntosGoles[66] = 66;
		listaNumerosPuntosGoles[67] = 67;
		listaNumerosPuntosGoles[68] = 68;
		listaNumerosPuntosGoles[69] = 69;
		listaNumerosPuntosGoles[70] = 70;
		listaNumerosPuntosGoles[71] = 71;
		listaNumerosPuntosGoles[72] = 72;
		listaNumerosPuntosGoles[73] = 73;
		listaNumerosPuntosGoles[74] = 74;
		listaNumerosPuntosGoles[75] = 75;
		listaNumerosPuntosGoles[76] = 76;
		listaNumerosPuntosGoles[77] = 77;
		listaNumerosPuntosGoles[78] = 78;
		listaNumerosPuntosGoles[79] = 79;
		listaNumerosPuntosGoles[80] = 80;
		listaNumerosPuntosGoles[81] = 81;
		listaNumerosPuntosGoles[82] = 82;
		listaNumerosPuntosGoles[83] = 83;
		listaNumerosPuntosGoles[84] = 84;
		listaNumerosPuntosGoles[85] = 85;
		listaNumerosPuntosGoles[86] = 86;
		listaNumerosPuntosGoles[87] = 87;
		listaNumerosPuntosGoles[88] = 88;
		listaNumerosPuntosGoles[89] = 89;
		listaNumerosPuntosGoles[90] = 90;
		listaNumerosPuntosGoles[91] = 91;
		listaNumerosPuntosGoles[92] = 92;
		listaNumerosPuntosGoles[93] = 93;
		listaNumerosPuntosGoles[94] = 94;
		listaNumerosPuntosGoles[95] = 95;
		listaNumerosPuntosGoles[96] = 96;
		listaNumerosPuntosGoles[97] = 97;
		listaNumerosPuntosGoles[98] = 98;
		listaNumerosPuntosGoles[99] = 99;
	
		
		Integer[] listaJornada = new Integer[44];
		listaJornada[0] = 1;
		listaJornada[1] = 2;
		listaJornada[2] = 3;
		listaJornada[3] = 4;
		listaJornada[4] = 5;
		listaJornada[5] = 6;
		listaJornada[6] = 7;
		listaJornada[7] = 8;
		listaJornada[8] = 9;
		listaJornada[9] = 10;
		listaJornada[10] = 11;
		listaJornada[11] = 12;
		listaJornada[12] = 13;
		listaJornada[13] = 14;
		listaJornada[14] = 15;
		listaJornada[15] = 16;
		listaJornada[16] = 17;
		listaJornada[17] = 18;
		listaJornada[18] = 19;
		listaJornada[19] = 20;
		listaJornada[20] = 21;
		listaJornada[21] = 22;
		listaJornada[22] = 23;
		listaJornada[23] = 24;
		listaJornada[24] = 25;
		listaJornada[25] = 26;
		listaJornada[26] = 27;
		listaJornada[27] = 28;
		listaJornada[28] = 29;
		listaJornada[29] = 30;
		listaJornada[30] = 31;
		listaJornada[31] = 32;
		listaJornada[32] = 33;
		listaJornada[33] = 34;
		listaJornada[34] = 35;
		listaJornada[35] = 36;
		listaJornada[36] = 37;
		listaJornada[37] = 38;
		listaJornada[38] = 39;
		listaJornada[39] = 40;
		listaJornada[40] = 41;
		listaJornada[41] = 42;
		listaJornada[42] = 43;
		listaJornada[43] = 44;
		
		String[] listaEquipos =new String[42];
		listaEquipos[0]="M�laga";
		listaEquipos[1]="Valladolid";
		listaEquipos[2]="Sevilla";
		listaEquipos[3]="Sporting";
		listaEquipos[4]="Tenerife";
		listaEquipos[5]="Getafe";
		listaEquipos[6]="Villarreal";
		listaEquipos[7]="At.Madrid";
		listaEquipos[8]="Xerez";
		listaEquipos[9]="Racing";
		listaEquipos[10]="Espanyol";
		listaEquipos[11]="Barcelona";
		listaEquipos[12]="Deportivo";
		listaEquipos[13]="Almer�a";
		listaEquipos[14]="R.Madrid";
		listaEquipos[15]="Valencia";
		listaEquipos[16]="Athletic";
		listaEquipos[17]="Zaragoza";
		listaEquipos[18]="Mallorca";
		listaEquipos[19]="Osasuna";
		listaEquipos[20]="Betis";
		listaEquipos[21]="Rayo";
		listaEquipos[22]="Celta";
		listaEquipos[23]="Salamanca";
		listaEquipos[24]="LasPalmas";
		listaEquipos[25]="H�rcules";
		listaEquipos[26]="Granada";
		listaEquipos[27]="Cartagena";
		listaEquipos[28]="Numancia";
		listaEquipos[29]="Elche";
		listaEquipos[30]="Girona";
		listaEquipos[31]="C�rdoba";
		listaEquipos[32]="Alcorc�n";
		listaEquipos[33]="VillarealB";
		listaEquipos[34]="Albacete";
		listaEquipos[35]="Huesca";
		listaEquipos[36]="Ponferradina";
		listaEquipos[37]="Huelva";
		listaEquipos[38]="Gimn�stic";
		listaEquipos[39]="Tenerife";
		listaEquipos[40]="Huelva";
		listaEquipos[41]="R.Sociedad";

 //       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		setTitle("PronosticoQuiniela");
        jLabel1.setText("Local");
        jLabel2.setText("Visitante");
        jLabel3.setText("Jornada  ");
        jLabel4.setText("Posicion  ");
        jLabel5.setText("Posicion  ");
        jLabel6.setText("Puntos    ");
        jLabel7.setText("Puntos   ");
        jLabel8.setText("Puntos   ");
        jLabel9.setText("Puntos   ");
        jLabel10.setText("Puntos   ");
        jLabel11.setText("Puntos   ");
        jLabel12.setText("Goles       ");
        jLabel13.setText("Goles      ");
        jLabel14.setText("Goles       ");
        jLabel15.setText("Goles       ");
      
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(listaJornada));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        
        jButton1.setText("OK");
        jLabel16.setText("Local");
        jLabel17.setText("Visitante");
        jLabel18.setText("Local");
        jLabel19.setText("Visitante");
        jLabel20.setText("Casa");
        jLabel21.setText("Local");
        jLabel22.setText("Fuera");
        jLabel23.setText("Local");
        jLabel24.setText("Casa");
        jLabel25.setText("Visitante");
        jLabel26.setText("Fuera");
        jLabel27.setText("Visitante");
        jLabel28.setText("Favor");
        jLabel29.setText("Local");
        jLabel30.setText("Contra");
        jLabel31.setText("Local");
        jLabel32.setText("Favor");
        jLabel33.setText("Visitante");
        jLabel34.setText("Contra");
        jLabel35.setText("Visitante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox3, 0, 0, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jComboBox4, 0, 38, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox6, 0, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox7, 0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel8)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox8, 0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel23)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22)
                            .addComponent(jComboBox9, 0, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel10)
                            .addComponent(jLabel25)
                            .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBox11, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(jComboBox12, 0, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox13, 0, 0, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel33)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel34)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox15, 0, 0, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(12, 12, 12)
                .addComponent(jLabel21)
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel29))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel31))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel32)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel33))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel35))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel22))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel23))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel27)))
                .addContainerGap())
        );

        pack();
    
		jButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
					q = new CBRQuery();
					q.setDescription(new QuinielaCaso());
					((QuinielaCaso)q.getDescription()).setNombreLocal((String)jComboBox1.getSelectedItem());
					((QuinielaCaso)q.getDescription()).setNombreVisitante((String)jComboBox2.getSelectedItem());
					((QuinielaCaso)q.getDescription()).setJornada((Integer)jComboBox3.getSelectedItem());
					((QuinielaCaso)q.getDescription()).setPosLocal((Integer)jComboBox4.getSelectedItem());
					((QuinielaCaso)q.getDescription()).setPosVis((Integer)jComboBox5.getSelectedItem());
					((QuinielaCaso)q.getDescription()).setPuntosLocal(((Integer)jComboBox6.getSelectedItem()).doubleValue());
					((QuinielaCaso)q.getDescription()).setPuntosVis(((Integer)jComboBox7.getSelectedItem()).doubleValue());
					((QuinielaCaso)q.getDescription()).setPuntosCasaLocal(((Integer)jComboBox8.getSelectedItem()).doubleValue());
					((QuinielaCaso)q.getDescription()).setPuntosFueraLocal(((Integer)jComboBox9.getSelectedItem()).doubleValue());
					((QuinielaCaso)q.getDescription()).setPuntosCasaVis(((Integer)jComboBox10.getSelectedItem()).doubleValue());
					((QuinielaCaso)q.getDescription()).setPuntosFueraVis(((Integer)jComboBox11.getSelectedItem()).doubleValue());
					((QuinielaCaso)q.getDescription()).setGolesFavorLocal(((Integer)jComboBox12.getSelectedItem()).doubleValue());
					((QuinielaCaso)q.getDescription()).setGolesContraLocal(((Integer)jComboBox13.getSelectedItem()).doubleValue());
					((QuinielaCaso)q.getDescription()).setGolesFavorVis(((Integer)jComboBox14.getSelectedItem()).doubleValue());
					((QuinielaCaso)q.getDescription()).setGolesContraVis(((Integer)jComboBox15.getSelectedItem()).doubleValue());
					//jornada = (Integer) jComboBox3.getSelectedItem();
					//frameQuiniela=new JFrame("Quiniela");
					//frameQuiniela.setSize(400, 200);
					//frameQuiniela.setContentPane(getPanelQuiniela());
					//frameQuiniela.setEnabled(true);
					//frameQuiniela.setVisible(true);
				} 
				catch (NumberFormatException e1) {
					e1.getMessage();
					JOptionPane.showMessageDialog(null, "Algo has liado!!");
				}
			}});
    }
    
    /**
    * @param args the command line arguments
    */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfazA c = new InterfazA();
		c.setEnabled(true);
		c.setVisible(true);
	}
	public void setQuery() {
		q = null;
		
	}



}
