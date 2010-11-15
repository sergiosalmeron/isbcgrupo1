package practica1;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Inter extends JFrame{

	private JPanel panelPrincipal=null;
	private String equipoLocal;
	private String equipoVisitante;
	private Integer jornada;
	private JComboBox local;
	private JComboBox visitante;
	private JComboBox lJornada;
	private JComboBox posicionLocal;
	private JComboBox posicionVis;
	private JComboBox puntoslocal;
	private JComboBox puntosVis;
	private JComboBox puntosCasaLoc;
	private JComboBox puntosFueraLoc;
	private JComboBox puntosCasaVis;
	private JComboBox puntosFueraVis;
	private JComboBox golesFavorLoc;
	private JComboBox golesContraLoc;
	private JComboBox golesFavorVis;
	private JComboBox golesContraVis;
	private JFrame frameQuiniela=null;
	
	public Inter(){
		super();
		crearInterfaz();
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inter c = new Inter();
		c.setEnabled(true);
		c.setVisible(true);
	}
	
	private void crearInterfaz() {
		this.setSize(900,200);
		this.setContentPane(getPanelPrincipal());
		this.setTitle("Pronóstico");
	}

	private JPanel getPanelPrincipal() {
		panelPrincipal=new JPanel();
		
		GridLayout c=new GridLayout(0,15);
//		c.setColumns(14);
//		c.setRows(3);
		panelPrincipal.setLayout(c);
		
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
		
		
		local = new JComboBox(listaEquipos);
		visitante = new JComboBox(listaEquipos);
		lJornada = new JComboBox(listaJornada);
		posicionLocal = new JComboBox(listaNumerosPuntosGoles);
		posicionVis = new JComboBox(listaNumerosPuntosGoles);
		puntoslocal = new JComboBox(listaNumerosPuntosGoles);
		puntosVis = new JComboBox(listaNumerosPuntosGoles);
		puntosCasaLoc = new JComboBox(listaNumerosPuntosGoles);
		puntosFueraLoc = new JComboBox(listaNumerosPuntosGoles);
		puntosCasaVis = new JComboBox(listaNumerosPuntosGoles);
		puntosFueraVis = new JComboBox(listaNumerosPuntosGoles);
		golesFavorLoc = new JComboBox(listaNumerosPuntosGoles);
		golesContraLoc = new JComboBox(listaNumerosPuntosGoles);
		golesFavorVis = new JComboBox(listaNumerosPuntosGoles);
		golesContraVis = new JComboBox(listaNumerosPuntosGoles);
		
		
		
		JLabel lLocal=new JLabel();
		lLocal.setText("Local: ");
		JLabel lVisitante=new JLabel();
		lVisitante.setText("Visitante: ");
		JLabel nada1=new JLabel();
		nada1.setText(" ");
		JLabel lajornada=new JLabel();
		lajornada.setText("Jornada:  ");
		JLabel lPosL=new JLabel();
		lVisitante.setText("Posicion Local: ");
		JLabel lPosV=new JLabel();
		lVisitante.setText("Posicion Visitante: ");
		JLabel lPL=new JLabel();
		lVisitante.setText("Puntos Local: ");
		JLabel lPV=new JLabel();
		lVisitante.setText("Puntos Visitante: ");
		JLabel lPCL=new JLabel();
		lVisitante.setText("Puntos Casa Local: ");
		JLabel lPFL=new JLabel();
		lVisitante.setText("Puntos Fuera Local: ");
		JLabel lPCV=new JLabel();
		lVisitante.setText("Puntos Casa Visitante: ");
		JLabel lPFV=new JLabel();
		lVisitante.setText("Puntos Fuera Visitante: ");
		JLabel lGFL=new JLabel();
		lVisitante.setText("Goles Favor Local: ");
		JLabel lGFV=new JLabel();
		lVisitante.setText("Goles Favor Visitante: ");		
		JLabel lGCL=new JLabel();
		lVisitante.setText("Goles Contra Local: ");
		JLabel lGCV=new JLabel();
		lVisitante.setText("Goles Contra Visitante: ");
		JLabel nada3=new JLabel();
		nada3.setText(" ");
		JLabel nada4=new JLabel();
		nada4.setText(" ");
		JLabel nada5=new JLabel();
		nada5.setText(" ");
		JLabel nada6=new JLabel();
		nada6.setText(" ");
		JLabel nada7=new JLabel();
		nada7.setText(" ");
		JButton boton1=new JButton();
		boton1.setText("OK");
		
	//	panelPrincipal.add(nada1);
		//primera Fila;
		panelPrincipal.add(lLocal,0);
		panelPrincipal.add(lVisitante,1);
		panelPrincipal.add(lajornada,2);
		panelPrincipal.add(lPosL,3);
		panelPrincipal.add(lPosV,4);
		panelPrincipal.add(lPL,5);
		panelPrincipal.add(lPV,6);
		panelPrincipal.add(lPCL,7);
		panelPrincipal.add(lPFL,8);
		panelPrincipal.add(lPCV,9);
		panelPrincipal.add(lPFV,10);
		panelPrincipal.add(lGFL,11);
		panelPrincipal.add(lGFV,12);
		panelPrincipal.add(lGCL,13);
		panelPrincipal.add(lGCV,14);
		
		//segunda fila, los campos
		panelPrincipal.add(local,15);	
		panelPrincipal.add(visitante,16);
		panelPrincipal.add(lJornada,17);
		panelPrincipal.add(posicionLocal,18);
		panelPrincipal.add(posicionVis,19);
		panelPrincipal.add(puntoslocal,20);
		panelPrincipal.add(puntosVis,21);
		panelPrincipal.add(puntosCasaLoc,22);
		panelPrincipal.add(puntosFueraLoc,23);
		panelPrincipal.add(puntosCasaVis,24);
		panelPrincipal.add(puntosFueraVis,25);
		panelPrincipal.add(golesFavorLoc,26);
		panelPrincipal.add(golesContraLoc,27);
		panelPrincipal.add(golesFavorVis,28);
		panelPrincipal.add(golesContraLoc);

		
		
		
//		panelPrincipal.add(nada5);
		panelPrincipal.add(boton1);
		panelPrincipal.setEnabled(true);
		panelPrincipal.setVisible(true);		
		panelPrincipal.validate();
		
		boton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
					equipoLocal=(String)local.getSelectedItem();
					equipoVisitante=(String) visitante.getSelectedItem();
					jornada = (Integer) lJornada.getSelectedItem();
					frameQuiniela=new JFrame("Quiniela");
					frameQuiniela.setSize(400, 200);
					frameQuiniela.setContentPane(getPanelQuiniela());
					frameQuiniela.setEnabled(true);
					frameQuiniela.setVisible(true);
				} 
				catch (NumberFormatException e1) {
					e1.getMessage();
					JOptionPane.showMessageDialog(null, "Algo has liado!!");
				}
			}
		});
		
		return panelPrincipal;
	}
	
	private JPanel getPanelQuiniela() {
		JPanel resultado=new JPanel();
		GridLayout c=new GridLayout();
		c.setColumns(5);
		c.setRows(6);
		resultado.setLayout(c);

		JLabel lLocal=new JLabel();
		lLocal.setText("                    Local: ");
		JLabel lVisitante=new JLabel();
		lVisitante.setText("                Visitante: ");
		JLabel nada1=new JLabel();
		nada1.setText(" ");
		JLabel nada2=new JLabel();
		nada2.setText(" ");
		JLabel nada3=new JLabel();
		nada3.setText(" ");
		JLabel nada4=new JLabel();
		nada4.setText(" ");
		JLabel nada5=new JLabel();
		nada5.setText(" ");
		JLabel l=new JLabel();
		l.setText(equipoLocal);
		JLabel v=new JLabel();
		v.setText(equipoVisitante);
		JLabel label=new JLabel();
		label.setText("               Resultado:");
		JLabel result=new JLabel();
		result.setText("X"); //////////// UN EJEMPLO
		JButton boton1=new JButton();
		boton1.setText("OK");
		
		resultado.add(nada1);
		resultado.add(nada2);
		resultado.add(lLocal);
		resultado.add(l);
		resultado.add(lVisitante);
		resultado.add(v);
		resultado.add(label);
		resultado.add(result);
		resultado.add(nada3);
		resultado.add(nada4);
		resultado.add(nada5);
		resultado.add(boton1);
		resultado.setEnabled(true);
		resultado.setVisible(true);		
		resultado.validate();
		
		boton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
					frameQuiniela.dispose();
				} 
				catch (NumberFormatException e1) {
					e1.getMessage();
					JOptionPane.showMessageDialog(null, "Algo has liado!!");
				}
			}
		});
		
		return resultado;
	}
	
}
