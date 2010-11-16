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

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Danny
 */
public class InterfazB extends javax.swing.JFrame {
	
	
	private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox100;
    private javax.swing.JComboBox jComboBox101;
    private javax.swing.JComboBox jComboBox102;
    private javax.swing.JComboBox jComboBox103;
    private javax.swing.JComboBox jComboBox104;
    private javax.swing.JComboBox jComboBox105;
    private javax.swing.JComboBox jComboBox106;
    private javax.swing.JComboBox jComboBox107;
    private javax.swing.JComboBox jComboBox108;
    private javax.swing.JComboBox jComboBox109;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox110;
    private javax.swing.JComboBox jComboBox111;
    private javax.swing.JComboBox jComboBox112;
    private javax.swing.JComboBox jComboBox113;
    private javax.swing.JComboBox jComboBox114;
    private javax.swing.JComboBox jComboBox115;
    private javax.swing.JComboBox jComboBox116;
    private javax.swing.JComboBox jComboBox117;
    private javax.swing.JComboBox jComboBox118;
    private javax.swing.JComboBox jComboBox119;
    private javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox120;
    private javax.swing.JComboBox jComboBox121;
    private javax.swing.JComboBox jComboBox122;
    private javax.swing.JComboBox jComboBox123;
    private javax.swing.JComboBox jComboBox124;
    private javax.swing.JComboBox jComboBox125;
    private javax.swing.JComboBox jComboBox126;
    private javax.swing.JComboBox jComboBox127;
    private javax.swing.JComboBox jComboBox128;
    private javax.swing.JComboBox jComboBox129;
    private javax.swing.JComboBox jComboBox13;
    private javax.swing.JComboBox jComboBox130;
    private javax.swing.JComboBox jComboBox131;
    private javax.swing.JComboBox jComboBox132;
    private javax.swing.JComboBox jComboBox133;
    private javax.swing.JComboBox jComboBox134;
    private javax.swing.JComboBox jComboBox135;
    private javax.swing.JComboBox jComboBox136;
    private javax.swing.JComboBox jComboBox137;
    private javax.swing.JComboBox jComboBox138;
    private javax.swing.JComboBox jComboBox139;
    private javax.swing.JComboBox jComboBox14;
    private javax.swing.JComboBox jComboBox140;
    private javax.swing.JComboBox jComboBox141;
    private javax.swing.JComboBox jComboBox142;
    private javax.swing.JComboBox jComboBox143;
    private javax.swing.JComboBox jComboBox144;
    private javax.swing.JComboBox jComboBox145;
    private javax.swing.JComboBox jComboBox146;
    private javax.swing.JComboBox jComboBox147;
    private javax.swing.JComboBox jComboBox148;
    private javax.swing.JComboBox jComboBox149;
    private javax.swing.JComboBox jComboBox15;
    private javax.swing.JComboBox jComboBox150;
    private javax.swing.JComboBox jComboBox151;
    private javax.swing.JComboBox jComboBox152;
    private javax.swing.JComboBox jComboBox153;
    private javax.swing.JComboBox jComboBox154;
    private javax.swing.JComboBox jComboBox155;
    private javax.swing.JComboBox jComboBox156;
    private javax.swing.JComboBox jComboBox157;
    private javax.swing.JComboBox jComboBox158;
    private javax.swing.JComboBox jComboBox159;
    private javax.swing.JComboBox jComboBox16;
    private javax.swing.JComboBox jComboBox160;
    private javax.swing.JComboBox jComboBox161;
    private javax.swing.JComboBox jComboBox162;
    private javax.swing.JComboBox jComboBox163;
    private javax.swing.JComboBox jComboBox164;
    private javax.swing.JComboBox jComboBox165;
    private javax.swing.JComboBox jComboBox166;
    private javax.swing.JComboBox jComboBox167;
    private javax.swing.JComboBox jComboBox168;
    private javax.swing.JComboBox jComboBox169;
    private javax.swing.JComboBox jComboBox17;
    private javax.swing.JComboBox jComboBox170;
    private javax.swing.JComboBox jComboBox171;
    private javax.swing.JComboBox jComboBox172;
    private javax.swing.JComboBox jComboBox173;
    private javax.swing.JComboBox jComboBox174;
    private javax.swing.JComboBox jComboBox175;
    private javax.swing.JComboBox jComboBox176;
    private javax.swing.JComboBox jComboBox177;
    private javax.swing.JComboBox jComboBox178;
    private javax.swing.JComboBox jComboBox179;
    private javax.swing.JComboBox jComboBox18;
    private javax.swing.JComboBox jComboBox180;
    private javax.swing.JComboBox jComboBox181;
    private javax.swing.JComboBox jComboBox182;
    private javax.swing.JComboBox jComboBox183;
    private javax.swing.JComboBox jComboBox184;
    private javax.swing.JComboBox jComboBox185;
    private javax.swing.JComboBox jComboBox186;
    private javax.swing.JComboBox jComboBox187;
    private javax.swing.JComboBox jComboBox188;
    private javax.swing.JComboBox jComboBox189;
    private javax.swing.JComboBox jComboBox19;
    private javax.swing.JComboBox jComboBox190;
    private javax.swing.JComboBox jComboBox191;
    private javax.swing.JComboBox jComboBox192;
    private javax.swing.JComboBox jComboBox193;
    private javax.swing.JComboBox jComboBox194;
    private javax.swing.JComboBox jComboBox195;
    private javax.swing.JComboBox jComboBox196;
    private javax.swing.JComboBox jComboBox197;
    private javax.swing.JComboBox jComboBox198;
    private javax.swing.JComboBox jComboBox199;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox20;
    private javax.swing.JComboBox jComboBox200;
    private javax.swing.JComboBox jComboBox201;
    private javax.swing.JComboBox jComboBox202;
    private javax.swing.JComboBox jComboBox203;
    private javax.swing.JComboBox jComboBox204;
    private javax.swing.JComboBox jComboBox205;
    private javax.swing.JComboBox jComboBox206;
    private javax.swing.JComboBox jComboBox207;
    private javax.swing.JComboBox jComboBox208;
    private javax.swing.JComboBox jComboBox209;
    private javax.swing.JComboBox jComboBox21;
    private javax.swing.JComboBox jComboBox210;
    private javax.swing.JComboBox jComboBox211;
    private javax.swing.JComboBox jComboBox212;
    private javax.swing.JComboBox jComboBox213;
    private javax.swing.JComboBox jComboBox214;
    private javax.swing.JComboBox jComboBox215;
    private javax.swing.JComboBox jComboBox216;
    private javax.swing.JComboBox jComboBox217;
    private javax.swing.JComboBox jComboBox218;
    private javax.swing.JComboBox jComboBox219;
    private javax.swing.JComboBox jComboBox22;
    private javax.swing.JComboBox jComboBox220;
    private javax.swing.JComboBox jComboBox221;
    private javax.swing.JComboBox jComboBox222;
    private javax.swing.JComboBox jComboBox223;
    private javax.swing.JComboBox jComboBox224;
    private javax.swing.JComboBox jComboBox225;
    private javax.swing.JComboBox jComboBox23;
    private javax.swing.JComboBox jComboBox24;
    private javax.swing.JComboBox jComboBox25;
    private javax.swing.JComboBox jComboBox26;
    private javax.swing.JComboBox jComboBox27;
    private javax.swing.JComboBox jComboBox28;
    private javax.swing.JComboBox jComboBox29;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox30;
    private javax.swing.JComboBox jComboBox31;
    private javax.swing.JComboBox jComboBox32;
    private javax.swing.JComboBox jComboBox33;
    private javax.swing.JComboBox jComboBox34;
    private javax.swing.JComboBox jComboBox35;
    private javax.swing.JComboBox jComboBox36;
    private javax.swing.JComboBox jComboBox37;
    private javax.swing.JComboBox jComboBox38;
    private javax.swing.JComboBox jComboBox39;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox40;
    private javax.swing.JComboBox jComboBox41;
    private javax.swing.JComboBox jComboBox42;
    private javax.swing.JComboBox jComboBox43;
    private javax.swing.JComboBox jComboBox44;
    private javax.swing.JComboBox jComboBox45;
    private javax.swing.JComboBox jComboBox46;
    private javax.swing.JComboBox jComboBox47;
    private javax.swing.JComboBox jComboBox48;
    private javax.swing.JComboBox jComboBox49;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox50;
    private javax.swing.JComboBox jComboBox51;
    private javax.swing.JComboBox jComboBox52;
    private javax.swing.JComboBox jComboBox53;
    private javax.swing.JComboBox jComboBox54;
    private javax.swing.JComboBox jComboBox55;
    private javax.swing.JComboBox jComboBox56;
    private javax.swing.JComboBox jComboBox57;
    private javax.swing.JComboBox jComboBox58;
    private javax.swing.JComboBox jComboBox59;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox60;
    private javax.swing.JComboBox jComboBox61;
    private javax.swing.JComboBox jComboBox62;
    private javax.swing.JComboBox jComboBox63;
    private javax.swing.JComboBox jComboBox64;
    private javax.swing.JComboBox jComboBox65;
    private javax.swing.JComboBox jComboBox66;
    private javax.swing.JComboBox jComboBox67;
    private javax.swing.JComboBox jComboBox68;
    private javax.swing.JComboBox jComboBox69;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox70;
    private javax.swing.JComboBox jComboBox71;
    private javax.swing.JComboBox jComboBox72;
    private javax.swing.JComboBox jComboBox73;
    private javax.swing.JComboBox jComboBox74;
    private javax.swing.JComboBox jComboBox75;
    private javax.swing.JComboBox jComboBox76;
    private javax.swing.JComboBox jComboBox77;
    private javax.swing.JComboBox jComboBox78;
    private javax.swing.JComboBox jComboBox79;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox80;
    private javax.swing.JComboBox jComboBox81;
    private javax.swing.JComboBox jComboBox82;
    private javax.swing.JComboBox jComboBox83;
    private javax.swing.JComboBox jComboBox84;
    private javax.swing.JComboBox jComboBox85;
    private javax.swing.JComboBox jComboBox86;
    private javax.swing.JComboBox jComboBox87;
    private javax.swing.JComboBox jComboBox88;
    private javax.swing.JComboBox jComboBox89;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JComboBox jComboBox90;
    private javax.swing.JComboBox jComboBox91;
    private javax.swing.JComboBox jComboBox92;
    private javax.swing.JComboBox jComboBox93;
    private javax.swing.JComboBox jComboBox94;
    private javax.swing.JComboBox jComboBox95;
    private javax.swing.JComboBox jComboBox96;
    private javax.swing.JComboBox jComboBox97;
    private javax.swing.JComboBox jComboBox98;
    private javax.swing.JComboBox jComboBox99;
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
    public InterfazB() {
        initComponents();
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
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
        jComboBox16 = new javax.swing.JComboBox();
        jComboBox17 = new javax.swing.JComboBox();
        jComboBox18 = new javax.swing.JComboBox();
        jComboBox19 = new javax.swing.JComboBox();
        jComboBox20 = new javax.swing.JComboBox();
        jComboBox21 = new javax.swing.JComboBox();
        jComboBox22 = new javax.swing.JComboBox();
        jComboBox23 = new javax.swing.JComboBox();
        jComboBox24 = new javax.swing.JComboBox();
        jComboBox25 = new javax.swing.JComboBox();
        jComboBox26 = new javax.swing.JComboBox();
        jComboBox27 = new javax.swing.JComboBox();
        jComboBox28 = new javax.swing.JComboBox();
        jComboBox29 = new javax.swing.JComboBox();
        jComboBox30 = new javax.swing.JComboBox();
        jComboBox31 = new javax.swing.JComboBox();
        jComboBox32 = new javax.swing.JComboBox();
        jComboBox33 = new javax.swing.JComboBox();
        jComboBox34 = new javax.swing.JComboBox();
        jComboBox35 = new javax.swing.JComboBox();
        jComboBox36 = new javax.swing.JComboBox();
        jComboBox37 = new javax.swing.JComboBox();
        jComboBox38 = new javax.swing.JComboBox();
        jComboBox39 = new javax.swing.JComboBox();
        jComboBox40 = new javax.swing.JComboBox();
        jComboBox41 = new javax.swing.JComboBox();
        jComboBox42 = new javax.swing.JComboBox();
        jComboBox43 = new javax.swing.JComboBox();
        jComboBox44 = new javax.swing.JComboBox();
        jComboBox45 = new javax.swing.JComboBox();
        jComboBox46 = new javax.swing.JComboBox();
        jComboBox47 = new javax.swing.JComboBox();
        jComboBox48 = new javax.swing.JComboBox();
        jComboBox49 = new javax.swing.JComboBox();
        jComboBox50 = new javax.swing.JComboBox();
        jComboBox51 = new javax.swing.JComboBox();
        jComboBox52 = new javax.swing.JComboBox();
        jComboBox53 = new javax.swing.JComboBox();
        jComboBox54 = new javax.swing.JComboBox();
        jComboBox55 = new javax.swing.JComboBox();
        jComboBox56 = new javax.swing.JComboBox();
        jComboBox57 = new javax.swing.JComboBox();
        jComboBox58 = new javax.swing.JComboBox();
        jComboBox59 = new javax.swing.JComboBox();
        jComboBox60 = new javax.swing.JComboBox();
        jComboBox61 = new javax.swing.JComboBox();
        jComboBox62 = new javax.swing.JComboBox();
        jComboBox63 = new javax.swing.JComboBox();
        jComboBox64 = new javax.swing.JComboBox();
        jComboBox65 = new javax.swing.JComboBox();
        jComboBox66 = new javax.swing.JComboBox();
        jComboBox67 = new javax.swing.JComboBox();
        jComboBox68 = new javax.swing.JComboBox();
        jComboBox69 = new javax.swing.JComboBox();
        jComboBox70 = new javax.swing.JComboBox();
        jComboBox71 = new javax.swing.JComboBox();
        jComboBox72 = new javax.swing.JComboBox();
        jComboBox73 = new javax.swing.JComboBox();
        jComboBox74 = new javax.swing.JComboBox();
        jComboBox75 = new javax.swing.JComboBox();
        jComboBox76 = new javax.swing.JComboBox();
        jComboBox77 = new javax.swing.JComboBox();
        jComboBox78 = new javax.swing.JComboBox();
        jComboBox79 = new javax.swing.JComboBox();
        jComboBox80 = new javax.swing.JComboBox();
        jComboBox81 = new javax.swing.JComboBox();
        jComboBox82 = new javax.swing.JComboBox();
        jComboBox83 = new javax.swing.JComboBox();
        jComboBox84 = new javax.swing.JComboBox();
        jComboBox85 = new javax.swing.JComboBox();
        jComboBox86 = new javax.swing.JComboBox();
        jComboBox87 = new javax.swing.JComboBox();
        jComboBox88 = new javax.swing.JComboBox();
        jComboBox89 = new javax.swing.JComboBox();
        jComboBox90 = new javax.swing.JComboBox();
        jComboBox91 = new javax.swing.JComboBox();
        jComboBox92 = new javax.swing.JComboBox();
        jComboBox93 = new javax.swing.JComboBox();
        jComboBox94 = new javax.swing.JComboBox();
        jComboBox95 = new javax.swing.JComboBox();
        jComboBox96 = new javax.swing.JComboBox();
        jComboBox97 = new javax.swing.JComboBox();
        jComboBox98 = new javax.swing.JComboBox();
        jComboBox99 = new javax.swing.JComboBox();
        jComboBox100 = new javax.swing.JComboBox();
        jComboBox101 = new javax.swing.JComboBox();
        jComboBox102 = new javax.swing.JComboBox();
        jComboBox103 = new javax.swing.JComboBox();
        jComboBox104 = new javax.swing.JComboBox();
        jComboBox105 = new javax.swing.JComboBox();
        jComboBox106 = new javax.swing.JComboBox();
        jComboBox107 = new javax.swing.JComboBox();
        jComboBox108 = new javax.swing.JComboBox();
        jComboBox109 = new javax.swing.JComboBox();
        jComboBox110 = new javax.swing.JComboBox();
        jComboBox111 = new javax.swing.JComboBox();
        jComboBox112 = new javax.swing.JComboBox();
        jComboBox113 = new javax.swing.JComboBox();
        jComboBox114 = new javax.swing.JComboBox();
        jComboBox115 = new javax.swing.JComboBox();
        jComboBox116 = new javax.swing.JComboBox();
        jComboBox117 = new javax.swing.JComboBox();
        jComboBox118 = new javax.swing.JComboBox();
        jComboBox119 = new javax.swing.JComboBox();
        jComboBox120 = new javax.swing.JComboBox();
        jComboBox121 = new javax.swing.JComboBox();
        jComboBox122 = new javax.swing.JComboBox();
        jComboBox123 = new javax.swing.JComboBox();
        jComboBox124 = new javax.swing.JComboBox();
        jComboBox125 = new javax.swing.JComboBox();
        jComboBox126 = new javax.swing.JComboBox();
        jComboBox127 = new javax.swing.JComboBox();
        jComboBox128 = new javax.swing.JComboBox();
        jComboBox129 = new javax.swing.JComboBox();
        jComboBox130 = new javax.swing.JComboBox();
        jComboBox131 = new javax.swing.JComboBox();
        jComboBox132 = new javax.swing.JComboBox();
        jComboBox133 = new javax.swing.JComboBox();
        jComboBox134 = new javax.swing.JComboBox();
        jComboBox135 = new javax.swing.JComboBox();
        jComboBox136 = new javax.swing.JComboBox();
        jComboBox137 = new javax.swing.JComboBox();
        jComboBox138 = new javax.swing.JComboBox();
        jComboBox139 = new javax.swing.JComboBox();
        jComboBox140 = new javax.swing.JComboBox();
        jComboBox141 = new javax.swing.JComboBox();
        jComboBox142 = new javax.swing.JComboBox();
        jComboBox143 = new javax.swing.JComboBox();
        jComboBox144 = new javax.swing.JComboBox();
        jComboBox145 = new javax.swing.JComboBox();
        jComboBox146 = new javax.swing.JComboBox();
        jComboBox147 = new javax.swing.JComboBox();
        jComboBox148 = new javax.swing.JComboBox();
        jComboBox149 = new javax.swing.JComboBox();
        jComboBox150 = new javax.swing.JComboBox();
        jComboBox151 = new javax.swing.JComboBox();
        jComboBox152 = new javax.swing.JComboBox();
        jComboBox153 = new javax.swing.JComboBox();
        jComboBox154 = new javax.swing.JComboBox();
        jComboBox155 = new javax.swing.JComboBox();
        jComboBox156 = new javax.swing.JComboBox();
        jComboBox157 = new javax.swing.JComboBox();
        jComboBox158 = new javax.swing.JComboBox();
        jComboBox159 = new javax.swing.JComboBox();
        jComboBox160 = new javax.swing.JComboBox();
        jComboBox161 = new javax.swing.JComboBox();
        jComboBox162 = new javax.swing.JComboBox();
        jComboBox163 = new javax.swing.JComboBox();
        jComboBox164 = new javax.swing.JComboBox();
        jComboBox165 = new javax.swing.JComboBox();
        jComboBox166 = new javax.swing.JComboBox();
        jComboBox167 = new javax.swing.JComboBox();
        jComboBox168 = new javax.swing.JComboBox();
        jComboBox169 = new javax.swing.JComboBox();
        jComboBox170 = new javax.swing.JComboBox();
        jComboBox171 = new javax.swing.JComboBox();
        jComboBox172 = new javax.swing.JComboBox();
        jComboBox173 = new javax.swing.JComboBox();
        jComboBox174 = new javax.swing.JComboBox();
        jComboBox175 = new javax.swing.JComboBox();
        jComboBox176 = new javax.swing.JComboBox();
        jComboBox177 = new javax.swing.JComboBox();
        jComboBox178 = new javax.swing.JComboBox();
        jComboBox179 = new javax.swing.JComboBox();
        jComboBox180 = new javax.swing.JComboBox();
        jComboBox181 = new javax.swing.JComboBox();
        jComboBox182 = new javax.swing.JComboBox();
        jComboBox183 = new javax.swing.JComboBox();
        jComboBox184 = new javax.swing.JComboBox();
        jComboBox185 = new javax.swing.JComboBox();
        jComboBox186 = new javax.swing.JComboBox();
        jComboBox187 = new javax.swing.JComboBox();
        jComboBox188 = new javax.swing.JComboBox();
        jComboBox189 = new javax.swing.JComboBox();
        jComboBox190 = new javax.swing.JComboBox();
        jComboBox191 = new javax.swing.JComboBox();
        jComboBox192 = new javax.swing.JComboBox();
        jComboBox193 = new javax.swing.JComboBox();
        jComboBox194 = new javax.swing.JComboBox();
        jComboBox195 = new javax.swing.JComboBox();
        jComboBox196 = new javax.swing.JComboBox();
        jComboBox197 = new javax.swing.JComboBox();
        jComboBox198 = new javax.swing.JComboBox();
        jComboBox199 = new javax.swing.JComboBox();
        jComboBox200 = new javax.swing.JComboBox();
        jComboBox201 = new javax.swing.JComboBox();
        jComboBox202 = new javax.swing.JComboBox();
        jComboBox203 = new javax.swing.JComboBox();
        jComboBox204 = new javax.swing.JComboBox();
        jComboBox205 = new javax.swing.JComboBox();
        jComboBox206 = new javax.swing.JComboBox();
        jComboBox207 = new javax.swing.JComboBox();
        jComboBox208 = new javax.swing.JComboBox();
        jComboBox209 = new javax.swing.JComboBox();
        jComboBox210 = new javax.swing.JComboBox();
        jComboBox211 = new javax.swing.JComboBox();
        jComboBox212 = new javax.swing.JComboBox();
        jComboBox213 = new javax.swing.JComboBox();
        jComboBox214 = new javax.swing.JComboBox();
        jComboBox215 = new javax.swing.JComboBox();
        jComboBox216 = new javax.swing.JComboBox();
        jComboBox217 = new javax.swing.JComboBox();
        jComboBox218 = new javax.swing.JComboBox();
        jComboBox219 = new javax.swing.JComboBox();
        jComboBox220 = new javax.swing.JComboBox();
        jComboBox221 = new javax.swing.JComboBox();
        jComboBox222 = new javax.swing.JComboBox();
        jComboBox223 = new javax.swing.JComboBox();
        jComboBox224 = new javax.swing.JComboBox();
        jComboBox225 = new javax.swing.JComboBox();
        
        
		Integer[] listaNumerosPuntosGoles = new Integer[100];
		listaNumerosPuntosGoles[0] = 1;
		listaNumerosPuntosGoles[1] = 2;
		listaNumerosPuntosGoles[2] = 3;
		listaNumerosPuntosGoles[3] = 4;
		listaNumerosPuntosGoles[4] = 5;
		listaNumerosPuntosGoles[5] = 6;
		listaNumerosPuntosGoles[6] = 7;
		listaNumerosPuntosGoles[7] = 8;
		listaNumerosPuntosGoles[8] = 9;
		listaNumerosPuntosGoles[9] = 10;
		listaNumerosPuntosGoles[10] = 11;
		listaNumerosPuntosGoles[11] = 12;
		listaNumerosPuntosGoles[12] = 13;
		listaNumerosPuntosGoles[13] = 14;
		listaNumerosPuntosGoles[14] = 15;
		listaNumerosPuntosGoles[15] = 16;
		listaNumerosPuntosGoles[16] = 17;
		listaNumerosPuntosGoles[17] = 18;
		listaNumerosPuntosGoles[18] = 19;
		listaNumerosPuntosGoles[19] = 20;
		listaNumerosPuntosGoles[20] = 21;
		listaNumerosPuntosGoles[21] = 22;
		listaNumerosPuntosGoles[22] = 23;
		listaNumerosPuntosGoles[23] = 24;
		listaNumerosPuntosGoles[24] = 25;
		listaNumerosPuntosGoles[25] = 26;
		listaNumerosPuntosGoles[26] = 27;
		listaNumerosPuntosGoles[27] = 28;
		listaNumerosPuntosGoles[28] = 29;
		listaNumerosPuntosGoles[29] = 30;
		listaNumerosPuntosGoles[30] = 31;
		listaNumerosPuntosGoles[31] = 32;
		listaNumerosPuntosGoles[32] = 33;
		listaNumerosPuntosGoles[33] = 34;
		listaNumerosPuntosGoles[34] = 35;
		listaNumerosPuntosGoles[35] = 36;
		listaNumerosPuntosGoles[36] = 37;
		listaNumerosPuntosGoles[37] = 38;
		listaNumerosPuntosGoles[38] = 39;
		listaNumerosPuntosGoles[39] = 40;
		listaNumerosPuntosGoles[40] = 41;
		listaNumerosPuntosGoles[41] = 42;
		listaNumerosPuntosGoles[42] = 43;
		listaNumerosPuntosGoles[43] = 44;
		listaNumerosPuntosGoles[44] = 45;
		listaNumerosPuntosGoles[45] = 46;
		listaNumerosPuntosGoles[46] = 47;
		listaNumerosPuntosGoles[47] = 48;
		listaNumerosPuntosGoles[48] = 49;
		listaNumerosPuntosGoles[49] = 50;
		listaNumerosPuntosGoles[50] = 51;
		listaNumerosPuntosGoles[51] = 52;
		listaNumerosPuntosGoles[52] = 53;
		listaNumerosPuntosGoles[53] = 54;
		listaNumerosPuntosGoles[54] = 55;
		listaNumerosPuntosGoles[55] = 56;
		listaNumerosPuntosGoles[56] = 57;
		listaNumerosPuntosGoles[57] = 58;
		listaNumerosPuntosGoles[58] = 59;
		listaNumerosPuntosGoles[59] = 60;
		listaNumerosPuntosGoles[60] = 61;
		listaNumerosPuntosGoles[61] = 62;
		listaNumerosPuntosGoles[62] = 63;
		listaNumerosPuntosGoles[63] = 64;
		listaNumerosPuntosGoles[64] = 65;
		listaNumerosPuntosGoles[65] = 66;
		listaNumerosPuntosGoles[66] = 67;
		listaNumerosPuntosGoles[67] = 68;
		listaNumerosPuntosGoles[68] = 69;
		listaNumerosPuntosGoles[69] = 70;
		listaNumerosPuntosGoles[70] = 71;
		listaNumerosPuntosGoles[71] = 72;
		listaNumerosPuntosGoles[72] = 73;
		listaNumerosPuntosGoles[73] = 74;
		listaNumerosPuntosGoles[74] = 75;
		listaNumerosPuntosGoles[75] = 76;
		listaNumerosPuntosGoles[76] = 77;
		listaNumerosPuntosGoles[77] = 78;
		listaNumerosPuntosGoles[78] = 79;
		listaNumerosPuntosGoles[79] = 80;
		listaNumerosPuntosGoles[80] = 81;
		listaNumerosPuntosGoles[81] = 82;
		listaNumerosPuntosGoles[82] = 83;
		listaNumerosPuntosGoles[83] = 84;
		listaNumerosPuntosGoles[84] = 85;
		listaNumerosPuntosGoles[85] = 86;
		listaNumerosPuntosGoles[86] = 87;
		listaNumerosPuntosGoles[87] = 88;
		listaNumerosPuntosGoles[88] = 89;
		listaNumerosPuntosGoles[89] = 90;
		listaNumerosPuntosGoles[90] = 91;
		listaNumerosPuntosGoles[91] = 92;
		listaNumerosPuntosGoles[92] = 93;
		listaNumerosPuntosGoles[93] = 94;
		listaNumerosPuntosGoles[94] = 95;
		listaNumerosPuntosGoles[95] = 96;
		listaNumerosPuntosGoles[96] = 97;
		listaNumerosPuntosGoles[97] = 98;
		listaNumerosPuntosGoles[98] = 99;
		listaNumerosPuntosGoles[99] = 100;

		
		
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
		listaEquipos[0]="Málaga";
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
		listaEquipos[13]="Almería";
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
		listaEquipos[25]="Hércules";
		listaEquipos[26]="Granada";
		listaEquipos[27]="Cartagena";
		listaEquipos[28]="Numancia";
		listaEquipos[29]="Elche";
		listaEquipos[30]="Girona";
		listaEquipos[31]="Córdoba";
		listaEquipos[32]="Alcorcón";
		listaEquipos[33]="VillarealB";
		listaEquipos[34]="Albacete";
		listaEquipos[35]="Huesca";
		listaEquipos[36]="Ponferradina";
		listaEquipos[37]="Huelva";
		listaEquipos[38]="Gimnástic";
		listaEquipos[39]="Tenerife";
		listaEquipos[40]="Huelva";
		listaEquipos[41]="R.Sociedad";

 //       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		setTitle("PronosticoQuiniela");

        jLabel1.setText("Local");

        jLabel2.setText("Visitante");

        jLabel3.setText("Jornada");

        jLabel4.setText("Posicion");

        jLabel5.setText("Posicion");

        jLabel6.setText("Puntos ");

        jLabel7.setText("Puntos");

        jLabel8.setText("Puntos");

        jLabel9.setText("Puntos");

        jLabel10.setText("Puntos");

        jLabel11.setText("Puntos");

        jLabel12.setText("Goles");

        jLabel13.setText("Goles");

        jLabel14.setText("Goles");

        jLabel15.setText("Goles");

      
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
        
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));

        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));

        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));

        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));

        jComboBox20.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));

        jComboBox21.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));

        jComboBox22.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));

        jComboBox23.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));

        jComboBox24.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));

        jComboBox25.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));

        jComboBox26.setModel(new javax.swing.DefaultComboBoxModel(listaJornada));

        jComboBox27.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));

        jComboBox28.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));

        jComboBox29.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));

        jComboBox30.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));   

        jComboBox31.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox32.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox33.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox34.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox35.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox36.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox37.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox38.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox39.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox40.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox41.setModel(new javax.swing.DefaultComboBoxModel(listaJornada));
        jComboBox42.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox43.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox44.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox45.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        
        jComboBox46.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox47.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox48.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox49.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox50.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox51.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox52.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox53.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox54.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox55.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox56.setModel(new javax.swing.DefaultComboBoxModel(listaJornada));
        jComboBox57.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox58.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox59.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox60.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        
        jComboBox61.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox62.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox63.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox64.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox65.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox66.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox67.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox68.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox69.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox70.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox71.setModel(new javax.swing.DefaultComboBoxModel(listaJornada));
        jComboBox72.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox73.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox74.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox75.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        
        jComboBox76.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox77.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox78.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox79.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox80.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox81.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox82.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox83.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox84.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox85.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox86.setModel(new javax.swing.DefaultComboBoxModel(listaJornada));
        jComboBox87.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox88.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox89.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox90.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        
        jComboBox91.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox92.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox93.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox94.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox95.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox96.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox97.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox98.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox99.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox100.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox101.setModel(new javax.swing.DefaultComboBoxModel(listaJornada));
        jComboBox102.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox103.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox104.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox105.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        
        jComboBox106.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox107.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox108.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox109.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox110.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox111.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox112.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox113.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox114.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox115.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox116.setModel(new javax.swing.DefaultComboBoxModel(listaJornada));
        jComboBox117.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox118.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox119.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox120.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        
        jComboBox121.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox122.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox123.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox124.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox125.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox126.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox127.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox128.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox129.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox130.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox131.setModel(new javax.swing.DefaultComboBoxModel(listaJornada));
        jComboBox132.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox133.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox134.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox135.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        
        jComboBox136.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox137.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox138.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox139.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox140.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox141.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox142.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox143.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox144.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox145.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox146.setModel(new javax.swing.DefaultComboBoxModel(listaJornada));
        jComboBox147.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox148.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox149.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox150.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        
        jComboBox151.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox152.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox153.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox154.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox155.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox156.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox157.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox158.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox159.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox160.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox161.setModel(new javax.swing.DefaultComboBoxModel(listaJornada));
        jComboBox162.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox163.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox164.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox165.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        
        jComboBox166.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox167.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox168.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox169.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox170.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox171.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox172.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox173.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox174.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox175.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox176.setModel(new javax.swing.DefaultComboBoxModel(listaJornada));
        jComboBox177.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox178.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox179.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox180.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        
        jComboBox181.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox182.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox183.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox184.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox185.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox186.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox187.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox188.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox189.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox190.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox191.setModel(new javax.swing.DefaultComboBoxModel(listaJornada));
        jComboBox192.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox193.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox194.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox195.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        
        jComboBox196.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox197.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox198.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox199.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox200.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox201.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox202.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox203.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox204.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox205.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox206.setModel(new javax.swing.DefaultComboBoxModel(listaJornada));
        jComboBox207.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox208.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox209.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox210.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        
        jComboBox211.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox212.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox213.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox214.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox215.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox216.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox217.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox218.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox219.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox220.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox221.setModel(new javax.swing.DefaultComboBoxModel(listaJornada));
        jComboBox222.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox223.setModel(new javax.swing.DefaultComboBoxModel(listaEquipos));
        jComboBox224.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
        jComboBox225.setModel(new javax.swing.DefaultComboBoxModel(listaNumerosPuntosGoles));
     
        
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox3, 0, 0, Short.MAX_VALUE)
                                .addGap(21, 21, 21))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16)
                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox30, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox45, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox60, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox75, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox90, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox105, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox120, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox134, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox149, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    //.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(jComboBox164, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox179, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox194, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox209, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox224, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBox135, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox150, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox165, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox180, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox195, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox210, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox225, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox119, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox104, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox89, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox74, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox59, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel6))
                                        .addGap(7, 7, 7))
                                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel19))
                                        .addGap(16, 16, 16))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel21)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel8))
                                    .addComponent(jComboBox8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel22))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel25)
                                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel27))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel28)
                                            .addComponent(jLabel29)
                                            .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18))
                                    .addComponent(jComboBox11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel30)
                                            .addComponent(jLabel31))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel32)
                                            .addComponent(jLabel33)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel15)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox122, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox137, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox152, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox167, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox182, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox197, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox212, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox106, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox91, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox76, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(495, 495, 495))))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jComboBox132, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox133, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox131, 0, 46, Short.MAX_VALUE)
                .addGap(161, 161, 161)
                .addComponent(jComboBox121, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox123, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox124, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox125, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jComboBox127, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addComponent(jComboBox126, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jComboBox128, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox129, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jComboBox130, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jComboBox147, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox148, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox146, 0, 46, Short.MAX_VALUE)
                .addGap(161, 161, 161)
                .addComponent(jComboBox136, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox138, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox139, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox140, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jComboBox142, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addComponent(jComboBox141, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jComboBox143, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox144, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jComboBox145, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jComboBox162, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox163, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox161, 0, 46, Short.MAX_VALUE)
                .addGap(161, 161, 161)
                .addComponent(jComboBox151, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox153, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox154, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox155, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jComboBox157, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addComponent(jComboBox156, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jComboBox158, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox159, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jComboBox160, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jComboBox177, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox178, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox176, 0, 46, Short.MAX_VALUE)
                .addGap(161, 161, 161)
                .addComponent(jComboBox166, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox168, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox169, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox170, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jComboBox172, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addComponent(jComboBox171, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jComboBox173, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox174, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jComboBox175, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jComboBox192, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox193, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox191, 0, 46, Short.MAX_VALUE)
                .addGap(161, 161, 161)
                .addComponent(jComboBox181, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox183, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox184, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox185, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jComboBox187, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addComponent(jComboBox186, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jComboBox188, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox189, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jComboBox190, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jComboBox207, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox208, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox206, 0, 46, Short.MAX_VALUE)
                .addGap(161, 161, 161)
                .addComponent(jComboBox196, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox198, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox199, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox200, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jComboBox202, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addComponent(jComboBox201, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jComboBox203, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox204, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jComboBox205, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jComboBox222, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox223, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox221, 0, 46, Short.MAX_VALUE)
                .addGap(161, 161, 161)
                .addComponent(jComboBox211, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox213, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox214, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox215, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jComboBox217, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addComponent(jComboBox216, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jComboBox218, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox219, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jComboBox220, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jComboBox42, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox43, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox41, 0, 46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jComboBox57, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox58, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox56, 0, 46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jComboBox72, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox73, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox71, 0, 46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jComboBox87, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox88, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox86, 0, 46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jComboBox102, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox103, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox101, 0, 46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jComboBox117, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox118, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox116, 0, 46, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox27, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox28, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox26, 0, 46, Short.MAX_VALUE)))
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jComboBox22, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addComponent(jComboBox21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jComboBox23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox24, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jComboBox25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBox107, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox108, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox109, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox110, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jComboBox112, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addComponent(jComboBox111, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jComboBox113, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox114, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jComboBox115, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBox92, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox93, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox94, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox95, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jComboBox97, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addComponent(jComboBox96, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jComboBox98, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox99, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jComboBox100, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBox77, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox78, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox79, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox80, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jComboBox82, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addComponent(jComboBox81, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jComboBox83, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox84, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jComboBox85, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBox62, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox63, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox64, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox65, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jComboBox67, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addComponent(jComboBox66, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jComboBox68, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox69, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jComboBox70, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBox47, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox48, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox49, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox50, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jComboBox52, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addComponent(jComboBox51, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jComboBox53, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox54, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jComboBox55, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBox32, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox33, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox34, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox35, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jComboBox37, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addComponent(jComboBox36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jComboBox38, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox39, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jComboBox40, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel22))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel23))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox102, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox118, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox120, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox132, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox133, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox130, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox128, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox126, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox125, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox124, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox123, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox129, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox127, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox131, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox121, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox147, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox148, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox145, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox143, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox141, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox140, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox139, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox138, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox144, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox142, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox146, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox136, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox162, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox163, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox160, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox158, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox156, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox155, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox154, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox153, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox159, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox157, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox161, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox151, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox177, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox178, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox175, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox173, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox171, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox170, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox169, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox168, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox174, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox172, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox176, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox166, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox192, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox193, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox190, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox188, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox186, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox185, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox184, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox183, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox189, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox187, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox191, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox181, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox207, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox208, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox205, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox203, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox201, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox200, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox199, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox198, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox204, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox202, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox206, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox196, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox222, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox223, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox220, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox218, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox216, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox215, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox214, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox213, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox219, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox217, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox221, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox211, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox122, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox137, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox152, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox167, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox182, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox197, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox134, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox149, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox164, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox179, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox194, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox209, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox224, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox119, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox135, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox150, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox165, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox180, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox195, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox210, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox225, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );

        pack();
    }
    /**
    * @param args the command line arguments
    */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfazB c = new InterfazB();
		c.setEnabled(true);
		c.setVisible(true);
	}



}