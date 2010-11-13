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
		this.setSize(400,200);
		this.setContentPane(getPanelPrincipal());
		this.setTitle("Equipos");
	}

	private JPanel getPanelPrincipal() {
		panelPrincipal=new JPanel();
		
		GridLayout c=new GridLayout(5,5);
		panelPrincipal.setLayout(c);
		
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
		
		JLabel lLocal=new JLabel();
		lLocal.setText("                    Local: ");
		JLabel lVisitante=new JLabel();
		lVisitante.setText("                Visitante: ");
		JLabel nada1=new JLabel();
		nada1.setText(" ");
		JLabel lajornada=new JLabel();
		lajornada.setText("                    Jornada:  ");
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
		
		panelPrincipal.add(nada1);
		panelPrincipal.add(lLocal);
		panelPrincipal.add(local);
		panelPrincipal.add(lVisitante);
		panelPrincipal.add(visitante);
		panelPrincipal.add(nada3);
		panelPrincipal.add(nada4);
		panelPrincipal.add(lajornada);
		panelPrincipal.add(lJornada);
		panelPrincipal.add(nada5);
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
