package jtable;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

public class TestTable extends JFrame {
	JTable jtable = new JTable();
	JLabel label0 = new JLabel("ROW INFO :-");
	JLabel label1 = new JLabel("");
	JLabel label2 = new JLabel("");
	JLabel label3 = new JLabel("");
	JLabel label4 = new JLabel("");
	JLabel label5 = new JLabel("");
	
	
	PersonTableModel tabelModel;

	public TestTable() {
		label0.setBounds(5, 30, 300, 300);
		label1.setBounds(100, 30, 300, 300);
		label2.setBounds(120, 30, 300, 300);
		label3.setBounds(170, 30, 300, 300);
		label4.setBounds(220, 30, 300, 300);
		label5.setBounds(270, 30, 300, 300);
		add(label0);
		add(label1);
		add(label2);
		add(label3);
		add(label4);
		add(label5);
     List<Person> listPerson = new ArrayList<>();
     listPerson.add(new Person("Jaspreet", "24", new Country("India"),true));
     listPerson.add(new Person("Amit", "25", new Country("USA"),false));
     listPerson.add(new Person("Sumit", "26", new Country("Canada"),false));
     
     List<Country> listCountry = new ArrayList<>();
     listCountry.add(new Country("India"));
     listCountry.add(new Country("USA"));
     listCountry.add(new Country("Canada"));
     
    tabelModel = new PersonTableModel(listPerson , jtable);
   
     
    jtable.setModel(tabelModel);
    
    TableModelListener TML = new TableModelListener() {
		
		@Override
		public void tableChanged(TableModelEvent e) {
			System.out.println("Table selected");
			
		}
	};
	
	ListSelectionListener lmt = new ListSelectionListener() {
		
		@Override
		public void valueChanged(ListSelectionEvent e) {
			int colIndex =jtable.getColumnCount();
			Object[] data =new Object[colIndex];
			for(int i =0 ; i < colIndex ; i++) {
				data[i]=jtable.getValueAt(jtable.getSelectedRow(), i);
			}
		label1.setText(data[0].toString());
		label2.setText(data[1].toString());
		label3.setText(data[2].toString());
		label4.setText(data[3].toString());
		label5.setText(data[4].toString());
		}
	};
	jtable.setCellSelectionEnabled(true);
	jtable.getSelectionModel().addListSelectionListener(lmt);
	
    
    jtable.setDefaultRenderer(Country.class, new CountryCellRenderer());
    
    jtable.setDefaultEditor(Country.class, new CountryCellEditor(listCountry));
    
    jtable.setRowHeight(25);
 
    JScrollPane scrollpane = new JScrollPane(jtable);
    scrollpane.setPreferredSize(new Dimension(400, 200));
     
    add(scrollpane, BorderLayout.CENTER);
     
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    setLocationRelativeTo(null);
    setVisible(true);  
	}

	public static void main(String[] args) {
		 try {
	            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	         
	        SwingUtilities.invokeLater(new Runnable() {
	             
	            @Override
	            public void run() {
	                new TestTable();
	            }
	        });
	    }
	}

