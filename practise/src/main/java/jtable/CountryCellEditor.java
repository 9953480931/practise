package jtable;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.AbstractCellEditor;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class CountryCellEditor extends AbstractCellEditor implements TableCellEditor , ActionListener{
	Component comp;
	
	Country country;
	
	List<Country> listCountry;
	
	public CountryCellEditor() {
		
	}

	public CountryCellEditor(List<Country> listCountry) {
		super();
		this.listCountry = listCountry;
	}

	@Override
	public Object getCellEditorValue() {
		return this.country;
	}

	@Override
	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
		System.out.println("Enter in cell editor");
	    //this.comp=table.prepareRenderer(renderer, row, column)
		
		//System.out.println(value+"    "+isSelected+"      "+row+"      "+column);
		
		TableCellRenderer tableCellRenderer = table.getCellRenderer(row, column);
		this.comp = table.prepareRenderer(tableCellRenderer, row, column);
		//System.out.println("Checking value");
		if(value instanceof Country) {
            this.country = (Country)value;			
		}
		
		JComboBox<Country> comboBoxCountry = new JComboBox<>();
		
		for(Country c :listCountry) {
			comboBoxCountry.addItem(c);
		}
		 System.out.println("In CEll editor "+this.country+ " row "+row +" coloumn "+column);
		comboBoxCountry.setSelectedItem(country);
		comboBoxCountry.addActionListener(this);
		
		if(isSelected){
			comboBoxCountry.setBackground(table.getSelectionBackground());
		}
		else {
			comboBoxCountry.setBackground(table.getForeground());
		}
		
		return comboBoxCountry;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox<Country> comboCountry = (JComboBox<Country>) e.getSource();
        this.country = (Country) comboCountry.getSelectedItem();
        if(this.country.equals("India"))
            this.comp.setBackground(Color.YELLOW);
      //  System.out.println("InAction Component  "+this.comp);
      //  System.out.println("InAction "+this.country);
		
	}

}
