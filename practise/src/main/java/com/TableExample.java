package com;

import java.awt.Image;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;    
public class TableExample {    
    JFrame f;    
    JLabel l1 = new JLabel(); 
    /**
     * 
     */
    
    TableExample(){    
    	/*Boolean [] items = {true,false};
    	JComboBox<Boolean> combo = new JComboBox<>(items);*/
    f=new JFrame("DEMO FRAME");
    
    /**
     * 
     */
    
    String data[][]={ {"101","Amit","670000"},    
                          {"102","Jai","780000"},    
                          {"101","Sachin","700000"},    
           };    
    String column[]={"ID","NAME","SALARY"};
    
    /**
     * 
     */
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,500,800); 
    jt.setCellSelectionEnabled(true); 
    ListSelectionModel select = jt.getSelectionModel();
    select.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    
    ListSelectionListener selectionListner = new ListSelectionListener() {
		
		@Override
		public void valueChanged(ListSelectionEvent e) {
		
			String data = null;
		/*int[] row = jt.getSelectedRows();
		int[] coloumn = jt.getSelectedColumns();
    for(int i =0; i < row.length ; i++) {
    	for(int j =0; j <coloumn.length ; j++){
    		data=(String)jt.getValueAt(row[i], coloumn[j]);
    	}
    }*/
	    	data=(String)jt.getValueAt(jt.getSelectedRow(), jt.getSelectedColumn()); 
	    	System.out.println("Selected Data is"+data); 
	    	l1.setText(data);
	    	l1.setBounds(50,100, 100,30);  
	    
		}
	};
    
	select.addListSelectionListener(selectionListner);
    /**
     * 
     */
    JScrollPane sp=new JScrollPane(jt);    
    f.add(l1);
    f.add(sp);   
    f.setSize(300,400);    
    f.setVisible(true);    
    
    
}     
public static void main(String[] args) {    
    new TableExample();    
    JFrame f2 = new JFrame("List");
    
    DefaultListModel<String> ll = new DefaultListModel<>();
    ll.addElement("AA");
    ll.addElement("BB");
    ll.addElement("CC");
    ll.addElement("DD");
    
   JList<String> jlist = new JList<>(ll);
   jlist.setBounds(100, 100, 75, 75);
   f2.add(jlist);
//   f2.add
   f2.setSize(400, 500);
   f2.setLayout(null);
   f2.setVisible(true);
    
}    
}  