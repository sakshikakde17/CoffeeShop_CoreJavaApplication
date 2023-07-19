package CoffeeShop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;

public class Coffee_Billing {

	private JFrame frame;
	private JTextField addsum;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Coffee_Billing window = new Coffee_Billing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	int sum=0;
	int qty;
	int price;
	int total;
	
	DefaultTableModel model=new DefaultTableModel();

	/**
	 * Create the application.
	 */
	public Coffee_Billing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 40));
		frame.getContentPane().setForeground(new Color(255, 0, 0));
		frame.getContentPane().setBackground(new Color(204, 153, 51));
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 784, 10);
		panel.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Coffee Shop");
		lblNewLabel.setForeground(new Color(153, 51, 0));
		lblNewLabel.setBounds(221, 0, 444, 100);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 52));
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(201, 88, 311, 5);
		panel_1.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(34, 103, 297, 197);
		panel_2.setBackground(new Color(255, 255, 204));
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Rice", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JCheckBox friedrice = new JCheckBox("Fried Rice");
		friedrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		friedrice.setForeground(new Color(255, 255, 255));
		friedrice.setBackground(new Color(102, 51, 0));
		friedrice.setBounds(30, 24, 97, 23);
		panel_2.add(friedrice);
		
		JCheckBox biryani = new JCheckBox("Biryani");
		biryani.setFont(new Font("Tahoma", Font.BOLD, 14));
		biryani.setForeground(new Color(255, 255, 255));
		biryani.setBackground(new Color(102, 51, 0));
		biryani.setBounds(30, 72, 97, 23);
		panel_2.add(biryani);
		
		JCheckBox pulao = new JCheckBox("Pulao");
		pulao.setFont(new Font("Tahoma", Font.BOLD, 14));
		pulao.setForeground(new Color(255, 255, 255));
		pulao.setBackground(new Color(102, 51, 0));
		pulao.setBounds(30, 126, 97, 23);
		panel_2.add(pulao);
		
		JSpinner countfriedrice = new JSpinner();
		countfriedrice.setBounds(187, 25, 30, 20);
		panel_2.add(countfriedrice);
		
		JSpinner countbiryani = new JSpinner();
		countbiryani.setBounds(187, 73, 30, 20);
		panel_2.add(countbiryani);
		
		JSpinner countpulao = new JSpinner();
		countpulao.setBounds(187, 127, 30, 20);
		panel_2.add(countpulao);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(349, 103, 297, 197);
		panel_2_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Drink", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1.setBackground(new Color(255, 255, 204));
		frame.getContentPane().add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JCheckBox tea = new JCheckBox("Tea");
		tea.setBackground(new Color(102, 51, 0));
		tea.setForeground(new Color(255, 255, 255));
		tea.setFont(new Font("Tahoma", Font.BOLD, 14));
		tea.setBounds(31, 27, 116, 23);
		panel_2_1.add(tea);
		
		JCheckBox coldcoffee = new JCheckBox("Cold Coffee");
		coldcoffee.setBackground(new Color(102, 51, 0));
		coldcoffee.setForeground(new Color(255, 255, 255));
		coldcoffee.setFont(new Font("Tahoma", Font.BOLD, 14));
		coldcoffee.setBounds(31, 77, 116, 23);
		panel_2_1.add(coldcoffee);
		
		JCheckBox cococola = new JCheckBox("Coco Cola");
		cococola.setBackground(new Color(102, 51, 0));
		cococola.setForeground(new Color(255, 255, 255));
		cococola.setFont(new Font("Tahoma", Font.BOLD, 14));
		cococola.setBounds(31, 128, 116, 23);
		panel_2_1.add(cococola);
		
		JSpinner counttea = new JSpinner();
		counttea.setBounds(184, 28, 30, 20);
		panel_2_1.add(counttea);
		
		JSpinner countcoldcoffee = new JSpinner();
		countcoldcoffee.setBounds(184, 78, 30, 20);
		panel_2_1.add(countcoldcoffee);
		
		JSpinner countcococola = new JSpinner();
		countcococola.setBounds(184, 129, 30, 20);
		panel_2_1.add(countcococola);
		
		JLabel txtsum = new JLabel("Total");
		txtsum.setBounds(506, 363, 169, 38);
		txtsum.setBackground(new Color(255, 255, 204));
		txtsum.setForeground(new Color(0, 0, 0));
		txtsum.setFont(new Font("Sylfaen", Font.BOLD, 33));
		frame.getContentPane().add(txtsum);
		
		addsum = new JTextField();
		addsum.setFont(new Font("Tahoma", Font.BOLD, 33));
		addsum.setBounds(605, 349, 145, 46);
		addsum.setBackground(new Color(255, 255, 204));
		addsum.setForeground(new Color(255, 0, 0));
		frame.getContentPane().add(addsum);
		addsum.setColumns(10);
		
		table = new JTable();
		table.setSurrendersFocusOnKeystroke(true);
		table.setColumnSelectionAllowed(true);
		table.setFillsViewportHeight(true);
		table.setForeground(new Color(255, 255, 255));
		table.setBackground(new Color(153, 51, 0));
		table.setToolTipText("");
		table.setFont(table.getFont().deriveFont(table.getFont().getStyle() | Font.BOLD, 13f));
		table.setBorder(new TitledBorder(new CompoundBorder(), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		table.setBounds(34, 321, 443, 116);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Item", "Price", "Quantity", "Total"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Integer.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(1).setPreferredWidth(74);
		frame.getContentPane().add(table);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(51, 0, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				if(friedrice.isSelected())
						{
						qty=Integer.parseInt(countfriedrice.getValue().toString());
						model=(DefaultTableModel)table.getModel();
						model.addRow(new Object[]
								{
									friedrice.getText(),
									price=100,
									qty,
									total=qty*price,
								
								});
						}
				
				if(biryani.isSelected())
				{
				qty=Integer.parseInt(countbiryani.getValue().toString());
				model=(DefaultTableModel)table.getModel();
				model.addRow(new Object[]
						{
							biryani.getText(),
							price=170,
							qty,
							total=qty*price,
						
						});
				}
				
				if(pulao.isSelected())
				{
				qty=Integer.parseInt(countpulao.getValue().toString());
				model=(DefaultTableModel)table.getModel();
				model.addRow(new Object[]
						{
							pulao.getText(),
							price=195,
							qty,
							total=qty*price,
						
						});
				}
				
				if(tea.isSelected())
				{
				qty=Integer.parseInt(counttea.getValue().toString());
				model=(DefaultTableModel)table.getModel();
				model.addRow(new Object[]
						{
							tea.getText(),
							price=30,
							qty,
							total=qty*price,
						
						});
				}
				
				if(coldcoffee.isSelected())
				{
				qty=Integer.parseInt(countcoldcoffee.getValue().toString());
				model=(DefaultTableModel)table.getModel();
				model.addRow(new Object[]
						{
							coldcoffee.getText(),
							price=90,
							qty,
							total=qty*price,
						
						});
				}
				
				if(cococola.isSelected())
				{
				qty=Integer.parseInt(countcococola.getValue().toString());
				model=(DefaultTableModel)table.getModel();
				model.addRow(new Object[]
						{
							cococola.getText(),
							price=50,
							qty,
							total=qty*price,
						
						});
				}
				
				for(int i=0;i<table.getRowCount();i++) {
					sum=sum+Integer.parseInt(table.getValueAt(i, 3).toString());
				}
				
				addsum.setText(Integer.toString(sum));
				
	
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 34));
		btnNewButton_1.setBounds(656, 256, 118, 44);
		frame.getContentPane().add(btnNewButton_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 0));
		panel_3.setBounds(141, 38, 26, 26);
		frame.getContentPane().add(panel_3);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(Color.BLACK);
		panel_3_1.setBounds(545, 38, 26, 26);
		frame.getContentPane().add(panel_3_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(Color.BLACK);
		panel_3_2.setBounds(109, 54, 10, 10);
		frame.getContentPane().add(panel_3_2);
		
		JPanel panel_3_2_1 = new JPanel();
		panel_3_2_1.setBackground(Color.BLACK);
		panel_3_2_1.setBounds(594, 54, 10, 10);
		frame.getContentPane().add(panel_3_2_1);
		
		JLabel lblSelectedItems = new JLabel("Selected Items : ");
		lblSelectedItems.setBounds(34, 295, 195, 30);
		frame.getContentPane().add(lblSelectedItems);
		lblSelectedItems.setForeground(new Color(0, 0, 0));
		lblSelectedItems.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		frame.setBackground(new Color(204, 153, 51));
		frame.setBounds(100, 100, 800, 487);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
