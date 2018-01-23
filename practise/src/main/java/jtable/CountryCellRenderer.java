package jtable;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class CountryCellRenderer extends DefaultTableCellRenderer {
	
	 public Component getTableCellRendererComponent(JTable table, Object value,
	            boolean isSelected, boolean hasFocus, int row, int column) {
		 Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		// System.out.println(cell);
		// System.out.println(value+"    "+isSelected+"      "+row+"      "+column+"     "+  hasFocus  + "  in render");
	        if (value instanceof Country) {
	            Country country = (Country) value;
	            setText(country.getName());
	        }
	        if(table.getValueAt(row, column).equals("India")){
                cell.setBackground(Color.orange);
            }
	        if(hasFocus && row==1 && column==3)
	        	setBackground(Color.RED);
	         
	        if (isSelected && value.toString().equals("India")) {
	            setBackground(Color.red);
	        }
	        else if(isSelected && value.toString().equals("USA")){
	        	setBackground(Color.green);
	        }
	        else if(isSelected && value.toString().equals("Canada")){
	        	setBackground(Color.cyan);
	        }
	        	else {
	            setBackground(table.getSelectionForeground());
	        }
	         
	        return this;
	    }
}
